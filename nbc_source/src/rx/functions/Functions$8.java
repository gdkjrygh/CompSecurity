// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            FuncN, Functions, Func7

static final class val.f
    implements FuncN
{

    final Func7 val$f;

    public transient Object call(Object aobj[])
    {
        if (aobj.length != 7)
        {
            throw new RuntimeException("Func7 expecting 7 arguments.");
        } else
        {
            return val$f.call(aobj[0], aobj[1], aobj[2], aobj[3], aobj[4], aobj[5], aobj[6]);
        }
    }

    n(Func7 func7)
    {
        val$f = func7;
        super();
    }
}
