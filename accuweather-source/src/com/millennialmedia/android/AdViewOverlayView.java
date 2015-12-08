// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;

// Referenced classes of package com.millennialmedia.android:
//            MMLayout, AdViewOverlayActivity, MMAdImpl, MMAdImplController, 
//            MMLog, MMActivity, OverlaySettings, MMWebView, 
//            InlineVideoView, BridgeMMSpeechkit, BannerExpandedWebViewClient, InterstitialWebViewClient, 
//            MMWebViewClient, HttpGetRequest

class AdViewOverlayView extends MMLayout
{
    class AdViewOverlayViewMMAdImpl extends MMLayout.MMLayoutMMAdImpl
    {

        final AdViewOverlayView this$0;

        MMWebViewClient getMMWebViewClient()
        {
            MMLog.d("AdViewOverlayView", (new StringBuilder()).append("Returning a client for user: OverlayWebViewClient, adimpl=").append(adImpl).toString());
            if (adImpl.linkForExpansionId != 0L || settings.hasExpandUrl())
            {
                BannerExpandedWebViewClient bannerexpandedwebviewclient = new BannerExpandedWebViewClient(mmWebViewClientListener, new OverlayRedirectionListenerImpl(this));
                mmWebViewClient = bannerexpandedwebviewclient;
                return bannerexpandedwebviewclient;
            } else
            {
                InterstitialWebViewClient interstitialwebviewclient = new InterstitialWebViewClient(mmWebViewClientListener, new OverlayRedirectionListenerImpl(this));
                mmWebViewClient = interstitialwebviewclient;
                return interstitialwebviewclient;
            }
        }

        boolean isExpandingToUrl()
        {
            return settings.hasExpandUrl() && !settings.hasLoadedExpandUrl();
        }

        void removeProgressBar()
        {
            AdViewOverlayView.this.removeProgressBar();
        }

        public AdViewOverlayViewMMAdImpl(Context context)
        {
            this$0 = AdViewOverlayView.this;
            super(AdViewOverlayView.this, context);
            mmWebViewClientListener = new OverlayWebViewClientListener(this);
        }
    }

    private static class AnimationListener
        implements android.view.animation.Animation.AnimationListener
    {

        private WeakReference overlayRef;

        public void onAnimationEnd(Animation animation)
        {
            animation = (AdViewOverlayView)overlayRef.get();
            if (animation != null)
            {
                animation = (Activity)animation.getContext();
                MMLog.d("AdViewOverlayView", "Finishing overlay this is in w/ anim finishOverLayWithAnim()");
                animation.finish();
            }
        }

        public void onAnimationRepeat(Animation animation)
        {
        }

        public void onAnimationStart(Animation animation)
        {
            animation = (AdViewOverlayView)overlayRef.get();
            if (animation != null && ((AdViewOverlayView) (animation)).mraidCloseButton != null)
            {
                ((AdViewOverlayView) (animation)).mraidCloseButton.setVisibility(8);
            }
        }

        public AnimationListener(AdViewOverlayView adviewoverlayview)
        {
            overlayRef = new WeakReference(adviewoverlayview);
        }
    }

    private static class CloseDrawable extends Drawable
    {

        protected boolean enabled;
        protected final Paint paint = new Paint();

        public void draw(Canvas canvas)
        {
            Rect rect = copyBounds();
            int i = rect.right - rect.left;
            int j = rect.bottom - rect.top;
            float f = (float)i / 6F;
            paint.setStrokeWidth(f);
            char c;
            if (enabled)
            {
                c = '\377';
            } else
            {
                c = 'P';
            }
            paint.setARGB(255, c, c, c);
            canvas.drawLine(f / 2.0F, f / 2.0F, (float)i - f / 2.0F, (float)j - f / 2.0F, paint);
            canvas.drawLine((float)i - f / 2.0F, f / 2.0F, f / 2.0F, (float)j - f / 2.0F, paint);
        }

        public int getOpacity()
        {
            return -3;
        }

        public void setAlpha(int i)
        {
        }

