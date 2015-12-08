// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.content.Context;
import com.google.android.m4b.maps.d.a;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            e, ae, ad

final class it> extends e
{

    private Context a;
    private String b;

    public final a a()
    {
        java.util.Map map = (new ad(a, b)).a();
        if (map == null)
        {
            return null;
        } else
        {
            return com.google.android.m4b.maps.ay.ae.a(map);
        }
    }

    (long l, Context context, String s)
    {
        a = context;
        b = s;
        super(l);
    }
}
