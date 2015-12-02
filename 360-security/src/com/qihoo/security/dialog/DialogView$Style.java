// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.dialog;


// Referenced classes of package com.qihoo.security.dialog:
//            DialogView

public static final class  extends Enum
{

    public static final TRANSPARENT TRANSPARENT;
    private static final TRANSPARENT a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo/security/dialog/DialogView$Style, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        TRANSPARENT = new <init>("TRANSPARENT", 0);
        a = (new a[] {
            TRANSPARENT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
