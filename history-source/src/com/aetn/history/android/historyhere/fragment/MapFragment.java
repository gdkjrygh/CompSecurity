// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.fragment;

import android.content.Context;
import android.content.res.Resources;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.aetn.history.android.historyhere.HistoryHereApplication;
import com.aetn.history.android.historyhere.MainNavigationActivity;
import com.aetn.history.android.historyhere.model.CustomMapClusteringAlgorithm;
import com.aetn.history.android.historyhere.model.LocationManager;
import com.aetn.history.android.historyhere.model.POI;
import com.aetn.history.android.historyhere.model.POIDetail;
import com.aetn.history.android.historyhere.model.PoiManager;
import com.aetn.history.android.historyhere.model.PreferenceManager;
import com.aetn.history.android.historyhere.utils.Utils;
import com.aetn.history.android.historyhere.view.ClusterIconGenerator;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.aetn.history.android.historyhere.fragment:
//            MapOverlayFragment

public class MapFragment extends Fragment
{
    public class MultiCameraChangedListener
        implements com.google.android.gms.maps.GoogleMap.OnCameraChangeListener
    {

        List mListeners;
        final MapFragment this$0;

        public void addListener(com.google.android.gms.maps.GoogleMap.OnCameraChangeListener oncamerachangelistener)
        {
            mListeners.add(oncamerachangelistener);
        }

        public void onCameraChange(CameraPosition cameraposition)
        {
            for (Iterator iterator = mListeners.iterator(); iterator.hasNext(); ((com.google.android.gms.maps.GoogleMap.OnCameraChangeListener)iterator.next()).onCameraChange(cameraposition)) { }
        }

        public MultiCameraChangedListener()
        {
            this$0 = MapFragment.this;
            super();
            mListeners = new ArrayList();
        }
    }

    public class PoiRenderer extends DefaultClusterRenderer
    {

        final BitmapDescriptor bdFavoriteIcon;
        final BitmapDescriptor bdIcon;
        final BitmapDescriptor bdSelectedFavoriteIcon;
        final BitmapDescriptor bdSelectedIcon;
        private final ClusterIconGenerator mClusterIconGenerator;
        private final ImageView mClusterImageView;
        private final int mDimension;
        private final ClusterIconGenerator mIconGenerator;
        private final ImageView mImageView;
        private ArrayList mUnclusteredPois;
        final MapFragment this$0;
        private int totalPoisRendered;

        private void onClusteringDone()
        {
            fireOnClustersDone(mUnclusteredPois);
            totalPoisRendered = 0;
            mUnclusteredPois.clear();
        }

        private void resetClustering()
        {
            Utils.logger(TAG, "resetClustering:");
            totalPoisRendered = 0;
            mUnclusteredPois.clear();
        }

        protected void onBeforeClusterItemRendered(POIDetail poidetail, MarkerOptions markeroptions)
        {
            Utils.logger(TAG, "onBeforeClusterItemRendered:");
            markeroptions.title(poidetail.getId());
            BitmapDescriptor bitmapdescriptor;
            boolean flag;
            if (mFavoritesString.indexOf((new StringBuilder()).append(",").append(poidetail.getId()).append(",").toString()) > -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                bitmapdescriptor = bdFavoriteIcon;
            } else
            {
                bitmapdescriptor = bdIcon;
            }
            if (getCurrentlySelectedPoi() != null)
            {
                Utils.logger(TAG, (new StringBuilder()).append("addMarkers(): getCurrentlySelectedPoi:").append(getCurrentlySelectedPoi().getId()).toString());
                if (getCurrentlySelectedPoi().getId().equals(poidetail.getId()))
                {
                    if (flag)
                    {
                        bitmapdescriptor = bdSelectedFavoriteIcon;
                    } else
                    {
                        bitmapdescriptor = bdSelectedIcon;
                    }
                }
            } else
            {
                hideDetailPager();
            }
            markeroptions.icon(bitmapdescriptor);
        }

        protected volatile void onBeforeClusterItemRendered(ClusterItem clusteritem, MarkerOptions markeroptions)
        {
            onBeforeClusterItemRendered((POIDetail)clusteritem, markeroptions);
        }

        protected void onBeforeClusterRendered(Cluster cluster, MarkerOptions markeroptions)
        {
            markeroptions.icon(BitmapDescriptorFactory.fromBitmap(mClusterIconGenerator.makeIcon(String.valueOf(cluster.getSize()))));
        }

        protected void onClusterItemRendered(POIDetail poidetail, Marker marker)
        {
            Utils.logger(TAG, (new StringBuilder()).append("PoiRenderer: onClusterItemRendered(): cluster item of: ").append(poidetail).toString());
            mUnclusteredPois.add(poidetail);
            totalPoisRendered = totalPoisRendered + 1;
            Utils.logger(TAG, (new StringBuilder()).append("PoiRenderer: onClusterItemRendered(): newPoiList.size(): ").append(newPoiList.size()).toString());
            if (totalPoisRendered == newPoiList.size())
            {
                onClusteringDone();
            }
        }

        protected volatile void onClusterItemRendered(ClusterItem clusteritem, Marker marker)
        {
            onClusterItemRendered((POIDetail)clusteritem, marker);
        }

        protected void onClusterRendered(Cluster cluster, Marker marker)
        {
            totalPoisRendered = totalPoisRendered + cluster.getSize();
            Utils.logger(TAG, (new StringBuilder()).append("PoiRenderer: onClusterRendered(): newPoiList.size(): ").append(newPoiList.size()).toString());
            if (totalPoisRendered == newPoiList.size())
            {
                onClusteringDone();
            }
        }

        protected boolean shouldRenderAsCluster(Cluster cluster)
        {
            return cluster.getSize() > 1;
        }


