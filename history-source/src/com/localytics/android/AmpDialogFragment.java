// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.localytics.android:
//            Constants, LocalyticsAmpSession, AmpCallable, AmpConstants, 
//            JavaScriptClient, DatapointHelper

public class AmpDialogFragment extends DialogFragment
{
    class AmpDialog extends Dialog
    {

        private static final String LOCATION_BOTTOM = "bottom";
        private static final String LOCATION_CENTER = "center";
        private static final String LOCATION_FULL = "full";
        private static final String LOCATION_TOP = "top";
        private static final int MARGIN = 10;
        private static final int MAX_BANNER_WIDTH_DIP = 360;
        private TranslateAnimation mAnimBottomIn;
        private TranslateAnimation mAnimBottomOut;
        private TranslateAnimation mAnimCenterIn;
        private TranslateAnimation mAnimCenterOut;
        private TranslateAnimation mAnimFullIn;
        private TranslateAnimation mAnimFullOut;
        private TranslateAnimation mAnimTopIn;
        private TranslateAnimation mAnimTopOut;
        private CloseButton mBtnClose;
        private RelativeLayout mDialogLayout;
        private float mHeight;
        private String mLocation;
        private DisplayMetrics mMetrics;
        private RelativeLayout mRootLayout;
        private AmpWebView mWebView;
        private float mWidth;
        final AmpDialogFragment this$0;

