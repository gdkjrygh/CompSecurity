// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import android.graphics.Bitmap;
import kik.android.util.e;

// Referenced classes of package com.kik.cache:
//            ContactImageView

private static final class 
{

    private static Bitmap a[] = {
        e.a(0), e.a(1), e.a(2), e.a(3), e.a(4), e.a(5), e.a(6), e.a(7), e.a(8), e.a(9)
    };

    public static Bitmap a(int i)
    {
        if (i >= 0 && i < 10)
        {
            return a[i];
        }
        if (i >= 10)
        {
            return a[9];
        } else
        {
            return a[0];
        }
    }

}
