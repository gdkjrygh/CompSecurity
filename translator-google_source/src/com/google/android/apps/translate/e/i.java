// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.e;

import android.view.View;
import com.google.android.apps.translate.r;

public final class i
    implements android.view.View.OnClickListener
{

    private static final int a;
    private final android.view.View.OnClickListener b;

    public i(android.view.View.OnClickListener onclicklistener)
    {
        b = onclicklistener;
    }

    public final void onClick(View view)
    {
        Object obj = view.getTag(a);
        long l;
        if (obj != null && (obj instanceof Long))
        {
            l = ((Long)obj).longValue();
        } else
        {
            l = 0L;
        }
        obj = Long.valueOf(System.currentTimeMillis());
        if (((Long) (obj)).longValue() > l + 1000L)
        {
            view.setTag(a, obj);
            b.onClick(view);
        }
    }

    static 
    {
        a = r.label_sort_by_time;
    }
}
