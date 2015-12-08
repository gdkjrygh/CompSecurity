// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONObject;

// Referenced classes of package com.taplytics:
//            hf, he, bd, gt

public final class gv
    implements hf
{

    final he a;
    final gt b;

    public gv(gt gt, he he1)
    {
        b = gt;
        a = he1;
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
            obj = (JSONObject)obj;
            if (((JSONObject) (obj)).has("sid"))
            {
                ((JSONObject) (obj)).remove("sid");
            }
            obj = new bd(((JSONObject) (obj)));
            a.a(((bd) (obj)), null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.a(null, ((Exception) (obj)));
        }
    }
}
