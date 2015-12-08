// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            FuncN, Functions, Func2

static final class val.f
    implements FuncN
{

    final Func2 val$f;

    public transient Object call(Object aobj[])
    {
        if (aobj.length != 2)
        {
            throw new RuntimeException("Func2 expecting 2 arguments.");
        } else
        {
            return val$f.call(aobj[0], aobj[1]);
        }
    }

    n(Func2 func2)
    {
        val$f = func2;
        super();
    }
}
