// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.bd.d;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bs.e;
import java.io.File;
import java.util.Locale;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            n

public final class m extends n
{
    public static final class a
    {

        a()
        {
        }
    }


    public static final a e = new a();
    private boolean g;
    private volatile a h;

    public m(u u, ah ah, int i, float f, Locale locale, File file, a a1, 
            e e1)
    {
        super(u, ah, i, f, locale, file, e1);
        g = false;
        h = a1;
    }

    public final void a(ac ac, d d)
    {
        c(ac, d);
    }

    public final void c(ac ac, d d)
    {
        a a1;
        if (h != null)
        {
            a1 = h;
        }
        super.a(ac, d);
    }

}
