// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.functions.Func0;

// Referenced classes of package rx.internal.operators:
//            OperatorScan

class val.initialValue
    implements Func0
{

    final Object val$initialValue;

    public Object call()
    {
        return val$initialValue;
    }

    ()
    {
        val$initialValue = obj;
        super();
    }
}
