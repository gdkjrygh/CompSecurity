// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            bu

final class  extends Enum
    implements bu
{

    public static final INSTANCE INSTANCE;
    private static final INSTANCE a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/google/common/collect/GenericMapMaker$NullListener, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    public final void onRemoval(r_3B_.clone clone)
    {
    }

    static 
    {
        INSTANCE = new <init>("INSTANCE");
        a = (new a[] {
            INSTANCE
        });
    }

    private (String s)
    {
        super(s, 0);
    }
}
