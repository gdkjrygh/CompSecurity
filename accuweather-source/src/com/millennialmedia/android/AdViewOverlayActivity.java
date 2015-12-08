// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.RelativeLayout;

// Referenced classes of package com.millennialmedia.android:
//            MMBaseActivity, MMActivity, AdViewOverlayView, OverlaySettings, 
//            MMLog, MMAdImpl, MMAdImplController, MMWebView

class AdViewOverlayActivity extends MMBaseActivity
{

    private static final String TAG = "AdViewOverlayActivity";
    private AdViewOverlayView adViewOverlayView;
    boolean hasFocus;
    boolean isPaused;
    private OverlaySettings settings;

    AdViewOverlayActivity()
    {
    }

    private void lockOrientation()
    {
        if (activity.getRequestedOrientation() == 0)
        {
            setRequestedOrientation(0);
            return;
        }
        if (activity.getRequestedOrientation() == 8)
        {
            setRequestedOrientation(8);
            return;
        }
        if (activity.getRequestedOrientation() == 9)
        {
            setRequestedOrientation(9);
            return;
        } else
        {
            setRequestedOrientation(1);
            return;
        }
    }

    private void setRequestedOrientation(String s)
    {
        if ("landscape".equalsIgnoreCase(s))
        {
            setRequestedOrientation(0);
        } else
        if ("portrait".equalsIgnoreCase(s))
        {
            setRequestedOrientation(1);
            return;
        }
    }

    public void finish()
    {
        if (adViewOverlayView != null)
        {
            if (!adViewOverlayView.attachWebViewToLink())
            {
                adViewOverlayView.killWebView();
            }
            adViewOverlayView.removeSelfAndAll();
        }
        adViewOverlayView = null;
        super.finish();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (adViewOverlayView != null)
        {
            adViewOverlayView.inlineConfigChange();
        }
        super.onConfigurationChanged(configuration);
    }

    protected void onCreate(Bundle bundle)
    {
        setTheme(0x1030010);
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().clearFlags(1024);
        getWindow().addFlags(2048);
        getWindow().addFlags(0x1000000);
        bundle = getIntent();
        settings = (OverlaySettings)bundle.getParcelableExtra("settings");
        if (settings == null)
        {
            settings = new OverlaySettings();
        }
        settings.log();
        if (settings.orientation != null)
        {
            setRequestedOrientation(settings.orientation);
        }
        android.widget.RelativeLayout.LayoutParams layoutparams;
        if (settings.allowOrientationChange)
        {
            unlockScreenOrientation();
        } else
        {
            lockOrientation();
        }
        if (bundle != null)
        {
            bundle = bundle.getData();
            if (bundle != null)
            {
                MMLog.v("AdViewOverlayActivity", String.format("Path: %s", new Object[] {
                    bundle.getLastPathSegment()
                }));
            }
        }
        bundle = new RelativeLayout(activity);
        layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutparams.addRule(13);
        bundle.setId(0x34c60db9);
        bundle.setLayoutParams(layoutparams);
        adViewOverlayView = new AdViewOverlayView(this, settings);
        bundle.addView(adViewOverlayView);
        setContentView(bundle);
        if (getLastNonConfigurationInstance() != null) goto _L2; else goto _L1
_L1:
        if (!settings.isExpanded()) goto _L4; else goto _L3
_L3:
        if (adViewOverlayView.adImpl != null && adViewOverlayView.adImpl.controller != null && adViewOverlayView.adImpl.controller.webView != null)
        {
            adViewOverlayView.adImpl.controller.webView.setMraidExpanded();
        }
        if (settings.hasExpandUrl())
        {
            adViewOverlayView.getWebContent(settings.urlToLoad);
        }
_L2:
        settings.orientation = null;
        return;
_L4:
        if (!settings.isExpanded())
        {
            adViewOverlayView.loadWebContent(settings.content, settings.adUrl);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected void onDestroy()
    {
        super.onDestroy();
        MMLog.d("AdViewOverlayActivity", "Overlay onDestroy");
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4 && keyevent.getRepeatCount() == 0 && adViewOverlayView != null)
        {
            adViewOverlayView.finishOverlayWithAnimation();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    protected void onPause()
    {
        BridgeMMMedia.Audio audio;
        isPaused = true;
        MMLog.d("AdViewOverlayActivity", (new StringBuilder()).append("Overlay onPause: ").append(adViewOverlayView).toString());
        audio = BridgeMMMedia.Audio.sharedAudio(activity);
        if (audio == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        audio.stop();
        this;
        JVM INSTR monitorexit ;
_L2:
        if (adViewOverlayView != null)
        {
            adViewOverlayView.onPause();
            if (adViewOverlayView.adImpl != null && adViewOverlayView.adImpl.controller != null && adViewOverlayView.adImpl.controller.webView != null)
            {
                adViewOverlayView.adImpl.controller.webView.onPauseWebView();
            }
        }
        setResult(0);
        super.onPause();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
    }

    protected void onResume()
    {
        isPaused = false;
        MMLog.d("AdViewOverlayActivity", "Overlay onResume");
        if (adViewOverlayView != null)
        {
            adViewOverlayView.onResume();
            if (adViewOverlayView.adImpl != null && adViewOverlayView.adImpl.controller != null && adViewOverlayView.adImpl.controller.webView != null)
            {
                adViewOverlayView.adImpl.controller.webView.onResumeWebView();
            }
        }
        super.onResume();
    }

    public Object onRetainNonConfigurationInstance()
    {
        if (adViewOverlayView != null)
        {
            return adViewOverlayView.getNonConfigurationInstance();
        } else
        {
            return null;
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        if (adViewOverlayView != null)
        {
            bundle.putInt("adViewId", adViewOverlayView.getId());
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStop()
    {
        super.onStop();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        hasFocus = flag;
    }

    void setAllowOrientationChange(boolean flag)
    {
        settings.allowOrientationChange = flag;
        if (flag)
        {
            unlockScreenOrientation();
            return;
        } else
        {
            lockOrientation();
            return;
        }
    }

    void setRequestedOrientationLandscape()
    {
        settings.orientation = "landscape";
        settings.allowOrientationChange = false;
        setRequestedOrientation(0);
    }

    void setRequestedOrientationPortrait()
    {
        settings.orientation = "portrait";
        settings.allowOrientationChange = false;
        setRequestedOrientation(1);
    }

    void unlockScreenOrientation()
    {
        setRequestedOrientation(-1);
    }
}
