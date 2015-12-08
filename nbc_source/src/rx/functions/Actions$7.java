// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            Func6, Actions, Action6

static final class 
    implements Func6
{

    final Action6 val$action;
    final Object val$result;

    public Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5)
    {
        val$action.call(obj, obj1, obj2, obj3, obj4, obj5);
        return val$result;
    }

    (Action6 action6, Object obj)
    {
        val$action = action6;
        val$result = obj;
        super();
    }
}
