// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            m, n, zzmw

public class zzmx
{

    public zzmx()
    {
    }

    int zzwp()
    {
        return android.os.Build.VERSION.SDK_INT;
    }

    public zzmw zzyM()
    {
        if (zzwp() < 8)
        {
            return new m();
        } else
        {
            return new n();
        }
    }
}
