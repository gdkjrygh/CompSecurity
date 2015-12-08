// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.p;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            ay, ax, io, fs

public final class ft
{
    private final class a
    {

        public final long a = p.i().a();
        public final fs b;
        final ft c;

        public a(fs fs)
        {
            c = ft.this;
            super();
            b = fs;
        }
    }


    private WeakHashMap a;

    public ft()
    {
        a = new WeakHashMap();
    }

    public final fs a(Context context)
    {
        Object obj = (a)a.get(context);
        if (obj == null) goto _L2; else goto _L1
_L1:
        long l = ((a) (obj)).a;
        au au = ay.ad;
        boolean flag;
        if (l + ((Long)p.n().a(au)).longValue() < p.i().a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L3
_L3:
        au = ay.ac;
        if (!((Boolean)p.n().a(au)).booleanValue()) goto _L2; else goto _L4
_L4:
        obj = (new fs.a(context, ((a) (obj)).b)).a();
_L6:
        a.put(context, new a(((fs) (obj))));
        return ((fs) (obj));
_L2:
        obj = (new fs.a(context)).a();
        if (true) goto _L6; else goto _L5
_L5:
    }
}
