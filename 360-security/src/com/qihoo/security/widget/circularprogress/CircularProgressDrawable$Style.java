// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.circularprogress;


// Referenced classes of package com.qihoo.security.widget.circularprogress:
//            CircularProgressDrawable

public static final class  extends Enum
{

    public static final ROUNDED NORMAL;
    public static final ROUNDED ROUNDED;
    private static final ROUNDED a[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style, s);
    }

    public static [] values()
    {
        return ([])a.clone();
    }

    static 
    {
        NORMAL = new <init>("NORMAL", 0);
        ROUNDED = new <init>("ROUNDED", 1);
        a = (new a[] {
            NORMAL, ROUNDED
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
