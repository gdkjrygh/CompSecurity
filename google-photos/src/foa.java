// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewPropertyAnimator;

public final class foa
    implements fpf
{

    View a;
    private boolean b;

    public foa()
    {
    }

    public final View a()
    {
        return a;
    }

    public final boolean b()
    {
        return b;
    }

    public final void c()
    {
        if (b)
        {
            return;
        } else
        {
            b = true;
            b.a(a.animate().alpha(0.0F).scaleX(0.6666667F).scaleY(0.6666667F).setDuration(80L)).setListener(new fob(this));
            return;
        }
    }

    public final void d()
    {
        if (!b)
        {
            return;
        } else
        {
            b = false;
            b.a(a.animate().alpha(255F).scaleX(1.0F).scaleY(1.0F).setDuration(80L)).setListener(new foc(this));
            return;
        }
    }
}
