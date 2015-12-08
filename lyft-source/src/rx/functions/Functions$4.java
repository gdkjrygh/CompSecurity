// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            FuncN, Functions, Func3

final class val.f
    implements FuncN
{

    final Func3 val$f;

    public transient Object call(Object aobj[])
    {
        if (aobj.length != 3)
        {
            throw new RuntimeException("Func3 expecting 3 arguments.");
        } else
        {
            return val$f.call(aobj[0], aobj[1], aobj[2]);
        }
    }

    n()
    {
        val$f = func3;
        super();
    }
}
