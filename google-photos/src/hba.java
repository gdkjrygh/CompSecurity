// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

public class hba
{

    final List a = new ArrayList();
    public hae b;

    public hba()
    {
    }

    public final void a()
    {
        a(((hbf) (new hbb(this))));
    }

    public final void a(aer aer)
    {
        b.a(aer);
    }

    public void a(hbf hbf1)
    {
        if (b != null)
        {
            hbf1.a(b);
            return;
        } else
        {
            a.add(hbf1);
            return;
        }
    }

    public final void a(boolean flag)
    {
        b.a(flag);
    }

    public final aex b()
    {
        if (b == null)
        {
            return null;
        } else
        {
            return b.r();
        }
    }
}
