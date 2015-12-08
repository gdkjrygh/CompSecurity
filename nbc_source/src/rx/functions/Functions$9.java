// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            FuncN, Functions, Func8

static final class val.f
    implements FuncN
{

    final Func8 val$f;

    public transient Object call(Object aobj[])
    {
        if (aobj.length != 8)
        {
            throw new RuntimeException("Func8 expecting 8 arguments.");
        } else
        {
            return val$f.call(aobj[0], aobj[1], aobj[2], aobj[3], aobj[4], aobj[5], aobj[6], aobj[7]);
        }
    }

    n(Func8 func8)
    {
        val$f = func8;
        super();
    }
}
