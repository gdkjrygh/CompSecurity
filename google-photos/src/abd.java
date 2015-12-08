// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class abd extends adu
{

    private abc a;

    abd(abc abc1, View view, aay aay1)
    {
        a = abc1;
        super(view);
    }

    public final adq a()
    {
        if (a.a.i == null)
        {
            return null;
        } else
        {
            return ((wh) (a.a.i)).c;
        }
    }

    public final boolean b()
    {
        a.a.b();
        return true;
    }

    public final boolean c()
    {
        if (a.a.k != null)
        {
            return false;
        } else
        {
            a.a.c();
            return true;
        }
    }
}
