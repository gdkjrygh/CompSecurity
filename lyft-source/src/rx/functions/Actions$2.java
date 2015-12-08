// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            Func1, Actions, Action1

final class 
    implements Func1
{

    final Action1 val$action;
    final Object val$result;

    public Object call(Object obj)
    {
        val$action.call(obj);
        return val$result;
    }

    ()
    {
        val$action = action1;
        val$result = obj;
        super();
    }
}
