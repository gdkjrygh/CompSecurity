// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.d.c;
import org.json.JSONException;
import org.json.JSONObject;

public final class bx
    implements c
{

    private final String a;
    private final String b;

    public bx(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public final Object a()
    {
        return b();
    }

    public final JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("serial", a);
            jsonobject.put("android_id", b);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }
}
