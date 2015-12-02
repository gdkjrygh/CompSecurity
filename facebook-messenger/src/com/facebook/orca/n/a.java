// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.n;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.w.n;
import com.facebook.o;
import com.facebook.orca.notify.ao;
import com.facebook.orca.notify.av;
import com.facebook.selfupdate.ae;

public class a
    implements ae
{

    private final Context a;
    private final av b;

    public a(Context context, av av1)
    {
        a = context;
        b = av1;
    }

    public void a()
    {
        b.a();
    }

    public void a(Intent intent)
    {
        String s = n.a(intent.getStringExtra("app_name"));
        String s1 = n.a(a.getString(o.notify_new_build_title));
        String s2 = n.a(a.getString(o.notify_new_build_text));
        String s3 = n.a(a.getString(o.notify_new_build_ticker));
        intent = new ao(n.a(s1, new Object[] {
            s
        }), s2, n.a(s3, new Object[] {
            s
        }), intent);
        b.a(intent);
    }
}
