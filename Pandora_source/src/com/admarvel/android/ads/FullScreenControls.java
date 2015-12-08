// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.PathShape;
import android.graphics.drawable.shapes.RectShape;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.jar.JarFile;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelInternalWebView, AdMarvelActivity, Utils, AdMarvelInterstitialAds, 
//            AdMarvelInterstitialAdListenerImpl, AdMarvelInternalWebViewPrivateListener

class FullScreenControls extends LinearLayout
{

    static int VIEW_ID = 0x186a1;
    final String GUID;
    private final WeakReference activityReference;

    FullScreenControls(Activity activity, Context context, String s)
    {
        super(context);
        activityReference = new WeakReference(activity);
        GUID = s;
        setId(VIEW_ID);
        setGravity(17);
        setOrientation(1);
        activity = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        activity.addRule(12);
        setLayoutParams(activity);
        s = new android.widget.LinearLayout.LayoutParams(-1, (int)TypedValue.applyDimension(1, 5F, getResources().getDisplayMetrics()));
        activity = new ShapeDrawable();
        activity.getPaint().setColor(Color.parseColor("#33B5E5"));
        Object obj = new ClipDrawable(activity, 3, 1);
        activity = new ProgressBar(context, null, 0x1010078);
        activity.setLayoutParams(s);
        activity.setTag((new StringBuilder(String.valueOf(GUID))).append("PROGRESS_BAR").toString());
        activity.setBackgroundColor(0);
        activity.setProgressDrawable(((android.graphics.drawable.Drawable) (obj)));
        activity.setVisibility(8);
        obj = new android.widget.LinearLayout.LayoutParams(-2, -2);
        obj.weight = 25F;
        obj.gravity = 17;
        float f = TypedValue.applyDimension(1, 25F, getResources().getDisplayMetrics());
        Object obj3 = new android.widget.RelativeLayout.LayoutParams((int)f, (int)f);
        ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(13);
        Object obj1 = new Button(context);
        ((Button) (obj1)).setTag((new StringBuilder(String.valueOf(GUID))).append("CLOSE_BUTTON").toString());
        ((Button) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

            final FullScreenControls this$0;

            public void onClick(View view)
            {
                view = (Activity)activityReference.get();
                if (view != null && (view instanceof AdMarvelActivity))
                {
                    view = (AdMarvelActivity)view;
                    if (view.isInterstitial())
                    {
                        AdMarvelInterstitialAds.getListener().onCloseInterstitialAd();
                    } else
                    {
                        view.finish();
                    }
                    if (AdMarvelInternalWebView.getListener(GUID) != null)
                    {
                        AdMarvelInternalWebView.getListener(GUID).onCloseInAppBrowser(GUID);
                    }
                }
            }

            
            {
                this$0 = FullScreenControls.this;
                super();
            }
        });
        ((Button) (obj1)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
        s = new RelativeLayout(context);
        s.setTag((new StringBuilder(String.valueOf(GUID))).append("CLOSE_BUTTON_LAYOUT").toString());
        s.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        s.addView(((View) (obj1)));
        Object obj2 = new Path();
        ((Path) (obj2)).moveTo(90F, 80F);
        ((Path) (obj2)).rLineTo(-80F, -60F);
        ((Path) (obj2)).moveTo(90F, 20F);
        ((Path) (obj2)).rLineTo(-80F, 60F);
        ((Path) (obj2)).close();
        obj2 = new ShapeDrawable(new PathShape(((Path) (obj2)), 100F, 100F));
        ((ShapeDrawable) (obj2)).getPaint().setColor(-1);
        ((ShapeDrawable) (obj2)).getPaint().setAntiAlias(true);
        ((ShapeDrawable) (obj2)).getPaint().setStyle(android.graphics.Paint.Style.STROKE);
        ((ShapeDrawable) (obj2)).getPaint().setStrokeWidth(15F);
        ((Button) (obj1)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj2)));
        obj2 = new Button(context);
        ((Button) (obj2)).setTag((new StringBuilder(String.valueOf(GUID))).append("BACK_BUTTON").toString());
        ((Button) (obj2)).setOnClickListener(new android.view.View.OnClickListener() {

            final FullScreenControls this$0;

            public void onClick(View view)
            {
                goBack();
            }

            
            {
                this$0 = FullScreenControls.this;
                super();
            }
        });
        ((Button) (obj2)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
        ((Button) (obj2)).setEnabled(false);
        obj1 = new RelativeLayout(context);
        ((RelativeLayout) (obj1)).setTag((new StringBuilder(String.valueOf(GUID))).append("BACK_BUTTON_LAYOUT").toString());
        ((RelativeLayout) (obj1)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        ((RelativeLayout) (obj1)).addView(((View) (obj2)));
        Object obj4 = new Button(context);
        ((Button) (obj4)).setTag((new StringBuilder(String.valueOf(GUID))).append("FORWARD_BUTTON").toString());
        ((Button) (obj4)).setOnClickListener(new android.view.View.OnClickListener() {

            final FullScreenControls this$0;

            public void onClick(View view)
            {
                goForward();
            }

            
            {
                this$0 = FullScreenControls.this;
                super();
            }
        });
        ((Button) (obj4)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
        ((Button) (obj4)).setEnabled(false);
        obj2 = new RelativeLayout(context);
        ((RelativeLayout) (obj2)).setTag((new StringBuilder(String.valueOf(GUID))).append("FORWARD_BUTTON_LAYOUT").toString());
        ((RelativeLayout) (obj2)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        ((RelativeLayout) (obj2)).addView(((View) (obj4)));
        obj4 = new Button(context);
        ((Button) (obj4)).setTag((new StringBuilder(String.valueOf(GUID))).append("RELOAD_BUTTON").toString());
        ((Button) (obj4)).setOnClickListener(new android.view.View.OnClickListener() {

            final FullScreenControls this$0;

            public void onClick(View view)
            {
                refresh();
            }

            
            {
                this$0 = FullScreenControls.this;
                super();
            }
        });
        ((Button) (obj4)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
        Object obj5 = new Path();
        ((Path) (obj5)).arcTo(new RectF(15F, 40F, 85F, 75F), 0.0F, 270F, false);
        ((Path) (obj5)).rLineTo(0.0F, 10F);
        ((Path) (obj5)).rLineTo(40F, -15F);
        ((Path) (obj5)).rLineTo(-40F, -15F);
        ((Path) (obj5)).rLineTo(0.0F, 10F);
        ((Path) (obj5)).arcTo(new RectF(5F, 30F, 95F, 85F), 270F, -270F, false);
        ((Path) (obj5)).close();
        obj5 = new ShapeDrawable(new PathShape(((Path) (obj5)), 100F, 100F));
        ((ShapeDrawable) (obj5)).getPaint().setColor(-1);
        ((ShapeDrawable) (obj5)).getPaint().setStyle(android.graphics.Paint.Style.FILL);
        ((ShapeDrawable) (obj5)).getPaint().setAntiAlias(true);
        ((Button) (obj4)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj5)));
        obj5 = new RelativeLayout(context);
        ((RelativeLayout) (obj5)).setTag((new StringBuilder(String.valueOf(GUID))).append("RELOAD_BUTTON_LAYOUT").toString());
        ((RelativeLayout) (obj5)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        ((RelativeLayout) (obj5)).addView(((View) (obj4)));
        obj4 = new Button(context);
        ((Button) (obj4)).setTag((new StringBuilder(String.valueOf(GUID))).append("BROWSER_BUTTON").toString());
        ((Button) (obj4)).setOnClickListener(new android.view.View.OnClickListener() {

            final FullScreenControls this$0;

            public void onClick(View view)
            {
                launchInBrowser();
            }

            
            {
                this$0 = FullScreenControls.this;
                super();
            }
        });
        ((Button) (obj4)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
        obj3 = new Path();
        ((Path) (obj3)).moveTo(40F, 60F);
        ((Path) (obj3)).rLineTo(0.0F, 2.0F);
        ((Path) (obj3)).rLineTo(30F, 0.0F);
        ((Path) (obj3)).rLineTo(0.0F, -4F);
        ((Path) (obj3)).rLineTo(-30F, 0.0F);
        ((Path) (obj3)).rLineTo(0.0F, 2.0F);
        ((Path) (obj3)).moveTo(70F, 60F);
        ((Path) (obj3)).rLineTo(0.0F, 10F);
        ((Path) (obj3)).rLineTo(20F, -10F);
        ((Path) (obj3)).rLineTo(-20F, -10F);
        ((Path) (obj3)).rLineTo(0.0F, 10F);
        ((Path) (obj3)).close();
        ((Path) (obj3)).addRect(new RectF(30F, 74F, 100F, 80F), android.graphics.Path.Direction.CW);
        ((Path) (obj3)).addRect(new RectF(100F, 80F, 94F, 40F), android.graphics.Path.Direction.CW);
        ((Path) (obj3)).addRect(new RectF(30F, 40F, 100F, 46F), android.graphics.Path.Direction.CW);
        ((Path) (obj3)).addRect(new RectF(30F, 40F, 36F, 80F), android.graphics.Path.Direction.CW);
        ((Path) (obj3)).addRect(new RectF(0.0F, 63F, 26F, 57F), android.graphics.Path.Direction.CW);
        ((Path) (obj3)).addRect(new RectF(0.0F, 63F, 6F, 26F), android.graphics.Path.Direction.CW);
        ((Path) (obj3)).addRect(new RectF(0.0F, 20F, 66F, 26F), android.graphics.Path.Direction.CW);
        ((Path) (obj3)).addRect(new RectF(60F, 20F, 66F, 36F), android.graphics.Path.Direction.CW);
        obj3 = new ShapeDrawable(new PathShape(((Path) (obj3)), 100F, 100F));
        ((ShapeDrawable) (obj3)).getPaint().setColor(-1);
        ((ShapeDrawable) (obj3)).getPaint().setStyle(android.graphics.Paint.Style.FILL);
        ((ShapeDrawable) (obj3)).getPaint().setAntiAlias(true);
        ((Button) (obj4)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj3)));
        obj3 = new RelativeLayout(context);
        ((RelativeLayout) (obj3)).setTag((new StringBuilder(String.valueOf(GUID))).append("BROWSER_BUTTON_LAYOUT").toString());
        ((RelativeLayout) (obj3)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        ((RelativeLayout) (obj3)).addView(((View) (obj4)));
        f = TypedValue.applyDimension(1, 40F, getResources().getDisplayMetrics());
        obj = new ShapeDrawable(new RectShape());
        ((ShapeDrawable) (obj)).getPaint().setShader(new LinearGradient(0.0F, 0.0F, 0.0F, f, Color.parseColor("#FF8E8E8E"), Color.parseColor("#FF000000"), android.graphics.Shader.TileMode.REPEAT));
        obj4 = new android.widget.LinearLayout.LayoutParams(-1, (int)f);
        context = new LinearLayout(context);
        context.setGravity(17);
        context.setTag((new StringBuilder(String.valueOf(GUID))).append("BUTTON_BAR_LAYOUT").toString());
        context.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj4)));
        context.setOrientation(0);
        context.setWeightSum(100F);
        context.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
        context.addView(s);
        context.addView(((View) (obj1)));
        context.addView(((View) (obj2)));
        context.addView(((View) (obj3)));
        addView(activity);
        addView(context);
    }

    private void goBack()
    {
        AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)((RelativeLayout)getParent()).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("WEBVIEW").toString());
        if (admarvelinternalwebview.canGoBack())
        {
            admarvelinternalwebview.goBack();
            updateButtonStates();
        }
    }

    private void goForward()
    {
        AdMarvelInternalWebView admarvelinternalwebview = (AdMarvelInternalWebView)((RelativeLayout)getParent()).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("WEBVIEW").toString());
        if (admarvelinternalwebview.canGoForward())
        {
            admarvelinternalwebview.goForward();
            updateButtonStates();
        }
    }

    private void launchInBrowser()
    {
        Object obj;
label0:
        {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(((AdMarvelInternalWebView)((RelativeLayout)getParent()).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("WEBVIEW").toString())).getUrl()));
            intent.addFlags(0x10000000);
            obj = (Activity)activityReference.get();
            if (obj != null && (obj instanceof AdMarvelActivity))
            {
                obj = (AdMarvelActivity)obj;
                if (Utils.isIntentAvailable(getContext(), intent))
                {
                    ((AdMarvelActivity) (obj)).startActivity(intent);
                }
                if (((AdMarvelActivity) (obj)).isInterstitial())
                {
                    AdMarvelInterstitialAds.getListener().onCloseInterstitialAd();
                    ((AdMarvelActivity) (obj)).updateCloseInterstialAdCounter();
                }
                if (((AdMarvelActivity) (obj)).getAdCloseCount() <= 3)
                {
                    break label0;
                }
                ((AdMarvelActivity) (obj)).finish();
            }
            return;
        }
        ((AdMarvelActivity) (obj)).finish();
    }

    private void refresh()
    {
        ((AdMarvelInternalWebView)((RelativeLayout)getParent()).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("WEBVIEW").toString())).reload();
        updateButtonStates();
    }

    public Bitmap bitmapFromJar(String s)
    {
        Object obj2 = null;
        Object obj1 = com/admarvel/android/ads/AdMarvelActivity.getClassLoader().getResource(s).getFile();
        Object obj = obj1;
        int i;
        if (((String) (obj1)).startsWith("file:"))
        {
            obj = ((String) (obj1)).substring(5);
        }
        i = ((String) (obj)).indexOf("!");
        obj1 = obj;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj1 = ((String) (obj)).substring(0, i);
        obj = new JarFile(((String) (obj1)));
        s = ((JarFile) (obj)).getInputStream(((JarFile) (obj)).getJarEntry(s));
        obj = s;
        obj1 = BitmapFactory.decodeStream(s);
        obj = obj1;
        obj1 = obj;
        if (s != null)
        {
            Exception exception1;
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return ((Bitmap) (obj));
            }
            obj1 = obj;
        }
        return ((Bitmap) (obj1));
        exception1;
        s = null;
