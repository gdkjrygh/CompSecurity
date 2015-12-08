// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import android.content.res.Resources;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.be.j;
import com.google.android.m4b.maps.be.k;
import com.google.android.m4b.maps.bq.h;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bx.o;
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
            return new ah.g(this, (byte)0);
        }

        private a()
        {
            super(11, (byte)0);
        }

        a(byte byte0)
        {
            this();
        }
    }


    final int a()
    {
        return 2048;
    }

    public final com.google.android.m4b.maps.be.a a(e e)
    {
        return new <init>((byte)0);
    }

    public final com.google.android.m4b.maps.bq.j a(u u, Resources resources, Locale locale, File file, e e)
    {
        return new h(u, this, locale, file, e);
    }

    public final k b()
    {
        return new j(Math.max(Math.min(128, (o.e() >> 3) * 18), 36));
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
