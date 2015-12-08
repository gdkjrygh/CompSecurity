// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.facebook.FacebookAuthorizationException;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.Request;
import com.facebook.RequestAsyncTask;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionDefaultAudience;
import com.facebook.SessionState;
import com.facebook.UiLifecycleHelper;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphPlace;
import com.facebook.model.GraphUser;
import com.facebook.widget.LoginButton;
import com.facebook.widget.PickerFragment;
import com.facebook.widget.PlacePickerFragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.LocationClient;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.helper.cache.image.BitmapLruCache;
import com.kohls.mcommerce.opal.helper.cache.image.LoadImageTask;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FacebookActivity extends FragmentActivity
    implements com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener, com.android.volley.toolbox.ImageLoader.ImageListener
{
    private class GetAddressTask extends AsyncTask
    {

        Context mContext;
        final FacebookActivity this$0;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Location[])aobj);
        }

        protected transient String doInBackground(Location alocation[])
        {
            Object obj = new Geocoder(mContext, Locale.getDefault());
            alocation = alocation[0];
            try
            {
                obj = ((Geocoder) (obj)).getFromLocation(alocation.getLatitude(), alocation.getLongitude(), 1);
            }
            // Misplaced declaration of an exception variable
            catch (Location alocation[])
            {
                Logger.debug(FacebookActivity.TAG, "IO Exception in getFromLocation()");
                return null;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                alocation = (new StringBuilder()).append("Illegal arguments ").append(Double.toString(alocation.getLatitude())).append(" , ").append(Double.toString(alocation.getLongitude())).append(" passed to address service").toString();
                Logger.debug(FacebookActivity.TAG, alocation);
                return null;
            }
            if (obj != null && ((List) (obj)).size() > 0)
            {
                alocation = (Address)((List) (obj)).get(0);
                obj = new StringBuilder();
                if (alocation != null)
                {
                    if (alocation.getLocality() != null)
                    {
                        ((StringBuilder) (obj)).append((new StringBuilder()).append(alocation.getLocality()).append(", ").toString());
                    }
                    if (alocation.getCountryName() != null)
                    {
                        ((StringBuilder) (obj)).append(alocation.getCountryName());
                    }
                    return ((StringBuilder) (obj)).toString();
                } else
                {
                    return null;
                }
            } else
            {
                return null;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            super.onPostExecute(s);
            if (s != null)
            {
                mLocationAddress = s;
                return;
            } else
            {
                mLocationAddress = "Nearby";
                Logger.debug(FacebookActivity.TAG, getString(0x7f0801f2));
                return;
            }
        }

        public GetAddressTask(Context context)
        {
            this$0 = FacebookActivity.this;
            super();
            mContext = context;
        }
    }


    private static final String PUBLISH_PERMISSIONS[] = {
        "publish_actions"
    };
    private static final String READ_PERMISSIONS[] = {
        "user_photos"
    };
    private static final String TAG = com/kohls/mcommerce/opal/framework/view/activity/FacebookActivity.getSimpleName();
    private String ACTION_POST_PHOTO;
    private final String EVERYONE = "Everyone";
    private final String FRIENDS = "Friends";
    private final String NEARBY = "Nearby";
    private final String ONLY_ME = "Only Me";
    private String PENDING_ACTION_BUNDLE_KEY;
    private final String STATUS_POST_CAPTION = "caption";
    private final String STATUS_POST_PICTURE = "picture";
    private final String STATUS_POST_PLACE = "place";
    private final int VIEW_ALBUM_SCREEN = 2;
    private final int VIEW_AUDIENCE_SCREEN = 3;
    private final int VIEW_FACEBOOK_SHARE_SCREEN = 0;
    private final int VIEW_PLACE_PICKER_SCREEN = 1;
    private final int VIEW_PROGRESS_SCREEN = 4;
    com.facebook.Request.Callback getAlbumsCallback;
    private ListView mAlbumListView;
    private TextView mAlbumNameTxt;
    private HashMap mAlbumsHashMap;
    private LinearLayout mAlbumsLayout;
    private LinearLayout mAudienceLayout;
    protected ListView mAudienceListView;
    private TextView mAudienceNameTxt;
    private String mAudienceNames[] = {
        "Everyone", "Friends", "Only Me"
    };
    private Button mCancelBtn;
    String mCurrentAlbumIdToPostIn;
    private String mCurrentAlbumNameToPostIn;
    private String mCurrentAudienceToPostIn;
    private Location mCurrentLocation;
    private ProgressBar mFacebookProgressBar;
    private LinearLayout mFacebookProgressScreen;
    private LinearLayout mFacebookScreen;
    private String mLastPendingAction;
    private String mLocationAddress;
    private LocationClient mLocationClient;
    private LinearLayout mLocationLayout;
    private TextView mLocationNameTxt;
    private LoginButton mLoginButton;
    private EditText mMessage;
    private TextView mMessageLink;
    private AlertDialog mNetworkDialog;
    private GraphPlace mPlace;
    private Button mPostBtn;
    private Bitmap mProductImage;
    private String mProductImageUrl;
    private ImageView mProductImageView;
    private String mProductLink;
    private com.facebook.Session.StatusCallback mSessionCallback;
    private GraphUser mUser;
    android.view.View.OnClickListener mViewClickListener;
    private ViewFlipper mViewFlipper;
    private UiLifecycleHelper uiHelper;

    public FacebookActivity()
    {
        mLastPendingAction = null;
        PENDING_ACTION_BUNDLE_KEY = "com.kohls.mcommerce.opal.framework.view.activity.FacebookActivity:PendingAction";
        ACTION_POST_PHOTO = "facebook_post_photo";
        mCurrentAudienceToPostIn = "Everyone";
        mSessionCallback = new com.facebook.Session.StatusCallback() {

            final FacebookActivity this$0;

            public void call(Session session, SessionState sessionstate, Exception exception)
            {
                onSessionStateChange(session, sessionstate, exception);
            }

            
            {
                this$0 = FacebookActivity.this;
                super();
            }
        };
        mViewClickListener = new android.view.View.OnClickListener() {

            final FacebookActivity this$0;

            public void onClick(View view)
            {
                if (!UtilityMethods.isNetworkConnected(FacebookActivity.this))
                {
                    displayNetworkErrorMessage();
                    return;
                }
                if (view == mPostBtn)
                {
                    if (isLoggedIn())
                    {
                        mViewFlipper.setDisplayedChild(4);
                        mLastPendingAction = ACTION_POST_PHOTO;
                    } else
                    {
                        Toast.makeText(FacebookActivity.this, getResources().getString(0x7f080116), 0).show();
                    }
                    checkSessionAndPostPhoto();
                    return;
                }
                if (view == mCancelBtn)
                {
                    finish();
                    return;
                }
                if (view == mAlbumsLayout)
                {
                    mViewFlipper.setDisplayedChild(4);
                    getAlbums();
                    return;
                }
                if (view == mLocationLayout)
                {
                    getLocation();
                    return;
                }
                if (view == mAudienceLayout)
                {
                    getAudience();
                    return;
                } else
                {
                    Logger.debug(FacebookActivity.TAG, "View not found to handle click.");
                    return;
                }
            }

            
            {
                this$0 = FacebookActivity.this;
                super();
            }
        };
        getAlbumsCallback = new com.facebook.Request.Callback() {

            final FacebookActivity this$0;

            public void onCompleted(Response response)
            {
                Logger.debug(FacebookActivity.TAG, (new StringBuilder()).append("Facebook Response: ").append(response.toString()).toString());
                Object obj = parseDataFromFQLResponse(response);
                if (response.getError() != null || obj == null)
                {
                    mViewFlipper.setDisplayedChild(0);
                    Toast.makeText(FacebookActivity.this, "Could not retrieve albums.", 0).show();
                    Logger.debug(FacebookActivity.TAG, response.getError().toString());
                    return;
                }
                Object obj1;
                int i;
                try
                {
                    mAlbumsHashMap = new HashMap();
                }
                // Misplaced declaration of an exception variable
                catch (Response response)
                {
                    mViewFlipper.setDisplayedChild(0);
                    Toast.makeText(FacebookActivity.this, "Could not retrieve albums.", 0).show();
                    Logger.debug(FacebookActivity.TAG, response.getMessage());
                    return;
                }
                i = 0;
                if (i >= ((JSONArray) (obj)).length())
                {
                    break; /* Loop/switch isn't completed */
                }
                obj1 = ((JSONArray) (obj)).getJSONObject(i);
                response = ((JSONObject) (obj1)).getString("id");
                obj1 = ((JSONObject) (obj1)).getString("name");
                mAlbumsHashMap.put(obj1, response);
                i++;
                if (true) goto _L2; else goto _L1
_L2:
                break MISSING_BLOCK_LABEL_104;
_L1:
                response = new ArrayList();
                for (obj = mAlbumsHashMap.keySet().iterator(); ((Iterator) (obj)).hasNext(); response.add((String)((Iterator) (obj)).next())) { }
                mViewFlipper.setDisplayedChild(2);
                setAlbumsListViewAdapter(response);
                return;
            }

            
            {
                this$0 = FacebookActivity.this;
                super();
            }
        };
    }

    private void checkSessionAndPostPhoto()
    {
        if (!TextUtils.isEmpty(mLastPendingAction))
        {
            Session session = Session.getActiveSession();
            if (session != null)
            {
                if (hasPublishPermission())
                {
                    postPhoto();
                } else
                if (session.isOpened())
                {
                    getNewPermissions(getCurrentAudience(mCurrentAudienceToPostIn));
                    return;
                }
            }
        }
    }

    private void displayNetworkErrorMessage()
    {
        if (mNetworkDialog == null)
        {
            mNetworkDialog = (new android.app.AlertDialog.Builder(this)).setMessage(0x7f0803cd).setPositiveButton(0x7f0803e5, new android.content.DialogInterface.OnClickListener() {

                final FacebookActivity this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    finish();
                }

            
            {
                this$0 = FacebookActivity.this;
                super();
            }
            }).show();
        } else
        if (!mNetworkDialog.isShowing())
        {
            mNetworkDialog.show();
            return;
        }
    }

    private void getAlbums()
    {
        if (!UtilityMethods.isNetworkConnected(this))
        {
            displayNetworkErrorMessage();
            return;
        } else
        {
            Request.newGraphPathRequest(Session.getActiveSession(), "me/albums", getAlbumsCallback).executeAsync();
            return;
        }
    }

    private void getAudience()
    {
        if (isLoggedIn())
        {
            mViewFlipper.setDisplayedChild(3);
            ArrayAdapter arrayadapter = new ArrayAdapter(this, 0x1090003, mAudienceNames);
            mAudienceListView.setAdapter(arrayadapter);
            mAudienceListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

                final FacebookActivity this$0;

                public void onItemClick(AdapterView adapterview, View view, int i, long l)
                {
                    mCurrentAudienceToPostIn = (String)mAudienceListView.getItemAtPosition(i);
                    mViewFlipper.setDisplayedChild(0);
                    getNewPermissions(getCurrentAudience(mCurrentAudienceToPostIn));
                    mAudienceNameTxt.setText(mCurrentAudienceToPostIn);
                }

            
            {
                this$0 = FacebookActivity.this;
                super();
            }
            });
            return;
        } else
        {
            mViewFlipper.setDisplayedChild(0);
            Toast.makeText(this, getResources().getString(0x7f080116), 0).show();
            return;
        }
    }

    private SessionDefaultAudience getCurrentAudience(String s)
    {
        if (s.contains("Everyone"))
        {
            return SessionDefaultAudience.EVERYONE;
        }
        if (s.contains("Friends"))
        {
            return SessionDefaultAudience.FRIENDS;
        }
        if (s.contains("Only Me"))
        {
            return SessionDefaultAudience.ONLY_ME;
        } else
        {
            return null;
        }
    }

    private void getCurrentLocation()
    {
        if (mCurrentLocation == null)
        {
            mLocationClient = new LocationClient(this, this, this);
            mLocationClient.connect();
        }
    }

    private void getLocation()
    {
        if (mCurrentLocation != null)
        {
            mViewFlipper.setDisplayedChild(1);
            onClickPickPlace();
            return;
        } else
        {
            Toast.makeText(this, getResources().getString(0x7f08010a), 0).show();
            return;
        }
    }

    private void getNewPermissions(SessionDefaultAudience sessiondefaultaudience)
    {
        if (isLoggedIn())
        {
            Session.getActiveSession().requestNewPublishPermissions((new com.facebook.Session.NewPermissionsRequest(this, PUBLISH_PERMISSIONS)).setDefaultAudience(sessiondefaultaudience));
            return;
        } else
        {
            Toast.makeText(this, 0x7f0804bc, 0).show();
            return;
        }
    }

    private boolean hasPublishPermission()
    {
        Session session = Session.getActiveSession();
        return session != null && session.getPermissions().contains("publish_actions");
    }

    private void initViews()
    {
        mLoginButton = (LoginButton)findViewById(0x7f0d056f);
        mLoginButton.setReadPermissions(READ_PERMISSIONS);
        mLoginButton.setDefaultAudience(SessionDefaultAudience.EVERYONE);
        mViewFlipper = (ViewFlipper)findViewById(0x7f0d0561);
        mAlbumListView = (ListView)findViewById(0x7f0d0574);
        mMessage = (EditText)findViewById(0x7f0d0563);
        mMessageLink = (TextView)findViewById(0x7f0d0564);
        mMessageLink.setText(mProductLink);
        mProductImageView = (ImageView)findViewById(0x7f0d0565);
        mAlbumNameTxt = (TextView)findViewById(0x7f0d056b);
        mLocationNameTxt = (TextView)findViewById(0x7f0d056d);
        mAudienceNameTxt = (TextView)findViewById(0x7f0d056e);
        mPostBtn = (Button)findViewById(0x7f0d0570);
        mCancelBtn = (Button)findViewById(0x7f0d0571);
        mAlbumsLayout = (LinearLayout)findViewById(0x7f0d0569);
        mLocationLayout = (LinearLayout)findViewById(0x7f0d056a);
        mAudienceLayout = (LinearLayout)findViewById(0x7f0d056c);
        mAudienceListView = (ListView)findViewById(0x7f0d0576);
        mFacebookScreen = (LinearLayout)findViewById(0x7f0d0560);
        mFacebookProgressScreen = (LinearLayout)findViewById(0x7f0d055e);
        mFacebookProgressBar = (ProgressBar)findViewById(0x7f0d055f);
        mPostBtn.setOnClickListener(mViewClickListener);
        mCancelBtn.setOnClickListener(mViewClickListener);
        mAlbumsLayout.setOnClickListener(mViewClickListener);
        mLocationLayout.setOnClickListener(mViewClickListener);
        mAudienceLayout.setOnClickListener(mViewClickListener);
    }

    private boolean isLoggedIn()
    {
        Session session = Session.getActiveSession();
        return session != null && session.isOpened();
    }

    private void loadProductImage()
    {
        if (mProductImageUrl != null && !TextUtils.isEmpty(mProductImageUrl.trim()))
        {
            String s = UtilityMethods.getUpdatedURL(mProductImageUrl, (int)(getResources().getDimension(0x7f0900ff) / getResources().getDisplayMetrics().density), (int)(getResources().getDimension(0x7f0900fe) / getResources().getDisplayMetrics().density));
            LoadImageTask.getInstance();
            LoadImageTask.getInstance().loadImage(s, mProductImageView, 0x7f020049, 0x7f020049);
            (new ImageLoader(KohlsPhoneApplication.getInstance().getRequestQueue(), BitmapLruCache.open())).get(mProductImageUrl, this);
        }
    }

    private void onClickPickPlace()
    {
        PlacePickerFragment placepickerfragment = new PlacePickerFragment();
        placepickerfragment.setLocation(mCurrentLocation);
        placepickerfragment.setTitleText(mLocationAddress);
        setPlacePickerListeners(placepickerfragment);
        showPickerFragment(placepickerfragment);
    }

    private void onPlacePickerDone(PlacePickerFragment placepickerfragment)
    {
        getSupportFragmentManager().popBackStack();
        mViewFlipper.setDisplayedChild(0);
        UtilityMethods.hideKeyboard(this, findViewById(0x1020002).getRootView());
        GraphPlace graphplace = placepickerfragment.getSelection();
        if (graphplace != null)
        {
            placepickerfragment = graphplace.getName();
            mPlace = graphplace;
        } else
        {
            placepickerfragment = "None";
            mPlace = null;
        }
        mLocationNameTxt.setText(placepickerfragment);
    }

    private void onSessionStateChange(Session session, SessionState sessionstate, Exception exception)
    {
        if (!(exception instanceof FacebookOperationCanceledException) && !(exception instanceof FacebookAuthorizationException)) goto _L2; else goto _L1
_L1:
        Logger.debug(TAG, exception.getMessage());
        mLastPendingAction = null;
        finish();
_L4:
        updateUI();
        return;
_L2:
        if (sessionstate == SessionState.OPENED)
        {
            mFacebookScreen.setVisibility(0);
            mFacebookProgressScreen.setVisibility(8);
        } else
        if (!TextUtils.isEmpty(mLastPendingAction) && sessionstate == SessionState.OPENED_TOKEN_UPDATED)
        {
            checkSessionAndPostPhoto();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private JSONArray parseDataFromFQLResponse(Response response)
    {
        response = response.getGraphObject().getInnerJSONObject();
        try
        {
            response = response.getJSONArray("data");
        }
        // Misplaced declaration of an exception variable
        catch (Response response)
        {
            return null;
        }
        return response;
    }

    private void postPhoto()
    {
        if (hasPublishPermission() && mProductImage != null && mProductLink != null)
        {
            Bundle bundle;
            Object obj;
            if (TextUtils.isEmpty(mCurrentAlbumNameToPostIn))
            {
                mCurrentAlbumIdToPostIn = "me";
            } else
            {
                mCurrentAlbumIdToPostIn = (String)mAlbumsHashMap.get(mCurrentAlbumNameToPostIn);
            }
            obj = new StringBuilder(mMessage.getText().toString());
            ((StringBuilder) (obj)).append(mProductLink);
            bundle = new Bundle();
            bundle.putParcelable("picture", mProductImage);
            bundle.putString("caption", ((StringBuilder) (obj)).toString());
            if (mPlace != null)
            {
                bundle.putString("place", mPlace.getId());
            }
            obj = new com.facebook.Request.Callback() {

                final FacebookActivity this$0;

                public void onCompleted(Response response)
                {
                    mLastPendingAction = null;
                    showPublishResult(response.getGraphObject(), response.getError());
                }

            
            {
                this$0 = FacebookActivity.this;
                super();
            }
            };
            (new RequestAsyncTask(new Request[] {
                new Request(Session.getActiveSession(), (new StringBuilder()).append(mCurrentAlbumIdToPostIn).append("/photos").toString(), bundle, HttpMethod.POST, ((com.facebook.Request.Callback) (obj)))
            })).execute(new Void[0]);
            Logger.debug(TAG, "Posting on Facebook.");
        } else
        {
            mViewFlipper.setDisplayedChild(0);
            mLastPendingAction = null;
            if (mProductImage == null)
            {
                Logger.debug(TAG, "Product Bitmap is null. Not posted.");
                Toast.makeText(this, getResources().getString(0x7f080237), 1).show();
                return;
            }
            if (mProductLink == null)
            {
                Logger.debug(TAG, "Product Link is null. Not posted.");
                Toast.makeText(this, getResources().getString(0x7f080283), 1).show();
                return;
            }
        }
    }

    private void setAlbumsListViewAdapter(ArrayList arraylist)
    {
        arraylist = new ArrayAdapter(this, 0x1090003, arraylist);
        mAlbumListView.setAdapter(arraylist);
        mAlbumListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final FacebookActivity this$0;

            public void onItemClick(AdapterView adapterview, View view, int i, long l)
            {
                mCurrentAlbumNameToPostIn = (String)mAlbumListView.getItemAtPosition(i);
                mViewFlipper.setDisplayedChild(0);
                mAlbumNameTxt.setText(mCurrentAlbumNameToPostIn);
            }

            
            {
                this$0 = FacebookActivity.this;
                super();
            }
        });
    }

    private void setPlacePickerListeners(final PlacePickerFragment fragment)
    {
        fragment.setOnDoneButtonClickedListener(new com.facebook.widget.PickerFragment.OnDoneButtonClickedListener() {

            final FacebookActivity this$0;
            final PlacePickerFragment val$fragment;

            public void onDoneButtonClicked(PickerFragment pickerfragment)
            {
                onPlacePickerDone(fragment);
            }

            
            {
                this$0 = FacebookActivity.this;
                fragment = placepickerfragment;
                super();
            }
        });
        fragment.setOnSelectionChangedListener(new com.facebook.widget.PickerFragment.OnSelectionChangedListener() {

            final FacebookActivity this$0;
            final PlacePickerFragment val$fragment;

            public void onSelectionChanged(PickerFragment pickerfragment)
            {
                if (fragment.getSelection() != null)
                {
                    onPlacePickerDone(fragment);
                }
            }

            
            {
                this$0 = FacebookActivity.this;
                fragment = placepickerfragment;
                super();
            }
        });
    }

    private void showPickerFragment(PickerFragment pickerfragment)
    {
        pickerfragment.setOnErrorListener(new com.facebook.widget.PickerFragment.OnErrorListener() {

            final FacebookActivity this$0;

            public void onError(PickerFragment pickerfragment1, FacebookException facebookexception)
            {
                if (!isLoggedIn())
                {
                    mViewFlipper.setDisplayedChild(0);
                    Toast.makeText(FacebookActivity.this, getResources().getString(0x7f080116), 0).show();
                }
                Logger.debug(FacebookActivity.TAG, facebookexception.getMessage());
            }

            
            {
                this$0 = FacebookActivity.this;
                super();
            }
        });
        FragmentManager fragmentmanager = getSupportFragmentManager();
        fragmentmanager.beginTransaction().replace(0x7f0d0572, pickerfragment).addToBackStack(null).commit();
        fragmentmanager.executePendingTransactions();
        pickerfragment.loadData(false);
    }

    private void showPublishResult(GraphObject graphobject, FacebookRequestError facebookrequesterror)
    {
        if (facebookrequesterror == null)
        {
            Toast.makeText(this, 0x7f0804be, 1).show();
            Logger.debug(TAG, "Posted on Facebook.");
            finish();
            return;
        } else
        {
            Logger.debug(TAG, facebookrequesterror.getErrorMessage());
            Toast.makeText(this, 0x7f0804bc, 0).show();
            finish();
            return;
        }
    }

    private void updateUI()
    {
        if (!UtilityMethods.isNetworkConnected(this))
        {
            displayNetworkErrorMessage();
            return;
        }
        if (isLoggedIn())
        {
            mAlbumsLayout.setVisibility(0);
            mLocationLayout.setVisibility(0);
            mAudienceLayout.setVisibility(0);
            mLoginButton.setVisibility(8);
            return;
        } else
        {
            mAlbumsLayout.setVisibility(8);
            mLocationLayout.setVisibility(8);
            mAudienceLayout.setVisibility(8);
            mLoginButton.setVisibility(0);
            return;
        }
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        uiHelper.onActivityResult(i, j, intent);
    }

    public void onBackPressed()
    {
        if (mViewFlipper.getDisplayedChild() != 0)
        {
            mViewFlipper.setDisplayedChild(0);
        } else
        {
            super.onBackPressed();
        }
        UtilityMethods.hideKeyboard(this, findViewById(0x1020002).getRootView());
    }

    public void onConnected(Bundle bundle)
    {
label0:
        {
            if (mLocationClient.isConnected())
            {
                mCurrentLocation = mLocationClient.getLastLocation();
                if (mCurrentLocation == null)
                {
                    break label0;
                }
                (new GetAddressTask(this)).execute(new Location[] {
                    mCurrentLocation
                });
            }
            return;
        }
        Logger.debug(TAG, "Current location not set. Cannot find address.");
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        uiHelper = new UiLifecycleHelper(this, mSessionCallback);
        uiHelper.onCreate(bundle);
        requestWindowFeature(1);
        if (bundle != null)
        {
            mLastPendingAction = bundle.getString(PENDING_ACTION_BUNDLE_KEY);
        }
        if (getIntent().getExtras() != null)
        {
            mProductLink = getIntent().getExtras().getString("product_link");
            mProductImageUrl = getIntent().getExtras().getString("product_image_link");
        }
        setContentView(0x7f0300d9);
        initViews();
        loadProductImage();
        getCurrentLocation();
        UtilityMethods.hideKeyboard(this, findViewById(0x1020002).getRootView());
        if (!isLoggedIn())
        {
            mLoginButton.performClick();
            mFacebookProgressScreen.setVisibility(0);
            mFacebookScreen.setVisibility(8);
            return;
        } else
        {
            updateUI();
            return;
        }
    }

    public void onDestroy()
    {
        super.onDestroy();
        uiHelper.onDestroy();
    }

    public void onDisconnected()
    {
    }

    public void onErrorResponse(VolleyError volleyerror)
    {
        Logger.debug(TAG, volleyerror.getMessage());
    }

    public void onPause()
    {
        super.onPause();
        uiHelper.onPause();
    }

    public void onResponse(com.android.volley.toolbox.ImageLoader.ImageContainer imagecontainer, boolean flag)
    {
        imagecontainer = imagecontainer.getBitmap();
        if (imagecontainer != null)
        {
            mProductImage = imagecontainer;
            return;
        } else
        {
            Logger.debug(TAG, "Product Bitmap Null.");
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        uiHelper.onResume();
        updateUI();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        uiHelper.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(mLastPendingAction))
        {
            bundle.putString(PENDING_ACTION_BUNDLE_KEY, mLastPendingAction);
        }
        super.onSaveInstanceState(bundle);
    }












/*
    static String access$1602(FacebookActivity facebookactivity, String s)
    {
        facebookactivity.mCurrentAudienceToPostIn = s;
        return s;
    }

*/









/*
    static HashMap access$2202(FacebookActivity facebookactivity, HashMap hashmap)
    {
        facebookactivity.mAlbumsHashMap = hashmap;
        return hashmap;
    }

*/




/*
    static String access$2402(FacebookActivity facebookactivity, String s)
    {
        facebookactivity.mCurrentAlbumNameToPostIn = s;
        return s;
    }

*/





/*
    static String access$2802(FacebookActivity facebookactivity, String s)
    {
        facebookactivity.mLocationAddress = s;
        return s;
    }

*/




/*
    static String access$502(FacebookActivity facebookactivity, String s)
    {
        facebookactivity.mLastPendingAction = s;
        return s;
    }

*/




}
