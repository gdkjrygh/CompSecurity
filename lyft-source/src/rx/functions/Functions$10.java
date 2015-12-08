// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            FuncN, Functions, Func9

final class val.f
    implements FuncN
{

    final Func9 val$f;

    public transient Object call(Object aobj[])
    {
        if (aobj.length != 9)
        {
            throw new RuntimeException("Func9 expecting 9 arguments.");
        } else
        {
            return val$f.call(aobj[0], aobj[1], aobj[2], aobj[3], aobj[4], aobj[5], aobj[6], aobj[7], aobj[8]);
        }
    }

    ()
    {
        val$f = func9;
        super();
    }
}
