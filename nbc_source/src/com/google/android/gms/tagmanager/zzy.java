// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.Log;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzbh

public class zzy
    implements zzbh
{

    private int zzKR;

    public zzy()
    {
        zzKR = 5;
    }

    public void zzaA(String s)
    {
        if (zzKR <= 4)
        {
            Log.i("GoogleTagManager", s);
        }
    }

    public void zzaB(String s)
    {
        if (zzKR <= 2)
        {
            Log.v("GoogleTagManager", s);
        }
    }

    public void zzaC(String s)
    {
        if (zzKR <= 5)
        {
            Log.w("GoogleTagManager", s);
        }
    }

    public void zzaz(String s)
    {
        if (zzKR <= 6)
        {
            Log.e("GoogleTagManager", s);
        }
    }

    public void zzb(String s, Throwable throwable)
    {
        if (zzKR <= 6)
        {
            Log.e("GoogleTagManager", s, throwable);
        }
    }

    public void zzd(String s, Throwable throwable)
    {
        if (zzKR <= 5)
        {
            Log.w("GoogleTagManager", s, throwable);
        }
    }
}
