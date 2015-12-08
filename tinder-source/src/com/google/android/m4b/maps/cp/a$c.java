// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cp;

import com.google.android.m4b.maps.cu.a;
import com.google.android.m4b.maps.cu.b;
import com.google.android.m4b.maps.cu.j;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.cp:
//            a

public static final class  extends b
{

    public final void a(a a1)
    {
        if (!Arrays.equals(null, j.a))
        {
            a1.a(1, null);
        }
        super.a(a1);
    }

    protected final int b()
    {
        int k = super.b();
        int i = k;
        if (!Arrays.equals(null, j.a))
        {
            i = k + com.google.android.m4b.maps.cu.a.b(1, null);
        }
        return i;
    }
}
