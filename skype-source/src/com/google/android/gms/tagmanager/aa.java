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

final class aa extends o
{

    private static final String a;
    private static final String b;
    private final Context c;

    public aa(Context context)
    {
        super(a, new String[0]);
        c = context;
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        if ((com.google.android.gms.internal.h.a)map.get(b) != null)
        {
            map = cl.a((com.google.android.gms.internal.h.a)map.get(b));
        } else
        {
            map = null;
        }
        map = ab.a(c, map);
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
        a = e.J.toString();
        b = f.R.toString();
    }
}
