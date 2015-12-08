// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.Context;
import com.android.volley.VolleyError;
import com.tinder.a.f;
import com.tinder.c.ah;
import com.tinder.e.af;
import com.tinder.e.ag;
import com.tinder.e.b;
import com.tinder.e.c;
import com.tinder.enums.ReportCause;
import com.tinder.enums.StatusCode;
import com.tinder.model.Match;
import com.tinder.utils.v;
import org.json.JSONObject;

public final class ac
{

    public f a;

    public ac(f f)
    {
        a = f;
    }

    public static ah a(Context context, ag ag, Match match)
    {
        return new ah(context, ag, match);
    }

    // Unreferenced inner class com/tinder/managers/ac$1

/* anonymous class */
    public final class _cls1
        implements com.android.volley.i.b
    {

        final af a;
        final String b;
        final ReportCause c;
        final String d;
        final ac e;

        public final void a(Object obj)
        {
            obj = (JSONObject)obj;
            (new StringBuilder("response=")).append(obj);
            if (((JSONObject) (obj)).optString("status").equals("not found"))
            {
                a.f();
                return;
            } else
            {
                a.a(b, c, d);
                return;
            }
        }

            public 
            {
                e = ac.this;
                a = af1;
                b = s;
                c = reportcause;
                d = s1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/ac$2

/* anonymous class */
    public final class _cls2
        implements com.android.volley.i.a
    {

        final af a;
        final ac b;

        public final void a(VolleyError volleyerror)
        {
            v.b(String.valueOf(volleyerror));
            a.f();
        }

            public 
            {
                b = ac.this;
                a = af1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/ac$3

/* anonymous class */
    public final class _cls3
        implements com.android.volley.i.b
    {

        final c a;
        final Match b;
        final Match c;
        final String d;
        final ReportCause e;
        final boolean f;
        final ac g;

        public final void a(Object obj)
        {
            obj = (JSONObject)obj;
            (new StringBuilder("response=")).append(obj);
            a.a(b, c.getId(), d, e, f);
        }

            public 
            {
                g = ac.this;
                a = c1;
                b = match;
                c = match1;
                d = s;
                e = reportcause;
                f = flag;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/ac$4

/* anonymous class */
    public final class _cls4
        implements com.android.volley.i.a
    {

        final c a;
        final Match b;
        final ac c;

        public final void a(VolleyError volleyerror)
        {
            v.b(String.valueOf(volleyerror));
            a.c();
        }

            public 
            {
                c = ac.this;
                a = c1;
                b = match;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/ac$5

/* anonymous class */
    public final class _cls5
        implements com.android.volley.i.b
    {

        final b a;
        final ac b;

        public final void a(Object obj)
        {
            obj = (JSONObject)obj;
            if (StatusCode.OK.getCode() == ((JSONObject) (obj)).optInt("status"))
            {
                a.a();
                return;
            } else
            {
                a.b();
                return;
            }
        }

            public 
            {
                b = ac.this;
                a = b1;
                super();
            }
    }


    // Unreferenced inner class com/tinder/managers/ac$6

/* anonymous class */
    public final class _cls6
        implements com.android.volley.i.a
    {

        final b a;
        final ac b;

        public final void a(VolleyError volleyerror)
        {
            v.b(volleyerror.getMessage());
            a.b();
        }

            public 
            {
                b = ac.this;
                a = b1;
                super();
            }
    }

}
