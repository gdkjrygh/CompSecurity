// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import org.json.JSONArray;
import org.json.JSONObject;

final class 
    implements apq
{

    public final void a(Bundle bundle, String s, Object obj)
    {
        throw new IllegalArgumentException("Unexpected type from JSON");
    }

    public final void a(JSONObject jsonobject, String s, Object obj)
    {
        JSONArray jsonarray = new JSONArray();
        obj = (String[])obj;
        int j = obj.length;
        for (int i = 0; i < j; i++)
        {
            jsonarray.put(obj[i]);
        }

        jsonobject.put(s, jsonarray);
    }

    ()
    {
    }
}
