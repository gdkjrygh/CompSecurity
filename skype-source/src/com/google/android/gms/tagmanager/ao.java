// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.e;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl

final class ao extends o
{

    private static final String a;
    private final Context b;

    public ao(Context context)
    {
        super(a, new String[0]);
        b = context;
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        map = android.provider.Settings.Secure.getString(b.getContentResolver(), "android_id");
        if (map == null)
        {
            return cl.f();
        } else
        {
            return cl.a(map);
        }
    }

    public final boolean a()
    {
        return true;
    }

    static 
    {
        a = e.L.toString();
    }
}
