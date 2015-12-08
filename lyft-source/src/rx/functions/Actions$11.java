// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.functions;


// Referenced classes of package rx.functions:
//            FuncN, Actions, ActionN

final class val.result
    implements FuncN
{

    final ActionN val$action;
    final Object val$result;

    public transient Object call(Object aobj[])
    {
        val$action.call(aobj);
        return val$result;
    }

    ()
    {
        val$action = actionn;
        val$result = obj;
        super();
    }
}
