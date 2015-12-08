// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.os.Parcelable;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.l;
import android.support.v7.internal.view.menu.o;
import android.support.v7.view.b;
import android.view.View;
import android.widget.ImageButton;

// Referenced classes of package android.support.v7.widget:
//            Toolbar

private final class <init>
    implements l
{

    f a;
    h b;
    final Toolbar c;

    public final void a(Context context, f f1)
    {
        if (a != null && b != null)
        {
            a.b(b);
        }
        a = f1;
    }

    public final void a(Parcelable parcelable)
    {
    }

    public final void a(f f1, boolean flag)
    {
    }

    public final void a(boolean flag)
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        boolean flag1;
        boolean flag2;
        flag2 = false;
        flag1 = flag2;
        if (a == null) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        j = a.size();
        i = 0;
_L9:
        flag1 = flag2;
        if (i >= j) goto _L4; else goto _L5
_L5:
        if (a.getItem(i) != b) goto _L7; else goto _L6
_L6:
        flag1 = true;
_L4:
        if (!flag1)
        {
            b(b);
        }
_L2:
        return;
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final boolean a()
    {
        return false;
    }

    public final boolean a(h h1)
    {
        android.support.v7.widget.Toolbar.b(c);
        if (Toolbar.c(c).getParent() != c)
        {
            c.addView(Toolbar.c(c));
        }
        c.a = h1.getActionView();
        b = h1;
        if (c.a.getParent() != c)
        {
            u.h h2 = Toolbar.n();
            h2.a = 0x800003 | Toolbar.d(c) & 0x70;
            h2.b = 2;
            c.a.setLayoutParams(h2);
            c.addView(c.a);
        }
        c.p();
        c.requestLayout();
        h1.e(true);
        if (c.a instanceof b)
        {
            ((b)c.a).a();
        }
        return true;
    }

    public final boolean a(o o)
    {
        return false;
    }

    public final int b()
    {
        return 0;
    }

    public final boolean b(h h1)
    {
        if (c.a instanceof b)
        {
            ((b)c.a).b();
        }
        c.removeView(c.a);
        c.removeView(Toolbar.c(c));
        c.a = null;
        c.q();
        b = null;
        c.requestLayout();
        h1.e(false);
        return true;
    }

    public final Parcelable d()
    {
        return null;
    }

    private u.h(Toolbar toolbar)
    {
        c = toolbar;
        super();
    }

    c(Toolbar toolbar, byte byte0)
    {
        this(toolbar);
    }
}
