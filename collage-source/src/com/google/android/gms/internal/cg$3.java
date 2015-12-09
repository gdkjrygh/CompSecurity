// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ch, cg, ay, au, 
//            hs

static final class 
    implements ch
{

    public void zza(hs hs1, Map map)
    {
        if (!((Boolean)ay.ai.c()).booleanValue())
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
        hs1.c(flag);
    }

    ()
    {
    }
}
