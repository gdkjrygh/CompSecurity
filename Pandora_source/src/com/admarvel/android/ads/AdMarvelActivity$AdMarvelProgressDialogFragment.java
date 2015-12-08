// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, FullScreenControls, AdMarvelInternalWebView

public static class  extends DialogFragment
{

    boolean signalShutdown;

    static  newInstance(AdMarvelActivity admarvelactivity)
    {
        admarvelactivity = new <init>();
        admarvelactivity.signalShutdown = false;
        return admarvelactivity;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = (AdMarvelActivity)getActivity();
        setRetainInstance setretaininstance = nce((AdMarvelActivity)getActivity());
        setretaininstance.getActivity(0);
        setretaininstance.("Loading...");
        setretaininstance.essStyle(1);
        setretaininstance.essStyle(100);
        ShapeDrawable shapedrawable = new ShapeDrawable();
        shapedrawable.getPaint().setColor(Color.parseColor("#33B5E5"));
        setretaininstance.essDrawable(new ClipDrawable(shapedrawable, 3, 1));
        bundle.progressDialogReference = new WeakReference(setretaininstance);
        if (AdMarvelActivity.access$2(bundle))
        {
            setretaininstance.lable(false);
            AdMarvelActivity.access$0(bundle, true);
            AdMarvelActivity.access$7(bundle).postDelayed(AdMarvelActivity.access$21(bundle), 5000L);
        }
        return setretaininstance;
    }

    public void onStop()
    {
        RelativeLayout relativelayout;
        FullScreenControls fullscreencontrols;
        Object obj;
label0:
        {
            super.onStop();
            obj = (AdMarvelActivity)getActivity();
            AdMarvelActivity.access$0(((AdMarvelActivity) (obj)), false);
            relativelayout = (RelativeLayout)((AdMarvelActivity) (obj)).findViewById(AdMarvelActivity.LAYOUT_VIEW_ID);
            if (relativelayout != null)
            {
                fullscreencontrols = (FullScreenControls)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(((AdMarvelActivity) (obj)))))).append("CONTROLS").toString());
                obj = (AdMarvelInternalWebView)relativelayout.findViewWithTag((new StringBuilder(String.valueOf(AdMarvelActivity.access$5(((AdMarvelActivity) (obj)))))).append("WEBVIEW").toString());
                if (signalShutdown)
                {
                    break label0;
                }
                if (fullscreencontrols != null && obj != null)
                {
                    ((AdMarvelInternalWebView) (obj)).clearHistory();
                    ((AdMarvelInternalWebView) (obj)).setVisibility(0);
                    fullscreencontrols.setVisibility(0);
                    relativelayout.requestLayout();
                }
            }
            return;
        }
        if (obj != null)
        {
            ((AdMarvelInternalWebView) (obj)).stopLoading();
            ((AdMarvelInternalWebView) (obj)).signalShutdown();
            ((AdMarvelInternalWebView) (obj)).setVisibility(8);
        }
        if (fullscreencontrols != null)
        {
            fullscreencontrols.setVisibility(8);
        }
        relativelayout.requestLayout();
    }

    public void signalShutdown()
    {
        signalShutdown = true;
    }

    public ()
    {
    }
}
