// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class dhj
{

    final Integer a;
    private final Activity b = null;
    private final am c;
    private final int d;

    public dhj(am am1, Integer integer, int i)
    {
        c = am1;
        a = integer;
        d = i;
    }

    public final Toolbar a()
    {
        View view = c.R;
        if (view == null)
        {
            return null;
        } else
        {
            return (Toolbar)view.findViewById(d);
        }
    }

    public final dhj a(olm olm1)
    {
        olm1.a(dhj, this);
        return this;
    }
}
