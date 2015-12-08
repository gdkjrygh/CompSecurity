// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            Func3, Actions, Action3

final class 
    implements Func3
{

    final Action3 val$action;
    final Object val$result;

    public Object call(Object obj, Object obj1, Object obj2)
    {
        val$action.call(obj, obj1, obj2);
        return val$result;
    }

    ()
    {
        val$action = action3;
        val$result = obj;
        super();
    }
}
