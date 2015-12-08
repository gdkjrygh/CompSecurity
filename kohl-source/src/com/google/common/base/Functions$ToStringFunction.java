// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            Function, Functions, Preconditions

private static final class  extends Enum
    implements Function
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/common/base/Functions$ToStringFunction, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public volatile Object apply(Object obj)
    {
        return apply(obj);
    }

    public String apply(Object obj)
    {
        Preconditions.checkNotNull(obj);
        return obj.toString();
    }

    public String toString()
    {
        return "toString";
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
