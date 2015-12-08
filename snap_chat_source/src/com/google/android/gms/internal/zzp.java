// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzn, zzwr

class zzp
    implements zzn
{

    private zzwr zzlb;
    private byte zzlc[];
    private final int zzld;

    public zzp(int i)
    {
        zzld = i;
        reset();
    }

    public void reset()
    {
        zzlc = new byte[zzld];
        zzlb = zzwr.zzu(zzlc);
    }

    public byte[] zzD()
    {
        int i = zzlb.zzvJ();
        if (i < 0)
        {
            throw new IOException();
        }
        if (i == 0)
        {
            return zzlc;
        } else
        {
            byte abyte0[] = new byte[zzlc.length - i];
            System.arraycopy(zzlc, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

    public void zzb(int i, long l)
    {
        zzlb.zzb(i, l);
    }

    public void zzb(int i, String s)
    {
        zzlb.zzb(i, s);
    }
}
