// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.a;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.analytics.f;
import com.microsoft.onlineid.sts.a.e;
import com.microsoft.onlineid.sts.q;
import java.util.ArrayList;
import java.util.List;

public final class d extends f
{

    public d(Context context)
    {
        super(context, null);
    }

    protected final String a(Throwable throwable, StackTraceElement stacktraceelement, String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(throwable.getClass().getSimpleName());
        if (throwable instanceof e)
        {
            throwable = ((e)throwable).a();
            if (throwable != null)
            {
                arraylist.add((new StringBuilder("[")).append(throwable.c()).append("]").toString());
            }
        }
        String s1 = stacktraceelement.getClassName();
        int i = s1.lastIndexOf('.');
        throwable = s1;
        if (i >= 0)
        {
            throwable = s1.substring(i + 1);
        }
        s1 = (new StringBuilder()).append(throwable).append(":").append(stacktraceelement.getMethodName()).toString();
        throwable = s1;
        if (stacktraceelement.getLineNumber() > 0)
        {
            throwable = (new StringBuilder()).append(s1).append(":").append(stacktraceelement.getLineNumber()).toString();
        }
        arraylist.add((new StringBuilder("(@")).append(throwable).append(")").toString());
        arraylist.add((new StringBuilder("{")).append(s).append("}").toString());
        return TextUtils.join(" ", arraylist);
    }
}
