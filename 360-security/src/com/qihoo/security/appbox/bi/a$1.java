// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.bi;

import android.content.Context;
import com.qihoo.security.g.b;
import com.qihoo.security.service.d;
import com.qihoo360.mobilesafe.b.o;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.appbox.bi:
//            a

static final class c
    implements com.qihoo.security.g..bi.a._cls1
{

    final Context a;
    final b b;
    final long c;

    public void a()
    {
    }

    public void a(int i)
    {
        com.qihoo.security.appbox.bi.a.a(false);
        String s = o.a();
        if (s != null && !s.equals(a.getPackageName()))
        {
            d.b(com.qihoo.security.appbox.bi.a.c(), Integer.valueOf(b.hashCode()));
        }
        if (i == 0)
        {
            SharedPref.a(a, "last_appbox_report_time", System.currentTimeMillis());
            com.qihoo.security.appbox.bi.a.a(a);
        }
    }

    redPref(Context context, b b1, long l)
    {
        a = context;
        b = b1;
        c = l;
        super();
    }
}
