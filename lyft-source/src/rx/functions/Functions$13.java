// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            FuncN, Functions, Action2

final class val.f
    implements FuncN
{

    final Action2 val$f;

    public volatile Object call(Object aobj[])
    {
        return call(aobj);
    }

    public transient Void call(Object aobj[])
    {
        if (aobj.length != 2)
        {
            throw new RuntimeException("Action3 expecting 2 arguments.");
        } else
        {
            val$f.call(aobj[0], aobj[1]);
            return null;
        }
    }

    ()
    {
        val$f = action2;
        super();
    }
}
