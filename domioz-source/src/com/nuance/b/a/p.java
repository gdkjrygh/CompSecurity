// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.a;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

final class p
{

    String a;
    String b;

    final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.putOpt("regex", a);
            jsonobject.putOpt("replacement", b);
        }
        catch (JSONException jsonexception)
        {
            Log.w("CloudTextFilter", String.format("unable to return filterItem: %s", new Object[] {
                jsonexception.getMessage()
            }));
            return jsonobject;
        }
        return jsonobject;
    }
}
