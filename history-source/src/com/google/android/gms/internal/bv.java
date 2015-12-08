// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            u, ah, gr

public class bv
{
    public static interface a
    {

        public abstract void a(bv bv1);
    }


    private u pM;
    private ah pN;
    private JSONObject pO;

    public bv(u u1, ah ah1, JSONObject jsonobject)
    {
        pM = u1;
        pN = ah1;
        pO = jsonobject;
    }

    public void aw()
    {
        pM.an();
    }

    public void b(String s, int i)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("asset", i);
            jsonobject.put("template", s);
            s = new JSONObject();
            s.put("ad", pO);
            s.put("click", jsonobject);
            pN.a("google.afma.nativeAds.handleClick", s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            gr.b("Unable to create click JSON.", s);
        }
    }
}
