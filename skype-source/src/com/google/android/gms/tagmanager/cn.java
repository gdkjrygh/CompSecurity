// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl

final class cn extends o
{

    private static final String a;
    private static final String b;

    public cn()
    {
        super(a, new String[] {
            b
        });
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        return cl.a(cl.a((com.google.android.gms.internal.h.a)map.get(b)).toUpperCase());
    }

    public final boolean a()
    {
        return true;
    }

    static 
    {
        a = e.P.toString();
        b = f.p.toString();
    }
}
