// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.c;

import android.content.Context;
import kik.a.d.j;
import kik.a.e.v;
import kik.a.z;
import kik.android.chat.KikApplication;
import kik.android.util.cq;

// Referenced classes of package com.kik.c:
//            d

public final class a
    implements d
{

    final Context a;
    final v b;
    private String c;

    public a(Context context, v v)
    {
        c = null;
        a = context;
        b = v;
    }

    public final String a()
    {
        return KikApplication.b();
    }

    public final String b()
    {
        if (c != null)
        {
            return c;
        }
        String s;
        s = android.provider.Settings.Secure.getString(a.getContentResolver(), "android_id");
        if (cq.c(s))
        {
            break MISSING_BLOCK_LABEL_40;
        }
        c = s;
        return s;
        Throwable throwable;
        throwable;
        return null;
    }

    public final String c()
    {
        return KikApplication.c();
    }

    public final j d()
    {
        Object obj = z.b(b);
        if (obj != null)
        {
            obj = ((z) (obj)).a();
            if (obj != null)
            {
                return ((j) (obj));
            }
        }
        return null;
    }
}
