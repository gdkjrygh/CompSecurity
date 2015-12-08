// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;

public final class iyw
{

    private static final SparseArray a = new SparseArray();

    public static ekq a(int i)
    {
        ekq ekq1 = (ekq)a.get(i);
        Object obj = ekq1;
        if (ekq1 == null)
        {
            obj = new iza(i);
            a.put(i, obj);
        }
        return ((ekq) (obj));
    }

}
