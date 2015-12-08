// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import rx.functions.Func1;

// Referenced classes of package rx.internal.util:
//            UtilityFunctions

private static final class  extends Enum
    implements Func1
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(rx/internal/util/UtilityFunctions$AlwaysTrue, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public Boolean call(Object obj)
    {
        return Boolean.valueOf(true);
    }

    public volatile Object call(Object obj)
    {
        return call(obj);
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE", 0);
        $VALUES = (new .VALUES[] {
            INSTANCE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
