// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cd, gr, cb, gu

public final class ca
    implements cd
{

    private final cb pP;

    public ca(cb cb1)
    {
        pP = cb1;
    }

    public void a(gu gu, Map map)
    {
        gu = (String)map.get("name");
        if (gu == null)
        {
            gr.W("App event with no name parameter.");
            return;
        } else
        {
            pP.onAppEvent(gu, (String)map.get("info"));
            return;
        }
    }
}
