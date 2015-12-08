// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.tremorvideo.sdk.android.googleAdapter.GoogleAdapterCalls;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            aw, ct, al, av, 
//            ax, aq

public class Playvideo extends Activity
{

    aw a;

    public Playvideo()
    {
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0 && a != null)
        {
            float f = motionevent.getRawX();
            float f1 = motionevent.getRawY();
            a.a(f, f1);
        }
        return super.dispatchTouchEvent(motionevent);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        ct.d("activity returned");
        a.a(i, j, intent);
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        a.a(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        String s;
        ct.d("TremorDebug: Playvideo activity on create");
        s = getIntent().getStringExtra("tremorVideoType");
        if (s.compareTo("buyitnow") == 0)
        {
            setTheme(0x1030011);
        }
        super.onCreate(bundle);
        ct.d("Playvideo - onCreate");
        if (s.compareTo("ad") != 0) goto _L2; else goto _L1
_L1:
        a = new al();
_L3:
        a.a(bundle, this);
_L4:
        ct.d("Playvideo - Activity Created");
        return;
_L2:
        if (s.compareTo("coupon") != 0)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        a = new av();
          goto _L3
        bundle;
        ct.a(bundle);
        finish();
        GoogleAdapterCalls.onAdFinished();
          goto _L4
        if (s.compareTo("webview") != 0) goto _L6; else goto _L5
_L5:
        a = new ax();
          goto _L3
_L6:
        if (s.compareTo("buyitnow") != 0) goto _L3; else goto _L7
_L7:
        a = new aq();
          goto _L3
    }

    protected void onDestroy()
    {
        ct.d("Playvideo - onDestroy");
        super.onDestroy();
        try
        {
            ct.a();
            a.j();
        }
        catch (Exception exception)
        {
            ct.a(exception);
        }
        System.gc();
        ct.a();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (a.a(i, keyevent))
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    protected void onPause()
    {
        super.onPause();
        ct.d("Playvideo - onPause");
        a.g();
    }

    protected void onResume()
    {
        super.onResume();
        ct.d("Playvideo - onResume");
        a.h();
    }

    public boolean onSearchRequested()
    {
        return a.e();
    }

    public void onStart()
    {
        super.onStart();
        ct.d("Playvideo - onStart");
        try
        {
            a.f();
            return;
        }
        catch (Exception exception)
        {
            ct.a(exception);
        }
        finish();
        GoogleAdapterCalls.onAdFinished();
    }

    protected void onStop()
    {
        super.onStop();
        ct.d("Playvideo - onStop");
        try
        {
            a.i();
            return;
        }
        catch (Exception exception)
        {
            ct.a(exception);
        }
    }
}