        public void setColorFilter(ColorFilter colorfilter)
        {
        }

        CloseDrawable(boolean flag)
        {
            enabled = true;
            enabled = flag;
            paint.setAntiAlias(true);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
        }
    }

    private static class CloseTopDrawable extends CloseDrawable
    {

        final float dist;
        final float scale;

        public void draw(Canvas canvas)
        {
            Rect rect = copyBounds();
            float f = (float)(rect.right - rect.left) / 10F;
            float f1 = (float)rect.right - scale * 20F;
            float f2 = (float)rect.top + scale * 20F;
            paint.setStrokeWidth(f);
            paint.setColor(0xff000000);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.drawCircle(f1, f2, 12F * scale, paint);
            paint.setColor(-1);
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            canvas.drawCircle(f1, f2, scale * 10F, paint);
            paint.setColor(0xff000000);
            canvas.drawCircle(f1, f2, 7F * scale, paint);
            paint.setColor(-1);
            paint.setStrokeWidth(f / 2.0F);
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            canvas.drawLine(f1 - dist, f2 - dist, f1 + dist, f2 + dist, paint);
            canvas.drawLine(f1 + dist, f2 - dist, f1 - dist, f2 + dist, paint);
        }

        CloseTopDrawable(boolean flag, float f)
        {
            super(flag);
            scale = f;
            dist = 4F * f;
            paint.setColor(0xff000000);
        }
    }

    private static class FetchWebViewContentTask extends AsyncTask
    {

        private WeakReference _overlayViewRef;
        private String baseUrl;
        private boolean cancelVideo;

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((Void[])aobj);
        }

        protected transient String doInBackground(Void avoid[])
        {
            cancelVideo = true;
            if (TextUtils.isEmpty(baseUrl))
            {
                break MISSING_BLOCK_LABEL_98;
            }
            avoid = (new HttpGetRequest()).get(baseUrl);
            if (avoid == null)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            StatusLine statusline = avoid.getStatusLine();
            if (avoid == null || statusline == null)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            if (statusline.getStatusCode() == 404)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            avoid = avoid.getEntity();
            if (avoid == null)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            avoid = HttpGetRequest.convertStreamToString(avoid.getContent());
            cancelVideo = false;
            return avoid;
            avoid;
            MMLog.e("AdViewOverlayView", "Unable to get weboverlay", avoid);
            return null;
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((String)obj);
        }

        protected void onPostExecute(String s)
        {
            AdViewOverlayView adviewoverlayview = (AdViewOverlayView)_overlayViewRef.get();
            if (adviewoverlayview != null)
            {
                if (cancelVideo)
                {
                    AdViewOverlayActivity adviewoverlayactivity = (AdViewOverlayActivity)adviewoverlayview.overlayActivityRef.get();
                    if (adviewoverlayactivity != null)
                    {
                        adviewoverlayactivity.finish();
                    } else
                    {
                        adviewoverlayview.removeProgressBar();
                    }
                }
                if (s != null && adviewoverlayview.adImpl != null && adviewoverlayview.adImpl.controller != null)
                {
                    adviewoverlayview.adImpl.controller.setWebViewContent(s, baseUrl);
                }
            }
        }

        protected void onPreExecute()
        {
            AdViewOverlayView adviewoverlayview = (AdViewOverlayView)_overlayViewRef.get();
            if (adviewoverlayview != null && adviewoverlayview.progressBar == null)
            {
                adviewoverlayview.initProgressBar();
            }
            super.onPreExecute();
        }

