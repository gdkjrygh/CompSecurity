// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            BundleJSONConverter

final class tter
    implements tter
{

    public void setOnBundle(Bundle bundle, String s, Object obj)
    {
        obj = (JSONArray)obj;
        ArrayList arraylist = new ArrayList();
        if (((JSONArray) (obj)).length() == 0)
        {
            bundle.putStringArrayList(s, arraylist);
            return;
        }
        for (int i = 0; i < ((JSONArray) (obj)).length();)
        {
            Object obj1 = ((JSONArray) (obj)).get(i);
            if (obj1 instanceof String)
            {
                arraylist.add((String)obj1);
                i++;
            } else
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unexpected type in an array: ").append(obj1.getClass()).toString());
            }
        }

        bundle.putStringArrayList(s, arraylist);
    }

    public void setOnJSON(JSONObject jsonobject, String s, Object obj)
    {
        throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
    }

    tter()
    {
    }
}