        public PoiRenderer()
        {
            this$0 = MapFragment.this;
            super(getActivity(), map, mClusterManager);
            mIconGenerator = new ClusterIconGenerator(getActivity());
            mClusterIconGenerator = new ClusterIconGenerator(getActivity());
            totalPoisRendered = 0;
            bdIcon = getMarkerIcon();
            bdFavoriteIcon = getFavoriteMarkerIcon();
            bdSelectedIcon = getSelectedMarkerIcon();
            bdSelectedFavoriteIcon = getFavoriteSelectedMarkerIcon();
            View view = getActivity().getLayoutInflater().inflate(0x7f030036, null);
            mClusterIconGenerator.setContentView(view);
            mClusterImageView = (ImageView)view.findViewById(0x7f0a003d);
            mUnclusteredPois = new ArrayList();
            mImageView = new ImageView(getActivity());
            mDimension = (int)getResources().getDimension(0x7f0b0014);
            mImageView.setLayoutParams(new android.view.ViewGroup.LayoutParams(mDimension, mDimension));
            int i = (int)getResources().getDimension(0x7f0b0015);
            mImageView.setPadding(i, i, i, i);
            mIconGenerator.setContentView(mImageView);
        }
    }


    private final String TAG = getClass().getSimpleName();
    private HistoryHereApplication app;
    private ArrayList currentPoiList;
    private Boolean enableMenuRefresh;
    private boolean isMapViewSatellite;
    private double latLngChangeAllowance;
    private View mCancelSearchBtn;
    private ClusterManager mClusterManager;
    private Context mContext;
    private POIDetail mCurrentlySelectedPoi;
    private int mCurrentlySelectedPoiIndex;
    private View mDoSearchBtn;
    private String mFavoritesString;
    public ViewGroup mMapContainer;
    private boolean mMapInited;
    private ArrayList mMapMarkers;
    private TextView mMapZoomError;
    private PoiRenderer mPoiRenderer;
    private ProgressBar mProgressBar;
    private EditText mSearchEditText;
    private ViewGroup mSearchView;
    private GoogleMap map;
    private SupportMapFragment mapFragment;
    private Handler mapUpdateHandler;
    private Runnable mapUpdateRunnable;
    private ArrayList newPoiList;
    private Boolean poiLoading;
    private boolean selectedMarker;

