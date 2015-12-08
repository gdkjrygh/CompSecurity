// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzew;
import com.google.android.gms.internal.zzex;

public class AdActivity extends Activity
{

    private zzex zznG;

    public AdActivity()
    {
    }

    private void zzaE()
    {
        if (zznG == null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        zznG.zzaE();
        return;
        RemoteException remoteexception;
        remoteexception;
        zzb.zzd("Could not forward setContentViewSet to ad overlay:", remoteexception);
        return;
    }

    public void onBackPressed()
    {
        try
        {
            if (zznG != null)
            {
                zznG.onBackPressed();
            }
        }
        catch (RemoteException remoteexception)
        {
            zzb.zzd("Could not forward onBackPressed to ad overlay:", remoteexception);
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        zznG = zzew.zzb(this);
        if (zznG == null)
        {
            zzb.zzaC("Could not create ad overlay.");
            finish();
            return;
        }
        try
        {
            zznG.onCreate(bundle);
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
            if (zznG != null)
            {
                zznG.onDestroy();
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
            if (zznG != null)
            {
                zznG.onPause();
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
            if (zznG != null)
            {
                zznG.onRestart();
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
            if (zznG != null)
            {
                zznG.onResume();
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
            if (zznG != null)
            {
                zznG.onSaveInstanceState(bundle);
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
            if (zznG != null)
            {
                zznG.onStart();
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
            if (zznG != null)
            {
                zznG.onStop();
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
        zzaE();
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        zzaE();
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        zzaE();
    }
}
