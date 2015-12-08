// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONArray;

// Referenced classes of package com.taplytics:
//            hf, hd, gt

public final class gy
    implements hf
{

    final hd a;
    final gt b;

    public gy(gt gt, hd hd1)
    {
        b = gt;
        a = hd1;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        if (exception != null)
        {
            a.a(null, exception);
            return;
        }
        if (obj == null)
        {
            a.a(null, null);
            return;
        }
        try
        {
            a.a((JSONArray)obj, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a(null, ((Exception) (obj)));
        }
    }
}
