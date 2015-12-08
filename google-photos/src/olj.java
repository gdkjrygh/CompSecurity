// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseBooleanArray;

public final class olj
{

    private static final SparseBooleanArray a;

    public static boolean a(int i)
    {
        return a.get(i);
    }

    static 
    {
        SparseBooleanArray sparsebooleanarray = new SparseBooleanArray();
        a = sparsebooleanarray;
        sparsebooleanarray.put(18, true);
        a.put(22, true);
        a.put(36, true);
    }
}
