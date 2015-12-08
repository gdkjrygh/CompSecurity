// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.dr;
import com.google.android.gms.internal.ds;
import com.google.android.gms.internal.gs;

public final class AdActivity extends Activity
{

    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private ds lc;

    public AdActivity()
    {
    }

    private void U()
    {
        if (lc == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        lc.U();
        return;
        RemoteException remoteexception;
        remoteexception;
        gs.d("Could not forward setContentViewSet to ad overlay:", remoteexception);
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        lc = dr.b(this);
        if (lc == null)
        {
            gs.W("Could not create ad overlay.");
            finish();
            return;
        }
        try
        {
            lc.onCreate(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            gs.d("Could not forward onCreate to ad overlay:", bundle);
        }
        finish();
    }

    protected void onDestroy()
    {
        try
        {
            if (lc != null)
            {
                lc.onDestroy();
            }
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Could not forward onDestroy to ad overlay:", remoteexception);
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        try
        {
            if (lc != null)
            {
                lc.onPause();
            }
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Could not forward onPause to ad overlay:", remoteexception);
            finish();
        }
        super.onPause();
    }

    protected void onRestart()
    {
        super.onRestart();
        try
        {
            if (lc != null)
            {
                lc.onRestart();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Could not forward onRestart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onResume()
    {
        super.onResume();
        try
        {
            if (lc != null)
            {
                lc.onResume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Could not forward onResume to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            if (lc != null)
            {
                lc.onSaveInstanceState(bundle);
            }
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Could not forward onSaveInstanceState to ad overlay:", remoteexception);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        try
        {
            if (lc != null)
            {
                lc.onStart();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Could not forward onStart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onStop()
    {
        try
        {
            if (lc != null)
            {
                lc.onStop();
            }
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Could not forward onStop to ad overlay:", remoteexception);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        U();
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        U();
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        U();
    }
}
