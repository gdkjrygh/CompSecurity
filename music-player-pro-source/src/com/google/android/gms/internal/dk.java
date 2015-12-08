// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            gr

public class dk
{
    public static final class a
    {

        private boolean rs;
        private boolean rt;
        private boolean ru;
        private boolean rv;
        private boolean rw;

        static boolean a(a a1)
        {
            return a1.rs;
        }

        static boolean b(a a1)
        {
            return a1.rt;
        }

        static boolean c(a a1)
        {
            return a1.ru;
        }

        static boolean d(a a1)
        {
            return a1.rv;
        }

        static boolean e(a a1)
        {
            return a1.rw;
        }

        public dk bU()
        {
            return new dk(this);
        }

        public a k(boolean flag)
        {
            rs = flag;
            return this;
        }

        public a l(boolean flag)
        {
            rt = flag;
            return this;
        }

        public a m(boolean flag)
        {
            ru = flag;
            return this;
        }

        public a n(boolean flag)
        {
            rv = flag;
            return this;
        }

        public a o(boolean flag)
        {
            rw = flag;
            return this;
        }

        public a()
        {
        }
    }


    private final boolean rs;
    private final boolean rt;
    private final boolean ru;
    private final boolean rv;
    private final boolean rw;

    private dk(a a1)
    {
        rs = a.a(a1);
        rt = a.b(a1);
        ru = a.c(a1);
        rv = a.d(a1);
        rw = a.e(a1);
    }


    public JSONObject toJson()
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = (new JSONObject()).put("sms", rs).put("tel", rt).put("calendar", ru).put("storePicture", rv).put("inlineVideo", rw);
        }
        catch (JSONException jsonexception)
        {
            gr.b("Error occured while obtaining the MRAID capabilities.", jsonexception);
            return null;
        }
        return jsonobject;
    }
}