        private void adjustLayout()
        {
            float f;
            float f1;
            Window window;
            Object obj;
            mMetrics = new DisplayMetrics();
            ((WindowManager)getActivity().getSystemService("window")).getDefaultDisplay().getMetrics(mMetrics);
            mWidth = ((Float)mAmpMessage.get("display_width")).floatValue();
            mHeight = ((Float)mAmpMessage.get("display_height")).floatValue();
            f = mHeight / mWidth;
            f1 = Math.min(360F * mMetrics.density, Math.min(mMetrics.widthPixels, mMetrics.heightPixels));
            window = getWindow();
            obj = window.getAttributes();
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setFlags(32, 32);
            if (!mLocation.equals("center")) goto _L2; else goto _L1
_L1:
            window.setLayout(mMetrics.widthPixels, mMetrics.heightPixels);
            int i = (int)(10F * mMetrics.density + 0.5F);
            obj = (android.view.ViewGroup.MarginLayoutParams)mWebView.getLayoutParams();
            obj.width = (int)Math.min(f1 - (float)(i << 1), (int)(mWidth * mMetrics.density + 0.5F)) + (i << 1);
            obj.height = (int)(Math.min(f1 - (float)(i << 1), (int)(mWidth * mMetrics.density + 0.5F)) * f) + (i << 1);
            ((android.view.ViewGroup.MarginLayoutParams) (obj)).setMargins(i, i, i, i);
            mWebView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            mWebView.requestLayout();
_L4:
            if (mEnterAnimatable.getAndSet(false))
            {
                enterWithAnimation();
            }
            window.setFlags(1024, 1024);
            return;
_L2:
            if (mLocation.equals("full"))
            {
                window.setLayout(mMetrics.widthPixels, mMetrics.heightPixels);
            } else
            if (mLocation.equals("top"))
            {
                obj.y = 0xf0000001;
                obj.dimAmount = 0.0F;
                window.setLayout((int)f1, (int)(f1 * f + 0.5F));
            } else
            if (mLocation.equals("bottom"))
            {
                obj.y = 0xfffffff;
                obj.dimAmount = 0.0F;
                window.setLayout((int)f1, (int)(f1 * f + 0.5F));
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private void createAnimations()
        {
            mAnimCenterIn = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 1.0F, 2, 0.0F);
            mAnimCenterIn.setDuration(500L);
            mAnimCenterOut = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 0.0F, 2, 1.0F);
            mAnimCenterOut.setDuration(500L);
            mAnimTopIn = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, -1F, 2, 0.0F);
            mAnimTopIn.setDuration(500L);
            mAnimTopOut = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 0.0F, 2, -1F);
            mAnimTopOut.setDuration(500L);
            mAnimBottomIn = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 1.0F, 2, 0.0F);
            mAnimBottomIn.setDuration(500L);
            mAnimBottomOut = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 0.0F, 2, 1.0F);
            mAnimBottomOut.setDuration(500L);
            mAnimFullIn = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 1.0F, 2, 0.0F);
            mAnimFullIn.setDuration(500L);
            mAnimFullOut = new TranslateAnimation(2, 0.0F, 2, 0.0F, 2, 0.0F, 2, 1.0F);
            mAnimFullOut.setDuration(500L);
            android.view.animation.Animation.AnimationListener animationlistener = new android.view.animation.Animation.AnimationListener() {

                final AmpDialog this$1;

                public void onAnimationEnd(Animation animation)
                {
                    dismiss();
                }

                public void onAnimationRepeat(Animation animation)
                {
                }

                public void onAnimationStart(Animation animation)
                {
                }

            
            {
                this$1 = AmpDialog.this;
                super();
            }
            };
            mAnimCenterOut.setAnimationListener(animationlistener);
            mAnimTopOut.setAnimationListener(animationlistener);
            mAnimBottomOut.setAnimationListener(animationlistener);
            mAnimFullOut.setAnimationListener(animationlistener);
        }

        private void setupViews()
        {
            mRootLayout = new RelativeLayout(getContext());
            mRootLayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
            mDialogLayout = new RelativeLayout(getContext());
            android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutparams.addRule(13);
            mDialogLayout.setLayoutParams(layoutparams);
            mRootLayout.addView(mDialogLayout);
            mWebView = new AmpWebView(getContext(), null);
            mDialogLayout.addView(mWebView);
            mBtnClose = new CloseButton(getContext(), null);
            mBtnClose.setOnClickListener(new android.view.View.OnClickListener() {

                final AmpDialog this$1;

                public void onClick(View view)
                {
                    if (mExitAnimatable.getAndSet(false))
                    {
                        dismissWithAnimation();
                    }
                }

            
            {
                this$1 = AmpDialog.this;
                super();
            }
            });
            mDialogLayout.addView(mBtnClose);
            requestWindowFeature(1);
            setContentView(mRootLayout);
        }

        public void dismissWithAnimation()
        {
            String s = (String)mAmpMessage.get("location");
            if (s.equals("center"))
            {
                mRootLayout.startAnimation(mAnimCenterOut);
            } else
            {
                if (s.equals("full"))
                {
                    mRootLayout.startAnimation(mAnimFullOut);
                    return;
                }
                if (s.equals("top"))
                {
                    mRootLayout.startAnimation(mAnimTopOut);
                    return;
                }
                if (s.equals("bottom"))
                {
                    mRootLayout.startAnimation(mAnimBottomOut);
                    return;
                }
            }
        }

        public void enterWithAnimation()
        {
            String s = (String)mAmpMessage.get("location");
            if (s.equals("center"))
            {
                mRootLayout.startAnimation(mAnimCenterIn);
            } else
            {
                if (s.equals("full"))
                {
                    mRootLayout.startAnimation(mAnimFullIn);
                    return;
                }
                if (s.equals("top"))
                {
                    mRootLayout.startAnimation(mAnimTopIn);
                    return;
                }
                if (s.equals("bottom"))
                {
                    mRootLayout.startAnimation(mAnimBottomIn);
                    return;
                }
            }
        }

        public boolean onKeyDown(int i, KeyEvent keyevent)
        {
            if (i == 4)
            {
                if (mExitAnimatable.getAndSet(false))
                {
                    dismissWithAnimation();
                }
                return true;
            } else
            {
                return super.onKeyDown(i, keyevent);
            }
        }

        protected void onStop()
        {
            if (mBtnClose != null)
            {
                mBtnClose.release();
            }
            super.onStop();
        }





        public AmpDialog(Context context, int i)
        {
            this$0 = AmpDialogFragment.this;
            super(context, i);
            if (mAmpMessage == null)
            {
                dismiss();
            } else
            {
                mLocation = (String)mAmpMessage.get("location");
                setupViews();
                createAnimations();
                adjustLayout();
                ampdialogfragment = (String)mAmpMessage.get("html_url");
                if (AmpDialogFragment.this != null)
                {
                    mWebView.loadUrl(AmpDialogFragment.this);
                    return;
                }
            }
        }
    }

    class AmpDialog.AmpWebView extends WebView
    {

        private AmpWebViewClient mClient;
        final AmpDialog this$1;

        public AmpDialog.AmpWebView(Context context, AttributeSet attributeset)
        {
            this$1 = AmpDialog.this;
            super(context, attributeset);
            if (DatapointHelper.getApiLevel() >= 19)
            {
                setLayerType(1, null);
            }
            context = new android.widget.LinearLayout.LayoutParams(-1, -1);
            context.gravity = 17;
            setLayoutParams(context);
            setBackgroundColor(0);
            setInitialScale(1);
            setHorizontalScrollBarEnabled(false);
            setVerticalScrollBarEnabled(false);
            context = new AmpWebViewClient(getActivity());
            mClient = context;
            setWebViewClient(context);
            context = getSettings();
            context.setJavaScriptEnabled(true);
            addJavascriptInterface(mJavaScriptClient, "localytics");
            context.setUseWideViewPort(true);
        }
    }

    public class AmpDialog.AmpWebView.AmpWebViewClient extends WebViewClient
    {

        private Activity mActivity;
        final AmpDialog.AmpWebView this$2;

        public void onPageFinished(WebView webview, String s)
        {
            int i;
            int j;
            int k;
            if (((String)mAmpMessage.get("location")).equals("center"))
            {
                i = (int)(10F * mMetrics.density + 0.5F) << 1;
            } else
            {
                i = 0;
            }
            j = Math.min(mMetrics.widthPixels, mMetrics.heightPixels);
            k = Math.max(mMetrics.widthPixels, mMetrics.heightPixels);
            webview.loadUrl(String.format("javascript:(function() {  var viewportNode = document.createElement('meta');  viewportNode.name    = 'viewport';  viewportNode.content = 'width=%f, height=%f, user-scalable=no, minimum-scale=.25, maximum-scale=1';  viewportNode.id      = 'metatag';  document.getElementsByTagName('head')[0].appendChild(viewportNode);})()", new Object[] {
                Float.valueOf((float)Math.min(j - i, (int)(mWidth * mMetrics.density + 0.5F)) / mMetrics.density), Float.valueOf((float)Math.min(k - i, (int)(mHeight * mMetrics.density + 0.5F)) / mMetrics.density)
            }));
            webview.loadUrl(mJavaScriptClient.getJsGlueCode());
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            return handleUrl(s, mActivity);
        }

        public AmpDialog.AmpWebView.AmpWebViewClient(Activity activity)
        {
            this$2 = AmpDialog.AmpWebView.this;
            super();
            mActivity = activity;
        }
    }

    class AmpDialog.CloseButton extends View
    {

        private Bitmap mBitmap;
        private float mCenterX;
        private float mCenterY;
        private float mInnerRadius;
        private float mOffset;
        private Paint mPaint;
        private float mRadius;
        private Paint mShadowInnerPaint;
        private Paint mShadowOuterPaint;
        private float mStrokeWidth;
        final AmpDialog this$1;

        protected void onDraw(Canvas canvas)
        {
            super.onDraw(canvas);
            if (AmpDialogFragment.sDismissButtonImage != null)
            {
                canvas.drawBitmap(AmpDialogFragment.sDismissButtonImage, 0.0F, 0.0F, mPaint);
            } else
            {
                float f = getResources().getDisplayMetrics().density;
                canvas.drawCircle(mCenterX + f, mCenterY + f, mRadius - f, mShadowInnerPaint);
                canvas.drawCircle(mCenterX + f, mCenterY + f, mRadius - f, mShadowOuterPaint);
                if (mBitmap != null)
                {
                    canvas.drawBitmap(mBitmap, 0.0F, 0.0F, mPaint);
                    return;
                }
            }
        }

        public void release()
        {
            if (mBitmap != null)
            {
                mBitmap.recycle();
                mBitmap = null;
            }
        }

        public AmpDialog.CloseButton(Context context, AttributeSet attributeset)
        {
            this$1 = AmpDialog.this;
            super(context, attributeset);
            setId(1);
            if (DatapointHelper.getApiLevel() >= 14)
            {
                setLayerType(1, null);
            }
            float f = getResources().getDisplayMetrics().density;
            mCenterX = 13F * f;
            mCenterY = 13F * f;
            mRadius = 13F * f;
            mOffset = 5F * f;
            mStrokeWidth = 2.5F * f;
            mInnerRadius = mRadius - mStrokeWidth * 0.5F;
            mPaint = new Paint(1);
            mShadowInnerPaint = new Paint(1);
            mShadowInnerPaint.setMaskFilter(new BlurMaskFilter(mRadius - f, android.graphics.BlurMaskFilter.Blur.INNER));
            mShadowOuterPaint = new Paint(1);
            mShadowOuterPaint.setMaskFilter(new BlurMaskFilter(2.0F * f, android.graphics.BlurMaskFilter.Blur.OUTER));
            if (AmpDialogFragment.sDismissButtonImage == null)
            {
                setLayoutParams(new android.widget.RelativeLayout.LayoutParams((int)(30F * f + 0.5F), (int)(30F * f + 0.5F)));
            } else
            {
                setLayoutParams(new android.widget.RelativeLayout.LayoutParams((int)(40F * f + 0.5F), (int)(40F * f + 0.5F)));
            }
            mBitmap = Bitmap.createBitmap((int)(26F * f + 0.5F), (int)(26F * f + 0.5F), android.graphics.Bitmap.Config.ARGB_8888);
            ampdialog = new Canvas(mBitmap);
            mPaint.setColor(0xff000000);
            mPaint.setStyle(android.graphics.Paint.Style.FILL);
            drawCircle(mCenterX, mCenterY, mRadius, mPaint);
            mPaint.setColor(-1);
            mPaint.setStyle(android.graphics.Paint.Style.STROKE);
            mPaint.setStrokeWidth(mStrokeWidth);
            drawCircle(mCenterX, mCenterY, mInnerRadius, mPaint);
            mPaint.setStrokeWidth(4.5F * f);
            drawLine(mCenterX - mOffset, mCenterY - mOffset, mCenterX + mOffset, mCenterY + mOffset, mPaint);
            drawLine(mCenterX - mOffset, mCenterY + mOffset, mCenterX + mOffset, mCenterY - mOffset, mPaint);
        }
    }


    public static final int CLOSE_BUTTON_ID = 1;
    public static final String DIALOG_TAG = "amp_dialog";
    private static final int OPENING_EXTERNAL = 2;
    private static final int OPENING_INTERNAL = 1;
    private static final int PROTOCOL_UNMATCHED = -1;
    private static final int PROTOCOL_UNRECOGNIZED = -2;
    private static Bitmap sDismissButtonImage;
    private AmpDialog mAmpDialog;
    private Map mAmpMessage;
    private Map mCallbacks;
    private AtomicBoolean mEnterAnimatable;
    private AtomicBoolean mExitAnimatable;
    private JavaScriptClient mJavaScriptClient;
    private AtomicBoolean mUploadedViewEvent;

    public AmpDialogFragment()
    {
        mEnterAnimatable = new AtomicBoolean(true);
        mExitAnimatable = new AtomicBoolean(true);
        mUploadedViewEvent = new AtomicBoolean(false);
    }

    private String getValueByQueryKey(String s, URI uri)
    {
        String s1 = uri.getQuery();
        if (!TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1))
        {
            uri = uri.getQuery().split("[&]");
            int j = uri.length;
            int i = 0;
            while (i < j) 
            {
                String as[] = uri[i].split("[=]");
                if (as[0].compareTo(s) == 0 && 2 == as.length)
                {
                    try
                    {
                        s = URLDecoder.decode(as[1], "UTF-8");
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        return null;
                    }
                    return s;
                }
                i++;
            }
        }
        return null;
    }

    private String getValueByQueryKey(String s, URL url)
    {
        try
        {
            s = getValueByQueryKey(s, url.toURI());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    private int handleCustomProtocolRequest(String s, Activity activity)
    {
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        if (mAmpDialog.getContext().getPackageManager().queryIntentActivities(s, 0).size() > 0)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "[AMP Nav Handler]: An app on this device is registered to handle this protocol scheme. Opening...");
            }
            s.setFlags(0x20000);
            activity.startActivity(s);
            return 2;
        } else
        {
            return -2;
        }
    }

    private int handleCustomProtocolRequest(URL url, Activity activity)
    {
        return handleCustomProtocolRequest(url.toString(), activity);
    }

    private int handleFileProtocolRequest(URL url)
    {
        if (!url.getProtocol().equals("file"))
        {
            return -1;
        }
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", String.format("[AMP Nav Handler]: Displaying content from your local creatives.", new Object[0]));
        }
        return 1;
    }

    private int handleHttpProtocolRequest(URL url, Activity activity)
    {
        byte byte0 = 1;
        String s = url.getProtocol();
        if (!s.equals("http") && !s.equals("https"))
        {
            byte0 = -1;
        } else
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "[AMP Nav Handler]: Handling a request for an external HTTP address.");
            }
            String s1 = getValueByQueryKey("ampExternalOpen", url);
            if (!TextUtils.isEmpty(s1) && s1.toLowerCase(Locale.US).equals("true"))
            {
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", String.format("[AMP Nav Handler]: Query string hook [%s] set to true. Opening the URL in chrome", new Object[] {
                        "ampExternalOpen"
                    }));
                }
                url = new Intent("android.intent.action.VIEW", Uri.parse(url.toString()));
                if (mAmpDialog.getContext().getPackageManager().queryIntentActivities(url, 0).size() > 0)
                {
                    activity.startActivity(url);
                    return 2;
                }
            }
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", "[AMP Nav Handler]: Loading HTTP request inside the current AMP view");
                return 1;
            }
        }
        return byte0;
    }

    public static AmpDialogFragment newInstance()
    {
        AmpDialogFragment ampdialogfragment = new AmpDialogFragment();
        ampdialogfragment.setRetainInstance(true);
        return ampdialogfragment;
    }

    public static void setDismissButtonImage(Bitmap bitmap)
    {
        if (sDismissButtonImage != null)
        {
            sDismissButtonImage.recycle();
        }
        sDismissButtonImage = bitmap;
    }

    private void tagAmpActionEventWithAction(String s)
    {
        if (mUploadedViewEvent.getAndSet(true))
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", String.format("The AMP action for this message has already been set. Ignoring AMP Action: [%s]", new Object[] {
                    s
                }));
            }
        } else
        {
            Object obj = new TreeMap();
            ((TreeMap) (obj)).put("ampAction", s);
            ((TreeMap) (obj)).put("ampCampaignId", mAmpMessage.get("campaign_id").toString());
            ((TreeMap) (obj)).put("ampCampaign", mAmpMessage.get("rule_name").toString());
            s = (String)mAmpMessage.get("ab_test");
            if (!TextUtils.isEmpty(s))
            {
                ((TreeMap) (obj)).put("ampAB", s);
            }
            if (!LocalyticsAmpSession.isTestModeEnabled() && mCallbacks != null)
            {
                s = (AmpCallable)mCallbacks.get(Integer.valueOf(2));
                if (s != null)
                {
                    s.call(new Object[] {
                        "ampView", obj
                    });
                }
                if (Constants.IS_LOGGABLE)
                {
                    s = new StringBuilder();
                    java.util.Map.Entry entry;
                    for (obj = ((TreeMap) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); s.append((new StringBuilder()).append("Key = ").append((String)entry.getKey()).append(", Value = ").append((String)entry.getValue()).toString()))
                    {
                        entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                    }

                    Log.w("Localytics", String.format("AMP event tagged successfully.\n   Attributes Dictionary = \n%s", new Object[] {
                        s.toString()
                    }));
                    return;
                }
            }
        }
    }

    private void tagAmpActionForURL(URI uri)
    {
        String s = getValueByQueryKey("ampAction", uri);
        if (!TextUtils.isEmpty(s))
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", String.format("Attempting to tag event with custom AMP action.[Action: %s]", new Object[] {
                    s
                }));
            }
            tagAmpActionEventWithAction(s);
        } else
        {
            uri = uri.getScheme();
            if (!uri.equals("file") && !uri.equals("http") && !uri.equals("https"))
            {
                tagAmpActionEventWithAction("click");
                return;
            }
        }
    }

    boolean handleUrl(String s, Activity activity)
    {
        String s1;
        Object obj;
        String s2;
        int i;
        int j;
        int k;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag6;
        boolean flag7;
        flag1 = true;
        flag6 = true;
        flag7 = true;
        flag2 = true;
        obj = s;
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", String.format("[AMP Nav Handler]: Evaluating AMP URL:\n\tURL:%s", new Object[] {
                obj
            }));
        }
        flag = false;
        k = 0;
        s1 = ((String) (obj));
        j = k;
        s2 = ((String) (obj));
        i = ((flag) ? 1 : 0);
        if (!((String) (obj)).endsWith("://"))
        {
            break MISSING_BLOCK_LABEL_100;
        }
        j = k;
        s2 = ((String) (obj));
        i = ((flag) ? 1 : 0);
        s1 = ((String) (obj)).substring(0, ((String) (obj)).length() - 1);
        j = k;
        s2 = s1;
        i = ((flag) ? 1 : 0);
        tagAmpActionForURL(new URI(s1));
        j = k;
        s2 = s1;
        i = ((flag) ? 1 : 0);
        obj = new URL(s1);
        j = k;
        s2 = s1;
        i = ((flag) ? 1 : 0);
        k = handleFileProtocolRequest(((URL) (obj)));
        i = k;
        if (i <= 0) goto _L2; else goto _L1
