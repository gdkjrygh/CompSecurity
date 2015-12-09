// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bl

public final class mc
{

    public static bl a(bl bl1)
    {
        bl bl2 = new bl();
        bl2.a = bl1.a;
        bl2.k = (int[])bl1.k.clone();
        if (bl1.l)
        {
            bl2.l = bl1.l;
        }
        return bl2;
    }
}
