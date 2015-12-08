// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.d;

// Referenced classes of package com.google.android.gms.internal:
//            ef, ad, ab

public final class z
{

    public static ab a(ad ad1)
    {
        if (ad1 == null)
        {
            return null;
        } else
        {
            return ad1.a(d.g().b());
        }
    }

    public static transient boolean a(ad ad1, ab ab, String as[])
    {
        while (ad1 == null || ab == null || !ad1.a || ab == null) 
        {
            return false;
        }
        return ad1.a(ab, d.g().b(), as);
    }
}
