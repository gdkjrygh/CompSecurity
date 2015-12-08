// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.functions;

import com.soundcloud.java.checks.Preconditions;

// Referenced classes of package com.soundcloud.java.functions:
//            Function, Functions

private static final class  extends Enum
    implements Function
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/soundcloud/java/functions/Functions$IdentityFunction, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public final Object apply(Object obj)
    {
        Preconditions.checkNotNull(obj);
        return obj;
    }

    public final String toString()
    {
        return "identity";
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
