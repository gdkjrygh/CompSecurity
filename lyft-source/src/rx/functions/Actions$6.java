// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            Func5, Actions, Action5

final class 
    implements Func5
{

    final Action5 val$action;
    final Object val$result;

    public Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4)
    {
        val$action.call(obj, obj1, obj2, obj3, obj4);
        return val$result;
    }

    ()
    {
        val$action = action5;
        val$result = obj;
        super();
    }
}
