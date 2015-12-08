// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzvp, zzvq, zzvr

public class zzvs
{

    public zzvs()
    {
    }

    int zzsF()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    public zzvr zzuO()
    {
        if (zzsF() < 8)
        {
            return new zzvp();
        } else
        {
            return new zzvq();
        }
    }
}
