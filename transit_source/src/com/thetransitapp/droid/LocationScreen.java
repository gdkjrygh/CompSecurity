// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid;

import android.app.AlertDialog;
import android.content.Intent;
import android.database.Cursor;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.widget.SearchView;
import com.bricolsoftconsulting.geocoderplus.Address;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.thetransitapp.droid.model.SimplePlacemark;
import com.thetransitapp.droid.service.GeocoderTask;
import com.thetransitapp.droid.service.ReverseGeocoderTask;
import com.thetransitapp.droid.service.ServiceCallback;
import com.thetransitapp.droid.ui.DelayedAutoCompleteView;
import com.thetransitapp.droid.widget.PlacesAutoCompleteAdapter;
import java.text.NumberFormat;

// Referenced classes of package com.thetransitapp.droid:
//            BaseMapScreen, TransitActivity

public class LocationScreen extends BaseMapScreen
    implements com.google.android.gms.maps.GoogleMap.OnMapLongClickListener, com.thetransitapp.droid.service.GeocoderTask.GeocoderTaskCallback, android.view.View.OnClickListener, com.actionbarsherlock.widget.SearchView.OnSuggestionListener
{

    private PlacesAutoCompleteAdapter autoCompleteAdapter;
    private double latitude;
    private Button locationSet;
    private double longitude;
    private Marker oldMarker;
    private MenuItem searchMenuItem;
    private SearchView searchView;
    private boolean useMyLocation;

    public LocationScreen()
    {
        super(TransitActivity.TransitScreen.LOCATION_SCREEN);
        super.setHasOptionsMenu(true);
    }

    private void dropMarker(double d, double d1)
    {
        Object obj = new LatLng(d, d1);
        boolean flag;
        if (oldMarker != null)
        {
            oldMarker.setPosition(((LatLng) (obj)));
        } else
        {
            MarkerOptions markeroptions = new MarkerOptions();
            markeroptions.position(((LatLng) (obj)));
            oldMarker = super.getMap().addMarker(markeroptions);
        }
        obj = locationSet;
        if (latitude != 0.0D && longitude != 0.0D)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((Button) (obj)).setEnabled(flag);
    }

    public void onAddressReceived(Address address)
    {
        if (super.isVisible())
        {
            if (address != null)
            {
                latitude = address.getLatitude();
                longitude = address.getLongitude();
                useMyLocation = address.getFormattedAddress().equals(super.getString(0x7f0a0042));
                hideKeyboard();
                if (super.getMap() != null)
                {
                    if (address.getViewPort() != null)
                    {
                        super.centerMap(address.getViewPort());
                    } else
                    {
                        super.centerMap(latitude, longitude);
                    }
                    dropMarker(latitude, longitude);
                }
            } else
            if (super.getActivity() != null)
            {
                address = (new android.app.AlertDialog.Builder(super.getActivity())).create();
                address.setTitle(getText(0x7f0a005a));
                address.setMessage(getText(0x7f0a0059));
                address.setButton(-1, getText(0x7f0a002f), null);
                address.show();
                return;
            }
        }
    }

    public void onCameraChange(CameraPosition cameraposition)
    {
        super.onCameraChange(cameraposition);
        if (autoCompleteAdapter != null)
        {
            autoCompleteAdapter.setLocation(cameraposition.target);
        }
    }

    public void onClick(View view)
    {
        if (latitude != 0.0D && longitude != 0.0D)
        {
            view = new SimplePlacemark(latitude, longitude);
            view.setName(searchView.getQuery().toString());
            Intent intent = new Intent();
            intent.putExtra("place", view);
            if (isVisible() && getActivity() != null)
            {
                byte byte0;
                if (useMyLocation)
                {
                    byte0 = 2;
                } else
                {
                    byte0 = 1;
                }
                ((TransitActivity)getActivity()).onActivityResult(TransitActivity.TransitScreen.LOCATION_SCREEN.ordinal(), byte0, intent);
            }
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        if (searchMenuItem == null)
        {
            searchView = new SearchView(getSherlockActivity().getSupportActionBar().getThemedContext());
            searchView.setQueryHint(getText(0x7f0a0044));
            searchMenuItem = menu.add(0, 10, 0, 0x7f0a0045).setActionView(searchView);
            searchMenuItem.setShowAsAction(9);
            searchMenuItem.setIcon(0x7f020033);
            searchMenuItem.expandActionView();
            autoCompleteAdapter = new PlacesAutoCompleteAdapter(super.getSherlockActivity().getSupportActionBar().getThemedContext(), 0x1090003);
            searchView.setSuggestionsAdapter(autoCompleteAdapter);
            searchView.setOnSuggestionListener(this);
            menu = (DelayedAutoCompleteView)searchView.findViewById(0x7f050032);
            if (menu != null)
            {
                menu.setThreshold(0);
            }
            ((TransitActivity)getActivity()).setSearchLocationMenuItem(searchMenuItem);
        }
    }

    public void onDestroyOptionsMenu()
    {
        super.onDestroyOptionsMenu();
        searchMenuItem.expandActionView();
        searchMenuItem.collapseActionView();
    }

    public void onMapLongClick(LatLng latlng)
    {
        NumberFormat numberformat = NumberFormat.getNumberInstance();
        numberformat.setMaximumFractionDigits(6);
        searchView.setQuery((new StringBuilder(String.valueOf(numberformat.format(latlng.latitude)))).append(", ").append(numberformat.format(latlng.longitude)).toString(), false);
        (new ReverseGeocoderTask(super.getActivity(), new ServiceCallback() {

            final LocationScreen this$0;

            public void onError(String s, Exception exception)
            {
            }

            public volatile void onResult(Object obj)
            {
                onResult((String)obj);
            }

            public void onResult(String s)
            {
                if (s != null)
                {
                    searchView.setQuery(s, true);
                }
            }

            
            {
                this$0 = LocationScreen.this;
                super();
            }
        })).execute(new LatLng[] {
            latlng
        });
        latitude = latlng.latitude;
        longitude = latlng.longitude;
        useMyLocation = false;
        dropMarker(latlng.latitude, latlng.longitude);
        super.hideKeyboard();
    }

    public void onMyLocationChange(Location location)
    {
        super.onMyLocationChange(location);
        if (location != null)
        {
            autoCompleteAdapter.setCurrent(new LatLng(location.getLatitude(), location.getLongitude()));
            if (super.isTracking() && super.isVisible())
            {
                latitude = location.getLatitude();
                longitude = location.getLongitude();
                useMyLocation = true;
            }
        }
    }

    public void onPause()
    {
        super.onPause();
        if (super.getMap() != null)
        {
            super.getMap().setOnMapLongClickListener(null);
            if (oldMarker != null)
            {
                oldMarker.remove();
                oldMarker = null;
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        if (super.getMap() != null)
        {
            Location location = super.getLastLocation();
            if (location != null)
            {
                super.centerMap(location);
                if (!super.isCurrentLocation())
                {
                    dropMarker(location.getLatitude(), location.getLongitude());
                }
            }
            super.getMap().setOnMapLongClickListener(this);
        }
    }

    public boolean onSuggestionClick(int i)
    {
        if (super.getMap() != null)
        {
            Cursor cursor = autoCompleteAdapter.getCursor();
            cursor.moveToPosition(i);
            i = cursor.getColumnIndex("suggest_text_1");
            int j = cursor.getColumnIndex("suggest_text_2");
            (new GeocoderTask(super.getActivity(), this)).execute(new String[] {
                cursor.getString(j)
            });
            searchMenuItem.collapseActionView();
            searchView.setQuery(cursor.getString(i), false);
        }
        return true;
    }

    public boolean onSuggestionSelect(int i)
    {
        return true;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        locationSet.setOnClickListener(this);
        locationSet.setEnabled(false);
    }

    public void setSearchMenuItem(MenuItem menuitem)
    {
        searchMenuItem = menuitem;
    }

}
