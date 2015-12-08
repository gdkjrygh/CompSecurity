// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.json.JSONException;
import org.json.JSONObject;

public class cgg
{

    private final String a;
    final ckw s;

    public cgg(ckw ckw1)
    {
        this(ckw1, "");
    }

    public cgg(ckw ckw1, String s1)
    {
        s = ckw1;
        a = s1;
    }

    public final void a(int i, int j, int k, int l, float f, int i1)
    {
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("width", i).put("height", j).put("maxSizeWidth", k).put("maxSizeHeight", l).put("density", f).put("rotation", i1);
            s.a("onScreenInfoChanged", jsonobject);
            return;
        }
        catch (JSONException jsonexception)
        {
            bka.b("Error occured while obtaining screen information.", jsonexception);
        }
    }

    public final void a(String s1)
    {
        try
        {
            s1 = (new JSONObject()).put("message", s1).put("action", a);
            s.a("onError", s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            bka.b("Error occurred while dispatching error event.", s1);
        }
    }

    public final void b(String s1)
    {
        try
        {
            s1 = (new JSONObject()).put("state", s1);
            s.a("onStateChanged", s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            bka.b("Error occured while dispatching state change.", s1);
        }
    }
}
