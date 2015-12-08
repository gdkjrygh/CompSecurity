// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bg, fj, av, fl

public final class au
    implements bg
{

    private final av a;

    public au(av av)
    {
        a = av;
    }

    public final void a(fl fl, Map map)
    {
        if ((String)map.get("name") == null)
        {
            fj.e("App event with no name parameter.");
            return;
        } else
        {
            map.get("info");
            return;
        }
    }
}
