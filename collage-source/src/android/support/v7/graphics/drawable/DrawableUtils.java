// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.graphics.drawable;


public class DrawableUtils
{

    public DrawableUtils()
    {
    }

    public static android.graphics.PorterDuff.Mode parseTintMode(int i, android.graphics.PorterDuff.Mode mode)
    {
        i;
        JVM INSTR tableswitch 3 16: default 72
    //                   3 74
    //                   4 72
    //                   5 78
    //                   6 72
    //                   7 72
    //                   8 72
    //                   9 82
    //                   10 72
    //                   11 72
    //                   12 72
    //                   13 72
    //                   14 86
    //                   15 90
    //                   16 94;
           goto _L1 _L2 _L1 _L3 _L1 _L1 _L1 _L4 _L1 _L1 _L1 _L1 _L5 _L6 _L7
_L1:
        return mode;
_L2:
        return android.graphics.PorterDuff.Mode.SRC_OVER;
_L3:
        return android.graphics.PorterDuff.Mode.SRC_IN;
_L4:
        return android.graphics.PorterDuff.Mode.SRC_ATOP;
_L5:
        return android.graphics.PorterDuff.Mode.MULTIPLY;
_L6:
        return android.graphics.PorterDuff.Mode.SCREEN;
_L7:
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return android.graphics.PorterDuff.Mode.valueOf("ADD");
        }
        if (true) goto _L1; else goto _L8
_L8:
    }
}
