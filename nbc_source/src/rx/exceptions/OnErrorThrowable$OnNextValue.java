// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.exceptions;

import java.util.HashSet;
import java.util.Set;
import rx.plugins.RxJavaErrorHandler;
import rx.plugins.RxJavaPlugins;

// Referenced classes of package rx.exceptions:
//            OnErrorThrowable

public static class value extends RuntimeException
{
    private static final class Primitives
    {

        static final Set INSTANCE = create();

        private static Set create()
        {
            HashSet hashset = new HashSet();
            hashset.add(java/lang/Boolean);
            hashset.add(java/lang/Character);
            hashset.add(java/lang/Byte);
            hashset.add(java/lang/Short);
            hashset.add(java/lang/Integer);
            hashset.add(java/lang/Long);
            hashset.add(java/lang/Float);
            hashset.add(java/lang/Double);
            return hashset;
        }


        private Primitives()
        {
        }
    }


    private static final long serialVersionUID = 0xd00f486d07cc9535L;
    private final Object value;

    static String renderValue(Object obj)
    {
        if (obj == null)
        {
            return "null";
        }
        if (Primitives.INSTANCE.contains(obj.getClass()))
        {
            return obj.toString();
        }
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if (obj instanceof Enum)
        {
            return ((Enum)obj).name();
        }
        String s = RxJavaPlugins.getInstance().getErrorHandler().handleOnNextValueRendering(obj);
        if (s != null)
        {
            return s;
        } else
        {
            return (new StringBuilder()).append(obj.getClass().getName()).append(".class").toString();
        }
    }

    public Object getValue()
    {
        return value;
    }

    public Primitives(Object obj)
    {
        super((new StringBuilder()).append("OnError while emitting onNext value: ").append(renderValue(obj)).toString());
        value = obj;
    }
}
