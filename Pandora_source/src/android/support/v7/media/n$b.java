// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import android.view.Display;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.media:
//            n, a, i

private static class <init> extends <init>
    implements <init>
{

    private a j;
    private a k;

    protected void a(b b1, b b2)
    {
        super.a(b1, b2);
        if (!a(b1.a))
        {
            b2.a(false);
        }
        if (b(b1))
        {
            b2.b(true);
        }
        b1 = b(b1.a);
        if (b1 != null)
        {
            b2.f(b1.getDisplayId());
        }
    }

    protected boolean b(b b1)
    {
        if (k == null)
        {
            k = new <init>();
        }
        return k.a(b1.a);
    }

    public void e(Object obj)
    {
        int l = f(obj);
        if (l >= 0)
        {
            b b1 = (b)h.get(l);
            obj = b(obj);
            if (obj != null)
            {
                l = ((Display) (obj)).getDisplayId();
            } else
            {
                l = -1;
            }
            if (l != b1.c.l())
            {
                b1.c = (new <init>(b1.c)).f(l).a();
                f();
            }
        }
    }

    protected void g()
    {
        super.g();
        if (j == null)
        {
            j = new <init>(a(), b());
        }
        f f = j;
        int l;
        if (this.f)
        {
            l = e;
        } else
        {
            l = 0;
        }
        f.a(l);
    }

    protected Object h()
    {
        return i.a(this);
    }

    public b(Context context, b b1)
    {
        super(context, b1);
    }
}
