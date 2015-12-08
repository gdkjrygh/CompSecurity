// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.eu;

public final class AdActivity extends Activity
{

    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private cn kr;

    public AdActivity()
    {
    }

    private void S()
    {
        if (kr == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        kr.S();
        return;
        RemoteException remoteexception;
        remoteexception;
        eu.c("Could not forward setContentViewSet to ad overlay:", remoteexception);
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        kr = cm.a(this);
        if (kr == null)
        {
            eu.D("Could not create ad overlay.");
            finish();
            return;
        }
        try
        {
            kr.onCreate(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            eu.c("Could not forward onCreate to ad overlay:", bundle);
        }
        finish();
    }

    protected void onDestroy()
    {
        try
        {
            if (kr != null)
            {
                kr.onDestroy();
            }
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward onDestroy to ad overlay:", remoteexception);
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        try
        {
            if (kr != null)
            {
                kr.onPause();
            }
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward onPause to ad overlay:", remoteexception);
            finish();
        }
        super.onPause();
    }

    protected void onRestart()
    {
        super.onRestart();
        try
        {
            if (kr != null)
            {
                kr.onRestart();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward onRestart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onResume()
    {
        super.onResume();
        try
        {
            if (kr != null)
            {
                kr.onResume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward onResume to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            if (kr != null)
            {
                kr.onSaveInstanceState(bundle);
            }
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward onSaveInstanceState to ad overlay:", remoteexception);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        try
        {
            if (kr != null)
            {
                kr.onStart();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward onStart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onStop()
    {
        try
        {
            if (kr != null)
            {
                kr.onStop();
            }
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not forward onStop to ad overlay:", remoteexception);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        S();
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        S();
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        S();
    }
}
