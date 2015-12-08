// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.app.ActionBar;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Address;
import android.location.Location;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.text.Html;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import com.analytics.AnalyticsMain;
import com.analytics.utils.enums.ScreenNames;
import com.android.volley.toolbox.NetworkImageView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.LocationClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.AnalyticsUtil;
import com.kohls.mcommerce.opal.common.util.FontUtils;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.controller.ControllerFactory;
import com.kohls.mcommerce.opal.framework.controller.impl.StoreLocatorControllerImpl;
import com.kohls.mcommerce.opal.framework.listener.SuggestionItemListener;
import com.kohls.mcommerce.opal.framework.view.adapter.StoreInfoAdapter;
import com.kohls.mcommerce.opal.framework.view.component.storelocatorMap.MapSearchBox;
import com.kohls.mcommerce.opal.framework.view.component.views.GothamBookTextView;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.helper.adapter.MapRecentSearchAdapter;
import com.kohls.mcommerce.opal.helper.analytics.AnalyticsHelper;
import com.kohls.mcommerce.opal.helper.cache.image.LoadImageTask;
import com.kohls.mcommerce.opal.helper.db.custom.DBSearchPlacesHelper;
import com.kohls.mcommerce.opal.helper.error.Error;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import com.kohls.mcommerce.opal.wl.HybridScreen;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider

