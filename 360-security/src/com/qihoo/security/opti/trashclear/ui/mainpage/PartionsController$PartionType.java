// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage;


// Referenced classes of package com.qihoo.security.opti.trashclear.ui.mainpage:
//            PartionsController

public static final class  extends Enum
{

    public static final EXTERNAL EXTERNAL;
    public static final EXTERNAL INTERNAL;
    public static final EXTERNAL SYSTEM;
    private static final EXTERNAL a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo/security/opti/trashclear/ui/mainpage/PartionsController$PartionType, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        SYSTEM = new <init>("SYSTEM", 0);
        INTERNAL = new <init>("INTERNAL", 1);
        EXTERNAL = new <init>("EXTERNAL", 2);
        a = (new a[] {
            SYSTEM, INTERNAL, EXTERNAL
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
