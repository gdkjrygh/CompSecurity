// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bc, bb, ex, eu, 
//            cf

static final class 
    implements bc
{

    public void b(ex ex1, Map map)
    {
        ex1 = ex1.ca();
        if (ex1 == null)
        {
            eu.D("A GMSG tried to use a custom close button on something that wasn't an overlay.");
            return;
        } else
        {
            ex1.j("1".equals(map.get("custom_close")));
            return;
        }
    }

    ()
    {
    }
}
