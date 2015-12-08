// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            FuncN, Functions, Action1

final class val.f
    implements FuncN
{

    final Action1 val$f;

    public volatile Object call(Object aobj[])
    {
        return call(aobj);
    }

    public transient Void call(Object aobj[])
    {
        if (aobj.length != 1)
        {
            throw new RuntimeException("Action1 expecting 1 argument.");
        } else
        {
            val$f.call(aobj[0]);
            return null;
        }
    }

    ()
    {
        val$f = action1;
        super();
    }
}
