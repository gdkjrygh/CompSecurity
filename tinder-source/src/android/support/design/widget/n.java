// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.View;
import android.view.ViewOutlineProvider;

// Referenced classes of package android.support.design.widget:
//            g, i, h

final class n
{
    private static interface a
    {

        public abstract void a(View view);
    }

    private static final class b
        implements a
    {

        public final void a(View view)
        {
        }

        private b()
        {
        }

        b(byte byte0)
        {
            this();
        }
    }

    private static final class c
        implements a
    {

        public final void a(View view)
        {
            view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
        }

        private c()
        {
        }

        c(byte byte0)
        {
            this();
        }
    }


    static final g.d a = new g.d() {

        public final g a()
        {
            Object obj;
            if (android.os.Build.VERSION.SDK_INT >= 12)
            {
                obj = new i();
            } else
            {
                obj = new h();
            }
            return new g(((g.e) (obj)));
        }

    };
    private static final a b;

    static g a()
    {
        return a.a();
    }

    static void a(View view)
    {
        b.a(view);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            b = new c((byte)0);
        } else
        {
            b = new b((byte)0);
        }
    }
}
