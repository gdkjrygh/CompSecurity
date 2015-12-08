// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.reporting;


// Referenced classes of package com.google.android.gms.location.reporting:
//            ReportingState

public static final class 
{

    public static int sanitize(int i)
    {
        int j = i;
        i;
        JVM INSTR tableswitch -2 1: default 32
    //                   -2 45
    //                   -1 45
    //                   0 45
    //                   1 45;
           goto _L1 _L2 _L2 _L2 _L2
_L1:
        if (i > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L4; else goto _L3
_L3:
        j = 99;
_L2:
        return j;
_L4:
        return -3;
    }
}
