// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


// Referenced classes of package android.support.v7.internal.widget:
//            c

private class <init>
    implements Runnable
{

    final c a;

    public void run()
    {
        if (a.u)
        {
            if (a.e() != null)
            {
                a.post(this);
            }
            return;
        } else
        {
            c.b(a);
            return;
        }
    }

    private (c c1)
    {
        a = c1;
        super();
    }

    a(c c1, a a1)
    {
        this(c1);
    }
}
