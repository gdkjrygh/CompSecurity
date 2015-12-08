// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.ar;
import com.tinder.utils.v;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            d

public final class a
    implements com.android.volley.
{

    final ar a;
    final d b;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        (new StringBuilder("response=")).append(obj);
        try
        {
            a.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.b(((Exception) (obj)).toString());
        }
        a.b();
    }

    public (d d1, ar ar1)
    {
        b = d1;
        a = ar1;
        super();
    }
}
