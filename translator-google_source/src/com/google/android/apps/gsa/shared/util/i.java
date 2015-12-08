// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import java.util.ArrayList;
import java.util.List;

public final class i
{

    static Throwable a(Throwable throwable, Throwable throwable1)
    {
        if (throwable1 == null)
        {
            return throwable;
        }
        Throwable throwable2;
        for (throwable2 = throwable; throwable2.getCause() != null; throwable2 = throwable2.getCause()) { }
        StackTraceElement astacktraceelement[] = throwable2.getStackTrace();
        throwable1 = throwable1.getStackTrace();
        StackTraceElement astacktraceelement1[] = new StackTraceElement[astacktraceelement.length + throwable1.length];
        System.arraycopy(astacktraceelement, 0, astacktraceelement1, 0, astacktraceelement.length);
        System.arraycopy(throwable1, 0, astacktraceelement1, astacktraceelement.length, throwable1.length);
        throwable2.setStackTrace(astacktraceelement1);
        return throwable;
    }

    static List a(Object aobj[])
    {
        ArrayList arraylist = new ArrayList(aobj.length);
        int k = aobj.length;
        int j = 0;
        while (j < k) 
        {
            Object obj = aobj[j];
            if (obj == null)
            {
                arraylist.add("null");
            } else
            {
                arraylist.add(obj.getClass().toString());
            }
            j++;
        }
        return arraylist;
    }
}
