// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bg, fj, fl

final class bf
    implements bg
{

    bf()
    {
    }

    public final void a(fl fl, Map map)
    {
        fl = (String)map.get("tx");
        String s = (String)map.get("ty");
        map = (String)map.get("td");
        try
        {
            Integer.parseInt(fl);
            Integer.parseInt(s);
            Integer.parseInt(map);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (fl fl)
        {
            fj.e("Could not parse touch parameters from gmsg.");
        }
    }
}
