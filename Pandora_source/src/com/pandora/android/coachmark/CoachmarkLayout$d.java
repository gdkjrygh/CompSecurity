// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.coachmark;


// Referenced classes of package com.pandora.android.coachmark:
//            CoachmarkLayout

public static final class  extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    private static final e f[];

    public static  valueOf(String s)
    {
        return ()Enum.valueOf(com/pandora/android/coachmark/CoachmarkLayout$d, s);
    }

    public static [] values()
    {
        return ([])f.clone();
    }

    static 
    {
        a = new <init>("LEFT", 0);
        b = new <init>("TOP", 1);
        c = new <init>("RIGHT", 2);
        d = new <init>("BOTTOM", 3);
        e = new <init>("CENTER", 4);
        f = (new f[] {
            a, b, c, d, e
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
