// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            ki, kj, kk

public final class kl
{

    public kl()
    {
    }

    public static kk a()
    {
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            return new ki();
        } else
        {
            return new kj();
        }
    }
}
