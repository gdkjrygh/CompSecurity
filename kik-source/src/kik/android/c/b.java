// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.c;

import android.hardware.Camera;

// Referenced classes of package kik.android.c:
//            a

public abstract class kik.android.c.b
    implements kik.android.c.a
{
    public static abstract class a
    {

        public abstract void a(Camera camera);

        public a()
        {
        }
    }

    public static abstract class b
    {

        public abstract void a();

        public b()
        {
        }
    }

    public static abstract class c
    {

        public abstract void a();

        public c()
        {
        }
    }


    protected android.view.View.OnTouchListener a;
    protected c b;
    protected b c;
    protected a d;

    public kik.android.c.b()
    {
    }

    public final kik.android.c.b a(android.view.View.OnTouchListener ontouchlistener)
    {
        a = ontouchlistener;
        return this;
    }

    public final kik.android.c.b a(a a1)
    {
        d = a1;
        return this;
    }

    public final kik.android.c.b a(b b1)
    {
        c = b1;
        return this;
    }

    public void a(Camera camera)
    {
        if (d != null)
        {
            d.a(camera);
        }
    }

    public abstract void b();

    public abstract Camera c();
}
