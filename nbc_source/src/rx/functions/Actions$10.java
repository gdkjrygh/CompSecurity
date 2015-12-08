// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            Func9, Actions, Action9

static final class val.result
    implements Func9
{

    final Action9 val$action;
    final Object val$result;

    public Object call(Object obj, Object obj1, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, 
            Object obj7, Object obj8)
    {
        val$action.call(obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
        return val$result;
    }

    (Action9 action9, Object obj)
    {
        val$action = action9;
        val$result = obj;
        super();
    }
}
