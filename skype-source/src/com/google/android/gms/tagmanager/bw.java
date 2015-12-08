// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.e;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl

final class bw extends o
{

    private static final String a;

    public bw()
    {
        super(a, new String[0]);
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        return cl.a(Integer.valueOf(android.os.Build.VERSION.SDK_INT));
    }

    public final boolean a()
    {
        return true;
    }

    static 
    {
        a = e.A.toString();
    }
}
