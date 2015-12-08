// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;


// Referenced classes of package com.google.api.client.util:
//            GenericData

public static final class  extends Enum
{

    private static final IGNORE_CASE $VALUES[];
    public static final IGNORE_CASE IGNORE_CASE;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/api/client/util/GenericData$Flags, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        IGNORE_CASE = new <init>("IGNORE_CASE", 0);
        $VALUES = (new .VALUES[] {
            IGNORE_CASE
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
