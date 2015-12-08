// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            Func2, Actions, Action2

final class 
    implements Func2
{

    final Action2 val$action;
    final Object val$result;

    public Object call(Object obj, Object obj1)
    {
        val$action.call(obj, obj1);
        return val$result;
    }

    ()
    {
        val$action = action2;
        val$result = obj;
        super();
    }
}
