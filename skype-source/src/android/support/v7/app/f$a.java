// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.p;

// Referenced classes of package android.support.v7.app:
//            f, ActionBar

private final class <init>
    implements <init>
{

    final f a;

    public final Drawable a()
    {
        p p1 = p.a(a.l(), null, new int[] {
            android.support.v7.appcompat.homeAsUpIndicator
        });
        Drawable drawable = p1.a(0);
        p1.b();
        return drawable;
    }

    public final void a(int i)
    {
        ActionBar actionbar = a.a();
        if (actionbar != null)
        {
            actionbar.b(i);
        }
    }

    public final void a(Drawable drawable, int i)
    {
        ActionBar actionbar = a.a();
        if (actionbar != null)
        {
            actionbar.b(drawable);
            actionbar.b(i);
        }
    }

    public final Context b()
    {
        return a.l();
    }

    public final boolean c()
    {
        ActionBar actionbar = a.a();
        return actionbar != null && (actionbar.e() & 4) != 0;
    }

    private rawable(f f1)
    {
        a = f1;
        super();
    }

    a(f f1, byte byte0)
    {
        this(f1);
    }
}
