// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            u, ah, gs

public class bq
{
    public static interface a
    {

        public abstract void a(bq bq1);
    }


    private u pw;
    private ah px;
    private JSONObject py;

    public bq(u u1, ah ah1, JSONObject jsonobject)
    {
        pw = u1;
        px = ah1;
        py = jsonobject;
    }

    public void as()
    {
        pw.aj();
    }

    public void b(String s, int i)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("asset", i);
            jsonobject.put("template", s);
            s = new JSONObject();
            s.put("ad", py);
            s.put("click", jsonobject);
            px.a("google.afma.nativeAds.handleClick", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gs.b("Unable to create click JSON.", s);
        }
    }
}