_L1:
        if (i != 2)
        {
            flag2 = false;
        }
        flag1 = flag2;
        if (i == 2)
        {
            dismiss();
            flag1 = flag2;
        }
_L4:
        return flag1;
_L2:
        j = i;
        s2 = s1;
        k = handleHttpProtocolRequest(((URL) (obj)), activity);
        i = k;
        if (i <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag3;
        if (i == 2)
        {
            flag3 = flag1;
        } else
        {
            flag3 = false;
        }
        flag1 = flag3;
        if (i == 2)
        {
            dismiss();
            return flag3;
        }
        if (true) goto _L4; else goto _L3
_L3:
        j = i;
        s2 = s1;
        k = handleCustomProtocolRequest(((URL) (obj)), activity);
        if (k <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        boolean flag4;
        if (k == 2)
        {
            flag4 = flag6;
        } else
        {
            flag4 = false;
        }
        flag1 = flag4;
        if (k == 2)
        {
            dismiss();
            return flag4;
        }
        if (true) goto _L4; else goto _L5
_L5:
        j = k;
        s2 = s1;
        i = k;
        if (!Constants.IS_LOGGABLE)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        j = k;
        s2 = s1;
        i = k;
        Log.w("Localytics", String.format("[AMP Nav Handler]: Protocol handler scheme not recognized. Attempting to load the URL... [Scheme: %s]", new Object[] {
            ((URL) (obj)).getProtocol()
        }));
        if (k == 2)
        {
            dismiss();
        }
_L7:
        return false;
        Exception exception;
        exception;
        i = j;
        j = handleCustomProtocolRequest(s2, activity);
        if (j > 0)
        {
            boolean flag5;
            if (j == 2)
            {
                flag5 = flag7;
            } else
            {
                flag5 = false;
            }
            flag1 = flag5;
            if (j == 2)
            {
                dismiss();
                return flag5;
            }
            continue; /* Loop/switch isn't completed */
        }
        i = j;
        if (!Constants.IS_LOGGABLE)
        {
            break MISSING_BLOCK_LABEL_467;
        }
        i = j;
        Log.w("Localytics", String.format("[AMP Nav Handler]: Invalid url %s", new Object[] {
            s
        }));
        i = j;
        dismiss();
        if (j == 2)
        {
            dismiss();
        }
        if (true) goto _L7; else goto _L6
_L6:
        s;
        if (i == 2)
        {
            dismiss();
        }
        throw s;
        if (true) goto _L4; else goto _L8
_L8:
    }

    public void onActivityCreated(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onActivityCreated");
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onAttach");
        }
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onCreate");
        }
        super.onCreate(bundle);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onCreateDialog");
        }
        bundle = new AmpDialog(getActivity(), 0x103000b);
        mAmpDialog = bundle;
        return bundle;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onCreateView");
        }
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroy()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onDestroy");
        }
        if (mCallbacks != null)
        {
            AmpCallable ampcallable = (AmpCallable)mCallbacks.get(Integer.valueOf(1));
            if (!AmpConstants.isTestModeEnabled() && ampcallable != null)
            {
                ampcallable.call(new Object[] {
                    mAmpMessage
                });
            }
        }
        super.onDestroy();
    }

    public void onDestroyView()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onDestroyView");
        }
        if (getDialog() != null && getRetainInstance())
        {
            getDialog().setOnDismissListener(null);
        }
        super.onDestroyView();
    }

    public void onDetach()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onDetach");
        }
        super.onDetach();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onDismiss");
        }
        if (mAmpMessage != null)
        {
            tagAmpActionEventWithAction("X");
        }
        super.onDismiss(dialoginterface);
    }

    public void onPause()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onPause");
        }
        super.onPause();
    }

    public void onResume()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onResume");
        }
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onSaveInstanceState");
        }
        super.onSaveInstanceState(bundle);
    }

    public void onStart()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onStart");
        }
        super.onStart();
    }

    public void onStop()
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onStop");
        }
        super.onStop();
    }

    public void onViewStateRestored(Bundle bundle)
    {
        if (Constants.IS_LOGGABLE)
        {
            Log.w("AmpDialogFragment", "onViewStateRestored");
        }
        super.onViewStateRestored(bundle);
    }

    public AmpDialogFragment setCallbacks(Map map)
    {
        mCallbacks = map;
        return this;
    }

    public AmpDialogFragment setData(Map map)
    {
        mAmpMessage = map;
        return this;
    }

    public AmpDialogFragment setJavaScriptClient(JavaScriptClient javascriptclient)
    {
        mJavaScriptClient = javascriptclient;
        javascriptclient = mJavaScriptClient.getCallbacks();
        javascriptclient.put(Integer.valueOf(15), new AmpCallable() {

            final AmpDialogFragment this$0;

            Object call(Object aobj[])
            {
                aobj = (String)aobj[0];
                final AmpDialog.AmpWebView mWebView = mAmpDialog.mWebView;
                if (handleUrl(((String) (aobj)), getActivity()))
                {
                    (new Handler(Looper.getMainLooper())).post(((_cls1) (aobj)). new Runnable() {

                        final _cls1 this$1;
                        final AmpDialog.AmpWebView val$mWebView;
                        final String val$url;

                        public void run()
                        {
                            mWebView.loadUrl(url);
                        }

            
            {
                this$1 = final__pcls1;
                mWebView = ampwebview;
                url = String.this;
                super();
            }
                    });
                }
                return null;
            }

            
            {
                this$0 = AmpDialogFragment.this;
                super();
            }
        });
        javascriptclient.put(Integer.valueOf(4), new AmpCallable() {

            final AmpDialogFragment this$0;

            Object call(Object aobj[])
            {
                dismiss();
                return null;
            }

            
            {
                this$0 = AmpDialogFragment.this;
                super();
            }
        });
        return this;
    }






}
