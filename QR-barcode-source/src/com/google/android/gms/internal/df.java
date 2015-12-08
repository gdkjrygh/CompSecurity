// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gs

public class df
{
    public static final class a
    {

        private boolean rb;
        private boolean rc;
        private boolean rd;
        private boolean re;
        private boolean rf;

        static boolean a(a a1)
        {
            return a1.rb;
        }

        static boolean b(a a1)
        {
            return a1.rc;
        }

        static boolean c(a a1)
        {
            return a1.rd;
        }

        static boolean d(a a1)
        {
            return a1.re;
        }

        static boolean e(a a1)
        {
            return a1.rf;
        }

        public df bL()
        {
            return new df(this);
        }

        public a i(boolean flag)
        {
            rb = flag;
            return this;
        }

        public a j(boolean flag)
        {
            rc = flag;
            return this;
        }

        public a k(boolean flag)
        {
            rd = flag;
            return this;
        }

        public a l(boolean flag)
        {
            re = flag;
            return this;
        }

        public a m(boolean flag)
        {
            rf = flag;
            return this;
        }

        public a()
        {
        }
    }


    private final boolean rb;
    private final boolean rc;
    private final boolean rd;
    private final boolean re;
    private final boolean rf;

    private df(a a1)
    {
        rb = a.a(a1);
        rc = a.b(a1);
        rd = a.c(a1);
        re = a.d(a1);
        rf = a.e(a1);
    }


    public JSONObject bK()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = (new JSONObject()).put("sms", rb).put("tel", rc).put("calendar", rd).put("storePicture", re).put("inlineVideo", rf);
        }
        catch (JSONException jsonexception)
        {
            gs.b("Error occured while obtaining the MRAID capabilities.", jsonexception);
            return null;
        }
        return jsonobject;
    }
}
