// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.domain:
//            k

public class l
{

    public l()
    {
    }

    public static List a(JSONArray jsonarray, k k1)
        throws JSONException
    {
        return a(jsonarray, k1, ((List) (new ArrayList(jsonarray.length()))));
    }

    public static List a(JSONArray jsonarray, k k1, List list)
        throws JSONException
    {
        int i = 0;
        for (int j = jsonarray.length(); i < j; i++)
        {
            list.add(k1.a(jsonarray.getJSONObject(i)));
        }

        return list;
    }
}
