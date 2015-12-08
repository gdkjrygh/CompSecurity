// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.m4b.maps.ay.u;
import com.google.android.m4b.maps.bq.c;
import com.google.android.m4b.maps.bq.j;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.bx.l;
import java.io.File;
import java.util.Locale;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            ah

static final class a extends ah
{
    static final class a extends ah.b
    {

        final ah a()
        {
            return new ah.c(this, (byte)0);
        }

        private a(int i)
        {
            super(i, (byte)0);
        }

        a(int i, byte byte0)
        {
            this(i);
        }
    }


    final int a()
    {
        return 2048;
    }

    public final com.google.android.m4b.maps.be.a a(e e)
    {
        return new <init>(this, e);
    }

    public final j a(u u, Resources resources, Locale locale, File file, e e)
    {
        float f2 = 3F;
        float f1;
        byte byte0;
        int i;
        if (resources.getDisplayMetrics().densityDpi > 160)
        {
            byte0 = 3;
        } else
        {
            byte0 = 1;
        }
        if (this == ah.d)
        {
            i = l.a(resources);
        } else
        {
            i = l.a(resources, 256);
        }
        if (super.F)
        {
            f1 = resources.getDisplayMetrics().density;
        } else
        {
            f1 = 1.0F;
        }
        if (this == x)
        {
            if (f1 == 4F)
            {
                f1 = f2;
            } else
            if (f1 == 3F)
            {
                f1 = 2.0F;
            } else
            if (f1 == 2.0F)
            {
                f1 = 1.5F;
            } else
            {
                f1 = 1.0F;
            }
        }
        return new c(u, this, byte0, i, f1, locale, file, e);
    }

    public final void a(GL10 gl10)
    {
        gl10.glColor4f(0.0F, 0.0F, 1.0F, 0.3F);
    }

    public final int compareTo(Object obj)
    {
        return super.a((ah)obj);
    }

    public final boolean f()
    {
        return true;
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