    public MapFragment()
    {
        isMapViewSatellite = false;
        latLngChangeAllowance = 0.02D;
        poiLoading = Boolean.valueOf(false);
        selectedMarker = false;
        mCurrentlySelectedPoiIndex = 0;
        mMapInited = false;
        mFavoritesString = "";
        mapUpdateHandler = new Handler();
        mapUpdateRunnable = new Runnable() {

            final MapFragment this$0;

            public void run()
            {
                Utils.logger(TAG, "mapUpdateRunnable: run - now refresh the map");
                refreshPlacesMap();
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        };
    }

    private void addFavoritesMarkers()
    {
        Utils.logger(TAG, "addFavoritesMarkers()");
        newPoiList = PoiManager.getInstance(mContext).getCurrentFavoritesListFromDB(getActivity());
        mMapMarkers = new ArrayList();
        mClusterManager.clearItems();
        map.clear();
        Object obj = new com.google.android.gms.maps.model.LatLngBounds.Builder();
        if (newPoiList.size() > 0)
        {
            Utils.logger(TAG, (new StringBuilder()).append("addFavoritesMarkers(): POIs number:").append(newPoiList.size()).toString());
            Marker marker;
            for (Iterator iterator = newPoiList.iterator(); iterator.hasNext(); mMapMarkers.add(marker))
            {
                POIDetail poidetail = (POIDetail)iterator.next();
                marker = map.addMarker((new MarkerOptions()).position(poidetail.getPosition()).title(poidetail.getId()));
                marker.setIcon(getFavoriteMarkerIcon());
                ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj)).include(poidetail.getPosition());
            }

            currentPoiList = newPoiList;
        }
        if (newPoiList.size() > 1)
        {
            obj = ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj)).build();
            map.moveCamera(CameraUpdateFactory.newLatLngBounds(((LatLngBounds) (obj)), 100));
        } else
        {
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(((POIDetail)newPoiList.get(0)).getLatitude(), ((POIDetail)newPoiList.get(0)).getLongitude()), 10F));
        }
        poiLoading = Boolean.valueOf(false);
    }

    private void addMarkers()
    {
        if (MainNavigationActivity.isMapTypePlaces())
        {
            addPlacesMarkers(null);
            return;
        }
        if (MainNavigationActivity.isMapTypeFavorites())
        {
            addFavoritesMarkers();
            return;
        } else
        {
            addTourMarkers(null);
            return;
        }
    }

    private void addPlacesMarkers(ArrayList arraylist)
    {
        Utils.logger(TAG, "addPlacesMarkers()");
        if (arraylist != null)
        {
            newPoiList = arraylist;
        } else
        {
            Object obj = map.getProjection();
            arraylist = ((Projection) (obj)).getVisibleRegion().latLngBounds.northeast;
            obj = ((Projection) (obj)).getVisibleRegion().latLngBounds.southwest;
            newPoiList = PoiManager.getInstance(mContext).getPoiListWithinBounds(((LatLng) (arraylist)).latitude, ((LatLng) (obj)).latitude, ((LatLng) (obj)).longitude, ((LatLng) (arraylist)).longitude);
        }
        mClusterManager.clearItems();
        if (newPoiList.size() > 0)
        {
            Utils.logger(TAG, (new StringBuilder()).append("addPlacesMarkers(): POIs number:").append(newPoiList.size()).toString());
            POIDetail poidetail;
            for (arraylist = newPoiList.iterator(); arraylist.hasNext(); mClusterManager.addItem(poidetail))
            {
                poidetail = (POIDetail)arraylist.next();
            }

            currentPoiList = newPoiList;
            mClusterManager.cluster();
        }
        poiLoading = Boolean.valueOf(false);
    }

    private void addTourMarkers(final String id)
    {
        Utils.logger(TAG, "addTourMarkers()");
        mMapMarkers = new ArrayList();
        mClusterManager.clearItems();
        map.clear();
        Object obj = new com.google.android.gms.maps.model.LatLngBounds.Builder();
        if (newPoiList.size() > 0)
        {
            Utils.logger(TAG, (new StringBuilder()).append("addTourMarkers(): POIs number:").append(newPoiList.size()).toString());
            Marker marker;
            for (Iterator iterator = newPoiList.iterator(); iterator.hasNext(); mMapMarkers.add(marker))
            {
                POIDetail poidetail = (POIDetail)iterator.next();
                marker = map.addMarker((new MarkerOptions()).position(poidetail.getPosition()).title(poidetail.getId()));
                marker.setIcon(getMarkerIcon());
                ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj)).include(poidetail.getPosition());
            }

            currentPoiList = newPoiList;
        }
        obj = ((com.google.android.gms.maps.model.LatLngBounds.Builder) (obj)).build();
        map.moveCamera(CameraUpdateFactory.newLatLngBounds(((LatLngBounds) (obj)), 100));
        (new Handler()).postDelayed(new Runnable() {

            final MapFragment this$0;
            final String val$id;

            public void run()
            {
                POIDetail poidetail2 = (POIDetail)newPoiList.get(0);
                POIDetail poidetail1 = poidetail2;
                if (id != null)
                {
                    Iterator iterator1 = newPoiList.iterator();
                    do
                    {
                        poidetail1 = poidetail2;
                        if (!iterator1.hasNext())
                        {
                            break;
                        }
                        poidetail1 = (POIDetail)iterator1.next();
                    } while (!poidetail1.getId().equalsIgnoreCase(id));
                }
                setSelectedToursMarkerByPoi(poidetail1, false);
                showDetailPager(poidetail1);
            }

            
            {
                this$0 = MapFragment.this;
                id = s;
                super();
            }
        }, 500L);
        poiLoading = Boolean.valueOf(false);
    }

    private void cancelPOIRequest()
    {
        Utils.logger(TAG, "cancelPOIRequest():");
        mapUpdateHandler.removeCallbacks(mapUpdateRunnable);
    }

    private void checkRelocationButton()
    {
        try
        {
            if (map.getMyLocation() != null)
            {
                LatLng latlng = map.getCameraPosition().target;
                LatLng latlng1 = new LatLng(map.getMyLocation().getLatitude(), map.getMyLocation().getLongitude());
                String.format("%.2f", new Object[] {
                    Double.valueOf(latlng.latitude)
                });
                String.format("%.2f", new Object[] {
                    Double.valueOf(latlng1.latitude)
                });
                String.format("%.2f", new Object[] {
                    Double.valueOf(latlng.longitude)
                });
                String.format("%.2f", new Object[] {
                    Double.valueOf(latlng1.longitude)
                });
            }
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            illegalstateexception.printStackTrace();
        }
    }

    private void doSearch(String s)
    {
        if (s.length() < 2)
        {
            Utils.logger(TAG, "setOnEditorActionListener:NG");
            Toast.makeText(getActivity(), getActivity().getResources().getString(0x7f0d0062), 1).show();
            return;
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put("Search Term", s);
            ((MainNavigationActivity)getActivity()).tagLocalyticsEvent("Internal Search", hashmap);
            ((MainNavigationActivity)getActivity()).doMapSearch(s);
            hideSearch();
            mSearchEditText.setText("");
            return;
        }
    }

    private void fireOnClustersDone(ArrayList arraylist)
    {
        Utils.logger(TAG, (new StringBuilder()).append("fireOnClustersDone: data.size()").append(arraylist.size()).toString());
        com.google.maps.android.MarkerManager.Collection collection = mClusterManager.getMarkerCollection();
        Utils.logger(TAG, (new StringBuilder()).append("fireOnClustersDone: getMarkerCollection() size:").append(collection.getMarkers().size()).toString());
        PoiManager.getInstance(getActivity()).setUnclusteredPois(arraylist);
    }

    private ArrayList getCurrentPoiList()
    {
        return PoiManager.getInstance(getActivity()).getCurrentPOIList();
    }

    private POIDetail getCurrentlySelectedPoi()
    {
        return mCurrentlySelectedPoi;
    }

    private LatLng getDefaultMapCenter()
    {
        return new LatLng(38.511099999999999D, -96.8005D);
    }

    private BitmapDescriptor getFavoriteMarkerIcon()
    {
        return BitmapDescriptorFactory.fromResource(0x7f0200f1);
    }

    private BitmapDescriptor getFavoriteSelectedMarkerIcon()
    {
        return BitmapDescriptorFactory.fromResource(0x7f0200f2);
    }

    private Marker getMarkerById(String s)
    {
        Utils.logger(TAG, "getMarkerById(): call the one based on if ths is tours or places:");
        if (MainNavigationActivity.isMapTypePlaces())
        {
            return getPlacesMarkerById(s);
        } else
        {
            return getTourMarkerById(s);
        }
    }

    private BitmapDescriptor getMarkerIcon()
    {
        return BitmapDescriptorFactory.fromResource(0x7f0200f0);
    }

    private Marker getPlacesMarkerById(String s)
    {
        new ArrayList();
        getCurrentPoiList();
        Iterator iterator = mClusterManager.getMarkerCollection().getMarkers().iterator();
        int j;
        for (int i = 0; iterator.hasNext(); i = j)
        {
            Object obj = TAG;
            StringBuilder stringbuilder = (new StringBuilder()).append("getPlacesMarkerById(): iterator:");
            j = i + 1;
            Utils.logger(((String) (obj)), stringbuilder.append(i).toString());
            obj = (Marker)iterator.next();
            if (((Marker) (obj)).getTitle().equalsIgnoreCase(s))
            {
                Utils.logger(TAG, (new StringBuilder()).append("getPlacesMarkerById(): found it:").append(j).toString());
                return ((Marker) (obj));
            }
        }

        return null;
    }

    private POIDetail getPoiById(String s)
    {
        for (Iterator iterator = currentPoiList.iterator(); iterator.hasNext();)
        {
            POIDetail poidetail = (POIDetail)iterator.next();
            if (poidetail.getId().equalsIgnoreCase(s))
            {
                return poidetail;
            }
        }

        return null;
    }

    private BitmapDescriptor getSelectedMarkerIcon()
    {
        return BitmapDescriptorFactory.fromResource(0x7f0200f3);
    }

    private Marker getTourMarkerById(String s)
    {
        for (Iterator iterator = mMapMarkers.iterator(); iterator.hasNext();)
        {
            Marker marker = (Marker)iterator.next();
            Utils.logger(TAG, (new StringBuilder()).append("getTourMarkerById(): m.getTitle():").append(marker.getTitle()).toString());
            Utils.logger(TAG, (new StringBuilder()).append("getTourMarkerById(): id:").append(s).toString());
            if (marker.getTitle().equalsIgnoreCase(s))
            {
                return marker;
            }
        }

        return null;
    }

    private void hideDetailPager()
    {
        ((MainNavigationActivity)getActivity()).hideDetailPager();
    }

    private void hideLoading()
    {
        app.hideMessageBox();
    }

    private void hideMapOverlay()
    {
        ((MainNavigationActivity)getActivity()).hideMapOverlay();
    }

    private void hideMapSettings()
    {
    }

    private void hideSearch()
    {
        showMapOverlay();
        mSearchView.setVisibility(4);
        ((InputMethodManager)getActivity().getSystemService("input_method")).hideSoftInputFromWindow(mSearchEditText.getWindowToken(), 0);
    }

    private void hideZoomError()
    {
        mMapZoomError.setVisibility(4);
    }

    private boolean isCameraZoomedOutToMax()
    {
        return map.getCameraPosition().zoom < 6.5F;
    }

    private void setCurrentlySelectedPoi(POIDetail poidetail)
    {
        mCurrentlySelectedPoi = poidetail;
    }

    private void setFavoritesMapListeners()
    {
        mMapInited = true;
        setTourMapListeners();
    }

    private void setInitialMapLocation()
    {
label0:
        {
            if (map != null)
            {
                boolean flag = LocationManager.getInstance(getActivity()).isUsersLocationKnown();
                boolean flag1 = LocationManager.getInstance(getActivity()).isUserInUs();
                if (!flag || !flag1)
                {
                    break label0;
                }
                moveToUsersLocation();
            }
            return;
        }
        Utils.logger(TAG, "setInitialMapLocation: latitude is null");
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(getDefaultMapCenter(), 3F));
    }

    private void setListeners()
    {
        PreferenceManager.setPreferencesChangedListener(new com.aetn.history.android.historyhere.model.PreferenceManager.OnFavoritesChangedListener() {

            final MapFragment this$0;

            public void onFavoritesChanged()
            {
                Utils.logger(TAG, "onFavoritesChanged");
                mFavoritesString = PreferenceManager.getFavoritesString(getActivity());
                if (MainNavigationActivity.isMapTypeFavorites())
                {
                    if (!PreferenceManager.hasFavorites(getActivity()))
                    {
                        MainNavigationActivity.setMapType(0);
                    }
                    hideDetailPager();
                }
                refreshPlacesMap();
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        });
        mCancelSearchBtn.setOnClickListener(new android.view.View.OnClickListener() {

            final MapFragment this$0;

            public void onClick(View view)
            {
                hideSearch();
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        });
        mDoSearchBtn.setOnClickListener(new android.view.View.OnClickListener() {

            final MapFragment this$0;

            public void onClick(View view)
            {
                doSearch(mSearchEditText.getText().toString());
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        });
        mSearchEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final MapFragment this$0;

            public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
            {
                if (i == 3 || i == 6 || keyevent.getAction() == 0 && keyevent.getKeyCode() == 66)
                {
                    textview = textview.getText().toString();
                    doSearch(textview);
                    return true;
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        });
        mClusterManager.setOnClusterClickListener(new com.google.maps.android.clustering.ClusterManager.OnClusterClickListener() {

            final MapFragment this$0;

            public boolean onClusterClick(Cluster cluster)
            {
                Utils.logger(TAG, (new StringBuilder()).append("onClusterClick():cluster:").append(cluster).toString());
                com.google.android.gms.maps.model.LatLngBounds.Builder builder = new com.google.android.gms.maps.model.LatLngBounds.Builder();
                for (cluster = cluster.getItems().iterator(); cluster.hasNext(); builder.include(((POIDetail)cluster.next()).getPosition())) { }
                cluster = builder.build();
                map.animateCamera(CameraUpdateFactory.newLatLngBounds(cluster, 100));
                return true;
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        });
        mClusterManager.setOnClusterItemClickListener(new com.google.maps.android.clustering.ClusterManager.OnClusterItemClickListener() {

            final MapFragment this$0;

            public boolean onClusterItemClick(POIDetail poidetail)
            {
                Utils.logger(TAG, (new StringBuilder()).append("onMarkerClick():getPoiIndexById(poi.getTitle()): ").append(poidetail.getId()).toString());
                clearSelectedMarkerIcon();
                setCurrentlySelectedPoi(poidetail);
                Utils.logger(TAG, (new StringBuilder()).append("onMarkerClick():index:").append(mCurrentlySelectedPoiIndex).toString());
                if (getCurrentlySelectedPoi() != null)
                {
                    selectedMarker = true;
                }
                setSelectedMarkerIcon(false);
                showDetailPager(getCurrentlySelectedPoi());
                return true;
            }

            public volatile boolean onClusterItemClick(ClusterItem clusteritem)
            {
                return onClusterItemClick((POIDetail)clusteritem);
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        });
        map.setOnMapClickListener(new com.google.android.gms.maps.GoogleMap.OnMapClickListener() {

            final MapFragment this$0;

            public void onMapClick(LatLng latlng)
            {
                Utils.logger(TAG, "onMapClick()");
                clearSelectedMarkerIcon();
                hideSearch();
                hideDetailPager();
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        });
    }

    private void setPlacesMapListeners()
    {
        map.setOnMarkerClickListener(mClusterManager);
        MultiCameraChangedListener multicamerachangedlistener = new MultiCameraChangedListener();
        multicamerachangedlistener.addListener(new com.google.android.gms.maps.GoogleMap.OnCameraChangeListener() {

            final MapFragment this$0;

            public void onCameraChange(CameraPosition cameraposition)
            {
label0:
                {
                    Utils.logger(TAG, (new StringBuilder()).append("onCameraChange():lat:").append(cameraposition.target.latitude).append("|lng:").append(cameraposition.target.longitude).append("|zoom level:").append(cameraposition.zoom).toString());
                    cancelPOIRequest();
                    if (!mMapInited)
                    {
                        if (isCameraZoomedOutToMax())
                        {
                            break label0;
                        }
                        mMapInited = true;
                    }
                    double d = Math.abs(cameraposition.target.latitude - app.getCurrentSearchLatitude());
                    double d1 = Math.abs(cameraposition.target.longitude - app.getCurrentSearchLongitude());
                    if ((d > latLngChangeAllowance || d1 > latLngChangeAllowance) && !poiLoading.booleanValue() && !selectedMarker)
                    {
                        Utils.logger(TAG, "onCameraChange(): different lat/lng -  UPDATE");
                        mapUpdateHandler.removeCallbacks(mapUpdateRunnable);
                        mapUpdateHandler.postDelayed(mapUpdateRunnable, 1000L);
                    }
                    if (d > latLngChangeAllowance || d1 > latLngChangeAllowance)
                    {
                        selectedMarker = false;
                    }
                    checkRelocationButton();
                    return;
                }
                Toast.makeText(getActivity(), getActivity().getResources().getString(0x7f0d004d), 0).show();
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        });
        map.setOnCameraChangeListener(multicamerachangedlistener);
    }

    private void setSelectedMarkerIcon(boolean flag)
    {
        Utils.logger(TAG, (new StringBuilder()).append("setSelectedMarkerIcon(): move:").append(flag).toString());
        CameraPosition cameraposition;
        try
        {
            if (getCurrentlySelectedPoi() == null)
            {
                break MISSING_BLOCK_LABEL_158;
            }
            BitmapDescriptor bitmapdescriptor = getSelectedMarkerIcon();
            PoiManager.getInstance(getActivity());
            if (PoiManager.isFavorite(getActivity(), getCurrentlySelectedPoi().getId()))
            {
                bitmapdescriptor = getFavoriteSelectedMarkerIcon();
            }
            getMarkerById(getCurrentlySelectedPoi().getId()).setIcon(bitmapdescriptor);
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        cameraposition = new CameraPosition(new LatLng(getCurrentlySelectedPoi().getLatitude(), getCurrentlySelectedPoi().getLongitude()), map.getCameraPosition().zoom, map.getCameraPosition().tilt, map.getCameraPosition().bearing);
        map.animateCamera(CameraUpdateFactory.newCameraPosition(cameraposition));
    }

    private void setTourMapListeners()
    {
        map.setOnMarkerClickListener(new com.google.android.gms.maps.GoogleMap.OnMarkerClickListener() {

            final MapFragment this$0;

            public boolean onMarkerClick(Marker marker)
            {
                Utils.logger(TAG, "the marker was clicked");
                marker = getPoiById(marker.getTitle());
                ((MainNavigationActivity)getActivity()).showDetailPager(marker);
                setSelectedToursMarkerByPoi(marker, true);
                return true;
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        });
        map.setOnCameraChangeListener(new com.google.android.gms.maps.GoogleMap.OnCameraChangeListener() {

            final MapFragment this$0;

            public void onCameraChange(CameraPosition cameraposition)
            {
                Utils.logger(TAG, "onCameraChange()");
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        });
    }

    private void showDetailPager(POIDetail poidetail)
    {
        ((MainNavigationActivity)getActivity()).showDetailPager(poidetail);
    }

    private void showLoading()
    {
    }

    private void showMapOverlay()
    {
        ((MainNavigationActivity)getActivity()).showMapOverlay();
    }

    private void showMapSettings()
    {
        if (!MainNavigationActivity.isMapTypePlaces())
        {
            handleOnTourHeaderShow();
        }
    }

    private void showNormalMapView()
    {
        map.setMapType(1);
        isMapViewSatellite = false;
    }

    private int showOverlayByDetail(POI poi)
    {
        return -1;
    }

    private void showSatelliteMapView()
    {
        map.setMapType(2);
        isMapViewSatellite = true;
    }

    private void showZoomError()
    {
    }

    public void clearSelectedMarkerIcon()
    {
        Utils.logger(TAG, "clearSelectedMarkerIcon()");
        Marker marker;
        if (getCurrentlySelectedPoi() == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        marker = getMarkerById(getCurrentlySelectedPoi().getId());
        if (marker != null)
        {
            try
            {
                BitmapDescriptor bitmapdescriptor = getMarkerIcon();
                PoiManager.getInstance(getActivity());
                if (PoiManager.isFavorite(getActivity(), getCurrentlySelectedPoi().getId()))
                {
                    bitmapdescriptor = getFavoriteMarkerIcon();
                }
                marker.setIcon(bitmapdescriptor);
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
            }
        }
        setCurrentlySelectedPoi(null);
        return;
    }

    public void displayPOI(final POIDetail poi)
    {
        hideDetailPager();
        selectedMarker = false;
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(poi.getLatitude(), poi.getLongitude()), 17F));
        (new Handler()).postDelayed(new Runnable() {

            final MapFragment this$0;
            final POIDetail val$poi;

            public void run()
            {
                setSelectedMarkerByPoi(poi);
                showDetailPager(poi);
            }

            
            {
                this$0 = MapFragment.this;
                poi = poidetail;
                super();
            }
        }, 3000L);
    }

    public void displayTargetedPOI(final POIDetail poi)
    {
        hideDetailPager();
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(poi.getLatitude(), poi.getLongitude()), 17F));
        refreshPlacesMap();
        (new Handler()).postDelayed(new Runnable() {

            final MapFragment this$0;
            final POIDetail val$poi;

            public void run()
            {
                setSelectedMarkerByPoi(poi);
                showDetailPager(poi);
            }

            
            {
                this$0 = MapFragment.this;
                poi = poidetail;
                super();
            }
        }, 2000L);
    }

    public LatLng getMapLatLng()
    {
        return map.getCameraPosition().target;
    }

    public void handleOnDetailHide()
    {
        clearSelectedMarkerIcon();
    }

    public void handleOnDetailShow()
    {
    }

    public void handleOnTourHeaderShow()
    {
    }

    public void hideUI()
    {
        hideZoomError();
        hideDetailPager();
        hideMapSettings();
        hideSearch();
    }

    public void initMap()
    {
        (new Handler()).postDelayed(new Runnable() {

            final MapFragment this$0;

            public void run()
            {
                if (map != null)
                {
                    if (LocationManager.getInstance(getActivity()).isUsersLocationKnown())
                    {
                        map.setMyLocationEnabled(true);
                        map.getUiSettings().setMyLocationButtonEnabled(false);
                    }
                    setInitialMapLocation();
                    mClusterManager = new ClusterManager(getActivity(), map);
                    mPoiRenderer = new PoiRenderer();
                    mClusterManager.setRenderer(mPoiRenderer);
                    mClusterManager.setAlgorithm(new CustomMapClusteringAlgorithm());
                    setListeners();
                }
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        }, 3000L);
    }

    public void initToUsersLocation(Location location)
    {
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), 8F));
        Object obj1 = map.getProjection();
        Object obj = ((Projection) (obj1)).getVisibleRegion().latLngBounds.northeast;
        obj1 = ((Projection) (obj1)).getVisibleRegion().latLngBounds.southwest;
        obj = PoiManager.getInstance(mContext).getPoiListWithinBounds(((LatLng) (obj)).latitude, ((LatLng) (obj1)).latitude, ((LatLng) (obj1)).longitude, ((LatLng) (obj)).longitude);
        Utils.logger(TAG, (new StringBuilder()).append("zoomToMapLocation(): list.size():").append(((ArrayList) (obj)).size()).toString());
        POIDetail poidetail;
        for (Iterator iterator = ((ArrayList) (obj)).iterator(); iterator.hasNext(); poidetail.setDistance((long)Utils.getDistanceBetweenLocations(location.getLatitude(), location.getLongitude(), poidetail.getLatitude(), poidetail.getLongitude(), "M")))
        {
            poidetail = (POIDetail)iterator.next();
        }

        Collections.sort(((List) (obj)), new Comparator() {

            final MapFragment this$0;

            public int compare(POIDetail poidetail2, POIDetail poidetail3)
            {
                return Math.round(poidetail2.getDistance() - poidetail3.getDistance());
            }

            public volatile int compare(Object obj2, Object obj3)
            {
                return compare((POIDetail)obj2, (POIDetail)obj3);
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        });
        POIDetail poidetail1;
        for (Iterator iterator1 = ((ArrayList) (obj)).iterator(); iterator1.hasNext(); poidetail1.setDistance((long)Utils.getDistanceBetweenLocations(location.getLatitude(), location.getLongitude(), poidetail1.getLatitude(), poidetail1.getLongitude(), "M")))
        {
            poidetail1 = (POIDetail)iterator1.next();
        }

        int i = ((ArrayList) (obj)).size();
        if (i > 20)
        {
            ((ArrayList) (obj)).subList(20, i).clear();
        }
        Utils.logger(TAG, (new StringBuilder()).append("zoomToMapLocation(): IT IS NOW list.size():").append(((ArrayList) (obj)).size()).toString());
        location = new com.google.android.gms.maps.model.LatLngBounds.Builder();
        for (Iterator iterator2 = ((ArrayList) (obj)).iterator(); iterator2.hasNext(); location.include(((POIDetail)iterator2.next()).getPosition())) { }
        location = location.build();
        map.moveCamera(CameraUpdateFactory.newLatLngBounds(location, 0));
        MainNavigationActivity.setMapType(0);
        PoiManager.getInstance(getActivity()).setCurrentPOIList(((ArrayList) (obj)));
        addPlacesMarkers(PoiManager.getInstance(getActivity()).getCurrentPOIList());
        mMapInited = true;
        setPlacesMapListeners();
    }

    public void moveToUsersLocation()
    {
        if (LocationManager.getInstance(getActivity()).isUsersLocationKnown())
        {
            Location location = LocationManager.getInstance(getActivity()).getUsersLocation();
            map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), 10F));
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRetainInstance(true);
        currentPoiList = new ArrayList();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Utils.logger(TAG, "onCreateView()");
        app = (HistoryHereApplication)getActivity().getApplication();
        layoutinflater = layoutinflater.inflate(0x7f030041, viewgroup, false);
        mMapZoomError = (TextView)layoutinflater.findViewById(0x7f0a00b3);
        mMapContainer = (ViewGroup)layoutinflater.findViewById(0x7f0a00b1);
        mContext = getActivity();
        mDoSearchBtn = layoutinflater.findViewById(0x7f0a0077);
        mSearchEditText = (EditText)layoutinflater.findViewById(0x7f0a0078);
        mSearchView = (ViewGroup)layoutinflater.findViewById(0x7f0a00b5);
        mCancelSearchBtn = layoutinflater.findViewById(0x7f0a00b6);
        mProgressBar = (ProgressBar)layoutinflater.findViewById(0x7f0a00b4);
        mSearchEditText.setImeOptions(6);
        mFavoritesString = PreferenceManager.getFavoritesString(getActivity());
        hideUI();
        mapFragment = (SupportMapFragment)getChildFragmentManager().findFragmentById(0x7f0a00b2);
        mapFragment.getMapAsync(new OnMapReadyCallback() {

            final MapFragment this$0;

            public void onMapReady(GoogleMap googlemap)
            {
                map = googlemap;
                initMap();
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        });
        return layoutinflater;
    }

    public void onPause()
    {
        Utils.logger(TAG, "onPause()");
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        Utils.logger(TAG, "onResume()");
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        boolean flag = false;
        super.onViewCreated(view, bundle);
        enableMenuRefresh = Boolean.valueOf(false);
        if (map != null)
        {
            if (map.getMapType() == 2)
            {
                flag = true;
            }
            isMapViewSatellite = flag;
        }
    }

    public void refreshPlacesMap()
    {
        Utils.logger(TAG, "refreshPlacesMap()");
        if (mMapInited)
        {
            mPoiRenderer.resetClustering();
            addMarkers();
        }
    }

    public void setMapType()
    {
        if (MainNavigationActivity.isMapTypePlaces())
        {
            setPlacesMapListeners();
        } else
        if (MainNavigationActivity.isMapTypeFavorites())
        {
            setFavoritesMapListeners();
        } else
        {
            setTourMapListeners();
        }
        map.clear();
        setCurrentlySelectedPoi(null);
        return;
        Object obj;
        obj;
        ((Exception) (obj)).printStackTrace();
        setCurrentlySelectedPoi(null);
        return;
        obj;
        setCurrentlySelectedPoi(null);
        throw obj;
    }

    public void setMapTypeNormal()
    {
        map.setMapType(1);
    }

    public void setMapTypeSatellite()
    {
        map.setMapType(4);
    }

    public void setSelectedMarkerByPoi(POIDetail poidetail)
    {
        Utils.logger(TAG, (new StringBuilder()).append("setSelectedMarkerByPoi():").append(poidetail).toString());
        if (MainNavigationActivity.isMapTypePlaces())
        {
            setSelectedPlacesMarkerByPoi(poidetail);
            return;
        } else
        {
            setSelectedToursMarkerByPoi(poidetail, true);
            return;
        }
    }

    public void setSelectedPlacesMarkerByPoi(POIDetail poidetail)
    {
        Utils.logger(TAG, (new StringBuilder()).append("setSelectedPlacesMarkerByPoi():").append(poidetail).toString());
        clearSelectedMarkerIcon();
        setCurrentlySelectedPoi(poidetail);
        Collection collection = mClusterManager.getMarkerCollection().getMarkers();
        Utils.logger(TAG, (new StringBuilder()).append("setSelectedMarkerByPoi(): m2.size():").append(collection.size()).toString());
        Iterator iterator = collection.iterator();
        int i = 0;
        do
        {
label0:
            {
                if (i < collection.size())
                {
                    String s = ((Marker)iterator.next()).getTitle();
                    Utils.logger(TAG, (new StringBuilder()).append("setSelectedMarkerByPoi(): this marker title:").append(s).toString());
                    Utils.logger(TAG, (new StringBuilder()).append("setSelectedMarkerByPoi(): we are lookig for:").append(poidetail.getId()).toString());
                    if (!s.equalsIgnoreCase(poidetail.getId()))
                    {
                        break label0;
                    }
                    Utils.logger(TAG, "setSelectedMarkerByPoiclear(): found it!!:");
                    setCurrentlySelectedPoi(poidetail);
                    selectedMarker = true;
                    setSelectedMarkerIcon(true);
                }
                return;
            }
            i++;
        } while (true);
    }

    public void setSelectedToursMarkerByPoi(POIDetail poidetail, boolean flag)
    {
        BitmapDescriptor bitmapdescriptor;
        Utils.logger(TAG, (new StringBuilder()).append("setSelectedToursMarkerByPoi():").append(poidetail).toString());
        setCurrentlySelectedPoi(poidetail);
        poidetail = getMarkerIcon();
        bitmapdescriptor = getFavoriteMarkerIcon();
_L1:
        Marker marker;
label0:
        {
            try
            {
                for (Iterator iterator = mMapMarkers.iterator(); iterator.hasNext(); marker.setIcon(bitmapdescriptor))
                {
                    marker = (Marker)iterator.next();
                    if (!PreferenceManager.isFavorite(getActivity(), marker.getTitle()))
                    {
                        break label0;
                    }
                }

            }
            // Misplaced declaration of an exception variable
            catch (POIDetail poidetail)
            {
                poidetail.printStackTrace();
            }
            poidetail = getSelectedMarkerIcon();
            if (PreferenceManager.isFavorite(getActivity(), getCurrentlySelectedPoi().getId()))
            {
                poidetail = getFavoriteSelectedMarkerIcon();
            }
            getMarkerById(getCurrentlySelectedPoi().getId()).setIcon(poidetail);
            if (flag)
            {
                poidetail = new CameraPosition(getCurrentlySelectedPoi().getPosition(), map.getCameraPosition().zoom, map.getCameraPosition().tilt, map.getCameraPosition().bearing);
                map.animateCamera(CameraUpdateFactory.newCameraPosition(poidetail));
            }
            return;
        }
        marker.setIcon(poidetail);
          goto _L1
    }

    public void showCurrentTourInMap(String s)
    {
        showUI();
        newPoiList = PoiManager.getInstance(mContext).getCurrentTourList();
        addTourMarkers(s);
    }

    public void showSearch()
    {
        hideMapOverlay();
        hideDetailPager();
        hideZoomError();
        clearSelectedMarkerIcon();
        mSearchView.setVisibility(0);
        mSearchEditText.requestFocus();
        mSearchEditText.postDelayed(new Runnable() {

            final MapFragment this$0;

            public void run()
            {
                ((InputMethodManager)getActivity().getSystemService("input_method")).showSoftInput(mSearchEditText, 0);
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        }, 200L);
    }

    public void showSurpriseMePoi(final POIDetail poi, boolean flag, boolean flag1)
    {
        map.setOnCameraChangeListener(null);
        showUI();
        hideDetailPager();
        final LatLng ll = new LatLng(poi.getLatitude(), poi.getLongitude());
        if (flag1)
        {
            selectedMarker = true;
            map.moveCamera(CameraUpdateFactory.newLatLngZoom(ll, 6F));
        }
        selectedMarker = false;
        ArrayList arraylist = new ArrayList();
        arraylist.add(poi);
        PoiManager.getInstance(getActivity()).setCurrentPOIList(arraylist);
        addPlacesMarkers(PoiManager.getInstance(getActivity()).getCurrentPOIList());
        (new Handler()).postDelayed(new Runnable() {

            final MapFragment this$0;
            final LatLng val$ll;
            final POIDetail val$poi;

            public void run()
            {
                map.animateCamera(CameraUpdateFactory.newLatLngZoom(ll, 17F));
                (new Handler()).postDelayed(new Runnable() {

                    final _cls18 this$1;

                    public void run()
                    {
                        setPlacesMapListeners();
                        setSelectedMarkerByPoi(poi);
                        showDetailPager(poi);
                    }

            
            {
                this$1 = _cls18.this;
                super();
            }
                }, 2000L);
            }

            
            {
                this$0 = MapFragment.this;
                ll = latlng;
                poi = poidetail;
                super();
            }
        }, 500L);
    }

    public void showUI()
    {
        showMapSettings();
        if (isCameraZoomedOutToMax())
        {
            showZoomError();
        }
        if (MainNavigationActivity.isMapTypePlaces())
        {
            ((MainNavigationActivity)getActivity()).getMapOverlayFragment().showRightMenu();
            return;
        } else
        {
            ((MainNavigationActivity)getActivity()).getMapOverlayFragment().hideRightMenu();
            return;
        }
    }

    public void zoomCloseupToMapLocation(Location location)
    {
        showUI();
        Utils.logger(TAG, (new StringBuilder()).append("zoomCloseupToMapLocation():currentZoom: ").append(map.getCameraPosition().zoom).toString());
        float f = map.getCameraPosition().zoom;
        location = new CameraPosition(new LatLng(location.getLatitude(), location.getLongitude()), f * 1.25F, map.getCameraPosition().tilt, map.getCameraPosition().bearing);
        map.animateCamera(CameraUpdateFactory.newCameraPosition(location));
    }

    public void zoomToMapLocation(Location location)
    {
        mMapInited = true;
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(location.getLatitude(), location.getLongitude()), 8F));
        Object obj1 = map.getProjection();
        Object obj = ((Projection) (obj1)).getVisibleRegion().latLngBounds.northeast;
        obj1 = ((Projection) (obj1)).getVisibleRegion().latLngBounds.southwest;
        obj = PoiManager.getInstance(mContext).getPoiListWithinBounds(((LatLng) (obj)).latitude, ((LatLng) (obj1)).latitude, ((LatLng) (obj1)).longitude, ((LatLng) (obj)).longitude);
        Utils.logger(TAG, (new StringBuilder()).append("zoomToMapLocation(): list.size():").append(((ArrayList) (obj)).size()).toString());
        POIDetail poidetail;
        for (Iterator iterator = ((ArrayList) (obj)).iterator(); iterator.hasNext(); poidetail.setDistance((long)Utils.getDistanceBetweenLocations(location.getLatitude(), location.getLongitude(), poidetail.getLatitude(), poidetail.getLongitude(), "M")))
        {
            poidetail = (POIDetail)iterator.next();
        }

        Collections.sort(((List) (obj)), new Comparator() {

            final MapFragment this$0;

            public int compare(POIDetail poidetail2, POIDetail poidetail3)
            {
                return Math.round(poidetail2.getDistance() - poidetail3.getDistance());
            }

            public volatile int compare(Object obj2, Object obj3)
            {
                return compare((POIDetail)obj2, (POIDetail)obj3);
            }

            
            {
                this$0 = MapFragment.this;
                super();
            }
        });
        POIDetail poidetail1;
        for (Iterator iterator1 = ((ArrayList) (obj)).iterator(); iterator1.hasNext(); poidetail1.setDistance((long)Utils.getDistanceBetweenLocations(location.getLatitude(), location.getLongitude(), poidetail1.getLatitude(), poidetail1.getLongitude(), "M")))
        {
            poidetail1 = (POIDetail)iterator1.next();
        }

        int i = ((ArrayList) (obj)).size();
        if (i > 20)
        {
            ((ArrayList) (obj)).subList(20, i).clear();
        }
        Utils.logger(TAG, (new StringBuilder()).append("zoomToMapLocation(): IT IS NOW list.size():").append(((ArrayList) (obj)).size()).toString());
        location = new com.google.android.gms.maps.model.LatLngBounds.Builder();
        for (Iterator iterator2 = ((ArrayList) (obj)).iterator(); iterator2.hasNext(); location.include(((POIDetail)iterator2.next()).getPosition())) { }
        location = location.build();
        map.moveCamera(CameraUpdateFactory.newLatLngBounds(location, 0));
        MainNavigationActivity.setMapType(0);
        addPlacesMarkers(((ArrayList) (obj)));
    }





/*
    static GoogleMap access$102(MapFragment mapfragment, GoogleMap googlemap)
    {
        mapfragment.map = googlemap;
        return googlemap;
    }

*/




/*
    static boolean access$1202(MapFragment mapfragment, boolean flag)
    {
        mapfragment.selectedMarker = flag;
        return flag;
    }

*/







/*
    static String access$1702(MapFragment mapfragment, String s)
    {
        mapfragment.mFavoritesString = s;
        return s;
    }

*/
















/*
    static ClusterManager access$302(MapFragment mapfragment, ClusterManager clustermanager)
    {
        mapfragment.mClusterManager = clustermanager;
        return clustermanager;
    }

*/







/*
    static PoiRenderer access$402(MapFragment mapfragment, PoiRenderer poirenderer)
    {
        mapfragment.mPoiRenderer = poirenderer;
        return poirenderer;
    }

*/





/*
    static boolean access$702(MapFragment mapfragment, boolean flag)
    {
        mapfragment.mMapInited = flag;
        return flag;
    }

*/


}
