// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.parse.h;
import com.tinder.utils.v;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            y

final class a
    implements com.android.volley.
{

    final y a;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        try
        {
            y.a(h.a(((JSONObject) (obj))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.b(((JSONException) (obj)).toString());
        }
    }

    (y y1)
    {
        a = y1;
        super();
    }
}
