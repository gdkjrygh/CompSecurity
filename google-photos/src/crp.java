// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class crp
{

    private crq a;

    protected crp(crq crq1)
    {
        a = crq1;
    }

    public final crz a(Object obj)
    {
        obj = (crz)a.get(obj);
        if (obj != null)
        {
            ((crz) (obj)).a();
            return ((crz) (obj));
        } else
        {
            return null;
        }
    }

    public final void a(Object obj, crz crz1)
    {
        crz1.a();
        a.put(obj, crz1);
    }

    public final String toString()
    {
        return a.toString();
    }
}
