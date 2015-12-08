// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            Func7, Actions, Action7

final class 
    implements Func7
{

    final Action7 val$action;
    final Object val$result;

    public Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6)
    {
        val$action.call(obj, obj1, obj2, obj3, obj4, obj5, obj6);
        return val$result;
    }

    ()
    {
        val$action = action7;
        val$result = obj;
        super();
    }
}
