// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public class dcn extends abo
{

    public dig j;

    public dcn(View view)
    {
        super(view);
        a.setTag(0x7f110053, this);
    }

    public final void b(Object obj)
    {
        a.setTag(obj);
    }

    public final void b(boolean flag)
    {
        a.setEnabled(flag);
    }

    public final void c(Object obj)
    {
        a.setTag(0x7f110041, obj);
    }

    public final void c(boolean flag)
    {
        if (a instanceof dhs)
        {
            ((dhs)a).a(flag);
        }
    }

    public final void d(boolean flag)
    {
        a.setActivated(flag);
    }

    public final dig u()
    {
        return j;
    }

    public final View v()
    {
        return a;
    }

    public final Object w()
    {
        return a.getTag();
    }
}
