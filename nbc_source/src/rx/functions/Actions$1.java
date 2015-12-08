// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            Func0, Actions, Action0

static final class 
    implements Func0
{

    final Action0 val$action;
    final Object val$result;

    public Object call()
    {
        val$action.call();
        return val$result;
    }

    (Action0 action0, Object obj)
    {
        val$action = action0;
        val$result = obj;
        super();
    }
}
