// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;

// Referenced classes of package android.support.v7.app:
//            a

static final class oolbar.k
    implements oolbar.k
{

    final Toolbar a;
    final Drawable b;
    final CharSequence c;

    public final Drawable a()
    {
        return b;
    }

    public final void a(int i)
    {
        if (i == 0)
        {
            a.setNavigationContentDescription(c);
            return;
        } else
        {
            a.setNavigationContentDescription(i);
            return;
        }
    }

    public final void a(Drawable drawable, int i)
    {
        a.setNavigationIcon(drawable);
        a(i);
    }

    public final Context b()
    {
        return a.getContext();
    }

    public final boolean c()
    {
        return true;
    }

    oolbar(Toolbar toolbar)
    {
        a = toolbar;
        b = toolbar.l();
        c = toolbar.k();
    }
}
