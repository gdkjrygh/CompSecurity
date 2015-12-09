// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.internal.am;
import com.google.android.gms.internal.cc;
import com.google.android.gms.internal.cd;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.jg;

// Referenced classes of package com.google.android.gms.location:
//            f, i

public class l
{
    public static abstract class a extends com.google.android.gms.common.api.b.c
    {

        public a(h h1)
        {
            super(com.google.android.gms.location.l.a(), h1);
        }
    }


    public static final com.google.android.gms.common.api.a a;
    public static f b = new cc();
    public static i c = new cd();
    private static final com.google.android.gms.common.api.a.d d;
    private static final com.google.android.gms.common.api.a.c e;

    private l()
    {
    }

    static com.google.android.gms.common.api.a.d a()
    {
        return d;
    }

    public static ch a(h h1)
    {
        boolean flag1 = true;
        boolean flag;
        if (h1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        am.b(flag, "GoogleApiClient parameter is required.");
        h1 = (ch)h1.a(d);
        if (h1 != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        am.a(flag, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
        return h1;
    }

    static 
    {
        d = new com.google.android.gms.common.api.a.d();
        e = new com.google.android.gms.common.api.a.c() {

            public int a()
            {
                return 0x7fffffff;
            }

            public com.google.android.gms.common.api.a.b a(Context context, Looper looper, jg jg1, Object obj, com.google.android.gms.common.api.h.b b1, com.google.android.gms.common.api.h.c c1)
            {
                return a(context, looper, jg1, (com.google.android.gms.common.api.a.a.b)obj, b1, c1);
            }

            public ch a(Context context, Looper looper, jg jg1, com.google.android.gms.common.api.a.a.b b1, com.google.android.gms.common.api.h.b b2, com.google.android.gms.common.api.h.c c1)
            {
                return new ch(context, looper, context.getPackageName(), b2, c1, "locationServices", jg1.a());
            }

        };
        a = new com.google.android.gms.common.api.a(e, d, new Scope[0]);
    }
}
