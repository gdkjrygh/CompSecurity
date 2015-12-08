// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.d;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            aq, ap, v, u, 
//            cw

static final class 
    implements aq
{

    public final void a(cw cw1, Map map)
    {
        r r = v.ai;
        if (!((Boolean)d.i().a(r)).booleanValue())
        {
            return;
        }
        boolean flag;
        if (!Boolean.parseBoolean((String)map.get("disabled")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cw1.c(flag);
    }

    ()
    {
    }
}
