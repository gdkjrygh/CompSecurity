// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;

import android.util.SparseArray;

// Referenced classes of package com.soundcloud.android.skippy:
//            Skippy

public static class a
{

    private SparseArray a;

    public Enum forValue(int i)
    {
        return (Enum)a.get(i);
    }

    public String nameForValue(int i)
    {
        return ((Enum)a.get(i)).name();
    }

    public (SparseArray sparsearray)
    {
        a = sparsearray;
    }
}
