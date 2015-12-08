// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.collect:
//            Constraint, Constraints

private static final class  extends Enum
    implements Constraint
{

    private static final INSTANCE $VALUES[];
    public static final INSTANCE INSTANCE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/common/collect/Constraints$NotNullConstraint, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    public Object checkElement(Object obj)
    {
        return Preconditions.checkNotNull(obj);
    }

    public String toString()
    {
        return "Not null";
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
