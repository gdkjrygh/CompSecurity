// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.util.SparseArray;

// Referenced classes of package com.pandora.radio.data:
//            ah

private static class 
{

    private static final SparseArray a = new SparseArray(7);

    static String a(int i)
    {
        return b(i);
    }

    static void a()
    {
        b();
    }

    private static String b(int i)
    {
        com/pandora/radio/data/ah$a;
        JVM INSTR monitorenter ;
        String s1 = (String)a.get(i);
        String s;
        s = s1;
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        s = String.format("number_of_clicks_for_tab_%s", new Object[] {
            Integer.valueOf(i)
        });
        a.put(i, s);
        com/pandora/radio/data/ah$a;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    private static void b()
    {
        a.clear();
    }

}
