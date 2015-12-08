// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            Func4, Actions, Action4

final class 
    implements Func4
{

    final Action4 val$action;
    final Object val$result;

    public Object call(Object obj, Object obj1, Object obj2, Object obj3)
    {
        val$action.call(obj, obj1, obj2, obj3);
        return val$result;
    }

    ()
    {
        val$action = action4;
        val$result = obj;
        super();
    }
}
