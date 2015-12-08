// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            FuncN, Functions, Func1

final class val.f
    implements FuncN
{

    final Func1 val$f;

    public transient Object call(Object aobj[])
    {
        if (aobj.length != 1)
        {
            throw new RuntimeException("Func1 expecting 1 argument.");
        } else
        {
            return val$f.call(aobj[0]);
        }
    }

    n()
    {
        val$f = func1;
        super();
    }
}
