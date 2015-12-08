// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.RectF;

final class ctz
    implements cvf
{

    private final Thread a;
    private ctv b;

    public ctz(ctv ctv1, Thread thread)
    {
        b = ctv1;
        super();
        a = (Thread)b.a(thread, "playerThread", null);
    }

    public final void a()
    {
        if (a == ctv.h(b) && ctv.d(b) != null)
        {
            ctv.d(b).a();
        }
    }

    public final void a(int i, boolean flag)
    {
        if (a == ctv.h(b))
        {
            ctv.a(b, null);
            if (ctv.d(b) != null)
            {
                ctv.d(b).a(i, flag);
            }
        }
    }

    public final void a(long l)
    {
        if (a == ctv.h(b) && ctv.d(b) != null)
        {
            ctv.d(b).a(l);
        }
    }

    public final void a(long l, RectF rectf)
    {
        if (a == ctv.h(b) && ctv.d(b) != null)
        {
            ctv.d(b).a(l, rectf);
        }
    }

    public final void a(Bitmap bitmap)
    {
        if (a == ctv.h(b) && ctv.d(b) != null)
        {
            ctv.d(b).a(bitmap);
        }
    }

    public final void b()
    {
        if (a == ctv.h(b) && ctv.d(b) != null)
        {
            ctv.d(b).b();
        }
    }

    public final void c()
    {
        if (a == ctv.h(b) && ctv.d(b) != null)
        {
            ctv.d(b).c();
        }
    }

    public final void d()
    {
        if (a == ctv.h(b) && ctv.d(b) != null)
        {
            ctv.d(b).d();
        }
    }
}
