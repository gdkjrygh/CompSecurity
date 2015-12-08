// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lja
{

    private final List a = new ArrayList();
    final ljb g;
    public final liy h;

    public lja(ljb ljb, kdh kdh)
    {
        b.d(ljb);
        g = ljb;
        ljb = new liy(this, kdh);
        ljb.g = true;
        h = ljb;
    }

    public liy a()
    {
        liy liy1 = h.a();
        b(liy1);
        return liy1;
    }

    public void a(liy liy1)
    {
    }

    public final void b(liy liy1)
    {
        for (liy1 = a.iterator(); liy1.hasNext(); liy1.next()) { }
    }
}
