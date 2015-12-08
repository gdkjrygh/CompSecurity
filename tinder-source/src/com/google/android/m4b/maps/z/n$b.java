// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.z;

import java.util.Random;

// Referenced classes of package com.google.android.m4b.maps.z:
//            n

static final class a
{

    private static Random b = new Random();
    int a;


    ()
    {
        int j = b.nextInt();
        int i = j;
        if (j == 0)
        {
            i = 1;
        }
        a = i;
    }
}
