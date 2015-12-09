// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzdi;
import com.google.android.gms.internal.zzdj;

public class AdActivity extends Activity
{

    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private zzdj zzlX;

    public AdActivity()
    {
    }

    private void zzab()
    {
        if (zzlX == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        zzlX.zzab();
        return;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Could not forward setContentViewSet to ad overlay:", remoteexception);
        return;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zzlX = zzdi.zzb(this);
        if (zzlX == null)
        {
            zzb.zzan("Could not create ad overlay.");
            finish();
            return;
        }
        try
        {
            zzlX.onCreate(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            zzb.zzd("Could not forward onCreate to ad overlay:", bundle);
        }
        finish();
    }

    protected void onDestroy()
    {
        try
        {
            if (zzlX != null)
            {
                zzlX.onDestroy();
            }
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward onDestroy to ad overlay:", remoteexception);
        }
        super.onDestroy();
    }

    protected void onPause()
    {
        try
        {
            if (zzlX != null)
            {
                zzlX.onPause();
            }
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward onPause to ad overlay:", remoteexception);
            finish();
        }
        super.onPause();
    }

    protected void onRestart()
    {
        super.onRestart();
        try
        {
            if (zzlX != null)
            {
                zzlX.onRestart();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward onRestart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onResume()
    {
        super.onResume();
        try
        {
            if (zzlX != null)
            {
                zzlX.onResume();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward onResume to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        try
        {
            if (zzlX != null)
            {
                zzlX.onSaveInstanceState(bundle);
            }
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward onSaveInstanceState to ad overlay:", remoteexception);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        try
        {
            if (zzlX != null)
            {
                zzlX.onStart();
            }
            return;
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward onStart to ad overlay:", remoteexception);
        }
        finish();
    }

    protected void onStop()
    {
        try
        {
            if (zzlX != null)
            {
                zzlX.onStop();
            }
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward onStop to ad overlay:", remoteexception);
            finish();
        }
        super.onStop();
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        zzab();
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        zzab();
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        zzab();
    }
}
