// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.b.a;

import com.roidapp.cloudlib.sns.b.v;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public class g extends ArrayList
    implements v
{

    public g()
    {
    }

    public final void a(JSONObject jsonobject, boolean flag)
    {
        jsonobject = jsonobject.optJSONArray("data");
        if (jsonobject != null && jsonobject.length() > 0)
        {
            for (int i = 0; i < jsonobject.length(); i++)
            {
                add(jsonobject.optString(i));
            }

        }
    }
}
