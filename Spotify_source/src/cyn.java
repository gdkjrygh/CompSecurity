// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.json.JSONObject;

public final class cyn
{

    public static String a(JSONObject jsonobject, String s)
    {
        if (jsonobject.has(s) && !jsonobject.isNull(s))
        {
            return jsonobject.getString(s);
        } else
        {
            return null;
        }
    }
}
