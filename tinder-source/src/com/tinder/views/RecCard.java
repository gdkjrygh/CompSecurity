// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.ConsoleMessage;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.a.e;
import com.facebook.a.f;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import com.tinder.activities.ActivityCallToActionBrowser;
import com.tinder.cards.a;
import com.tinder.e.at;
import com.tinder.e.d;
import com.tinder.enums.SwipeType;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerLiveRail;
import com.tinder.managers.ae;
import com.tinder.managers.y;
import com.tinder.model.Career;
import com.tinder.model.ProcessedPhoto;
import com.tinder.model.ProfilePhoto;
import com.tinder.model.SparksEvent;
import com.tinder.model.Teaser;
import com.tinder.model.User;
import com.tinder.utils.ad;
import com.tinder.utils.h;
import com.tinder.utils.o;
import com.tinder.utils.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;

// Referenced classes of package com.tinder.views:
//            BadgeView, RecImageView, LiveRailWebView

public class RecCard extends a
    implements x
{
    public static final class CardMode extends Enum
    {

        private static final CardMode $VALUES[];
        public static final CardMode PROMOTED_REC;
        public static final CardMode REC;
        public static final CardMode SUPER_LIKE;
        public static final CardMode VIDEO_AD;

        public static CardMode valueOf(String s1)
        {
            return (CardMode)Enum.valueOf(com/tinder/views/RecCard$CardMode, s1);
        }

        public static CardMode[] values()
        {
            return (CardMode[])$VALUES.clone();
        }

        static 
        {
            REC = new CardMode("REC", 0);
            PROMOTED_REC = new CardMode("PROMOTED_REC", 1);
            SUPER_LIKE = new CardMode("SUPER_LIKE", 2);
            VIDEO_AD = new CardMode("VIDEO_AD", 3);
            $VALUES = (new CardMode[] {
                REC, PROMOTED_REC, SUPER_LIKE, VIDEO_AD
            });
        }

        private CardMode(String s1, int i)
        {
            super(s1, i);
        }
    }

    static final class Progress extends Enum
    {

        private static final Progress $VALUES[];
        public static final Progress FIRST_QUARTILE;
        public static final Progress INITIAL;
        public static final Progress MIDPOINT;
        public static final Progress THIRD_QUARTILE;
        private double mValue;

        public static Progress valueOf(String s1)
        {
            return (Progress)Enum.valueOf(com/tinder/views/RecCard$Progress, s1);
        }

        public static Progress[] values()
        {
            return (Progress[])$VALUES.clone();
        }

        public final double getValue()
        {
            return mValue;
        }

        static 
        {
            INITIAL = new Progress("INITIAL", 0, 0.0D);
            FIRST_QUARTILE = new Progress("FIRST_QUARTILE", 1, 0.25D);
            MIDPOINT = new Progress("MIDPOINT", 2, 0.5D);
            THIRD_QUARTILE = new Progress("THIRD_QUARTILE", 3, 0.75D);
            $VALUES = (new Progress[] {
                INITIAL, FIRST_QUARTILE, MIDPOINT, THIRD_QUARTILE
            });
        }

        private Progress(String s1, int i, double d1)
        {
            super(s1, i);
            mValue = d1;
        }
    }

    public static interface SetRecListener
    {

        public abstract void setupComplete();
    }

    public class WebAppLiveRailInterface
    {

        double mDuration;
        private boolean mFiredFirstQuartile;
        private boolean mFiredMidpoint;
        private boolean mFiredThirdQuartile;
        private boolean mPaused;
        final RecCard this$0;

        public String getActionButtonTitle()
        {
            return mManagerLiveRail.h;
        }

        public boolean getPaused()
        {
            return mPaused;
        }

        public String getSubtitle()
        {
            return mManagerLiveRail.g;
        }

        public String getTitle()
        {
            return mManagerLiveRail.e;
        }

        public String getVideoUrl()
        {
            return mManagerLiveRail.i;
        }

        public void invalidate()
        {
            mWebView.postInvalidate();
        }

        public void launchCallToAction()
        {
            mCrmUtility.f(mManagerLiveRail.c);
            getBaseAdEvent("Ad.Select", true, true, true, true).put("method", "BUTTON").fire();
            mManagerLiveRail.a(com.tinder.managers.ManagerLiveRail.LiveRailEvent.k);
            String s1 = mManagerLiveRail.f;
            if (!h.a(s1))
            {
                Intent intent = new Intent(getContext(), com/tinder/activities/ActivityCallToActionBrowser);
                intent.putExtra(ActivityCallToActionBrowser.a, s1);
                getContext().startActivity(intent);
            }
        }

        public void onClosed()
        {
            mManagerLiveRail.a(com.tinder.managers.ManagerLiveRail.LiveRailEvent.j);
        }

        public void onImpression()
        {
            mManagerLiveRail.a(com.tinder.managers.ManagerLiveRail.LiveRailEvent.a);
        }

        public void onLoadComplete()
        {
            getBaseAdEvent("Ad.Play", true, true, false, false).fire();
        }

        public void onMuted(String s1)
        {
            mLastMuteState = Boolean.parseBoolean(s1);
            getBaseAdEvent("Ad.ToggleAudio", true, true, true, false).fire();
        }

        public void onPaused()
        {
            mManagerLiveRail.a(com.tinder.managers.ManagerLiveRail.LiveRailEvent.h);
            mPaused = true;
        }

        public void onReplay()
        {
            getBaseAdEvent("Ad.Replay", true, false, false, false).fire();
        }

        public void onResumed()
        {
            getBaseAdEvent("Ad.Play", true, false, false, false).fire();
            mManagerLiveRail.a(com.tinder.managers.ManagerLiveRail.LiveRailEvent.i);
            mPaused = false;
        }

        public void onTimeChanged(String s1)
        {
            if (mDuration == 0.0D)
            {
                mDuration = mManagerLiveRail.n;
            }
            int i = (int)Double.parseDouble(s1);
            if (i == (int)Math.ceil(mDuration * Progress.FIRST_QUARTILE.getValue()) && !mFiredFirstQuartile)
            {
                mManagerLiveRail.a(com.tinder.managers.ManagerLiveRail.LiveRailEvent.b);
                mFiredFirstQuartile = true;
                mLastProgress = Progress.FIRST_QUARTILE.getValue();
                i = 1;
            } else
            if (i == (int)Math.ceil(mDuration * Progress.MIDPOINT.getValue()) && !mFiredMidpoint)
            {
                mManagerLiveRail.a(com.tinder.managers.ManagerLiveRail.LiveRailEvent.c);
                mFiredMidpoint = true;
                mLastProgress = Progress.MIDPOINT.getValue();
                i = 1;
            } else
            if (i == (int)Math.ceil(mDuration * Progress.THIRD_QUARTILE.getValue()) && !mFiredThirdQuartile)
            {
                mManagerLiveRail.a(com.tinder.managers.ManagerLiveRail.LiveRailEvent.d);
                mFiredThirdQuartile = true;
                mLastProgress = Progress.THIRD_QUARTILE.getValue();
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                getBaseAdEvent("Ad.Progress", true, true, false, true).fire();
            }
        }

        public void onVideoEnded()
        {
            mManagerLiveRail.a(com.tinder.managers.ManagerLiveRail.LiveRailEvent.e);
            getBaseAdEvent("Ad.Complete", true, false, false, false).fire();
            mFiredFirstQuartile = false;
            mFiredMidpoint = false;
            mFiredThirdQuartile = false;
            mLastProgress = Progress.INITIAL.getValue();
        }

        public WebAppLiveRailInterface()
        {
            this$0 = RecCard.this;
            super();
        }
    }


    private static final float DIM_FULL = 0.04F;
    private static final float DIM_MED = 0.02F;
    private static final DecimalFormat EVENT_DECIMAL_FORMAT = new DecimalFormat("0.00");
    private static final String FILE_PATH = "file:///android_asset/content/video_ad/index.html";
    private static final float PERCENT_WIDTH_TO_DRAG = 0.25F;
    private static final float ROTATION_ON_DRAG = 0.03F;
    private static final float SUPERLIKE_SCALE_END = 1F;
    private static final float SUPERLIKE_START_SCALE = 0.45F;
    private static final float SUPERLIKE_START_TRANS_Y = 50F;
    private static final float TILT_SLOP = 1.3F;
    private static final float VELOCITY_SLOP = 1.5F;
    private static final float VELOCITY_UPSWIPE_SLOP = 0.8F;
    private TextView mAge;
    private BadgeView mBadgeView;
    private float mClickThreshold;
    private TextView mCommonFriendCount;
    private TextView mCommonInterestCount;
    com.tinder.d.a mCrmUtility;
    private boolean mEnableSuperlike;
    private ImageView mFriendsIcon;
    private int mHeight;
    private ImageView mInterestsIcon;
    private CardMode mLastCardMode;
    private boolean mLastMuteState;
    private double mLastProgress;
    private com.tinder.e.a mListenerAdCache;
    ManagerLiveRail mManagerLiveRail;
    y mManagerPassport;
    ae mManagerSharedPrefs;
    private CardMode mMode;
    private TextView mName;
    private ImageView mPartnerLogo;
    private ProgressBar mProgressBar;
    private User mRec;
    private String mRecId;
    private RecImageView mRecImage;
    private boolean mShouldBypassBecauseOfError;
    private View mStarTailCenter;
    private View mStartTailLeft;
    private View mStartTailRight;
    private View mSuperlikeIcon;
    private View mSuperlikeTails;
    private int mSuperlikeTextColor;
    private TextView mTeaser;
    private long mTimeMillisCardLoaded;
    private View mTooltip;
    private RelativeLayout mTopLayout;
    private ViewGroup mVideoViewContainer;
    private LiveRailWebView mWebView;
    private WebAppLiveRailInterface mWebViewBridge;
    private int mWidth;

    public RecCard(Context context)
    {
        super(context);
        mShouldBypassBecauseOfError = false;
        mSuperlikeTextColor = getResources().getColor(0x7f0d00f5);
        initCommon(context);
    }

    public RecCard(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mShouldBypassBecauseOfError = false;
        mSuperlikeTextColor = getResources().getColor(0x7f0d00f5);
        initCommon(context);
    }

    public RecCard(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mShouldBypassBecauseOfError = false;
        mSuperlikeTextColor = getResources().getColor(0x7f0d00f5);
        initCommon(context);
    }

    public RecCard(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        mShouldBypassBecauseOfError = false;
        mSuperlikeTextColor = getResources().getColor(0x7f0d00f5);
        initCommon(context);
    }

    private void displayBadgeTooltip()
    {
label0:
        {
            if (mRec != null)
            {
                mBadgeView.displayBadge(mRec);
                if (!mRec.isVerified())
                {
                    break label0;
                }
                Object obj = ad.a(this);
                Point point = ad.a(mBadgeView);
                Point point1 = ad.a(mTooltip);
                point.x = point.x - ((Point) (obj)).x;
                point.y = point.y - ((Point) (obj)).y;
                point1.x = point1.x - ((Point) (obj)).x;
                point1.y = point1.y - ((Point) (obj)).y;
                int i = point.x;
                int j = mTooltip.getMeasuredWidth() / 2;
                int k = mBadgeView.getMeasuredWidth() / 2;
                int l = point.y;
                int i1 = mTooltip.getMeasuredHeight();
                obj = (android.widget.RelativeLayout.LayoutParams)mTooltip.getLayoutParams();
                obj.leftMargin = k + (i - j);
                obj.topMargin = l - i1;
                mTooltip.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                mTooltip.setPivotX(mTooltip.getMeasuredWidth() / 2);
                mTooltip.setPivotY(mTooltip.getMeasuredHeight());
                mTooltip.setVisibility(0);
            }
            return;
        }
        mTooltip.setVisibility(8);
    }

    private void initCommon(Context context)
    {
        ManagerApp.h().a(this);
        mEnableSuperlike = ae.z();
        mClickThreshold = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        inflate(getContext(), 0x7f0300ac, this);
        mProgressBar = (ProgressBar)findViewById(0x7f0e0189);
        mRecImage = (RecImageView)findViewById(0x7f0e0324);
        mWebView = (LiveRailWebView)findViewWithTag("video_ad");
        mWebView.setLayerType(2, null);
        mName = (TextView)findViewById(0x7f0e02ac);
        mAge = (TextView)findViewById(0x7f0e0330);
        mTeaser = (TextView)findViewById(0x7f0e0335);
        mCommonFriendCount = (TextView)findViewById(0x7f0e0332);
        mCommonInterestCount = (TextView)findViewById(0x7f0e0333);
        mFriendsIcon = (ImageView)findViewById(0x7f0e0331);
        mInterestsIcon = (ImageView)findViewById(0x7f0e0334);
        mPartnerLogo = (ImageView)findViewById(0x7f0e032f);
        mVideoViewContainer = (ViewGroup)findViewById(0x7f0e0326);
        mBadgeView = (BadgeView)findViewById(0x7f0e01f6);
        mTooltip = findViewById(0x7f0e0337);
        mSuperlikeIcon = findViewById(0x7f0e0132);
        mSuperlikeTails = findViewById(0x7f0e032a);
        mStarTailCenter = findViewById(0x7f0e032c);
        mStartTailLeft = findViewById(0x7f0e032b);
        mStartTailRight = findViewById(0x7f0e032d);
        ((ImageView)mTooltip.findViewById(0x7f0e0338)).setColorFilter(getResources().getColor(0x7f0d0101));
        mTopLayout = (RelativeLayout)findViewById(0x7f0e0322);
        enableDimming(mTopLayout, getResources().getDrawable(0x7f020220));
        resizeToScreen();
        setupTooltipThrob();
        setupTouchValues();
        setupStamps();
        if (o.e())
        {
            setupShadows();
        }
        setCardMode(CardMode.REC);
    }

    private void initPromotedRecMode()
    {
        initRecMode();
        setSwipeUpEnabled(false);
    }

    private void initRecMode()
    {
        mVideoViewContainer.setVisibility(8);
        mRecImage.setVisibility(0);
        mAge.setVisibility(0);
        mName.setVisibility(0);
        mPartnerLogo.setVisibility(8);
        setSwipeUpEnabled(mEnableSuperlike);
        setOnClickWithEventListener(new at() {

            final RecCard this$0;

            public void onClick(MotionEvent motionevent, View view)
            {
                motionevent = getCardListener();
                if (motionevent != null)
                {
                    motionevent.a(RecCard.this);
                }
            }

            
            {
                this$0 = RecCard.this;
                super();
            }
        });
    }

    private void initSuperLikeMode()
    {
        initRecMode();
        ad.a(mTopLayout, android.support.v4.b.a.a(getContext(), 0x7f0201a8));
        mName.setTextColor(getResources().getColor(0x7f0d0113));
        mAge.setTextColor(getResources().getColor(0x7f0d0113));
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)mTeaser.getLayoutParams();
        layoutparams.leftMargin = getContext().getResources().getDimensionPixelSize(0x7f090174);
        mTeaser.setLayoutParams(layoutparams);
        mTeaser.setVisibility(0);
        mTeaser.setTextColor(mSuperlikeTextColor);
        mTeaser.setText(0x7f06018d);
        mTeaser.setTextSize(0, getResources().getDimension(0x7f0901b3));
        findViewById(0x7f0e0325).setVisibility(0);
        mFriendsIcon.setColorFilter(mSuperlikeTextColor);
        mCommonFriendCount.setTextColor(mSuperlikeTextColor);
        mInterestsIcon.setVisibility(8);
        mCommonInterestCount.setVisibility(8);
        setSwipeUpEnabled(false);
    }

    private void initVideoAdMode()
    {
        mRecId = null;
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)mTeaser.getLayoutParams();
        layoutparams.leftMargin = getContext().getResources().getDimensionPixelSize(0x7f090174) * 2;
        mTeaser.setLayoutParams(layoutparams);
        mVideoViewContainer.setVisibility(0);
        mTeaser.setVisibility(0);
        mRecImage.setVisibility(8);
        mTeaser.setTextSize(0, getResources().getDimension(0x7f090010));
        mTeaser.setTextColor(android.support.v4.b.a.b(getContext(), 0x7f0d00f2));
        mAge.setVisibility(8);
        mFriendsIcon.setVisibility(8);
        mInterestsIcon.setVisibility(8);
        mCommonInterestCount.setVisibility(8);
        mCommonFriendCount.setVisibility(8);
        mPartnerLogo.setVisibility(0);
        setSwipeUpEnabled(false);
        mName.setFilters(new InputFilter[] {
            new android.text.InputFilter.LengthFilter(1000)
        });
        mWebViewBridge = new WebAppLiveRailInterface();
        setOnClickWithEventListener(new at() {

            final RecCard this$0;

            public void onClick(MotionEvent motionevent, View view)
            {
                if (motionevent.getRawY() > (float)(ad.a(mWebView).y + mWebView.getMeasuredHeight()))
                {
                    mWebViewBridge.launchCallToAction();
                    return;
                } else
                {
                    mWebView.simulateMotionEvent(motionevent);
                    return;
                }
            }

            
            {
                this$0 = RecCard.this;
                super();
            }
        });
        mWebView.getSettings().setSupportZoom(false);
        mWebView.getSettings().setPluginState(android.webkit.WebSettings.PluginState.ON);
        mWebView.getSettings().setCacheMode(1);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setLoadWithOverviewMode(true);
        mWebView.getSettings().setUseWideViewPort(true);
        mWebView.getSettings().setBuiltInZoomControls(false);
        if (o.d())
        {
            mWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        }
        mWebView.addJavascriptInterface(mWebViewBridge, "TinderAds");
        mWebView.setInitialScale(1);
        mWebView.setLongClickable(false);
        mWebView.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            final RecCard this$0;

            public boolean onLongClick(View view)
            {
                return true;
            }

            
            {
                this$0 = RecCard.this;
                super();
            }
        });
        mWebView.setHapticFeedbackEnabled(false);
        mWebView.setLayerType(2, null);
        mWebView.setWebChromeClient(new com.tinder.h.a() {

            final RecCard this$0;

            public boolean onConsoleMessage(ConsoleMessage consolemessage)
            {
                String.format("Console: %s [%s:%s] %s", new Object[] {
                    consolemessage.messageLevel().name(), consolemessage.sourceId(), Integer.valueOf(consolemessage.lineNumber()), consolemessage.message()
                });
                if (consolemessage.messageLevel() == android.webkit.ConsoleMessage.MessageLevel.ERROR)
                {
                    mShouldBypassBecauseOfError = true;
                }
                return true;
            }

            
            {
                this$0 = RecCard.this;
                super();
            }
        });
        mWebView.setWebViewClient(new WebViewClient() {

            final RecCard this$0;

            public void onPageFinished(WebView webview, String s1)
            {
                (new StringBuilder("Loaded URL ")).append(s1).append(" into WebView");
                if (!s1.startsWith("javascript:"))
                {
                    mWebView.runCommand(LiveRailWebView.LiveRailCommand.setup);
                    mManagerLiveRail.toString();
                    mName.setText(mManagerLiveRail.e);
                    mTeaser.setText(mManagerLiveRail.g);
                    Picasso.a(getContext()).a(mManagerLiveRail.l).a(mPartnerLogo, null);
                }
                super.onPageFinished(webview, s1);
            }

            public void onPageStarted(WebView webview, String s1, Bitmap bitmap)
            {
                super.onPageStarted(webview, s1, bitmap);
                if (s1.equals("file:///android_asset/content/video_ad/index.html"))
                {
                    mProgressBar.setVisibility(0);
                }
            }

            public WebResourceResponse shouldInterceptRequest(WebView webview, String s1)
            {
                if (!s1.startsWith("file://"))
                {
                    if ((webview = z.a(getContext(), s1)) != null)
                    {
                        try
                        {
                            webview = new WebResourceResponse("video/webm", "UTF-8", new FileInputStream(webview));
                        }
                        // Misplaced declaration of an exception variable
                        catch (WebView webview)
                        {
                            return null;
                        }
                        return webview;
                    }
                }
                return null;
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s1)
            {
                return super.shouldOverrideUrlLoading(webview, s1);
            }

            
            {
                this$0 = RecCard.this;
                super();
            }
        });
        mWebView.loadUrl("file:///android_asset/content/video_ad/index.html");
    }

    private void resizeToScreen()
    {
        double d1 = ad.a(getContext());
        double d2 = ad.b(getContext()) - ad.c(getContext());
        double d3 = getResources().getDimension(0x7f090076);
        double d4 = 0.40000000000000002D * d1;
        mHeight = Math.min((int)(d2 - d3 - d4), (int)(0.94999999999999996D * d1 + d3));
        mWidth = (int)((double)mHeight - d3);
        (new StringBuilder("resizeToScreen: ")).append(d1).append(", ").append(d2).append(", ").append(d3).append(", ").append(d4).append(" Output: ").append(mWidth).append(", ").append(mHeight);
        Object obj1 = (android.widget.RelativeLayout.LayoutParams)getLayoutParams();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = new android.widget.RelativeLayout.LayoutParams(mWidth, mHeight);
        }
        obj.width = mWidth;
        obj.height = mHeight;
        setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = findViewById(0x7f0e0323);
        obj1 = ((View) (obj)).getLayoutParams();
        obj1.width = mWidth;
        obj1.height = mWidth;
        ((View) (obj)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
    }

    private void setupShadows()
    {
        setOutlineProvider(new ViewOutlineProvider() {

            final RecCard this$0;

            public void getOutline(View view, Outline outline)
            {
                outline.setRoundRect(0, 0, mWidth, mHeight, getResources().getDimension(0x7f09017d));
                outline.setAlpha(0.55F);
            }

            
            {
                this$0 = RecCard.this;
                super();
            }
        });
        setClipToOutline(false);
    }

    private void setupStamps()
    {
        setStampNopeCompat((ImageView)findViewById(0x7f0e0327));
        setStampLikeCompat((ImageView)findViewById(0x7f0e0328));
        setStampSuperLikeCompat((ImageView)findViewById(0x7f0e032e));
    }

    private void setupTooltipThrob()
    {
        Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f04000e);
        animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

            final RecCard this$0;

            public void onAnimationEnd(Animation animation1)
            {
                mTooltip.animate().scaleX(0.0F).scaleY(0.0F).setStartDelay(128L).setDuration(128L).setInterpolator(new AccelerateInterpolator());
            }

            public void onAnimationRepeat(Animation animation1)
            {
            }

            public void onAnimationStart(Animation animation1)
            {
            }

            
            {
                this$0 = RecCard.this;
                super();
            }
        });
        mTooltip.startAnimation(animation);
    }

    private void setupTouchValues()
    {
        setClickThreshold(ViewConfiguration.get(getContext()).getScaledTouchSlop());
        setSwipeThreshold(0.25F * (float)mWidth);
        setTopThreshhold(mScreenHeight / 3);
        setSwipeEndX((float)mWidth * 1.4F);
        setSwipeEndY(mScreenHeight);
        setMinimumSwipeVelocity(1.5F);
        setMinimumSwipeUpVelocity(0.8F);
        setTiltSlop((float)mHeight / 1.3F);
        setRotationOnDrag(0.03F);
        setSwipeBoundaries(70F, 15F, 70F);
        setStampLeftBounds();
        setStampRightBounds();
    }

    public void animateSuperLike()
    {
        Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f04001c);
        Animation animation1 = AnimationUtils.loadAnimation(getContext(), 0x7f04001c);
        Animation animation2 = AnimationUtils.loadAnimation(getContext(), 0x7f04001c);
        animation2.setStartOffset(500L);
        animation1.setStartOffset(200L);
        mStarTailCenter.startAnimation(animation1);
        mStartTailLeft.startAnimation(animation);
        mStartTailRight.startAnimation(animation2);
        post(new Runnable() {

            final RecCard this$0;

            public void run()
            {
                mSuperlikeIcon.setVisibility(0);
                mSuperlikeTails.setVisibility(0);
                e e1 = com.tinder.utils.a.a();
                e1.a(f.b(14D, 14D));
                e1.a(new com.facebook.a.d() {

                    final _cls8 this$1;

                    public void onSpringAtRest(e e1)
                    {
                        e1 = AnimationUtils.loadAnimation(getContext(), 0x7f04001b);
                        mSuperlikeIcon.startAnimation(e1);
                    }

                    public void onSpringUpdate(e e1)
                    {
                        float f = (float)e1.d.a;
                        ad.c(mSuperlikeIcon, o.a(f, 0.0F, 0.45F, 1.0F, 1.0F));
                        mSuperlikeIcon.setTranslationY((1.0F - f) * 50F);
                        mSuperlikeIcon.setAlpha(f);
                        mSuperlikeTails.setTranslationY((1.0F - f) * 50F);
                        mSuperlikeTails.setAlpha(f);
                    }

            
            {
                this$1 = _cls8.this;
                super();
            }
                });
                e1.a(0.0D);
                e1.b(1.0D);
            }

            
            {
                this$0 = RecCard.this;
                super();
            }
        });
    }

    public boolean canBeSuperLiked()
    {
        return mMode == CardMode.REC;
    }

    public SparksEvent getBaseAdEvent(String s1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        s1 = (new SparksEvent(s1)).put("creativeId", mManagerLiveRail.c).put("campaignId", mManagerLiveRail.b).put("provider", mManagerLiveRail.d).put("type", "rec").put("format", "video").put("from", "recs");
        if (flag3)
        {
            s1.put("paused", Boolean.valueOf(mWebViewBridge.getPaused()));
        }
        if (flag)
        {
            s1.put("mute", Boolean.valueOf(mLastMuteState));
        }
        if (flag1)
        {
            s1.put("progress", EVENT_DECIMAL_FORMAT.format(mLastProgress));
        }
        if (flag2)
        {
            s1.put("timeViewed", Long.valueOf(System.currentTimeMillis() - mTimeMillisCardLoaded));
        }
        return s1;
    }

    public int getCardHeight()
    {
        return mHeight;
    }

    public CardMode getCardMode()
    {
        return mMode;
    }

    public int getCardWidth()
    {
        return mWidth;
    }

    public float getDimFull()
    {
        return 0.04F;
    }

    public float getDimMedium()
    {
        return 0.02F;
    }

    public ImageView getImageView()
    {
        return mRecImage;
    }

    public TextView getNameTextView()
    {
        return mName;
    }

    public User getRec()
    {
        return mRec;
    }

    public String getRecId()
    {
        return mRecId;
    }

    public View getSuperLikeStar()
    {
        return mSuperlikeIcon;
    }

    public boolean meetsRequirementsForSwipeUp()
    {
        return !mRec.isSuperLike();
    }

    public void onBitmapFailed(Drawable drawable)
    {
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
    {
        (new StringBuilder("image load from ")).append(loadedfrom.name());
        mProgressBar.setVisibility(8);
        mRecImage.setImageBitmap(bitmap);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        displayBadgeTooltip();
    }

    public void onPause()
    {
        if (mMode == CardMode.VIDEO_AD && mWebView != null)
        {
            mWebView.runCommand(LiveRailWebView.LiveRailCommand.pause);
        }
    }

    public void onPoppedOffStack(SwipeType swipetype)
    {
        if (mMode == CardMode.VIDEO_AD)
        {
            if (mListenerAdCache != null)
            {
                mListenerAdCache.n();
            }
            mWebView.loadUrl("about:blank");
            mManagerLiveRail.a(com.tinder.managers.ManagerLiveRail.LiveRailEvent.j);
            Object obj1 = mManagerLiveRail;
            Object obj = getContext();
            if (((ManagerLiveRail) (obj1)).i != null)
            {
                obj1 = ((ManagerLiveRail) (obj1)).i;
                obj = z.a(((Context) (obj)), ((String) (obj1)));
                boolean flag;
                if (obj != null && ((File) (obj)).exists())
                {
                    flag = ((File) (obj)).delete();
                } else
                {
                    flag = false;
                }
                String.format("Deleted URL from cache: %s (%s)", new Object[] {
                    Boolean.valueOf(flag), obj1
                });
            }
            obj = getBaseAdEvent("Ad.Close", true, true, true, true);
            if (swipetype != null)
            {
                ((SparksEvent) (obj)).put("like", Boolean.valueOf(swipetype.getAnalyticsFlag())).put("method", swipetype.getAnalyticsMethod());
            }
            ((SparksEvent) (obj)).fire();
            mRec = null;
        }
    }

    public void onPrepareLoad(Drawable drawable)
    {
    }

    public void onPushedToTopOfStack()
    {
        if (mMode == CardMode.VIDEO_AD)
        {
            mWebView.runCommand(LiveRailWebView.LiveRailCommand.load);
            mTimeMillisCardLoaded = System.currentTimeMillis();
            getBaseAdEvent("Ad.View", true, false, false, false).fire();
            if (mShouldBypassBecauseOfError && getCardListener() != null)
            {
                getCardListener().a(this, false);
            }
        } else
        if (mMode == CardMode.REC)
        {
            displayBadgeTooltip();
            return;
        }
    }

    public void setAdCacheListener(com.tinder.e.a a1)
    {
        mListenerAdCache = a1;
    }

    public void setCardMode(CardMode cardmode)
    {
        mLastCardMode = mMode;
        mMode = cardmode;
        mShouldBypassBecauseOfError = false;
        static class _cls9
        {

            static final int $SwitchMap$com$tinder$views$RecCard$CardMode[];

            static 
            {
                $SwitchMap$com$tinder$views$RecCard$CardMode = new int[CardMode.values().length];
                try
                {
                    $SwitchMap$com$tinder$views$RecCard$CardMode[CardMode.REC.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$tinder$views$RecCard$CardMode[CardMode.PROMOTED_REC.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$tinder$views$RecCard$CardMode[CardMode.SUPER_LIKE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$tinder$views$RecCard$CardMode[CardMode.VIDEO_AD.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls9..SwitchMap.com.tinder.views.RecCard.CardMode[cardmode.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            mRecId = null;
            initRecMode();
            return;

        case 2: // '\002'
            initPromotedRecMode();
            return;

        case 3: // '\003'
            initSuperLikeMode();
            return;

        case 4: // '\004'
            mRecId = null;
            break;
        }
        initVideoAdMode();
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        mProgressBar.setVisibility(8);
        mRecImage.setImageBitmap(bitmap);
    }

    public void setImageUrl(String s1)
    {
        mRecImage.setImageDrawable(null);
        mProgressBar.setVisibility(0);
        Picasso.a(getContext()).a(s1).a(this);
    }

    public void setNameAge(String s1, String s2)
    {
        s2 = (new StringBuilder(", ")).append(s2).toString();
        mName.setVisibility(0);
        mAge.setText(s2);
        mName.setText(TextUtils.ellipsize(s1, mName.getPaint(), (float)mWidth / 2.5F, android.text.TextUtils.TruncateAt.END));
    }

    public void setRec(User user)
    {
        setRec(user, null);
    }

    public void setRec(User user, SetRecListener setreclistener)
    {
        boolean flag;
        flag = false;
        mSuperlikeIcon.setVisibility(8);
        mSuperlikeIcon.clearAnimation();
        if (mRecId != null && mRecId.equals(user.getId()) && mLastCardMode == mMode) goto _L2; else goto _L1
_L1:
        int k;
        mRec = user;
        mRecId = user.getId();
        setNameAge(user.getName(), user.getAge());
        Career career = mRec.getCareer();
        boolean flag1;
        if (career != null && career.hasTeaser())
        {
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)mTeaser.getLayoutParams();
            layoutparams.leftMargin = getContext().getResources().getDimensionPixelSize(0x7f090174);
            mTeaser.setLayoutParams(layoutparams);
            mTeaser.setVisibility(0);
            mTeaser.setTextColor(android.support.v4.b.a.b(getContext(), 0x7f0d00f2));
            mTeaser.setText(career.getTeaser().getSpanned());
        } else
        {
            mTeaser.setVisibility(8);
        }
        mRecImage.setImageDrawable(null);
        k = user.getNumConnections();
        mCommonFriendCount.setText(String.valueOf(k));
        flag1 = mRec.isSuperLike();
        mSuperlikeTails.setVisibility(8);
        mStartTailLeft.clearAnimation();
        mStarTailCenter.clearAnimation();
        mStartTailRight.clearAnimation();
        if (!flag1 || !mEnableSuperlike) goto _L4; else goto _L3
_L3:
        setCardMode(CardMode.SUPER_LIKE);
_L6:
        if (user.hasPhotos() && user.getMainPhoto() != null)
        {
            user = user.getMainPhoto().getProcessedPhoto(ad.a((Activity)getContext()));
            if (user != null)
            {
                setImageUrl(((ProcessedPhoto) (user)).imageUrl);
            }
        }
        displayBadgeTooltip();
_L2:
        if (!isMoving())
        {
            resetStamps();
        }
        if (setreclistener != null)
        {
            setreclistener.setupComplete();
        }
        return;
_L4:
        ad.a(mTopLayout, getResources().getDrawable(0x7f0201a6));
        mName.setTextColor(getResources().getColor(0x7f0d00fb));
        mAge.setTextColor(getResources().getColor(0x7f0d00fb));
        findViewById(0x7f0e0325).setVisibility(8);
        int l = user.getNumCommonInterests();
        mCommonInterestCount.setText(String.valueOf(l));
        Object obj;
        int j;
        if (k > 0)
        {
            int i = getResources().getColor(0x7f0d0101);
            mCommonFriendCount.setTextColor(i);
            mFriendsIcon.setColorFilter(i);
        } else
        {
            j = getResources().getColor(0x7f0d000a);
            mCommonFriendCount.setTextColor(j);
            mFriendsIcon.setColorFilter(j);
        }
        obj = mInterestsIcon;
        if (l > 0)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((ImageView) (obj)).setVisibility(j);
        obj = mCommonInterestCount;
        if (l > 0)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((TextView) (obj)).setVisibility(j);
        obj = mFriendsIcon;
        if (k > 0)
        {
            j = 0;
        } else
        {
            j = 8;
        }
        ((ImageView) (obj)).setVisibility(j);
        obj = mCommonFriendCount;
        if (k > 0)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 8;
        }
        ((TextView) (obj)).setVisibility(j);
        if (mRec.isBrand())
        {
            setCardMode(CardMode.PROMOTED_REC);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void test()
    {
        mWebViewBridge = new WebAppLiveRailInterface();
        mWebViewBridge.launchCallToAction();
    }








/*
    static double access$1302(RecCard reccard, double d1)
    {
        reccard.mLastProgress = d1;
        return d1;
    }

*/


/*
    static boolean access$1402(RecCard reccard, boolean flag)
    {
        reccard.mLastMuteState = flag;
        return flag;
    }

*/



/*
    static boolean access$302(RecCard reccard, boolean flag)
    {
        reccard.mShouldBypassBecauseOfError = flag;
        return flag;
    }

*/






}
