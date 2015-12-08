// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            FuncN, Functions, Func5

final class val.f
    implements FuncN
{

    final Func5 val$f;

    public transient Object call(Object aobj[])
    {
        if (aobj.length != 5)
        {
            throw new RuntimeException("Func5 expecting 5 arguments.");
        } else
        {
            return val$f.call(aobj[0], aobj[1], aobj[2], aobj[3], aobj[4]);
        }
    }

    n()
    {
        val$f = func5;
        super();
    }
}
