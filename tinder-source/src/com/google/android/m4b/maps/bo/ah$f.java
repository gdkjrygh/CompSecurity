// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import android.content.res.Resources;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.bq.e;
import com.google.android.m4b.maps.bq.j;
import com.google.android.m4b.maps.bx.l;
import java.io.File;
import java.util.Locale;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            ah

static final class a extends ah
{
    static final class a extends ah.b
    {

        final ah a()
        {
            return new ah.f(this, (byte)0);
        }

        private a()
        {
            super(8, (byte)0);
        }

        a(byte byte0)
        {
            this();
        }
    }


    final int a()
    {
        return 0;
    }

    public final com.google.android.m4b.maps.be.a a(com.google.android.m4b.maps.bs.e e1)
    {
        return null;
    }

    public final j a(u u, Resources resources, Locale locale, File file, com.google.android.m4b.maps.bs.e e1)
    {
        return new e(u, l.a(resources, 256), locale, file, e1);
    }

    public final int compareTo(Object obj)
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
