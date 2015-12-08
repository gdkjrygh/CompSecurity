// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android;

import com.kik.c.b;
import com.mixpanel.android.mpmetrics.v;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.kik.android:
//            a

private final class <init> extends <init>
{

    final a a;

    public final void b()
    {
        com.kik.android.a.e();
        (new StringBuilder("Event ")).append(toString());
        com.kik.android.a.a(a).remove((new StringBuilder()).append(d()).append(e()).toString());
        if (com.kik.android.a.b(a))
        {
            com.kik.android.a.c(a).add(this);
        } else
        {
            com.kik.android.a.d(a).a(d(), f());
            com.kik.android.a.d(a).a();
        }
        if (c)
        {
            com.kik.android.a.f(a).a(this, com.kik.android.a.e(a));
        }
    }

    protected .mpmetrics.v(a a1, String s, String s1)
    {
        a = a1;
        super(a1, s, s1);
    }
}
