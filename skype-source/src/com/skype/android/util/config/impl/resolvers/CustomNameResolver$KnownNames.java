// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.config.impl.resolvers;


// Referenced classes of package com.skype.android.util.config.impl.resolvers:
//            CustomNameResolver

private static final class  extends Enum
{

    private static final screenSize $VALUES[];
    public static final screenSize numCpuCores;
    public static final screenSize screenSize;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/skype/android/util/config/impl/resolvers/CustomNameResolver$KnownNames, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        numCpuCores = new <init>("numCpuCores", 0);
        screenSize = new <init>("screenSize", 1);
        $VALUES = (new .VALUES[] {
            numCpuCores, screenSize
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
