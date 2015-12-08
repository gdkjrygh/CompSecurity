// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.tinder.utils.v;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.tinder.fragments:
//            a

final class a
    implements com.android.volley._cls1
{

    final String a;
    final a b;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        com.tinder.fragments.a.a(b, ((JSONObject) (obj)));
        if (!((JSONObject) (obj)).has("paging"))
        {
            break MISSING_BLOCK_LABEL_46;
        }
        obj = ((JSONObject) (obj)).getJSONObject("paging").getString("next");
        com.tinder.fragments.a.a(b, a, ((String) (obj)));
        return;
        obj;
        v.b(((JSONException) (obj)).toString());
        return;
    }

    (a a1, String s)
    {
        b = a1;
        a = s;
        super();
    }
}
