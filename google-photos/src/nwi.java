// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class nwi
    implements jw
{

    private final nwj a;
    private final jw b;

    public nwi(jw jw1, nwj nwj1)
    {
        a = nwj1;
        b = jw1;
    }

    public final Object a()
    {
        Object obj1 = b.a();
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = a.a();
        }
        return obj;
    }

    public final boolean a(Object obj)
    {
        a.a(obj);
        return b.a(obj);
    }
}
