// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.parse;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

public final class i
{

    public static List a(JSONArray jsonarray)
    {
        int j = 0;
        if (jsonarray != null)
        {
            ArrayList arraylist = new ArrayList(jsonarray.length());
            for (; j < jsonarray.length(); j++)
            {
                arraylist.add(jsonarray.optString(j));
            }

            return arraylist;
        } else
        {
            return new ArrayList(0);
        }
    }
}
