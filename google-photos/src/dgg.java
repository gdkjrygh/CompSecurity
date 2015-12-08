// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class dgg
{

    final dgk a;
    public final Context b;
    public final List c = new ArrayList();
    public String d;
    int e;
    public dgv f;
    int g;

    public dgg(dgk dgk1)
    {
        e = (int)dgh.b.c;
        g = 80;
        b = (Context)p.a(dgk1.a);
        a = (dgk)p.a(dgk1);
    }

    public final dge a()
    {
        return new dge(this);
    }

    public final dgg a(int i)
    {
        e = ((Integer)p.a(Integer.valueOf(i))).intValue();
        return this;
    }

    public final transient dgg a(int i, Object aobj[])
    {
        d = b.getString(i, aobj);
        return this;
    }

    public final dgg a(String s, android.view.View.OnClickListener onclicklistener)
    {
        boolean flag;
        if (c.size() <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "You can only add %s buttons.", new Object[] {
            Integer.valueOf(1)
        });
        c.add(new dgj(s, onclicklistener, 0));
        return this;
    }
}
