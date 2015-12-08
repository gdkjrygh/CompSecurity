// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            FuncN, Functions, Func0

static final class val.f
    implements FuncN
{

    final Func0 val$f;

    public transient Object call(Object aobj[])
    {
        if (aobj.length != 0)
        {
            throw new RuntimeException("Func0 expecting 0 arguments.");
        } else
        {
            return val$f.call();
        }
    }

    n(Func0 func0)
    {
        val$f = func0;
        super();
    }
}
