// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            ii, ij

final class eb extends Enum
    implements ii
{

    private static final eb $VALUES[];
    public static final eb INSTANCE;

    private eb(String s, int i)
    {
        super(s, i);
    }

    public static eb valueOf(String s)
    {
        return (eb)Enum.valueOf(com/google/common/a/eb, s);
    }

    public static eb[] values()
    {
        return (eb[])$VALUES.clone();
    }

    public void onRemoval(ij ij)
    {
    }

    static 
    {
        INSTANCE = new eb("INSTANCE", 0);
        $VALUES = (new eb[] {
            INSTANCE
        });
    }
}
