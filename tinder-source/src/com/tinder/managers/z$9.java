// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.aq;
import com.tinder.utils.v;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            z

final class a
    implements com.android.volley.
{

    final aq a;
    final z b;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        (new StringBuilder("Updated profile: ")).append(obj);
        try
        {
            b.a(true, ((JSONObject) (obj)));
            a.u();
            b.a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.b((new StringBuilder("Error updating profile: ")).append(obj).toString());
        }
        a.v();
    }

    (z z1, aq aq1)
    {
        b = z1;
        a = aq1;
        super();
    }
}
