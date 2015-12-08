// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.d.a;

import com.nuance.dragon.toolkit.d.e;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends JSONObject
{

    public a()
    {
    }

    public final boolean a(String s, com.nuance.dragon.toolkit.d.a a1)
    {
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        put(s, a1.c());
        return true;
        s;
        e.d(this, "Error adding to JSON");
        return false;
    }

    public final boolean a(String s, Object obj)
    {
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        put(s, obj);
        return true;
        s;
        e.d(this, "Error adding to JSON");
        return false;
    }
}
