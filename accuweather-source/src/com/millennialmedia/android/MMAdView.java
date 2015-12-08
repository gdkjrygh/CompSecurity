// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Random;

// Referenced classes of package com.millennialmedia.android:
//            MMLayout, MMLog, MMAdImpl, MMRequest, 
//            MMSDK, DTOResizeParameters, MMAdImplController, MMWebView, 
//            RequestListener

public final class MMAdView extends MMLayout
    implements android.view.View.OnClickListener, android.view.animation.Animation.AnimationListener
{
    class BannerBounds
    {

        DTOResizeParameters resizeParams;
        final MMAdView this$0;
        int translationX;
        int translationY;

        private BoundsResult calculateBounds(int i, int j, int k, int l)
        {
            int i1;
            int j1;
            i1 = i;
            j1 = k;
            if (i + k + j <= l) goto _L2; else goto _L1
_L1:
            j = (l - k) + j;
            if (j >= 0) goto _L4; else goto _L3
_L3:
            int k1;
            i1 = 0;
            k1 = l;
_L6:
            BoundsResult boundsresult = new BoundsResult();
            boundsresult.translation = i1 - i;
            boundsresult.size = k1;
            return boundsresult;
_L4:
            k1 = j1;
            i1 = j;
            if (j + k > l)
            {
                i1 = l - k;
                k1 = j1;
            }
            continue; /* Loop/switch isn't completed */
_L2:
            k1 = j1;
            if (j > 0)
            {
                k1 = j1;
                i1 = j;
            }
            if (true) goto _L6; else goto _L5
_L5:
        }

        private void calculateXBounds()
        {
            int ai[] = new int[2];
            getLocationInWindow(ai);
            BoundsResult boundsresult = calculateBounds(ai[0], resizeParams.offsetX, resizeParams.width, resizeParams.xMax);
            resizeParams.width = boundsresult.size;
            translationX = boundsresult.translation;
        }

        private void calculateYBounds()
        {
            int ai[] = new int[2];
            getLocationInWindow(ai);
            BoundsResult boundsresult = calculateBounds(ai[1], resizeParams.offsetY, resizeParams.height, resizeParams.yMax);
            resizeParams.height = boundsresult.size;
            translationY = boundsresult.translation;
        }

        void calculateOnScreenBounds()
        {
            calculateXBounds();
            calculateYBounds();
        }

        android.view.ViewGroup.LayoutParams modifyLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            layoutparams.width = resizeParams.width;
            layoutparams.height = resizeParams.height;
            return layoutparams;
        }

        BannerBounds(DTOResizeParameters dtoresizeparameters)
        {
            this$0 = MMAdView.this;
            super();
            resizeParams = dtoresizeparameters;
            translationX = dtoresizeparameters.offsetX;
            translationY = dtoresizeparameters.offsetY;
        }
    }

    private class BannerBounds.BoundsResult
    {

        int size;
        final BannerBounds this$1;
        int translation;

        private BannerBounds.BoundsResult()
        {
            this$1 = BannerBounds.this;
            super();
        }

    }

    class MMAdViewMMAdImpl extends MMLayout.MMLayoutMMAdImpl
    {

        final MMAdView this$0;

        void animateTransition()
        {
            if (refreshAnimationimageView.getDrawable() == null) goto _L2; else goto _L1
_L1:
            int i;
            int j = transitionType;
            i = j;
            if (j == 4)
            {
                i = (new Random()).nextInt(4);
            }
            i;
            JVM INSTR tableswitch 2 3: default 64
        //                       2 117
        //                       3 140;
               goto _L3 _L4 _L5
_L3:
            Object obj = new AlphaAnimation(1.0F, 0.0F);
_L7:
            ((Animation) (obj)).setDuration(1000L);
            ((Animation) (obj)).setAnimationListener(MMAdView.this);
            ((Animation) (obj)).setFillEnabled(true);
            ((Animation) (obj)).setFillBefore(true);
            ((Animation) (obj)).setFillAfter(true);
            MMSDK.runOnUiThread(((_cls1) (obj)). new Runnable() {

                final MMAdViewMMAdImpl this$1;
                final Animation val$animFinal;

                public void run()
                {
                    refreshAnimationimageView.startAnimation(animFinal);
                }

            
            {
                this$1 = final_mmadviewmmadimpl;
                animFinal = Animation.this;
                super();
            }
            });
_L2:
            return;
_L4:
            obj = new TranslateAnimation(0.0F, 0.0F, 0.0F, -(float)getHeight());
            continue; /* Loop/switch isn't completed */
_L5:
            obj = new TranslateAnimation(0.0F, 0.0F, 0.0F, getHeight());
            if (true) goto _L7; else goto _L6
_L6:
        }

        String getReqType()
        {
            return "getad";
        }

        String getRequestCompletedAction()
        {
            return "millennialmedia.action.ACTION_GETAD_SUCCEEDED";
        }

        String getRequestFailedAction()
        {
            return "millennialmedia.action.ACTION_GETAD_FAILED";
        }

        public boolean hasCachedVideoSupport()
        {
            return false;
        }

        void insertUrlAdMetaValues(Map map)
        {
            if (height > 0)
            {
                map.put("hsht", String.valueOf(height));
            }
            if (width > 0)
            {
                map.put("hswd", String.valueOf(width));
            }
            super.insertUrlAdMetaValues(map);
        }

        public boolean isBanner()
        {
            return true;
        }

        boolean isLifecycleObservable()
        {
            return getWindowToken() != null;
        }

        boolean isTransitionAnimated()
        {
            return transitionType != 0;
        }

        void prepareTransition(Bitmap bitmap)
        {
            refreshAnimationimageView.setImageBitmap(bitmap);
            refreshAnimationimageView.setVisibility(0);
            refreshAnimationimageView.bringToFront();
        }

        public MMAdViewMMAdImpl(Context context)
        {
            this$0 = MMAdView.this;
            super(MMAdView.this, context);
            mmWebViewClientListener = new MMAdViewWebViewClientListener(this);
        }
    }

    private static class MMAdViewWebViewClientListener extends MMAdImpl.BasicWebViewClientListener
    {

        public void onPageFinished(String s)
        {
            super.onPageFinished(s);
            s = (MMAdImpl)adImplRef.get();
            if (s != null && s.isTransitionAnimated())
            {
                s.animateTransition();
            }
        }

        MMAdViewWebViewClientListener(MMAdImpl mmadimpl)
        {
            super(mmadimpl);
        }
    }

    class ResizeView extends View
    {

        final MMAdView this$0;

        void attachToContext(View view1)
        {
            this;
            JVM INSTR monitorenter ;
            detachFromParent(view1);
            if (getParent() != null && (getParent() instanceof ViewGroup))
            {
                ((ViewGroup)getParent()).addView(view1);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            view1;
            throw view1;
        }

        protected void onRestoreInstanceState(Parcelable parcelable)
        {
            MMLog.d("MMAdView", "onRestoreInstanceState");
            attachToWindow(MMAdView.this);
            super.onRestoreInstanceState(parcelable);
        }

        protected Parcelable onSaveInstanceState()
        {
            MMLog.d("MMAdView", "onSaveInstanceState");
            attachToContext(MMAdView.this);
            return super.onSaveInstanceState();
        }

        public ResizeView(Context context)
        {
            this$0 = MMAdView.this;
            super(context);
        }
    }


    static final int DEFAULT_RESIZE_PARAM_VALUES = -50;
    private static final String TAG = "MMAdView";
    public static final int TRANSITION_DOWN = 3;
    public static final int TRANSITION_FADE = 1;
    public static final int TRANSITION_NONE = 0;
    public static final int TRANSITION_RANDOM = 4;
    public static final int TRANSITION_UP = 2;
    int height;
    int oldHeight;
    int oldWidth;
    ImageView refreshAnimationimageView;
    int transitionType;
    ResizeView view;
    int width;

    public MMAdView(Context context)
    {
        super(context);
        transitionType = 4;
        height = 0;
        width = 0;
        oldHeight = -50;
        oldWidth = -50;
        adImpl = new MMAdViewMMAdImpl(context);
        init(context);
    }

    public MMAdView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MMAdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        transitionType = 4;
        height = 0;
        width = 0;
        oldHeight = -50;
        oldWidth = -50;
        if (!isInEditMode())
        {
            MMLog.d("MMAdView", "Creating MMAdView from XML layout.");
            adImpl = new MMAdViewMMAdImpl(context);
            if (attributeset != null)
            {
                setApid(attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "apid"));
                adImpl.ignoreDensityScaling = attributeset.getAttributeBooleanValue("http://millennialmedia.com/android/schema", "ignoreDensityScaling", false);
                String s = attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "height");
                String s1 = attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "width");
                try
                {
                    if (!TextUtils.isEmpty(s))
                    {
                        height = Integer.parseInt(s);
                    }
                    if (!TextUtils.isEmpty(s1))
                    {
                        width = Integer.parseInt(s1);
                    }
                }
                catch (NumberFormatException numberformatexception)
                {
                    MMLog.e("MMAdView", "Error reading attrs file from xml", numberformatexception);
                }
                if (adImpl.mmRequest != null)
                {
                    adImpl.mmRequest.age = attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "age");
                    adImpl.mmRequest.children = attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "children");
                    adImpl.mmRequest.education = attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "education");
                    adImpl.mmRequest.ethnicity = attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "ethnicity");
                    adImpl.mmRequest.gender = attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "gender");
                    adImpl.mmRequest.income = attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "income");
                    adImpl.mmRequest.keywords = attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "keywords");
                    adImpl.mmRequest.marital = attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "marital");
                    adImpl.mmRequest.politics = attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "politics");
                    adImpl.mmRequest.vendor = attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "vendor");
                    adImpl.mmRequest.zip = attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "zip");
                }
                goalId = attributeset.getAttributeValue("http://millennialmedia.com/android/schema", "goalId");
            }
            init(context);
            return;
        } else
        {
            initEclipseAd(context);
            return;
        }
    }

    private void attachToWindow(View view1)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        detachFromParent(view1);
        obj = getContext();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (!(obj instanceof Activity))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj = ((Activity)obj).getWindow();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj = ((Window) (obj)).getDecorView();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        if (obj instanceof ViewGroup)
        {
            ((ViewGroup)obj).addView(view1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        view1;
        throw view1;
    }

    private void callSetTranslationX(int i)
    {
        try
        {
            android/view/View.getMethod("setTranslationX", new Class[] {
                Float.TYPE
            }).invoke(this, new Object[] {
                Integer.valueOf(i)
            });
            return;
        }
        catch (Exception exception)
        {
            MMLog.e("MMAdView", "Unable to call setTranslationX", exception);
        }
    }

    private void callSetTranslationY(int i)
    {
        try
        {
            android/view/View.getMethod("setTranslationY", new Class[] {
                Float.TYPE
            }).invoke(this, new Object[] {
                Integer.valueOf(i)
            });
            return;
        }
        catch (Exception exception)
        {
            MMLog.e("MMAdView", "Unable to call setTranslationY", exception);
        }
    }

    private void detachFromParent(View view1)
    {
        this;
        JVM INSTR monitorenter ;
        if (view1 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        Object obj = getParent();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        if (obj instanceof ViewGroup)
        {
            obj = (ViewGroup)obj;
            if (view1.getParent() != null)
            {
                ((ViewGroup) (obj)).removeView(view1);
            }
        }
        this;
        JVM INSTR monitorexit ;
        return;
        view1;
        throw view1;
    }

    private void getAdInternal()
    {
        if (adImpl != null)
        {
            adImpl.requestAd();
        }
    }

    private boolean hasDefaultResizeParams()
    {
        return oldWidth == -50 && oldHeight == -50;
    }

    private void init(Context context)
    {
        setBackgroundColor(0);
        adImpl.adType = "b";
        setOnClickListener(this);
        setFocusable(true);
        refreshAnimationimageView = new ImageView(context);
        refreshAnimationimageView.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
        refreshAnimationimageView.setVisibility(8);
        addView(refreshAnimationimageView, new android.widget.RelativeLayout.LayoutParams(-2, -2));
        setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
    }

    private void initEclipseAd(Context context)
    {
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Bitmap bitmap;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        ImageView imageview;
        imageview = new ImageView(context);
        obj6 = null;
        obj7 = null;
        obj8 = null;
        bitmap = null;
        obj5 = null;
        obj3 = null;
        context = obj6;
        obj1 = bitmap;
        obj2 = obj7;
        obj4 = obj5;
        Object obj9 = System.getProperty("java.io.tmpdir");
        Object obj;
        obj = obj9;
        if (obj9 == null)
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj = obj9;
        context = obj6;
        obj1 = bitmap;
        obj2 = obj7;
        obj4 = obj5;
        if (((String) (obj9)).endsWith(File.separator))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        context = obj6;
        obj1 = bitmap;
        obj2 = obj7;
        obj4 = obj5;
        obj = (new StringBuilder()).append(((String) (obj9))).append(File.separator).toString();
        context = obj6;
        obj1 = bitmap;
        obj2 = obj7;
        obj4 = obj5;
        obj9 = new File((new StringBuilder()).append(((String) (obj))).append("millenial355jns6u3l1nmedia.png").toString());
        obj = obj8;
        context = obj6;
        obj1 = bitmap;
        obj2 = obj7;
        obj4 = obj5;
        if (((File) (obj9)).exists()) goto _L2; else goto _L1
_L1:
        context = obj6;
        obj1 = bitmap;
        obj2 = obj7;
        obj4 = obj5;
        obj = (HttpURLConnection)(new URL("http://images.millennialmedia.com/9513/192134.gif")).openConnection();
        context = obj6;
        obj1 = bitmap;
        obj2 = obj7;
        obj4 = obj5;
        ((HttpURLConnection) (obj)).setDoOutput(true);
        context = obj6;
        obj1 = bitmap;
        obj2 = obj7;
        obj4 = obj5;
        ((HttpURLConnection) (obj)).setConnectTimeout(10000);
        context = obj6;
        obj1 = bitmap;
        obj2 = obj7;
        obj4 = obj5;
        ((HttpURLConnection) (obj)).connect();
        context = obj6;
        obj1 = bitmap;
        obj2 = obj7;
        obj4 = obj5;
        obj = ((HttpURLConnection) (obj)).getInputStream();
        context = ((Context) (obj));
        obj1 = bitmap;
        obj2 = obj;
        obj4 = obj5;
        obj3 = new FileOutputStream(((File) (obj9)));
        context = new byte[1024];
_L4:
        int i = ((InputStream) (obj)).read(context);
        if (i <= 0) goto _L2; else goto _L3
_L3:
        ((OutputStream) (obj3)).write(context, 0, i);
          goto _L4
        context;
        obj4 = obj3;
        obj3 = context;
_L10:
        context = ((Context) (obj));
        obj1 = obj4;
        MMLog.e("MMAdView", "Error with eclipse xml image display: ", ((Throwable) (obj3)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_382;
        }
        ((InputStream) (obj)).close();
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_392;
        }
        ((OutputStream) (obj4)).close();
_L6:
        addView(imageview);
        return;
_L2:
        context = ((Context) (obj));
        obj1 = obj3;
        obj2 = obj;
        obj4 = obj3;
        bitmap = BitmapFactory.decodeFile(((File) (obj9)).getAbsolutePath());
        if (imageview == null || bitmap == null)
        {
            break MISSING_BLOCK_LABEL_450;
        }
        context = ((Context) (obj));
        obj1 = obj3;
        obj2 = obj;
        obj4 = obj3;
        imageview.setImageBitmap(bitmap);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_458;
        }
        ((InputStream) (obj)).close();
        if (obj3 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        try
        {
            ((OutputStream) (obj3)).close();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
_L7:
        MMLog.e("MMAdView", "Error closing file", context);
        if (true) goto _L6; else goto _L5
_L5:
        obj;
_L8:
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_493;
        }
        context.close();
        if (obj1 != null)
        {
            try
            {
                ((OutputStream) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                MMLog.e("MMAdView", "Error closing file", context);
            }
        }
        throw obj;
        context;
          goto _L7
        obj2;
        obj1 = obj3;
        context = ((Context) (obj));
        obj = obj2;
          goto _L8
        obj3;
        obj = obj2;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void setUnresizeParameters()
    {
        if (hasDefaultResizeParams())
        {
            android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
            oldWidth = layoutparams.width;
            oldHeight = layoutparams.height;
            if (oldWidth <= 0)
            {
                oldWidth = getWidth();
            }
            if (oldHeight <= 0)
            {
                oldHeight = getHeight();
            }
        }
    }

    void closeAreaTouched()
    {
        adImpl.unresizeToDefault();
    }

    public void getAd()
    {
        if (adImpl != null && adImpl.requestListener != null)
        {
            getAd(adImpl.requestListener);
            return;
        } else
        {
            getAdInternal();
            return;
        }
    }

    public void getAd(RequestListener requestlistener)
    {
        if (adImpl != null)
        {
            adImpl.requestListener = requestlistener;
        }
        getAdInternal();
    }

    public volatile String getApid()
    {
        return super.getApid();
    }

    public volatile boolean getIgnoresDensityScaling()
    {
        return super.getIgnoresDensityScaling();
    }

    public volatile RequestListener getListener()
    {
        return super.getListener();
    }

    public volatile MMRequest getMMRequest()
    {
        return super.getMMRequest();
    }

    void handleMraidResize(DTOResizeParameters dtoresizeparameters)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        refreshAnimationimageView.setImageBitmap(null);
        if (!MMSDK.hasSetTranslationMethod())
        {
            break MISSING_BLOCK_LABEL_227;
        }
        if (view == null)
        {
            view = new ResizeView(getContext());
            view.setId(0x121f0dbe);
            view.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(1, 1));
            view.setBackgroundColor(0);
        }
        if (view.getParent() != null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        obj = getParent();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        if (obj instanceof ViewGroup)
        {
            ((ViewGroup)obj).addView(view);
        }
        int ai[];
        int ai1[];
        obj = new BannerBounds(dtoresizeparameters);
        if (!dtoresizeparameters.allowOffScreen)
        {
            ((BannerBounds) (obj)).calculateOnScreenBounds();
        }
        ai = new int[2];
        getLocationInWindow(ai);
        attachToWindow(this);
        ai1 = new int[2];
        getLocationInWindow(ai1);
        setUnresizeParameters();
        int i;
        int j;
        int k;
        int l;
        i = ai[0];
        j = ai1[0];
        k = ai[1];
        l = ai1[1];
        ((BannerBounds) (obj)).modifyLayoutParams(getLayoutParams());
        callSetTranslationX(((BannerBounds) (obj)).translationX + (i - j));
        callSetTranslationY(((BannerBounds) (obj)).translationY + (k - l));
        setCloseArea(dtoresizeparameters.customClosePosition);
        this;
        JVM INSTR monitorexit ;
        return;
        dtoresizeparameters;
        throw dtoresizeparameters;
    }

    void handleUnresize()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (!MMSDK.hasSetTranslationMethod())
        {
            break MISSING_BLOCK_LABEL_126;
        }
        removeCloseTouchDelegate();
        if (!hasDefaultResizeParams())
        {
            android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
            layoutparams.width = oldWidth;
            layoutparams.height = oldHeight;
            callSetTranslationX(0);
            callSetTranslationY(0);
            oldWidth = -50;
            oldHeight = -50;
        }
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        isResizing = true;
        view.attachToContext(this);
        obj = getParent();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        if (obj instanceof ViewGroup)
        {
            obj = (ViewGroup)obj;
            if (view.getParent() != null)
            {
                ((ViewGroup) (obj)).removeView(view);
            }
        }
        isResizing = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void onAnimationEnd(Animation animation)
    {
        refreshAnimationimageView.setVisibility(8);
    }

    public void onAnimationRepeat(Animation animation)
    {
    }

    public void onAnimationStart(Animation animation)
    {
    }

    public void onClick(View view1)
    {
        MMLog.d("MMAdView", (new StringBuilder()).append("On click for ").append(view1.getId()).append(" view, ").append(view1).append(" adimpl").append(adImpl).toString());
        onTouchEvent(MotionEvent.obtain(0L, System.currentTimeMillis(), 1, 0.0F, 0.0F, 0));
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        Utils.ThreadUtils.execute(new Runnable() {

            final MMAdView this$0;

            public void run()
            {
                float f = getContext().getResources().getDisplayMetrics().density;
                if (width <= 0)
                {
                    width = (int)((float)getWidth() / f);
                }
                if (height <= 0)
                {
                    height = (int)((float)getHeight() / f);
                }
            }

            
            {
                this$0 = MMAdView.this;
                super();
            }
        });
    }

    public volatile boolean onTouchEvent(MotionEvent motionevent)
    {
        return super.onTouchEvent(motionevent);
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        if (flag && adImpl != null && adImpl.controller != null)
        {
            if (adImpl.controller.webView == null)
            {
                adImpl.controller.webView = MMAdImplController.getWebViewFromExistingAdImpl(adImpl);
            }
            MMWebView mmwebview = adImpl.controller.webView;
            if (mmwebview != null && !mmwebview.isCurrentParent(adImpl.internalId) && !mmwebview.mraidState.equals("expanded"))
            {
                mmwebview.removeFromParent();
                addView(mmwebview);
                return;
            }
        }
    }

    public volatile void setApid(String s)
    {
        super.setApid(s);
    }

    public void setBackgroundColor(int i)
    {
        super.setBackgroundColor(i);
        if (adImpl != null && adImpl.controller != null && adImpl.controller.webView != null)
        {
            adImpl.controller.webView.setBackgroundColor(i);
        }
    }

    public void setHeight(int i)
    {
        height = i;
    }

    public volatile void setIgnoresDensityScaling(boolean flag)
    {
        super.setIgnoresDensityScaling(flag);
    }

    public volatile void setListener(RequestListener requestlistener)
    {
        super.setListener(requestlistener);
    }

    public volatile void setMMRequest(MMRequest mmrequest)
    {
        super.setMMRequest(mmrequest);
    }

    public void setTransitionType(int i)
    {
        transitionType = i;
    }

    public void setWidth(int i)
    {
        width = i;
    }


}
