// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.common.collect.ImmutableList;
import java.util.List;

public abstract class eqk extends eqj
{

    private List c;

    public eqk()
    {
        c = ImmutableList.d();
    }

    public volatile void a(abo abo, int i)
    {
        a((eql)abo, i);
    }

    public void a(eql eql1, int i)
    {
        eql1.a(f(i), i);
    }

    public final void a(List list)
    {
        if (list == null)
        {
            list = ImmutableList.d();
        }
        c = list;
    }

    public int b()
    {
        return c.size();
    }

    public Object f(int i)
    {
        return c.get(i);
    }
}
