// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.tinder.e.h;
import com.tinder.parse.e;
import com.tinder.utils.v;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            i

final class a
    implements com.android.volley.
{

    final h a;
    final i b;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        (new StringBuilder("response=")).append(obj);
        obj = e.a(((JSONObject) (obj)).getJSONObject("results"), i.l());
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        try
        {
            throw new JSONException("Unknown error parsing match");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        finally
        {
            i.g(b);
        }
        v.a("Failed to parse match", ((Throwable) (obj)));
        a.a();
        i.g(b);
        return;
        a.a(((com.tinder.model.Match) (obj)));
        i.g(b);
        return;
        throw obj;
    }

    (i j, h h1)
    {
        b = j;
        a = h1;
        super();
    }
}
