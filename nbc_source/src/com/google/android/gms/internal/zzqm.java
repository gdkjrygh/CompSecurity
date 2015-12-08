// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzqj, zzqk, zzql

public class zzqm
{

    public zzqm()
    {
    }

    public zzql zzAG()
    {
        if (zzyj() < 8)
        {
            return new zzqj();
        } else
        {
            return new zzqk();
        }
    }

    int zzyj()
    {
        return android.os.Build.VERSION.SDK_INT;
    }
}
