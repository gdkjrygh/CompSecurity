// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bc, eu, ba, ex

public final class az
    implements bc
{

    private final ba mS;

    public az(ba ba1)
    {
        mS = ba1;
    }

    public void b(ex ex, Map map)
    {
        ex = (String)map.get("name");
        if (ex == null)
        {
            eu.D("App event with no name parameter.");
            return;
        } else
        {
            mS.onAppEvent(ex, (String)map.get("info"));
            return;
        }
    }
}
