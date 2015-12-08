// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.picker;

import com.kik.cards.web.plugin.j;
import com.kik.g.r;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.picker:
//            PickerPlugin

final class a extends r
{

    final com.kik.cards.web.plugin.a a;
    final PickerPlugin b;

    a(PickerPlugin pickerplugin, com.kik.cards.web.plugin.a a1)
    {
        b = pickerplugin;
        a = a1;
        super();
    }

    public final void a(Object obj)
    {
        JSONObject jsonobject = (JSONObject)obj;
        super.a(jsonobject);
        obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("responseData", jsonobject);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
        }
        a.a(new j(((JSONObject) (obj))));
    }

    public final void a(Throwable throwable)
    {
        super.a(throwable);
        a.a(new j());
    }
}
