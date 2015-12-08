// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cd, cc, gu, k, 
//            g, gr

static final class 
    implements cd
{

    public void a(gu gu1, Map map)
    {
        String s = (String)map.get("tx");
        String s1 = (String)map.get("ty");
        map = (String)map.get("td");
        int i;
        int j;
        int l;
        try
        {
            i = Integer.parseInt(s);
            j = Integer.parseInt(s1);
            l = Integer.parseInt(map);
            gu1 = gu1.dF();
        }
        // Misplaced declaration of an exception variable
        catch (gu gu1)
        {
            gr.W("Could not parse touch parameters from gmsg.");
            return;
        }
        if (gu1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        gu1.C().a(i, j, l);
    }

    ()
    {
    }
}
