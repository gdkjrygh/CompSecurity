// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.u;

final class a
{

    final String a;
    final String b;
    final String c;
    final String d;
    final long e;
    final long f;

    a(String s, String s1, String s2, String s3, long l, long l1)
    {
        u.a(s);
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        u.b(flag);
        a = s;
        b = s1;
        s = s2;
        if (TextUtils.isEmpty(s2))
        {
            s = null;
        }
        c = s;
        d = s3;
        e = l;
        f = l1;
    }
}
