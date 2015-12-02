// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;


// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            PartionsController

public static final class  extends Enum
{

    public static final INTERNAL_EXTERNAL INTERNAL;
    public static final INTERNAL_EXTERNAL INTERNAL_EXTERNAL;
    public static final INTERNAL_EXTERNAL INTERNAL_SYSTEM;
    public static final INTERNAL_EXTERNAL SYSTEM_INTERNAL_EXTERNAL;
    private static final INTERNAL_EXTERNAL a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$StorageState, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        SYSTEM_INTERNAL_EXTERNAL = new <init>("SYSTEM_INTERNAL_EXTERNAL", 0);
        INTERNAL_SYSTEM = new <init>("INTERNAL_SYSTEM", 1);
        INTERNAL = new <init>("INTERNAL", 2);
        INTERNAL_EXTERNAL = new <init>("INTERNAL_EXTERNAL", 3);
        a = (new a[] {
            SYSTEM_INTERNAL_EXTERNAL, INTERNAL_SYSTEM, INTERNAL, INTERNAL_EXTERNAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
