// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.networkrecognizer;

import com.google.android.libraries.handwriting.base.StrokeList;
import org.json.JSONObject;

public final class b
{

    final String a;
    final StrokeList b;
    final String c;
    final String d;
    final String e;

    public b(String s, StrokeList strokelist, String s1, String s2)
    {
        a = s;
        b = strokelist;
        c = null;
        e = s1;
        d = s2;
    }

    public b(String s, String s1, String s2, String s3)
    {
        a = s;
        b = null;
        c = s1;
        e = s2;
        d = s3;
    }

    public final JSONObject a(String s)
    {
        JSONObject jsonobject;
        if (c == null)
        {
            jsonobject = b.asJsonObject();
        } else
        {
            jsonobject = new JSONObject();
            jsonobject.put("ink_hash", c);
        }
        jsonobject.put("language", s);
        jsonobject.put("feedback", a);
        if (d != null && d.length() > 0)
        {
            jsonobject.put("debug_info", d);
        }
        jsonobject.put("select_type", e);
        return jsonobject;
    }
}
