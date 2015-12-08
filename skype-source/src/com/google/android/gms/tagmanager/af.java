// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.e;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl

public final class af extends o
{

    private static final String a;

    public af()
    {
        super(a, new String[0]);
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        map = Locale.getDefault();
        if (map == null)
        {
            return cl.f();
        }
        map = map.getLanguage();
        if (map == null)
        {
            return cl.f();
        } else
        {
            return cl.a(map.toLowerCase());
        }
    }

    public final boolean a()
    {
        return false;
    }

    public final volatile String b()
    {
        return super.b();
    }

    public final volatile Set c()
    {
        return super.c();
    }

    static 
    {
        a = e.t.toString();
    }
}
