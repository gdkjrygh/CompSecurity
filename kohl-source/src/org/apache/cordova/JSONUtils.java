// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

public class JSONUtils
{

    public JSONUtils()
    {
    }

    public static List toStringList(JSONArray jsonarray)
        throws JSONException
    {
        if (jsonarray != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList();
        int i = 0;
        do
        {
            obj = arraylist;
            if (i >= jsonarray.length())
            {
                continue;
            }
            arraylist.add(jsonarray.get(i).toString());
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
