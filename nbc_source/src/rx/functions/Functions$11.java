// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            FuncN, Functions, Action0

static final class val.f
    implements FuncN
{

    final Action0 val$f;

    public volatile Object call(Object aobj[])
    {
        return call(aobj);
    }

    public transient Void call(Object aobj[])
    {
        if (aobj.length != 0)
        {
            throw new RuntimeException("Action0 expecting 0 arguments.");
        } else
        {
            val$f.call();
            return null;
        }
    }

    (Action0 action0)
    {
        val$f = action0;
        super();
    }
}
