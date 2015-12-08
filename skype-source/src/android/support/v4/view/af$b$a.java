// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;

// Referenced classes of package android.support.v4.view:
//            aj, af, x

static final class a
    implements aj
{

    af a;

    public final void a(View view)
    {
        if (af.d(a) >= 0)
        {
            x.a(view, 2, null);
        }
        if (af.a(a) != null)
        {
            af.a(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        aj aj1 = null;
        if (obj instanceof aj)
        {
            aj1 = (aj)obj;
        }
        if (aj1 != null)
        {
            aj1.a(view);
        }
    }

    public final void b(View view)
    {
        if (af.d(a) >= 0)
        {
            x.a(view, af.d(a), null);
            af.c(a);
        }
        if (af.b(a) != null)
        {
            af.b(a).run();
        }
        Object obj = view.getTag(0x7e000000);
        aj aj1 = null;
        if (obj instanceof aj)
        {
            aj1 = (aj)obj;
        }
        if (aj1 != null)
        {
            aj1.b(view);
        }
    }

    public final void c(View view)
    {
        Object obj = view.getTag(0x7e000000);
        aj aj1 = null;
        if (obj instanceof aj)
        {
            aj1 = (aj)obj;
        }
        if (aj1 != null)
        {
            aj1.c(view);
        }
    }

    (af af1)
    {
        a = af1;
    }
}
