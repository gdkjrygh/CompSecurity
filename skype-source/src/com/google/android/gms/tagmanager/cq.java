// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl, ab

final class cq extends o
{

    private static final String a;
    private static final String b;
    private static final String c;
    private final Context d;

    public cq(Context context)
    {
        super(a, new String[] {
            c
        });
        d = context;
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        Object obj = (com.google.android.gms.internal.h.a)map.get(c);
        if (obj == null)
        {
            return com.google.android.gms.tagmanager.cl.f();
        }
        obj = cl.a(((com.google.android.gms.internal.h.a) (obj)));
        map = (com.google.android.gms.internal.h.a)map.get(b);
        if (map != null)
        {
            map = cl.a(map);
        } else
        {
            map = null;
        }
        map = ab.a(d, ((String) (obj)), map);
        if (map != null)
        {
            return cl.a(map);
        } else
        {
            return com.google.android.gms.tagmanager.cl.f();
        }
    }

    public final boolean a()
    {
        return true;
    }

    static 
    {
        a = e.E.toString();
        b = f.R.toString();
        c = f.U.toString();
    }
}
