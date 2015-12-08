// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            hf, hg, gt

public final class ha
    implements hf
{

    final hg a;
    final gt b;

    public ha(gt gt, hg hg1)
    {
        b = gt;
        a = hg1;
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
            a.a((JSONObject)obj, null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a(null, ((Exception) (obj)));
        }
    }
}
