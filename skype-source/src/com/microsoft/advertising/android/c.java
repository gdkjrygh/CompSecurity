// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.microsoft.advertising.android:
//            bu, OrientationChangeEventManager, aw, af, 
//            av, Dimensions

public final class c
{
    public static final class a
    {

        protected volatile int a;
        protected volatile int b;

        final void a(int i)
        {
            a = i;
        }

        public final boolean a()
        {
            return a >= 0 && b >= 0;
        }

        public final int b()
        {
            return a;
        }

        final void b(int i)
        {
            b = i;
        }

        public final int c()
        {
            return b;
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append(a).append("x").append(b);
            return stringbuilder.toString();
        }

        public a()
        {
            a = -1;
            b = -1;
        }
    }


    protected final a a = new a();
    protected final a b = new a();
    protected final int c;
    private final Context d;
    private boolean e;

    public c(Context context)
    {
        boolean flag = true;
        super();
        d = context.getApplicationContext();
        c = bu.a(d.getResources());
        if (1 != OrientationChangeEventManager.a(d.getResources()))
        {
            flag = false;
        }
        a(flag);
    }

    public final int a()
    {
        if (e)
        {
            return a.b();
        } else
        {
            return b.b();
        }
    }

    public final void a(Dimensions dimensions, aw aw1, int i, int j, int k)
    {
        aw aw2 = aw1;
        if (aw1 == null)
        {
            aw2 = aw.a;
        }
        int l;
        int i1;
        boolean flag;
        if (e)
        {
            flag = a.a();
        } else
        {
            flag = b.a();
        }
        af.a(flag);
        av.a("ActivityDimensions", (new StringBuilder("setExpandedViewDimensions() ad requested: ")).append(j).append("x").append(k).toString());
        av.a("ActivityDimensions", (new StringBuilder("isPortrait=")).append(e).toString());
        av.a("ActivityDimensions", (new StringBuilder("portrait size=")).append(a.toString()).toString());
        av.a("ActivityDimensions", (new StringBuilder("landscape size=")).append(b.toString()).toString());
        l = a();
        i1 = b();
        if (i == -1)
        {
            i = 1;
        } else
        if (1024 != (i & 0x400))
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0)
        {
            i = 0;
        } else
        {
            i = c;
        }
        dimensions.a = 0;
        dimensions.b = 0;
        dimensions.a = dimensions.a + aw2.a();
        dimensions.b = dimensions.b + (aw2.b() + i);
        dimensions.c = l - aw2.c();
        dimensions.d = i1 - aw2.d() - i;
        if (j <= 0 && k <= 0)
        {
            return;
        }
        if (j <= 0)
        {
            j = dimensions.c;
        }
        if (k <= 0)
        {
            k = dimensions.d;
        }
        dimensions.a(j, k);
        av.a("ActivityDimensions", (new StringBuilder("final result dimension: ")).append(dimensions.toString()).toString());
    }

    public final void a(boolean flag)
    {
        e = flag;
        boolean flag1;
        if (a.a() && b.a())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            return;
        }
        Display display = ((WindowManager)d.getSystemService("window")).getDefaultDisplay();
        if (flag)
        {
            a.a(display.getWidth());
            a.b(display.getHeight());
            return;
        } else
        {
            b.a(display.getWidth());
            b.b(display.getHeight());
            return;
        }
    }

    public final int b()
    {
        if (e)
        {
            return a.c();
        } else
        {
            return b.c();
        }
    }
}
