// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.text.TextUtils;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzf, zzl, zzn

public abstract class zzd
{

    protected final zzl zzNv;
    private final String zzNw;
    private zzn zzNx;

    protected zzd(String s, String s1, String s2)
    {
        zzf.zzbo(s);
        zzNw = s;
        zzNv = new zzl(s1);
        if (!TextUtils.isEmpty(s2))
        {
            zzNv.zzbt(s2);
        }
    }

    public final String getNamespace()
    {
        return zzNw;
    }

    public final void zza(zzn zzn1)
    {
        zzNx = zzn1;
        if (zzNx == null)
        {
            zzjW();
        }
    }

    protected final void zza(String s, long l, String s1)
        throws IOException
    {
        zzNv.zza("Sending text message: %s to: %s", new Object[] {
            s, s1
        });
        zzNx.zza(zzNw, s, l, s1);
    }

    public void zzb(long l, int i)
    {
    }

    public void zzbm(String s)
    {
    }

    public void zzjW()
    {
    }

    protected final long zzjX()
    {
        return zzNx.zzjU();
    }
}
