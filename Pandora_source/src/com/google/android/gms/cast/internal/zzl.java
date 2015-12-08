// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

public class zzl
{

    private static boolean zzOi = false;
    protected final String mTag;
    private boolean zzOj;
    private boolean zzOk;
    private String zzOl;

    public zzl(String s)
    {
        this(s, zzkq());
    }

    public zzl(String s, boolean flag)
    {
        mTag = s;
        zzOj = flag;
        zzOk = false;
    }

    public static boolean zzkq()
    {
        return zzOi;
    }

    public transient void zza(String s, Object aobj[])
    {
        if (zzkp())
        {
            Log.v(mTag, zze(s, aobj));
        }
    }

    public transient void zza(Throwable throwable, String s, Object aobj[])
    {
        if (zzko() || zzOi)
        {
            Log.d(mTag, zze(s, aobj), throwable);
        }
    }

    public transient void zzb(String s, Object aobj[])
    {
        if (zzko() || zzOi)
        {
            Log.d(mTag, zze(s, aobj));
        }
    }

    public void zzbt(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            s = null;
        } else
        {
            s = String.format("[%s] ", new Object[] {
                s
            });
        }
        zzOl = s;
    }

    public transient void zzc(String s, Object aobj[])
    {
        Log.i(mTag, zze(s, aobj));
    }

    public transient void zzd(String s, Object aobj[])
    {
        Log.w(mTag, zze(s, aobj));
    }

    protected transient String zze(String s, Object aobj[])
    {
        if (aobj.length != 0)
        {
            s = String.format(Locale.ROOT, s, aobj);
        }
        aobj = s;
        if (!TextUtils.isEmpty(zzOl))
        {
            aobj = (new StringBuilder()).append(zzOl).append(s).toString();
        }
        return ((String) (aobj));
    }

    public boolean zzko()
    {
        return zzOj;
    }

    public boolean zzkp()
    {
        return zzOk;
    }

}
