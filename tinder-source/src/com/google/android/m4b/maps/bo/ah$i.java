// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.bq.j;
import com.google.android.m4b.maps.bq.m;
import com.google.android.m4b.maps.bq.n;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bx.l;
import java.io.File;
import java.util.Locale;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            ah

static class a extends ah
{
    static class a extends ah.b
    {

        ah a()
        {
            return new ah.i(this, (byte)0);
        }

        private a(int j)
        {
            super(j, (byte)0);
        }

        a(int j, byte byte0)
        {
            this(j);
        }
    }


    final int a()
    {
        return 4096;
    }

    public final com.google.android.m4b.maps.be.a a(e e)
    {
        return new <init>(this, e);
    }

    public final j a(u u, Resources resources, Locale locale, File file, e e)
    {
        float f;
        int j;
        if (super.F)
        {
            f = resources.getDisplayMetrics().density;
        } else
        {
            f = 1.0F;
        }
        j = l.a(resources, 256);
        if (this != com.google.android.m4b.maps.bo.ah.u) goto _L2; else goto _L1
_L1:
        u = null;
_L4:
        return u;
_L2:
        if (super.C)
        {
            return new m(u, this, j, f, locale, file, m.e, e);
        }
        resources = new n(u, this, j, f, locale, file, e);
        if (this == ah.f)
        {
            break; /* Loop/switch isn't completed */
        }
        u = resources;
        if (this != ah.g) goto _L4; else goto _L3
_L3:
        resources.f();
        return resources;
    }

    public int compareTo(Object obj)
    {
        return super.a((ah)obj);
    }

    private a(a a1)
    {
        super(a1, (byte)0);
    }

    a(a a1, byte byte0)
    {
        this(a1);
    }
}
