// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class 
    implements aoq
{

    private aok a;

    public final void a(int i, Exception exception)
    {
        anR.a();
        if (i == 10001)
        {
            a.a(exception);
            return;
        } else
        {
            a.a(i);
            return;
        }
    }

    public final void a(Object obj)
    {
        obj = (List)obj;
        anR.a();
        if (!((List) (obj)).isEmpty())
        {
            if (a.a != null)
            {
                a.a.a(((List) (obj)).get(0));
            }
            return;
        } else
        {
            a.a(10002);
            return;
        }
    }

    private (aok aok1)
    {
        a = aok1;
        super();
    }

    public (aok aok1, byte byte0)
    {
        this(aok1);
    }
}
