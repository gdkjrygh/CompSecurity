// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import android.graphics.Bitmap;
import com.android.slyce.h.a;
import com.android.slyce.h.b;
import com.android.slyce.h.c;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce:
//            a

public final class u extends a
{

    private final String f = com/android/slyce/u.getSimpleName();

    public u(com.android.slyce.a a1, com.android.slyce.f.c c1, JSONObject jsonobject)
    {
        super(a1.d(), a1, c1, jsonobject);
    }

    private void c(Bitmap bitmap)
    {
        a(b.b);
        a(c.a);
        b(bitmap);
        b();
    }

    private void d(Bitmap bitmap)
    {
        a(b.d);
        a(c.a);
        b(bitmap);
        b();
    }

    private void d(String s)
    {
        a(b.b);
        a(c.b);
        c(s);
        b();
    }

    private void e(String s)
    {
        a(b.d);
        a(c.b);
        c(s);
        b();
    }

    public void a()
    {
        a.c();
        e = true;
    }

    public void a(Bitmap bitmap)
    {
        if (d.b())
        {
            d(bitmap);
            return;
        }
        if (d.a())
        {
            a(b.c);
            a(c.a);
            b(bitmap);
            b();
            return;
        } else
        {
            c(bitmap);
            return;
        }
    }

    public void a(String s)
    {
        if (d.b())
        {
            e(s);
            return;
        }
        if (d.a())
        {
            a(b.c);
            a(c.b);
            c(s);
            b();
            return;
        } else
        {
            d(s);
            return;
        }
    }
}
