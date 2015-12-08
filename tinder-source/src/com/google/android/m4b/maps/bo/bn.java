// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.ak.a;
import java.io.DataInput;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bm, k, bk, t, 
//            ae, o

public final class bn extends bm
{

    public bn(int i, a a1, k k, bk abk[], t t, int j, String s, 
            int l, float f, int i1, int ai[])
    {
        super(i, a1, k, abk, t, j, s, l, f, i1, ai);
    }

    public static bm b(DataInput datainput, ae ae, o o)
    {
        return com.google.android.m4b.maps.bo.bm.a(datainput, ae, o, true);
    }

    public final int a()
    {
        return 11;
    }
}
