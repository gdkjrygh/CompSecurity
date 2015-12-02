// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.exam;


// Referenced classes of package com.qihoo.security.ui.exam:
//            ExamMainAnim

public static final class a extends Enum
{

    public static final EXCELLENT EXCELLENT;
    public static final EXCELLENT IN_DANGER;
    public static final EXCELLENT NEED_OPTIMIZE;
    private static final EXCELLENT b[];
    private final int a;

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(com/qihoo/security/ui/exam/ExamMainAnim$ExamStatus, s);
    }

    public static a[] values()
    {
        return (a[])b.clone();
    }

    public int getLevel()
    {
        return a;
    }

    public a getStatusWithLevel(int i)
    {
        switch (i)
        {
        default:
            return EXCELLENT;

        case 0: // '\0'
            return EXCELLENT;

        case 1: // '\001'
            return NEED_OPTIMIZE;

        case 2: // '\002'
            return IN_DANGER;
        }
    }

    static 
    {
        IN_DANGER = new <init>("IN_DANGER", 0, 2);
        NEED_OPTIMIZE = new <init>("NEED_OPTIMIZE", 1, 1);
        EXCELLENT = new <init>("EXCELLENT", 2, 0);
        b = (new b[] {
            IN_DANGER, NEED_OPTIMIZE, EXCELLENT
        });
    }

    private (String s, int i, int j)
    {
        super(s, i);
        a = j;
    }
}
