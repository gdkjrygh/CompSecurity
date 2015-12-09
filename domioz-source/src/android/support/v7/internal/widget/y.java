// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


// Referenced classes of package android.support.v7.internal.widget:
//            u

final class y
    implements Runnable
{

    final u a;

    private y(u u1)
    {
        a = u1;
        super();
    }

    y(u u1, byte byte0)
    {
        this(u1);
    }

    public final void run()
    {
        if (a.t)
        {
            if (a.c() != null)
            {
                a.post(this);
            }
            return;
        } else
        {
            u.b(a);
            return;
        }
    }
}
