// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.analytics.internal.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            h

public final class f extends h
{

    private static List i = new ArrayList();
    public boolean a;
    public boolean b;
    public boolean c;
    volatile boolean d;
    private Set j;

    public f(v v)
    {
        super(v);
        j = new HashSet();
    }

    public static void a()
    {
        com/google/android/gms/analytics/f;
        JVM INSTR monitorenter ;
        if (i == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        com/google/android/gms/analytics/f;
        JVM INSTR monitorexit ;
        throw exception;
        i = null;
        com/google/android/gms/analytics/f;
        JVM INSTR monitorexit ;
    }

}
