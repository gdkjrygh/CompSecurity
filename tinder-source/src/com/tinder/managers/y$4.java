// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import com.google.android.m4b.maps.model.j;
import com.tinder.e.o;
import com.tinder.model.TinderLocation;
import com.tinder.parse.h;
import com.tinder.utils.v;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            y

final class b
    implements com.android.volley.
{

    final o a;
    final j b;
    final y c;

    public final void a(Object obj)
    {
        obj = (JSONObject)obj;
        ((JSONObject) (obj)).toString();
        try
        {
            obj = ((JSONObject) (obj)).optJSONArray("results");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            v.b(((Exception) (obj)).toString());
            a.d(b);
            return;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        if (((JSONArray) (obj)).length() != 0)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        obj = new TinderLocation();
_L2:
        a.a(((TinderLocation) (obj)), b);
        return;
        obj = h.b(((JSONArray) (obj)).getJSONObject(0));
        if (true) goto _L2; else goto _L1
_L1:
    }

    aps.model.j(y y1, o o1, j j)
    {
        c = y1;
        a = o1;
        b = j;
        super();
    }
}
