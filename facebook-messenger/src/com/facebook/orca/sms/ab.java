// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.sms;

import android.content.ContentResolver;
import android.content.Context;
import android_src.c.j;
import android_src.mms.g.d;
import android_src.mms.g.l;
import com.facebook.base.c;
import com.facebook.inject.t;
import com.facebook.orca.sms.a.b;

public class ab
    implements c
{

    private final Context a;

    public ab(Context context)
    {
        a = context;
    }

    public void a()
    {
        l.a(a);
        d.a(a);
        android_src.mms.transaction.d.a(a);
        android_src.mms.c.a(a);
        Object obj = t.a(a);
        com.facebook.orca.sms.a.c c1 = (com.facebook.orca.sms.a.c)((t) (obj)).a(com/facebook/orca/sms/a/c);
        a.getContentResolver().registerContentObserver(android_src.c.l.a, true, c1);
        obj = (b)((t) (obj)).a(com/facebook/orca/sms/a/b);
        a.getContentResolver().registerContentObserver(j.a, true, ((android.database.ContentObserver) (obj)));
    }
}
