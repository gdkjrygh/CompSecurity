// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import java.util.Comparator;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            j

static final class 
    implements Comparator
{

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (j)obj;
        obj1 = (j)obj1;
        if (((j) (obj)).b < ((j) (obj1)).b)
        {
            return -1;
        }
        return ((j) (obj)).b <= ((j) (obj1)).b ? 0 : 1;
    }

    ()
    {
    }
}
