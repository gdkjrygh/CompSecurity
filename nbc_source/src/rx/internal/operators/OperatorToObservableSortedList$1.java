// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import java.util.Comparator;
import rx.functions.Func2;

// Referenced classes of package rx.internal.operators:
//            OperatorToObservableSortedList

class val.sortFunction
    implements Comparator
{

    final OperatorToObservableSortedList this$0;
    final Func2 val$sortFunction;

    public int compare(Object obj, Object obj1)
    {
        return ((Integer)val$sortFunction.call(obj, obj1)).intValue();
    }

    ()
    {
        this$0 = final_operatortoobservablesortedlist;
        val$sortFunction = Func2.this;
        super();
    }
}
