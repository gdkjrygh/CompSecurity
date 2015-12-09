// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.service;

import com.fitbit.data.bl.exceptions.JsonException;
import com.fitbit.data.bl.exceptions.NamedException;
import com.fitbit.mixpanel.f;
import org.json.JSONException;

// Referenced classes of package com.fitbit.util.service:
//            b

public abstract class a extends b
{

    public a()
    {
    }

    protected final void a(String s, a a1)
        throws Exception
    {
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
    /* block-local class not found */
    class a {}

        a1.a();
        return;
        a1;
        f.a(new com.fitbit.mixpanel.a(s, a1));
        throw a1;
        a1;
        f.a(new com.fitbit.mixpanel.a(s, new JsonException(a1)));
        throw a1;
        a1;
        f.a(new com.fitbit.mixpanel.a(s, new NamedException(a1)));
        throw a1;
    }
}
