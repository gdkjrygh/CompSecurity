// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;


// Referenced classes of package com.google.inject.internal:
//            InjectorImpl

static final class  extends Enum
{

    private static final NEW_OR_EXISTING_JIT $VALUES[];
    public static final NEW_OR_EXISTING_JIT EXISTING_JIT;
    public static final NEW_OR_EXISTING_JIT NEW_OR_EXISTING_JIT;
    public static final NEW_OR_EXISTING_JIT NO_JIT;

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/inject/internal/InjectorImpl$JitLimitation, s);
    }

    public static [] values()
    {
        return ([])$VALUES.clone();
    }

    static 
    {
        NO_JIT = new <init>("NO_JIT", 0);
        EXISTING_JIT = new <init>("EXISTING_JIT", 1);
        NEW_OR_EXISTING_JIT = new <init>("NEW_OR_EXISTING_JIT", 2);
        $VALUES = (new .VALUES[] {
            NO_JIT, EXISTING_JIT, NEW_OR_EXISTING_JIT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
