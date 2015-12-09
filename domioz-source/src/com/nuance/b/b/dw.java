// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b;

import com.nuance.b.a.ae;
import org.json.JSONObject;

// Referenced classes of package com.nuance.b.b:
//            a, v

public final class dw extends a
{

    private final boolean b;

    public dw(String s, ae ae1)
    {
        super(s);
        if (ae1 == null)
        {
            throw new IllegalArgumentException("ResetCommand: null dialogModel not allowed");
        }
        if (ae1.b(s) != null)
        {
            b = true;
            return;
        }
        if (ae1.a(s) != null)
        {
            b = false;
            return;
        } else
        {
            throw new IllegalArgumentException(String.format("ResetCommand: specified node [%s] not in dialogModel", new Object[] {
                s
            }));
        }
    }

    final JSONObject a()
    {
        return v.a(super.a, b);
    }
}
