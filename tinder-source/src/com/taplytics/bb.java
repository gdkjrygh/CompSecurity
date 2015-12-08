// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import org.json.JSONArray;
import org.json.JSONException;

public final class bb extends JSONArray
{

    public bb()
    {
    }

    public bb(JSONArray jsonarray)
        throws JSONException
    {
        super(jsonarray.toString());
    }

    public final bb a(int i)
        throws JSONException
    {
        bb bb1 = new bb();
        for (int j = 0; j < length(); j++)
        {
            if (j != i)
            {
                bb1.put(opt(j));
            }
        }

        return bb1;
    }
}
