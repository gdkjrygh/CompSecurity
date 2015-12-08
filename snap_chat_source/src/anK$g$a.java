// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.List;

final class b
    implements anQ
{

    anZ a;
    private final aoq b;
    private final List c = new ArrayList();
    private l.ArrayList d;

    public final void a()
    {
        anK.a(b);
    }

    public final void a(int i, Exception exception)
    {
        b.a(i, exception);
    }

    public final void a(Object obj)
    {
        obj = (aon)obj;
        c.addAll(((aon) (obj)).b);
        if (((aon) (obj)).c != null)
        {
            a = new anZ(a, ((aon) (obj)).c);
            anK.a(d.d, a, d.d);
            return;
        } else
        {
            b.a(new aon(((aon) (obj)).a, c, null));
            return;
        }
    }

    public ( , aoq aoq1)
    {
        d = ;
        super();
        b = aoq1;
    }
}
