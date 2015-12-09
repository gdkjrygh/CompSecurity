// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.a;

import android.graphics.drawable.Drawable;

// Referenced classes of package p.a:
//            b

public class p.a.a
{
    static class a
        implements b
    {

        public void a(Drawable drawable)
        {
        }

        a()
        {
        }
    }

    static interface b
    {

        public abstract void a(Drawable drawable);
    }

    static class c extends a
    {

        public void a(Drawable drawable)
        {
            p.a.b.a(drawable);
        }

        c()
        {
        }
    }

    static class d extends c
    {

        d()
        {
        }
    }

    static class e extends d
    {

        e()
        {
        }
    }


    static final b a;

    public static void a(Drawable drawable)
    {
        a.a(drawable);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 21)
        {
            a = new e();
        } else
        if (i >= 19)
        {
            a = new d();
        } else
        if (i >= 11)
        {
            a = new c();
        } else
        {
            a = new a();
        }
    }
}
