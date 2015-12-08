// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.viewcrawler;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mixpanel.android.mpmetrics.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

class com.mixpanel.android.viewcrawler.b
    implements l.h
{
    private final class a
        implements Runnable
    {

        final com.mixpanel.android.viewcrawler.b a;

        public void run()
        {
            long l = System.currentTimeMillis();
            Map map = com.mixpanel.android.viewcrawler.b.a(a);
            map;
            JVM INSTR monitorenter ;
            Iterator iterator = com.mixpanel.android.viewcrawler.b.a(a).entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                c c1 = (c)((java.util.Map.Entry)iterator.next()).getValue();
                if (l - c1.a > 1000L)
                {
                    com.mixpanel.android.viewcrawler.b.b(a).a(c1.b, c1.c);
                    iterator.remove();
                }
            } while (true);
            break MISSING_BLOCK_LABEL_106;
            Exception exception;
            exception;
            map;
            JVM INSTR monitorexit ;
            throw exception;
            if (!com.mixpanel.android.viewcrawler.b.a(a).isEmpty())
            {
                com.mixpanel.android.viewcrawler.b.c(a).postDelayed(this, 500L);
            }
            map;
            JVM INSTR monitorexit ;
        }

        private a()
        {
            a = com.mixpanel.android.viewcrawler.b.this;
            super();
        }

    }

    private static class b
    {

        private final int a;

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof b)
            {
                flag = flag1;
                if (a == obj.hashCode())
                {
                    flag = true;
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return a;
        }

        public b(View view, String s)
        {
            a = view.hashCode() ^ s.hashCode();
        }
    }

    private static class c
    {

        public final long a;
        public final String b;
        public final JSONObject c;

        public c(String s, JSONObject jsonobject, long l)
        {
            b = s;
            c = jsonobject;
            a = l;
        }
    }


    private static final int e = 128;
    private static final int f = 1000;
    private static String g = "MixpanelAPI.DynamicEventTracker";
    private final h a;
    private final Handler b;
    private final Runnable c = new a();
    private final Map d = new HashMap();

    public com.mixpanel.android.viewcrawler.b(h h1, Handler handler)
    {
        a = h1;
        b = handler;
    }

    private static String a(View view)
    {
        Object obj = null;
        String s;
        if (view instanceof TextView)
        {
            view = ((TextView)view).getText();
            s = obj;
            if (view != null)
            {
                s = view.toString();
            }
        } else
        {
            s = obj;
            if (view instanceof ViewGroup)
            {
                StringBuilder stringbuilder = new StringBuilder();
                view = (ViewGroup)view;
                int j = view.getChildCount();
                int i = 0;
                boolean flag;
                boolean flag1;
                for (flag = false; i < j && stringbuilder.length() < 128; flag = flag1)
                {
                    s = a(view.getChildAt(i));
                    flag1 = flag;
                    if (s != null)
                    {
                        flag1 = flag;
                        if (s.length() > 0)
                        {
                            if (flag)
                            {
                                stringbuilder.append(", ");
                            }
                            stringbuilder.append(s);
                            flag1 = true;
                        }
                    }
                    i++;
                }

                if (stringbuilder.length() > 128)
                {
                    return stringbuilder.substring(0, 128);
                }
                s = obj;
                if (flag)
                {
                    return stringbuilder.toString();
                }
            }
        }
        return s;
    }

    static Map a(com.mixpanel.android.viewcrawler.b b1)
    {
        return b1.d;
    }

    static h b(com.mixpanel.android.viewcrawler.b b1)
    {
        return b1.a;
    }

    static Handler c(com.mixpanel.android.viewcrawler.b b1)
    {
        return b1.b;
    }

    public void a(View view, String s, boolean flag)
    {
        Object obj;
        long l = System.currentTimeMillis();
        obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("$text", a(view));
            ((JSONObject) (obj)).put("$from_binding", true);
            ((JSONObject) (obj)).put("time", l / 1000L);
        }
        catch (JSONException jsonexception)
        {
            Log.e(g, "Can't format properties from view due to JSON issue", jsonexception);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        view = new b(view, s);
        obj = new c(s, ((JSONObject) (obj)), l);
        s = d;
        s;
        JVM INSTR monitorenter ;
        flag = d.isEmpty();
        d.put(view, obj);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        b.postDelayed(c, 1000L);
        s;
        JVM INSTR monitorexit ;
        return;
        view;
        s;
        JVM INSTR monitorexit ;
        throw view;
        a.a(s, ((JSONObject) (obj)));
        return;
    }

}
