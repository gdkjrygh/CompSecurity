// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;


// Referenced classes of package com.snapchat.videochat.view:
//            QuickSnapOnboardingOverlay

public static final class  extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    private static final c d[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/snapchat/videochat/view/QuickSnapOnboardingOverlay$a, s);
    }

    public static [] values()
    {
        return ([])d.clone();
    }

    static 
    {
        a = new <init>("MODE_BLINK", 0);
        b = new <init>("MODE_SOLID", 1);
        c = new <init>("MODE_SOLID_EXPIRE", 2);
        d = (new d[] {
            a, b, c
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
