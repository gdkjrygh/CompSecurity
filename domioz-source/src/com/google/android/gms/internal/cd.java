// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fj, a, eu, fl

public final class cd
{

    private final fl a;
    private final boolean b;
    private final String c;

    public cd(fl fl1, Map map)
    {
        a = fl1;
        c = (String)map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange"))
        {
            b = Boolean.parseBoolean((String)map.get("allowOrientationChange"));
            return;
        } else
        {
            b = true;
            return;
        }
    }

    public final void a()
    {
        if (a == null)
        {
            fj.e("AdWebView is null");
            return;
        }
        int i;
        if ("portrait".equalsIgnoreCase(c))
        {
            i = com.google.android.gms.internal.a.e().b();
        } else
        if ("landscape".equalsIgnoreCase(c))
        {
            i = com.google.android.gms.internal.a.e().a();
        } else
        if (b)
        {
            i = -1;
        } else
        {
            i = com.google.android.gms.internal.a.e().c();
        }
        a.b(i);
    }
}
