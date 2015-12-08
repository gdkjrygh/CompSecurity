// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;

// Referenced classes of package com.google.android.gms.internal:
//            zzek, zzbe

class d
    implements a
{

    final String a;
    final Integer b;
    final Integer c;
    final int d;
    final zzek e;

    public zzbe a(Drawable drawable)
    {
        Integer integer = null;
        if (drawable == null || TextUtils.isEmpty(a))
        {
            return null;
        }
        String s = a;
        Integer integer1 = b;
        Integer integer2 = c;
        if (d > 0)
        {
            integer = Integer.valueOf(d);
        }
        return new zzbe(s, drawable, integer1, integer2, integer);
    }

    public Object zzb(Object obj)
    {
        return a((Drawable)obj);
    }

    a(zzek zzek1, String s, Integer integer, Integer integer1, int i)
    {
        e = zzek1;
        a = s;
        b = integer;
        c = integer1;
        d = i;
        super();
    }
}
