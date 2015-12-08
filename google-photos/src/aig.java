// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class aig extends ahs
{

    aig(agu agu1)
    {
        super(agu1);
    }

    static void a(aif aif1)
    {
        if (aif1.a != 1)
        {
            throw new RuntimeException("Cannot access non-object based Frame as FrameValue!");
        } else
        {
            return;
        }
    }

    public final void a(Object obj)
    {
        a.b(2, 8).a(obj);
        a.a();
    }

    public final Object m()
    {
        Object obj = a.a(1, 8);
        a.a();
        return obj;
    }
}
