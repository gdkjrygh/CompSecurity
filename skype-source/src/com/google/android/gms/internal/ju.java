// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.analytics.c;
import com.google.android.gms.analytics.g;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.tagmanager.a;

// Referenced classes of package com.google.android.gms.internal:
//            jv, jg, jn

final class ju
{
    static final class a
        implements jg.a
    {

        private final g a;

        public final void a(jn jn1)
        {
            a.a(jn1.a());
            com.google.android.gms.analytics.d.e e = new com.google.android.gms.analytics.d.e();
            e.a("&a", String.valueOf(jn1.b()));
            a.a(e.a());
        }

        public final void a(jn jn1, Activity activity)
        {
        }

        a(g g1)
        {
            a = g1;
        }
    }


    private final jv a;
    private final Context b;

    public ju(Context context, com.google.android.gms.tagmanager.a a1, jv jv1)
    {
        b = context;
        context = jv1;
        if (a1 != null)
        {
            boolean flag;
            if (a1.b() == 0L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                context = jv1;
            } else
            {
                context = new jv.a(jv1.a());
                context.a(a1.b("trackingId")).a(a1.a("trackScreenViews")).b(a1.a("collectAdIdentifiers"));
                context = context.a();
            }
        }
        a = context;
        if (a.b() && !TextUtils.isEmpty(a.d()))
        {
            context = a.d();
            context = c.a(b).a(context);
            context.a(a.c());
            context = new a(context);
            y.a(context);
            a1 = com.google.android.gms.internal.jg.a(b);
            a1.b();
            a1.a(context);
        }
    }

    public final jv a()
    {
        return a;
    }
}
