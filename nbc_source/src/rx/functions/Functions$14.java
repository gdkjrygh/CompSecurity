// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            FuncN, Functions, Action3

static final class val.f
    implements FuncN
{

    final Action3 val$f;

    public volatile Object call(Object aobj[])
    {
        return call(aobj);
    }

    public transient Void call(Object aobj[])
    {
        if (aobj.length != 3)
        {
            throw new RuntimeException("Action3 expecting 3 arguments.");
        } else
        {
            val$f.call(aobj[0], aobj[1], aobj[2]);
            return null;
        }
    }

    (Action3 action3)
    {
        val$f = action3;
        super();
    }
}
