// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.location.LocationClient;
import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.helper.cache.image.LoadImageTask;
import com.kohls.mcommerce.opal.helper.preference.PreferenceHelper;
import java.io.InputStream;
import java.net.URL;
import twitter4j.GeoLocation;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.RequestToken;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterFragment extends Fragment
    implements com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks, com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener
{

    private static int MAX_TWITTER_LENGTH = 117;
    private final String IEXTRA_OAUTH_VERIFIER = "oauth_verifier";
    private String NO_LOCATION_FOUND;
    private String TAG;
    private final String TWITTER_CALLBACK_URL = "http://www.kohls.com";
    private final int TWITTER_LOGIN_RESULT_CODE_FAILURE = 2;
    private final int TWITTER_LOGIN_RESULT_CODE_SUCCESS = 1;
    boolean isOriginatedFromLnR;
    private Button mCancelButton;
    private ImageView mCancelLocationBtn;
    private String mCityName;
    private Activity mContext;
    private Location mCurrentLocation;
    private String mCurrentLocationName;
    private String mErrorMessage;
    private GeoLocation mGeoLocation;
    private InputStream mInputStreamProductLink;
    private boolean mIsFragmentVisible;
    private PreferenceHelper mKohlsPref;
    private LinearLayout mLayoutProgressBar;
    private FrameLayout mLayoutWebviewContainer;
    private RelativeLayout mLayoutdialog;
    private LocationClient mLocationClient;
    private TextView mLocationPlaceTxt;
    private ProgressBar mLocationProgressBar;
    private TextView mMessageCount;
    private ImageView mNextButton;
    private Button mPostButton;
    private String mProductDescription;
    private String mProductImageLink;
    private URL mProductImageUrl;
    private String mProductLink;
    private TextView mProductLinkTxt;
    private EditText mProductMessageEditText;
    private RequestToken mRequestToken;
    com.kohls.mcommerce.opal.modules.lnr.common.value.LnRConstantValues.ShareFeatureHostScreen mScreenOriginatedFrom;
    private StatusUpdate mStatus;
    private Twitter mTwitter;
    private ImageView mTwitterImageView;
    private LinearLayout mTwitterLocationLayout;
    private WebView mTwitterLoginWebView;
    android.view.View.OnClickListener shareOnClickListener;

    public TwitterFragment()
    {
        TAG = com/kohls/mcommerce/opal/framework/view/fragment/TwitterFragment.getSimpleName();
        NO_LOCATION_FOUND = "No location found";
        mErrorMessage = null;
        shareOnClickListener = new _cls2();
    }

    private void buildStatusAndTweet()
    {
        mLayoutProgressBar.setVisibility(0);
        if (getTweetMessage() != null)
        {
            (new Thread(new _cls4())).start();
        }
    }

    private void changeVisibility(boolean flag)
    {
        if (flag)
        {
            mLayoutProgressBar.setVisibility(8);
            mLayoutWebviewContainer.setVisibility(8);
            mLayoutdialog.setVisibility(0);
            return;
        } else
        {
            mLayoutProgressBar.setVisibility(0);
            mLayoutWebviewContainer.setVisibility(0);
            mLayoutdialog.setVisibility(8);
            return;
        }
    }

    private boolean checkFragmentisActive()
    {
        return mContext != null && mIsFragmentVisible;
    }

    private void displayTwitterAuthorization()
    {
        ConfigurationBuilder configurationbuilder = new ConfigurationBuilder();
        configurationbuilder.setOAuthConsumerKey(getResources().getString(0x7f080524));
        configurationbuilder.setOAuthConsumerSecret(getResources().getString(0x7f080525));
        mTwitter = (new TwitterFactory(configurationbuilder.build())).getInstance();
        (new Thread(new _cls5())).start();
    }

    private String getAccessToken()
    {
        return mKohlsPref.getTwitterOauthTokenKey();
    }

    private String getAccessTokenSecret()
    {
        return mKohlsPref.getTwitterOauthTokenSecret();
    }

    private void getLocation()
    {
        mLocationPlaceTxt.setVisibility(8);
        mLocationProgressBar.setVisibility(0);
        if (mCurrentLocation == null)
        {
            startFetchingCurrentLocation();
            return;
        } else
        {
            mLocationPlaceTxt.setVisibility(0);
            mLocationProgressBar.setVisibility(8);
            return;
        }
    }

    private void getLocationName()
    {
        if (mCurrentLocation != null)
        {
            mGeoLocation = new GeoLocation(mCurrentLocation.getLatitude(), mCurrentLocation.getLongitude());
    /* block-local class not found */
    class GetAddressTask {}

            (new GetAddressTask(mContext)).execute(new Location[] {
                mCurrentLocation
            });
            return;
        } else
        {
            mLocationProgressBar.setVisibility(8);
            mLocationPlaceTxt.setVisibility(0);
            mLocationPlaceTxt.setText(NO_LOCATION_FOUND);
            Logger.debug(TAG, "Current location was not retrieved. Cannot find location name.");
            return;
        }
    }

    private String getTweetMessage()
    {
        if (!TextUtils.isEmpty(mProductMessageEditText.getText().toString()))
        {
            return mProductMessageEditText.getText().toString();
        } else
        {
            return null;
        }
    }

    private void initViews()
    {
        mProductLinkTxt = (TextView)mContext.findViewById(0x7f0d057d);
        mLayoutWebviewContainer = (FrameLayout)mContext.findViewById(0x7f0d0578);
        mLayoutdialog = (RelativeLayout)mContext.findViewById(0x7f0d057a);
        mTwitterLoginWebView = (WebView)mContext.findViewById(0x7f0d0579);
        mCancelButton = (Button)mContext.findViewById(0x7f0d0586);
        mPostButton = (Button)mContext.findViewById(0x7f0d0585);
        mTwitterLocationLayout = (LinearLayout)mContext.findViewById(0x7f0d057f);
        mTwitterImageView = (ImageView)mContext.findViewById(0x7f0d057e);
        mLocationProgressBar = (ProgressBar)mContext.findViewById(0x7f0d0582);
        mLocationPlaceTxt = (TextView)mContext.findViewById(0x7f0d0581);
        mLayoutProgressBar = (LinearLayout)mContext.findViewById(0x7f0d0577);
        mCancelLocationBtn = (ImageView)mContext.findViewById(0x7f0d0584);
        mNextButton = (ImageView)mContext.findViewById(0x7f0d0583);
        mProductMessageEditText = (EditText)mContext.findViewById(0x7f0d057b);
        mMessageCount = (TextView)mContext.findViewById(0x7f0d057c);
        if (isOriginatedFromLnR)
        {
            mTwitterImageView.setBackgroundColor(mContext.getResources().getColor(0x7f0c00c0));
        }
        mProductMessageEditText.addTextChangedListener(new _cls1());
        if (mProductDescription != null)
        {
            mProductMessageEditText.setText((new StringBuilder()).append(mProductDescription).append(" ").toString());
        }
        if (mProductLink != null)
        {
            mProductMessageEditText.append(mProductLink);
        }
        mPostButton.setOnClickListener(shareOnClickListener);
        mCancelButton.setOnClickListener(shareOnClickListener);
        mTwitterLocationLayout.setOnClickListener(shareOnClickListener);
        mCancelLocationBtn.setOnClickListener(shareOnClickListener);
        mProductMessageEditText.setScroller(new Scroller(mContext));
        mProductMessageEditText.setMaxLines(8);
        mProductMessageEditText.setVerticalScrollBarEnabled(true);
    }

    private boolean isConnected()
    {
        return getAccessToken() != null;
    }

    private void logOutOfTwitter(Context context)
    {
        mKohlsPref.saveTwitterOauth(null, null);
        mKohlsPref.setTwitterAutorizationStatus(false);
    }

    private void postToTwitter(Activity activity, String s, String s1, StatusUpdate statusupdate, TwitterPostResponse twitterpostresponse)
    {
        if (!isConnected())
        {
    /* block-local class not found */
    class TwitterPostResponse {}

            twitterpostresponse.OnResult(Boolean.valueOf(false));
            return;
        } else
        {
            ConfigurationBuilder configurationbuilder = new ConfigurationBuilder();
            configurationbuilder.setOAuthConsumerKey(s);
            configurationbuilder.setOAuthConsumerSecret(s1);
            configurationbuilder.setOAuthAccessToken(getAccessToken());
            configurationbuilder.setOAuthAccessTokenSecret(getAccessTokenSecret());
            (new Thread(new _cls7((new TwitterFactory(configurationbuilder.build())).getInstance(), statusupdate, activity, twitterpostresponse))).start();
            return;
        }
    }

    private void saveAccessTokenAndFinish(Uri uri)
    {
        (new Thread(new _cls6(uri))).start();
    }

    private void setUpImage()
    {
        if (mProductImageLink != null && !TextUtils.isEmpty(mProductImageLink.trim()))
        {
            MAX_TWITTER_LENGTH = 83;
            String s = UtilityMethods.getUpdatedURL(mProductImageLink, (int)(getResources().getDimension(0x7f0900ff) / getResources().getDisplayMetrics().density), (int)(getResources().getDimension(0x7f0900fe) / getResources().getDisplayMetrics().density));
            LoadImageTask.getInstance();
            LoadImageTask.getInstance().loadImage(s, mTwitterImageView, 0x7f020049, 0x7f020049);
        }
    }

    private void startFetchingCurrentLocation()
    {
        if (checkFragmentisActive())
        {
            mLocationClient = new LocationClient(mContext, this, this);
            mLocationClient.connect();
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        initViews();
        setUpImage();
        mTwitterLoginWebView.setWebViewClient(new _cls3());
        if (!mKohlsPref.getTwitterAuthorizationStatus())
        {
            changeVisibility(false);
            displayTwitterAuthorization();
            return;
        } else
        {
            changeVisibility(true);
            return;
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        mIsFragmentVisible = true;
    }

    public void onConnected(Bundle bundle)
    {
        if (checkFragmentisActive())
        {
            if (mLocationClient.isConnected())
            {
                mCurrentLocation = mLocationClient.getLastLocation();
            }
            getLocationName();
        }
    }

    public void onConnectionFailed(ConnectionResult connectionresult)
    {
    }

    public void onCreate(Bundle bundle)
    {
        isOriginatedFromLnR = false;
        mContext = getActivity();
        mKohlsPref = new PreferenceHelper(getActivity());
        mProductLink = mContext.getIntent().getExtras().getString("product_link");
        mScreenOriginatedFrom = (com.kohls.mcommerce.opal.modules.lnr.common.value.LnRConstantValues.ShareFeatureHostScreen)mContext.getIntent().getExtras().getSerializable("origin_of_fragment");
        if (mScreenOriginatedFrom == com.kohls.mcommerce.opal.modules.lnr.common.value.LnRConstantValues.ShareFeatureHostScreen.LIST_DETAILS_SCREEN)
        {
            isOriginatedFromLnR = true;
        }
        if (mContext.getIntent().getExtras().getString("share_is_from_lnr") != null && mContext.getIntent().getExtras().getString("share_is_from_lnr").equalsIgnoreCase("true"))
        {
            mProductLink = mProductLink.replace(".com", "");
        }
        if (mContext.getIntent().getExtras().getString("product_desc") != null)
        {
            mProductDescription = mContext.getIntent().getExtras().getString("product_desc");
        }
        mProductImageLink = mContext.getIntent().getExtras().getString("product_image_link");
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300da, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public void onDetach()
    {
        super.onDetach();
        mIsFragmentVisible = false;
    }

    public void onDisconnected()
    {
    }











/*
    static StatusUpdate access$1502(TwitterFragment twitterfragment, StatusUpdate statusupdate)
    {
        twitterfragment.mStatus = statusupdate;
        return statusupdate;
    }

*/



/*
    static URL access$1602(TwitterFragment twitterfragment, URL url)
    {
        twitterfragment.mProductImageUrl = url;
        return url;
    }

*/




/*
    static InputStream access$1802(TwitterFragment twitterfragment, InputStream inputstream)
    {
        twitterfragment.mInputStreamProductLink = inputstream;
        return inputstream;
    }

*/






/*
    static RequestToken access$2202(TwitterFragment twitterfragment, RequestToken requesttoken)
    {
        twitterfragment.mRequestToken = requesttoken;
        return requesttoken;
    }

*/







/*
    static String access$2802(TwitterFragment twitterfragment, String s)
    {
        twitterfragment.mErrorMessage = s;
        return s;
    }

*/



/*
    static String access$2902(TwitterFragment twitterfragment, String s)
    {
        twitterfragment.mCurrentLocationName = s;
        return s;
    }

*/









/*
    static Location access$802(TwitterFragment twitterfragment, Location location)
    {
        twitterfragment.mCurrentLocation = location;
        return location;
    }

*/



/*
    static GeoLocation access$902(TwitterFragment twitterfragment, GeoLocation geolocation)
    {
        twitterfragment.mGeoLocation = geolocation;
        return geolocation;
    }

*/

    // Unreferenced inner class com/kohls/mcommerce/opal/framework/view/fragment/TwitterFragment$KohlsTwitterPostResponse
    /* block-local class not found */
    class KohlsTwitterPostResponse {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls3 {}

}
