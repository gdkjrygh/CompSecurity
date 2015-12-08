// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.stickers;

import java.net.MalformedURLException;
import java.net.URL;
import kik.a.d.w;
import org.json.JSONObject;

public final class a
{

    public static w a(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return null;
        }
        String s = jsonobject.optString("icon");
        String s1 = jsonobject.optString("pngPreview");
        jsonobject = jsonobject.optString("compatPreview");
        try
        {
            new URL(s);
            new URL(s1);
            new URL(jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return new w(s, s1, jsonobject);
    }
}
