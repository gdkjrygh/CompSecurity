// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.operators;

import rx.functions.Func2;

// Referenced classes of package rx.internal.operators:
//            OperatorSequenceEqual

static final class val.equality
    implements Func2
{

    final Func2 val$equality;

    public Boolean call(Object obj, Object obj1)
    {
        boolean flag;
        boolean flag1;
        if (obj == OperatorSequenceEqual.access$000())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (obj1 == OperatorSequenceEqual.access$000())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && flag1)
        {
            return Boolean.valueOf(true);
        }
        if (flag || flag1)
        {
            return Boolean.valueOf(false);
        } else
        {
            return (Boolean)val$equality.call(obj, obj1);
        }
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call(obj, obj1);
    }

    (Func2 func2)
    {
        val$equality = func2;
        super();
    }
}
