// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.ViewGroup;

abstract class dde
    implements ddd
{

    final View a;
    private final dhr b;
    private final View c;

    protected dde(View view)
    {
        a = view;
        b = new dhr((ViewGroup)view.findViewById(0x7f1102f5));
        c = view.findViewById(0x7f11046f);
    }

    public final View a()
    {
        return a;
    }

    public final void a(View view)
    {
        b.a(view);
        b.a();
    }

    public final void a(Object obj)
    {
        a.setTag(obj);
    }

    public final void a(boolean flag)
    {
        View view = c;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
    }

    public final View b()
    {
        return b.a;
    }

    public final void b(Object obj)
    {
        a.setTag(0x7f110041, obj);
    }

    public final void b(boolean flag)
    {
        if (a instanceof dhs)
        {
            ((dhs)a).a(flag);
        }
    }
}