public class FindinStoreActivity extends BaseActivityWithoutSlider
    implements SuggestionItemListener, com.kohls.mcommerce.opal.framework.view.component.storelocatorMap.MapSearchBox.IGPSSearchListener, com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, LocationListener, android.widget.AdapterView.OnItemClickListener
{
    protected class ToggleStoreTask extends AsyncTask
    {

        final FindinStoreActivity this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Boolean[])aobj);
        }

        protected transient List doInBackground(Boolean aboolean[])
        {
            if (mIsShowAllStore && mStoreData != null)
            {
                ArrayList arraylist = new ArrayList();
                Iterator iterator = mStoreData.iterator();
                do
                {
                    aboolean = arraylist;
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    aboolean = (com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)iterator.next();
                    if (aboolean.getAvailability() != null && !aboolean.getAvailability().contains("Out") && aboolean.getAvailableStock() != null && Integer.parseInt(aboolean.getAvailableStock()) > 0 && (selectedQuantity == 0 || selectedQuantity <= Integer.parseInt(aboolean.getAvailableStock())))
                    {
                        arraylist.add(aboolean);
                    }
                } while (true);
            } else
            {
                aboolean = mStoreData;
            }
            return aboolean;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((List)obj);
        }

        protected void onPostExecute(List list)
        {
            super.onPostExecute(list);
            showStores(list);
        }

        protected void onPreExecute()
        {
            super.onPreExecute();
        }

        protected ToggleStoreTask()
        {
            this$0 = FindinStoreActivity.this;
            super();
        }
    }


    private static final int LOCATION_FETCHING_TIME_OUT = 7000;
    private final long LAST_LOCATION_TIMEOUT = 0xfffffffff8475800L;
    private String collectionID;
    private boolean isFromCheckout;
    private boolean isOnlineExclusive;
    private String mCollectionId;
    private StoreLocatorControllerImpl mController;
    private Location mCurrentLocation;
    protected TextView mHintText;
    private boolean mIsFromCheckout;
    private boolean mIsProductBopusEligible;
    boolean mIsShowAllStore;
    private boolean mIsSkuBopusEligible;
    protected boolean mIsUpdateStore;
    protected LinearLayout mLayout;
    private LocationClient mLocationClient;
    private Handler mLocationTimeOutHandler;
    Runnable mLocationTimeout;
    private LocationRequest mLocationequest;
    Button mMyStoreBtn;
    private TextView mNoStoreMsgText;
    private String mProductImgURL;
    private String mProductOmniture;
    private boolean mResolvingError;
    private final ResultReceiver mResultReceiver = new ResultReceiver(null) {

        final FindinStoreActivity this$0;

        protected void onReceiveResult(int i, Bundle bundle)
        {
            int j;
            j = 0;
            if (bundle != null)
            {
                j = bundle.getInt("dialogId");
            }
            i;
            JVM INSTR tableswitch 4006 4007: default 36
        //                       4006 37
        //                       4007 36;
               goto _L1 _L2 _L1
_L1:
            return;
_L2:
            if (j > 0)
            {
                onBackPressed();
                return;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

            
            {
                this$0 = FindinStoreActivity.this;
                super(handler);
            }
    };
    private MapSearchBox mSearchBox;
    protected TextView mShowAllStoreText;
    private String mSkuCode;
    protected List mStoreData;
    protected StoreInfoAdapter mStoreInfoAdapter;
    protected LinearLayout mSuggContainer;
    private MapRecentSearchAdapter mSuggestAdapter;
    private String mWebID;
    protected int selectedQuantity;
    protected ListView storeListView;
    private View suggView;
    private List suggestAddresses;

    public FindinStoreActivity()
    {
        mLocationTimeout = new Runnable() {

            final FindinStoreActivity this$0;

            public void run()
            {
                showLocationFailureError();
            }

            
            {
                this$0 = FindinStoreActivity.this;
                super();
            }
        };
    }

    private boolean checkActivityisActive()
    {
        return !isFinishing();
    }

    private void getStoreInventory(com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store store)
    {
        if (!UtilityMethods.isNetworkConnected(this))
        {
            dismissDialog();
            UtilityMethods.showToast(this, getString(0x7f0803cd), 0);
        } else
        {
            showStoreSearchProgress();
            if (mController == null)
            {
                mController = (StoreLocatorControllerImpl)ControllerFactory.getStoreLocatorController(null, new WeakReference(this));
            }
            mController.getInventoryforSKU(mCurrentLocation, store, mSkuCode, KohlsPhoneApplication.getInstance().getKohlsPref().getUserStore());
            if (store == null)
            {
                setAllStoreLinkVisible();
                return;
            }
        }
    }

    private void initMapSearchBox()
    {
        Object obj;
        obj = (LinearLayout)findViewById(0x7f0d0250);
        mSearchBox = new MapSearchBox(this, Integer.valueOf(0x7f030096), this, this, null);
        mSearchBox.setFocusableInTouchMode(false);
        mSearchBox.setFocusable(false);
        ((LinearLayout) (obj)).addView(mSearchBox, new android.widget.LinearLayout.LayoutParams(-1, -2));
        mMyStoreBtn = (Button)findViewById(0x7f0d0251);
        obj = KohlsPhoneApplication.getInstance().getKohlsPref().getUserStore();
        if (obj == null) goto _L2; else goto _L1
_L1:
        mMyStoreBtn.setVisibility(0);
        if (((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store) (obj)).getAddress() != null && ((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store) (obj)).getAddress().getLocation() != null)
        {
            Location location = new Location(getResources().getString(0x7f0803b8));
            location.setLatitude(((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store) (obj)).getAddress().getLocation().getLatitude());
            location.setLongitude(((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store) (obj)).getAddress().getLocation().getLongitude());
            mCurrentLocation = location;
            getStoreInventory(null);
        }
_L4:
        mMyStoreBtn.setOnClickListener(new android.view.View.OnClickListener() {

            final FindinStoreActivity this$0;

            public void onClick(View view)
            {
                mShowAllStoreText.setVisibility(8);
                mIsShowAllStore = false;
                mShowAllStoreText.setText(Html.fromHtml((new StringBuilder()).append(" <u> ").append(getString(0x7f0803ea)).append(" </u> ").toString()));
                getStoreInventory(KohlsPhoneApplication.getInstance().getKohlsPref().getUserStore());
            }

            
            {
                this$0 = FindinStoreActivity.this;
                super();
            }
        });
        return;
_L2:
        mMyStoreBtn.setVisibility(8);
        if (isLocationServiceEnabled())
        {
            startFetchingCurrentLocation();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean isLocationServiceEnabled()
    {
        LocationManager locationmanager = (LocationManager)getSystemService("location");
        return locationmanager != null && locationmanager.isProviderEnabled("network");
    }

    private void removeOldLocations()
    {
        if (mCurrentLocation != null && mCurrentLocation.getElapsedRealtimeNanos() > 0xfffffffff8475800L)
        {
            mCurrentLocation = null;
        }
    }

    private void sendAnalyticsForFindInStoreSearch(String s)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        ScreenNames screennames;
        if (isFromCheckout)
        {
            ScreenNames screennames1 = ScreenNames.STORE_SEARCH_CHECKOUT;
            hashmap.put("page.siteSection", "checkout|store search");
            screennames = screennames1;
            if (KohlsPhoneApplication.getInstance().getKohlsPref().getCartID() != null)
            {
                hashmap.put("cart.id", KohlsPhoneApplication.getInstance().getKohlsPref().getCartID());
                screennames = screennames1;
            }
        } else
        {
            screennames = ScreenNames.STORE_SEARCH_PDP;
            hashmap.put("page.siteSection", "pdp|store search");
        }
        hashmap.put("actions.storeSearch", "1");
        if (s != null)
        {
            hashmap.put("store.search", s);
        }
        hashmap.put("page.type", screennames.getPageType());
        hashmap.put("page.name", screennames.getTrackState());
        if (mProductOmniture == null) goto _L2; else goto _L1
_L1:
        hashmap.put("&&products", mProductOmniture);
_L4:
        AnalyticsUtil.sendTrackState(screennames.getTrackState(), hashmap);
        return;
_L2:
        StringBuilder stringbuilder = new StringBuilder();
        if (isOnlineExclusive)
        {
            s = "y";
        } else
        {
            s = "n";
        }
        stringbuilder.append(";");
        if (mWebID != null)
        {
            stringbuilder.append(mWebID);
            stringbuilder.append(";;;;");
            if (collectionID != null)
            {
                stringbuilder.append("evar11=").append(collectionID).append("|");
            }
            stringbuilder.append("evar16=").append(s);
            hashmap.put("&&products", stringbuilder.toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setAllStoreLinkVisible()
    {
        if (!mIsUpdateStore)
        {
            mShowAllStoreText.setVisibility(0);
        }
    }

    private void showLocationSettings()
    {
        dismissDialog();
        android.app.AlertDialog.Builder builder = UtilityMethods.getAlertDialog(this, getString(0x7f08021f), getString(0x7f080111), getString(0x7f0800c7), new android.content.DialogInterface.OnClickListener() {

            final FindinStoreActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1)
                {
                    dialoginterface = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
                    startActivity(dialoginterface);
                }
            }

            
            {
                this$0 = FindinStoreActivity.this;
                super();
            }
        });
        if (checkActivityisActive())
        {
            builder.show();
        }
    }

    private void showStoreSearchProgress()
    {
        UtilityMethods.showKohlsProgressDialog(4002, "", getString(0x7f08011b), null, true, true, false, 4005, this);
    }

    private void startFetchingCurrentLocation()
    {
        if (checkActivityisActive())
        {
            UtilityMethods.showKohlsProgressDialog(4002, "", getString(0x7f080101), mResultReceiver, true, true, false, 4004, this);
            mLocationClient = new LocationClient(this, this, this);
            mLocationClient.connect();
        }
    }

    private View suggestListPopWindow(boolean flag)
    {
        Object obj = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(((DisplayMetrics) (obj)));
        obj = View.inflate(this, 0x7f0300e4, null);
        ListView listview = (ListView)((View) (obj)).findViewById(0x7f0d05df);
        Button button = (Button)((View) (obj)).findViewById(0x7f0d05e0);
        if (flag)
        {
            button.setVisibility(0);
        } else
        {
            button.setVisibility(8);
        }
        button.setOnClickListener(new android.view.View.OnClickListener() {

            final FindinStoreActivity this$0;

            public void onClick(View view)
            {
                clearRecentSearchFromDB();
            }

            
            {
                this$0 = FindinStoreActivity.this;
                super();
            }
        });
        mSuggestAdapter = new MapRecentSearchAdapter(this, 0x7f0300e4, suggestAddresses);
        listview.setAdapter(mSuggestAdapter);
        listview.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final FindinStoreActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                if (mSuggContainer != null)
                {
                    mSuggContainer.setVisibility(8);
                }
                if (suggestAddresses != null && suggestAddresses.size() > i)
                {
                    onSuggestClick((Address)suggestAddresses.get(i));
                }
            }

            
            {
                this$0 = FindinStoreActivity.this;
                super();
            }
        });
        ((View) (obj)).setFocusable(true);
        return ((View) (obj));
    }

    protected void attachActionItemListener()
    {
        getActionBarHelper().getItemView().setOnClickListener(new android.view.View.OnClickListener() {

            final FindinStoreActivity this$0;

            public void onClick(View view)
            {
                UtilityMethods.openHybridScreen(FindinStoreActivity.this, HybridScreen.SHOPPINGBAG);
            }

            
            {
                this$0 = FindinStoreActivity.this;
                super();
            }
        });
    }

    protected void clearRecentSearchFromDB()
    {
        android.app.AlertDialog.Builder builder = UtilityMethods.getAlertDialog(this, getString(0x7f0800f8), getString(0x7f080275), getString(0x7f0800c7), new android.content.DialogInterface.OnClickListener() {

            final FindinStoreActivity this$0;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                if (i == -1)
                {
                    dialoginterface = new DBSearchPlacesHelper();
                    try
                    {
                        dialoginterface.deleteAll("SearchPlaces");
                        showSuggestionItems(null, false);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (DialogInterface dialoginterface)
                    {
                        UtilityMethods.showToast(getApplicationContext(), getString(0x7f0800f9), 0);
                    }
                    return;
                } else
                {
                    onBackPressed();
                    return;
                }
            }

            
            {
                this$0 = FindinStoreActivity.this;
                super();
            }
        });
        if (checkActivityisActive())
        {
            builder.show();
        }
    }

    protected void dismissDialog()
    {
        UtilityMethods.dismissDialog(4001);
        UtilityMethods.dismissDialog(4002);
    }

    protected int getLayoutId()
    {
        return 0x7f03006a;
    }

    public boolean hideSuggestionItems(boolean flag)
    {
        if (mLayout != null && mLayout.getVisibility() == 0)
        {
            mLayout.setVisibility(8);
        }
        if (mSuggContainer != null && mSuggContainer.getVisibility() == 0)
        {
            mSuggContainer.setVisibility(8);
            return true;
        } else
        {
            return false;
        }
    }

    protected void initializeViews(Bundle bundle)
    {
        mSkuCode = bundle.getString("product_sku");
        mShowAllStoreText = (TextView)findViewById(0x7f0d025c);
        mShowAllStoreText.setVisibility(8);
        initMapSearchBox();
        Object obj = (NetworkImageView)findViewById(0x7f0d0254);
        if (bundle.getString("product_imageUrl") != null)
        {
            mProductImgURL = bundle.getString("product_imageUrl");
            LoadImageTask.getInstance().loadImage(UtilityMethods.getUpdatedURL(mProductImgURL, (int)(getResources().getDimension(0x7f0900e1) / getResources().getDisplayMetrics().density), (int)(getResources().getDimension(0x7f0900e1) / getResources().getDisplayMetrics().density)), ((android.widget.ImageView) (obj)), 0x7f02014b, 0x7f02014b);
        }
        obj = (TextView)findViewById(0x7f0d0255);
        ((TextView) (obj)).setTypeface(FontUtils.loadTypeFace(this, "Gotham-Book.otf"));
        if (bundle.getString("product_nameTitle") != null)
        {
            ((TextView) (obj)).setText(Html.fromHtml(bundle.getString("product_nameTitle")));
        }
        mProductOmniture = bundle.getString("key_omniture_s_products");
        mLayout = (LinearLayout)findViewById(0x7f0d0262);
        mLayout.setEnabled(false);
        mLayout.setClickable(false);
        obj = (TextView)findViewById(0x7f0d0256);
        ((TextView) (obj)).setTypeface(FontUtils.loadTypeFace(this, "Gotham-Bold.otf"));
        RatingBar ratingbar;
        if (bundle.getString("product_salePrice") != null)
        {
            ((TextView) (obj)).setText(bundle.getString("product_salePrice"));
            ((TextView) (obj)).setVisibility(0);
        } else
        {
            ((TextView) (obj)).setVisibility(8);
        }
        mIsProductBopusEligible = bundle.getBoolean("product_bopus_eligible");
        mIsSkuBopusEligible = bundle.getBoolean("sku_bopus_eligible");
        mIsFromCheckout = bundle.getBoolean("isFromCheckoutScreen");
        mCollectionId = bundle.getString("collection id");
        obj = (TextView)findViewById(0x7f0d0257);
        ((TextView) (obj)).setTypeface(FontUtils.loadTypeFace(this, "Gotham-Book.otf"));
        if (bundle.getString("product_oriPrice") != null)
        {
            ((TextView) (obj)).setText(bundle.getString("product_oriPrice"));
            ((TextView) (obj)).setVisibility(0);
        } else
        {
            ((TextView) (obj)).setVisibility(8);
        }
        mSkuCode = bundle.getString("product_sku");
        obj = (TextView)findViewById(0x7f0d0258);
        if (mSkuCode != null)
        {
            ((TextView) (obj)).setText((new StringBuilder()).append(getString(0x7f0804e0)).append(mSkuCode).toString());
            ((TextView) (obj)).setVisibility(0);
        } else
        {
            ((TextView) (obj)).setVisibility(8);
        }
        obj = (GothamBookTextView)findViewById(0x7f0d025b);
        ratingbar = (RatingBar)findViewById(0x7f0d025a);
        if (bundle.getString("product_ratings") != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            if (bundle.getInt("product_ratings_count") >= 0)
            {
                stringbuilder.append("(");
                stringbuilder.append(bundle.getInt("product_ratings_count"));
                stringbuilder.append(" ");
                stringbuilder.append(getString(0x7f080419));
                stringbuilder.append(")");
            } else
            {
                stringbuilder.append(getResources().getString(0x7f0803cf));
                ratingbar.setVisibility(8);
            }
            try
            {
                ratingbar.setRating(Float.parseFloat(bundle.getString("product_ratings")));
            }
            catch (Exception exception)
            {
                ratingbar.setRating(0.0F);
            }
            mWebID = bundle.getString("product_webID");
            if (mWebID != null)
            {
                ((GothamBookTextView) (obj)).setText(stringbuilder);
            }
        } else
        {
            ratingbar.setVisibility(8);
            ((GothamBookTextView) (obj)).setVisibility(8);
        }
        mHintText = (TextView)findViewById(0x7f0d025e);
        mNoStoreMsgText = (TextView)findViewById(0x7f0d025f);
        storeListView = (ListView)findViewById(0x7f0d0260);
        mStoreData = new ArrayList();
        collectionID = bundle.getString("collection id");
        isOnlineExclusive = bundle.getBoolean("OnlineExclusive");
        isFromCheckout = bundle.getBoolean("isFromCheckoutScreen");
        mStoreInfoAdapter = new StoreInfoAdapter(this, 0x7f030069, mStoreData, mSkuCode, mWebID, mIsProductBopusEligible, mIsSkuBopusEligible, collectionID, isOnlineExclusive, isFromCheckout, mIsUpdateStore);
        storeListView.setAdapter(mStoreInfoAdapter);
        mShowAllStoreText.setOnClickListener(new android.view.View.OnClickListener() {

            final FindinStoreActivity this$0;

            public void onClick(View view)
            {
                if (mIsShowAllStore)
                {
                    mIsShowAllStore = false;
                    mShowAllStoreText.setText(Html.fromHtml((new StringBuilder()).append(" <u> ").append(getString(0x7f0803ea)).append(" </u> ").toString()));
                } else
                {
                    mIsShowAllStore = true;
                    mShowAllStoreText.setText(Html.fromHtml((new StringBuilder()).append(" <u> ").append(getString(0x7f0804cc)).append(" </u> ").toString()));
                }
                ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 2);
                (new ToggleStoreTask()).execute(new Boolean[] {
                    Boolean.valueOf(mIsShowAllStore)
                });
            }

            
            {
                this$0 = FindinStoreActivity.this;
                super();
            }
        });
        if (!isLocationServiceEnabled() && KohlsPhoneApplication.getInstance().getKohlsPref().getUserStore() == null)
        {
            dismissDialog();
            showLocationSettings();
        }
    }

    public void onBackPressed()
    {
        dismissDialog();
        stopLocationUpdates();
        finish();
    }

    public void onConnected(Bundle bundle)
    {
label0:
        {
            if (checkActivityisActive())
            {
                if (mLocationClient.isConnected())
                {
                    mCurrentLocation = mLocationClient.getLastLocation();
                    KohlsPhoneApplication.getInstance().getAnalytics().sendLocation(mLocationClient.getLastLocation());
                    if (android.os.Build.VERSION.SDK_INT >= 17)
                    {
                        removeOldLocations();
                    }
                }
                if (mCurrentLocation == null)
                {
                    break label0;
                }
                stopLocationUpdates();
                getStoreInventory(null);
            }
            return;
        }
        if (!isLocationServiceEnabled())
        {
            dismissDialog();
            showLocationSettings();
            return;
        } else
        {
            mLocationTimeOutHandler = new Handler();
            mLocationequest = new LocationRequest();
            mLocationequest.setPriority(104);
            mLocationequest.setExpirationDuration(7000L);
            mLocationClient.requestLocationUpdates(mLocationequest, this);
            mLocationTimeOutHandler.postDelayed(mLocationTimeout, 7000L);
            return;
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
        dismissDialog();
        if (!checkActivityisActive() || mResolvingError)
        {
            return;
        }
        if (connectionresult.hasResolution())
        {
            try
            {
                mResolvingError = true;
                connectionresult.startResolutionForResult(this, 1001);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ConnectionResult connectionresult)
            {
                mLocationClient.connect();
            }
            return;
        } else
        {
            UtilityMethods.showGoogleServiceErrorDialog(connectionresult.getErrorCode(), 1001, this);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        mSuggContainer = null;
    }

    public void onDisconnected()
    {
        dismissDialog();
        mResolvingError = false;
    }

    public void onGPSDrawableClick()
    {
        if (mSearchBox != null)
        {
            mSearchBox.hideSoftKeyboard();
        }
        if (checkActivityisActive())
        {
            startFetchingCurrentLocation();
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        UtilityMethods.openStoreDetailsActivity(this, (com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStoreInfoAdapter.getStoreInfoData().get(i));
    }

    public void onLocationChanged(Location location)
    {
label0:
        {
            stopLocationUpdates();
            if (checkActivityisActive())
            {
                if (location == null)
                {
                    break label0;
                }
                mCurrentLocation = location;
                getStoreInventory(null);
            }
            return;
        }
        dismissDialog();
        UtilityMethods.showToast(this, getString(0x7f08010a), 1);
    }

    protected void onResume()
    {
        super.onResume();
        if (storeListView != null)
        {
            mStoreInfoAdapter.getMyStore();
            mStoreInfoAdapter.notifyDataSetChanged();
        }
        if (KohlsPhoneApplication.getInstance().getKohlsPref().getUserStore() != null)
        {
            mMyStoreBtn.setVisibility(0);
            return;
        } else
        {
            mMyStoreBtn.setVisibility(8);
            return;
        }
    }

    protected void onStart()
    {
        super.onStart();
        AnalyticsHelper.sendAnalyticsForFindInStore(mProductOmniture, true, mIsFromCheckout, null);
    }

    public void onSuggestClick(Address address)
    {
        if (address == null || !address.hasLatitude() || !checkActivityisActive()) goto _L2; else goto _L1
_L1:
        DBSearchPlacesHelper dbsearchplaceshelper;
        ArrayList arraylist;
        int i;
        boolean flag1;
        if (mSearchBox != null)
        {
            mSearchBox.hideSoftKeyboard();
            mSearchBox.updateKeyWord(address.getFeatureName());
        }
        Location location = new Location("network");
        location.setLatitude(address.getLatitude());
        location.setLongitude(address.getLongitude());
        mCurrentLocation = location;
        dbsearchplaceshelper = new DBSearchPlacesHelper();
        arraylist = dbsearchplaceshelper.getAll();
        flag1 = false;
        i = 0;
_L9:
        boolean flag = flag1;
        if (i >= arraylist.size()) goto _L4; else goto _L3
_L3:
        if (arraylist.get(i) == null || ((Address)arraylist.get(i)).getLocality() == null) goto _L6; else goto _L5
_L5:
        String s;
        String s2 = address.getLocality();
        s = s2;
        if (s2 == null)
        {
            s = address.getAdminArea();
        }
        if (!((Address)arraylist.get(i)).getLocality().equalsIgnoreCase(s)) goto _L6; else goto _L7
_L7:
        flag = true;
_L4:
        if (flag)
        {
            dbsearchplaceshelper.delete(address);
        }
        dbsearchplaceshelper.insert(address);
        getStoreInventory(null);
        String s1;
        if (address.getFeatureName() != null)
        {
            if (address.getFeatureName().contains(","))
            {
                String as[] = new String[2];
                as[0] = address.getFeatureName().split(",")[0];
                as[1] = address.getFeatureName().split(",")[1];
                s1 = (new StringBuilder()).append(as[0].trim()).append("|").append(as[1].trim()).toString();
            } else
            {
                s1 = address.getFeatureName().trim();
            }
        } else
        {
            s1 = "||";
        }
        if (address.getPostalCode() != null)
        {
            String s3 = s1;
            if (s1.contains(address.getPostalCode()))
            {
                s3 = s1.replace(address.getPostalCode(), "").trim();
            }
            address = (new StringBuilder()).append(s3.trim()).append("|").append(address.getPostalCode().trim()).toString();
        } else
        {
            address = (new StringBuilder()).append(s1.trim()).append("|").toString();
        }
        sendAnalyticsForFindInStoreSearch(address);
_L2:
        return;
_L6:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected void showLocationFailureError()
    {
        if (checkActivityisActive())
        {
            dismissDialog();
            UtilityMethods.showAlertDialog(4001, null, "", getString(0x7f08010a), 0, "", getString(0x7f0800c7), "", false, true, this);
        }
    }

    protected void showNoStoreFound()
    {
        if (checkActivityisActive())
        {
            if (mNoStoreMsgText != null)
            {
                mNoStoreMsgText.setVisibility(0);
            }
            if (storeListView != null)
            {
                storeListView.setVisibility(8);
            }
            dismissDialog();
            UtilityMethods.showAlertDialog(4001, null, "", getString(0x7f08010f), 0, "", getString(0x7f0800c7), "", false, true, this);
        }
    }

    protected void showStores(List list)
    {
label0:
        {
            list.removeAll(Collections.singleton(null));
            mStoreInfoAdapter.setAddToBagController(mController);
            mStoreInfoAdapter.setStoreInfoData(list);
            mStoreInfoAdapter.notifyDataSetChanged();
            if (mNoStoreMsgText != null && storeListView != null)
            {
                if (!list.isEmpty())
                {
                    break label0;
                }
                mNoStoreMsgText.setVisibility(0);
                storeListView.setVisibility(8);
            }
            return;
        }
        mNoStoreMsgText.setVisibility(8);
        storeListView.setVisibility(0);
    }

    public void showSuggestionItems(List list, boolean flag)
    {
        if (list != null && list.size() > 0)
        {
            suggestAddresses = list;
            if (mLayout != null)
            {
                mLayout.setVisibility(0);
            }
            if (mSuggContainer == null)
            {
                mSuggContainer = (LinearLayout)findViewById(0x7f0d0261);
                suggView = suggestListPopWindow(flag);
                mSuggContainer.addView(suggView, new android.widget.LinearLayout.LayoutParams(-1, -2));
            } else
            if (mSuggestAdapter != null)
            {
                Button button = (Button)suggView.findViewById(0x7f0d05e0);
                if (flag)
                {
                    button.setVisibility(0);
                } else
                {
                    button.setVisibility(8);
                }
                mSuggestAdapter.setAddresses(list);
                mSuggestAdapter.notifyDataSetChanged();
            } else
            {
                suggView = suggestListPopWindow(flag);
                mSuggContainer.addView(suggView, new android.widget.LinearLayout.LayoutParams(-1, -2));
            }
            mSuggContainer.setVisibility(0);
        } else
        if (mSuggContainer != null)
        {
            mSuggContainer.setVisibility(8);
            return;
        }
    }

    protected void stopLocationUpdates()
    {
        if (mLocationClient != null && mLocationClient.isConnected())
        {
            mLocationClient.removeLocationUpdates(this);
            mLocationequest = null;
            if (mLocationTimeOutHandler != null)
            {
                mLocationTimeOutHandler.removeCallbacks(mLocationTimeout);
                mLocationTimeOutHandler = null;
            }
            mLocationClient.disconnect();
        }
    }

    protected void updateActionBarViews()
    {
        getActionBarHelper().showActionBarWithFIS(getString(0x7f08012d));
        attachActionItemListener();
    }

    public void updateViewsOnFailure(Object obj)
    {
        dismissDialog();
        if (!((Error)obj).getMessage().equalsIgnoreCase(getResources().getString(0x7f0803d2)))
        {
            UtilityMethods.showToast(this, ((Error)obj).getMessage(), 1);
        } else
        if (checkActivityisActive())
        {
            if (mNoStoreMsgText != null)
            {
                mNoStoreMsgText.setVisibility(0);
            }
            if (storeListView != null)
            {
                storeListView.setVisibility(8);
            }
            if (mSuggContainer != null)
            {
                mSuggContainer.setVisibility(8);
            }
            if (mHintText != null)
            {
                mHintText.setVisibility(8);
            }
            if (mLayout != null && mLayout.getVisibility() == 0)
            {
                mLayout.setVisibility(8);
            }
            mShowAllStoreText.setVisibility(8);
            UtilityMethods.showAlertDialog(4001, null, "", getString(0x7f08010f), 0, "", getString(0x7f0800c7), "", false, true, this);
            return;
        }
    }

    public void updateViewsOnSuccess(Object obj)
    {
        dismissDialog();
        if (obj instanceof String)
        {
            obj = (String)obj;
            getActionBarHelper().updateShopingBagCount();
            if (!((String) (obj)).contains(getString(0x7f0804f0)))
            {
                ((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStoreData.get(mStoreInfoAdapter.getItemPosition())).setErrorMess(((String) (obj)));
                mStoreInfoAdapter.notifyDataSetChanged();
                UtilityMethods.showToast(this, ((String) (obj)), 1);
                return;
            } else
            {
                ToastUtility.showAddToBagToastMessages(getActionBar().getHeight(), ((String) (obj)));
                ((com.kohls.mcommerce.opal.framework.vo.StoreLocatorVO.Payload.Store)mStoreData.get(mStoreInfoAdapter.getItemPosition())).setErrorMess("");
                mStoreInfoAdapter.notifyDataSetChanged();
                return;
            }
        }
        if (mLayout != null && mLayout.getVisibility() == 0)
        {
            mLayout.setVisibility(8);
        }
        if (mHintText != null)
        {
            mHintText.setVisibility(8);
        }
        if (storeListView != null)
        {
            storeListView.setVisibility(0);
        }
        if (mSuggContainer != null)
        {
            mSuggContainer.setVisibility(8);
        }
        if ((obj instanceof SparseArray) && (SparseArray)obj != null && ((SparseArray)obj).size() > 0)
        {
            mStoreData = UtilityMethods.asList((SparseArray)obj);
            if (mStoreData != null && mStoreData.size() > 0)
            {
                (new ToggleStoreTask()).execute(new Boolean[] {
                    Boolean.valueOf(mIsShowAllStore)
                });
                return;
            } else
            {
                showNoStoreFound();
                return;
            }
        } else
        {
            showNoStoreFound();
            return;
        }
    }


}
