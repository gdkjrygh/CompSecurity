// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result;

import android.content.Context;
import com.qihoo.security.c.b.a;

public class g
{

    public static String a(Context context)
    {
        context = com.qihoo.security.c.b.a.a(context);
        long l = context[0];
        long l1 = context[1];
        if (l != 0L)
        {
            return (new StringBuilder()).append(((l - l1) * 100L) / l).append("%").toString();
        } else
        {
            return "0%";
        }
    }
}