        public FetchWebViewContentTask(AdViewOverlayView adviewoverlayview, String s)
        {
            baseUrl = s;
            _overlayViewRef = new WeakReference(adviewoverlayview);
        }
    }

    private static final class NonConfigurationInstance
    {

        MMAdImplController controller;
        boolean progressDone;
        OverlaySettings settings;

        private NonConfigurationInstance()
        {
        }

    }

    static class OverlayRedirectionListenerImpl extends MMAdImpl.MMAdImplRedirectionListenerImpl
    {

        public boolean isExpandingToUrl()
        {
            MMAdImpl mmadimpl = (MMAdImpl)adImplRef.get();
            if (mmadimpl != null && (mmadimpl instanceof AdViewOverlayViewMMAdImpl))
            {
                return mmadimpl.isExpandingToUrl();
            } else
            {
                return false;
            }
        }

        public OverlayRedirectionListenerImpl(MMAdImpl mmadimpl)
        {
            super(mmadimpl);
        }
    }

    private static class OverlayWebViewClientListener extends MMAdImpl.BasicWebViewClientListener
    {

        public void onPageFinished(String s)
        {
            super.onPageFinished(s);
            s = (MMAdImpl)adImplRef.get();
            if (s != null)
            {
                s.removeProgressBar();
            }
        }

        OverlayWebViewClientListener(MMAdImpl mmadimpl)
        {
            super(mmadimpl);
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public SavedState[] newArray(int i)
            {
                return new SavedState[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        public Object customInlineLayoutParams;
        String json;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(json);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            json = parcel.readString();
        }


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    private static class SetCloseButtonTouchDelegateRunnable
        implements Runnable
    {

        int bottom;
        private final Button closeButton;
        int left;
        int right;
        int top;

        public void run()
        {
            Object obj = new Rect();
            closeButton.getHitRect(((Rect) (obj)));
            obj.top = ((Rect) (obj)).top + top;
            obj.right = ((Rect) (obj)).right + right;
            obj.bottom = ((Rect) (obj)).bottom + bottom;
            obj.left = ((Rect) (obj)).left + left;
            obj = new TouchDelegate(((Rect) (obj)), closeButton);
            if (android/view/View.isInstance(closeButton.getParent()))
            {
                ((View)closeButton.getParent()).setTouchDelegate(((TouchDelegate) (obj)));
            }
        }

        SetCloseButtonTouchDelegateRunnable(Button button, int i, int j, int k, int l)
        {
            closeButton = button;
            top = i;
            left = j;
            bottom = k;
            right = l;
        }
    }


    private static final String MRAID_CLOSE_BUTTON_DESRIPTION = "mraidCloseButton";
    private static final String TAG = "AdViewOverlayView";
    private Button mraidCloseButton;
    CloseTopDrawable mraidCloseDrawable;
    WeakReference overlayActivityRef;
    private ProgressBar progressBar;
    private boolean progressDone;
    OverlaySettings settings;

    AdViewOverlayView(AdViewOverlayActivity adviewoverlayactivity, OverlaySettings overlaysettings)
    {
        super(adviewoverlayactivity.activity);
        overlayActivityRef = new WeakReference(adviewoverlayactivity);
        adImpl = new AdViewOverlayViewMMAdImpl(adviewoverlayactivity.activity);
        setId(15062);
        adImpl.adType = "i";
        settings = overlaysettings;
        overlaysettings = null;
        Object obj;
        if (adviewoverlayactivity.activity instanceof Activity)
        {
            overlaysettings = (NonConfigurationInstance)adviewoverlayactivity.activity.getLastNonConfigurationInstance();
            float f;
            if (overlaysettings != null)
            {
                progressDone = ((NonConfigurationInstance) (overlaysettings)).progressDone;
                adImpl.controller = ((NonConfigurationInstance) (overlaysettings)).controller;
                settings = ((NonConfigurationInstance) (overlaysettings)).settings;
                if (adImpl != null && adImpl.controller != null && adImpl.controller.webView != null)
                {
                    addView(adImpl.controller.webView);
                }
                MMLog.d("AdViewOverlayView", (new StringBuilder()).append("Restoring configurationinstance w/ controller= ").append(((NonConfigurationInstance) (overlaysettings)).controller).toString());
            } else
            {
                MMLog.d("AdViewOverlayView", "Null configurationinstance ");
            }
        }
        f = adviewoverlayactivity.activity.getResources().getDisplayMetrics().density;
        if (settings.height != 0 && settings.width != 0)
        {
            obj = new android.widget.RelativeLayout.LayoutParams((int)((float)settings.width * f), (int)((float)settings.height * f));
        } else
        {
            obj = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        }
        ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13);
        setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        obj = Integer.valueOf((int)(0.0625F * f * (float)settings.shouldResizeOverlay));
        setPadding(((Integer) (obj)).intValue(), ((Integer) (obj)).intValue(), ((Integer) (obj)).intValue(), ((Integer) (obj)).intValue());
        mraidCloseButton = initMRaidCloseButton(adviewoverlayactivity.activity, f);
        if (settings.isExpanded() && !settings.hasExpandUrl())
        {
            adImpl.linkForExpansionId = settings.creatorAdImplId;
        }
        MMAdImplController.assignAdViewController(adImpl);
        if (mraidCloseButton != null)
        {
            addView(mraidCloseButton);
        }
        if (!progressDone && !settings.isExpanded() && !settings.isFromInterstitial())
        {
            initProgressBar();
        }
        if (settings.getIsTransparent())
        {
            if (adImpl != null && adImpl.controller != null && adImpl.controller.webView != null)
            {
                adImpl.controller.webView.setBackgroundColor(0);
            }
            setBackgroundColor(0);
        } else
        {
            if (adImpl != null && adImpl.controller != null && adImpl.controller.webView != null)
            {
                adImpl.controller.webView.setBackgroundColor(-1);
            }
            setBackgroundColor(-1);
        }
        if (settings.enableHardwareAccel() && adImpl != null && adImpl.controller != null && adImpl.controller.webView != null)
        {
            adImpl.controller.webView.enableHardwareAcceleration();
        }
        if (overlaysettings == null)
        {
            animateView();
        }
        setUseCustomClose(settings.getUseCustomClose());
    }

    private void animateView()
    {
        Object obj;
        if (settings.getTransition().equals("slideup"))
        {
            obj = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, 1.0F, 1, 0.0F);
            MMLog.v("AdViewOverlayView", "Translate up");
        } else
        {
            if (!settings.getTransition().equals("slidedown"))
            {
                continue;
            }
            obj = new TranslateAnimation(1, 0.0F, 1, 0.0F, 1, -1F, 1, 0.0F);
            MMLog.v("AdViewOverlayView", "Translate down");
        }
        do
        {
            ((Animation) (obj)).setDuration(settings.getTransitionDurationInMillis());
            startAnimation(((Animation) (obj)));
            do
            {
                return;
            } while (!settings.getTransition().equals("explode"));
            obj = new ScaleAnimation(1.1F, 0.9F, 0.1F, 0.9F, 1, 0.5F, 1, 0.5F);
            MMLog.v("AdViewOverlayView", "Explode");
        } while (true);
    }

    private android.widget.RelativeLayout.LayoutParams getCloseAreaParams(float f)
    {
        int i = (int)(50F * f + 0.5F);
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(i, i);
        layoutparams.addRule(11);
        layoutparams.addRule(10);
        return layoutparams;
    }

    private Button initMRaidCloseButton(Context context, float f)
    {
        context = new Button(context);
        context.setId(301);
        context.setContentDescription("mraidCloseButton");
        mraidCloseDrawable = new CloseTopDrawable(true, f);
        context.setOnClickListener(new android.view.View.OnClickListener() {

            final AdViewOverlayView this$0;

            public void onClick(View view)
            {
                MMLog.v("AdViewOverlayView", "Close button clicked.");
                finishOverlayWithAnimation();
            }

            
            {
                this$0 = AdViewOverlayView.this;
                super();
            }
        });
        android.widget.RelativeLayout.LayoutParams layoutparams = getCloseAreaParams(f);
        context.setLayoutParams(layoutparams);
        context.post(new SetCloseButtonTouchDelegateRunnable(context, layoutparams.topMargin, layoutparams.leftMargin, layoutparams.bottomMargin, layoutparams.rightMargin));
        return context;
    }

    private void initProgressBar()
    {
        Object obj = (AdViewOverlayActivity)overlayActivityRef.get();
        if (obj != null)
        {
            progressBar = new ProgressBar(((AdViewOverlayActivity) (obj)).activity);
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13);
            addView(progressBar, ((android.view.ViewGroup.LayoutParams) (obj)));
        }
    }

    private void removeProgressBar()
    {
        if (!progressDone && progressBar != null)
        {
            progressDone = true;
            progressBar.setVisibility(8);
            removeView(progressBar);
            progressBar = null;
        }
    }

    boolean attachWebViewToLink()
    {
        return adImpl != null && adImpl.linkForExpansionId != 0L && MMAdImplController.attachWebViewFromOverlay(adImpl);
    }

    void bringMraidCloseToFront()
    {
        if (mraidCloseButton != null)
        {
            mraidCloseButton.bringToFront();
        }
    }

    void closeAreaTouched()
    {
        post(new Runnable() {

            final AdViewOverlayView this$0;

            public void run()
            {
                finishOverlayWithAnimation();
            }

            
            {
                this$0 = AdViewOverlayView.this;
                super();
            }
        });
    }

    void finishOverlayWithAnimation()
    {
        MMLog.d("AdViewOverlayView", "Ad overlay closed");
        if ((Activity)getContext() == null)
        {
            return;
        } else
        {
            AlphaAnimation alphaanimation = new AlphaAnimation(1.0F, 0.0F);
            alphaanimation.setAnimationListener(new AnimationListener(this));
            alphaanimation.setFillEnabled(true);
            alphaanimation.setFillBefore(true);
            alphaanimation.setFillAfter(true);
            alphaanimation.setDuration(400L);
            startAnimation(alphaanimation);
            return;
        }
    }

    Object getNonConfigurationInstance()
    {
        NonConfigurationInstance nonconfigurationinstance = new NonConfigurationInstance();
        if (adImpl != null)
        {
            MMLog.d("AdViewOverlayView", (new StringBuilder()).append("Saving getNonConfigurationInstance for ").append(adImpl).toString());
            if (adImpl.controller != null && adImpl.controller.webView != null)
            {
                adImpl.controller.webView.removeFromParent();
            }
            nonconfigurationinstance.controller = adImpl.controller;
        }
        nonconfigurationinstance.progressDone = progressDone;
        nonconfigurationinstance.settings = settings;
        return nonconfigurationinstance;
    }

    void getWebContent(String s)
    {
        (new FetchWebViewContentTask(this, s)).execute(new Void[0]);
    }

    void injectJS(String s)
    {
        if (adImpl.controller != null)
        {
            adImpl.controller.loadUrl(s);
        }
    }

    void inlineConfigChange()
    {
        if (inlineVideoView != null && inlineVideoLayout != null)
        {
            inlineVideoLayout.setLayoutParams(inlineVideoView.getCustomLayoutParams());
            bringMraidCloseToFront();
        }
    }

    void killWebView()
    {
        BridgeMMSpeechkit.releaseSpeechKit();
        if (adImpl != null && adImpl.controller != null && adImpl.controller.webView != null)
        {
            adImpl.controller.webView.clearFocus();
            adImpl.controller.webView.setMraidViewableHidden();
            if (adImpl.adType == "i")
            {
                adImpl.controller.webView.setMraidHidden();
            }
            adImpl.controller.webView.onPauseWebView();
        }
    }

    void removeSelfAndAll()
    {
        removeAllViews();
        android.view.ViewParent viewparent = getParent();
        if (viewparent != null && (viewparent instanceof ViewGroup))
        {
            ((ViewGroup)viewparent).removeView(this);
        }
    }

    void setUseCustomClose(boolean flag)
    {
        settings.setUseCustomClose(flag);
        Button button = mraidCloseButton;
        Object obj;
        if (flag)
        {
            obj = null;
        } else
        {
            obj = mraidCloseDrawable;
        }
        button.setBackgroundDrawable(((Drawable) (obj)));
    }




}