_L4:
        obj = s;
        exception1.printStackTrace();
        exception1 = obj2;
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_99;
        }
        s;
        obj = null;
_L2:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (Exception exception) { }
        }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        exception1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setVisibility(int i)
    {
        super.setVisibility(i);
        if (i == 0)
        {
            updateButtonStates();
        }
    }

    void updateButtonStates()
    {
        Object obj = new Path();
        ((Path) (obj)).moveTo(0.0F, 50F);
        ((Path) (obj)).rLineTo(80F, 30F);
        ((Path) (obj)).rLineTo(0.0F, -60F);
        ((Path) (obj)).rLineTo(-80F, 30F);
        ((Path) (obj)).close();
        Object obj3 = new ShapeDrawable(new PathShape(((Path) (obj)), 100F, 100F));
        Object obj1 = (AdMarvelInternalWebView)((RelativeLayout)getParent()).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("WEBVIEW").toString());
        Button button = (Button)findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("BACK_BUTTON_LAYOUT").toString()).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("BACK_BUTTON").toString());
        Object obj2 = (Button)findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("FORWARD_BUTTON_LAYOUT").toString()).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("FORWARD_BUTTON").toString());
        obj = (Button)findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("BROWSER_BUTTON_LAYOUT").toString()).findViewWithTag((new StringBuilder(String.valueOf(GUID))).append("BROWSER_BUTTON").toString());
        if (((AdMarvelInternalWebView) (obj1)).canGoBack())
        {
            button.setEnabled(true);
            ((ShapeDrawable) (obj3)).getPaint().setColor(-1);
        } else
        {
            button.setEnabled(false);
            ((ShapeDrawable) (obj3)).getPaint().setColor(0xff444444);
        }
        ((ShapeDrawable) (obj3)).getPaint().setAntiAlias(true);
        button.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj3)));
        obj3 = new Path();
        ((Path) (obj3)).moveTo(0.0F, 80F);
        ((Path) (obj3)).rLineTo(80F, -30F);
        ((Path) (obj3)).rLineTo(-80F, -30F);
        ((Path) (obj3)).rLineTo(0.0F, 60F);
        ((Path) (obj3)).close();
        obj3 = new ShapeDrawable(new PathShape(((Path) (obj3)), 100F, 100F));
        if (((AdMarvelInternalWebView) (obj1)).canGoForward())
        {
            ((Button) (obj2)).setEnabled(true);
            ((ShapeDrawable) (obj3)).getPaint().setColor(-1);
        } else
        {
            ((Button) (obj2)).setEnabled(false);
            ((ShapeDrawable) (obj3)).getPaint().setColor(0xff444444);
        }
        ((ShapeDrawable) (obj3)).getPaint().setAntiAlias(true);
        ((Button) (obj2)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj3)));
        obj2 = new Path();
        ((Path) (obj2)).moveTo(40F, 60F);
        ((Path) (obj2)).rLineTo(0.0F, 2.0F);
        ((Path) (obj2)).rLineTo(30F, 0.0F);
        ((Path) (obj2)).rLineTo(0.0F, -4F);
        ((Path) (obj2)).rLineTo(-30F, 0.0F);
        ((Path) (obj2)).rLineTo(0.0F, 2.0F);
        ((Path) (obj2)).moveTo(70F, 60F);
        ((Path) (obj2)).rLineTo(0.0F, 10F);
        ((Path) (obj2)).rLineTo(20F, -10F);
        ((Path) (obj2)).rLineTo(-20F, -10F);
        ((Path) (obj2)).rLineTo(0.0F, 10F);
        ((Path) (obj2)).close();
        ((Path) (obj2)).addRect(new RectF(30F, 74F, 100F, 80F), android.graphics.Path.Direction.CW);
        ((Path) (obj2)).addRect(new RectF(100F, 80F, 94F, 40F), android.graphics.Path.Direction.CW);
        ((Path) (obj2)).addRect(new RectF(30F, 40F, 100F, 46F), android.graphics.Path.Direction.CW);
        ((Path) (obj2)).addRect(new RectF(30F, 40F, 36F, 80F), android.graphics.Path.Direction.CW);
        ((Path) (obj2)).addRect(new RectF(0.0F, 63F, 26F, 57F), android.graphics.Path.Direction.CW);
        ((Path) (obj2)).addRect(new RectF(0.0F, 63F, 6F, 26F), android.graphics.Path.Direction.CW);
        ((Path) (obj2)).addRect(new RectF(0.0F, 20F, 66F, 26F), android.graphics.Path.Direction.CW);
        ((Path) (obj2)).addRect(new RectF(60F, 20F, 66F, 36F), android.graphics.Path.Direction.CW);
        obj2 = new ShapeDrawable(new PathShape(((Path) (obj2)), 100F, 100F));
        obj1 = ((AdMarvelInternalWebView) (obj1)).getUrl();
        if (obj1 != null && ((String) (obj1)).contains("http://"))
        {
            ((ShapeDrawable) (obj2)).getPaint().setColor(-1);
            ((Button) (obj)).setEnabled(true);
        } else
        {
            ((ShapeDrawable) (obj2)).getPaint().setColor(0xff444444);
            ((Button) (obj)).setEnabled(false);
        }
        ((ShapeDrawable) (obj2)).getPaint().setStyle(android.graphics.Paint.Style.FILL);
        ((ShapeDrawable) (obj2)).getPaint().setAntiAlias(true);
        ((Button) (obj)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj2)));
    }






}
