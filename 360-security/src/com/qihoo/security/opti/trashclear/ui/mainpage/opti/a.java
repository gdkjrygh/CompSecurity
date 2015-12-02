// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.ui.mainpage.opti;

import android.content.Context;
import android.text.TextUtils;
import com.android.core.AsyncTask;
import com.qihoo.security.SecurityApplication;
import com.qihoo360.mobilesafe.b.i;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class com.qihoo.security.opti.trashclear.ui.mainpage.opti.a
{
    public static interface a
    {

        public abstract void a(String s, String s1);
    }

    private class b extends AsyncTask
    {

        final com.qihoo.security.opti.trashclear.ui.mainpage.opti.a c;
        private final String d;
        private final String e;
        private final a f;
        private final HashMap g = new HashMap();

        protected volatile Object a(Object aobj[])
        {
            return a((String[])aobj);
        }

        protected transient Void a(String as[])
        {
            if (i.a(com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a(c), d))
            {
                as = i.b(com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a(c), d);
            } else
            {
                as = i.d(com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a(c), e);
            }
            com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.b(c).put(d, new SoftReference(as));
            d(new String[] {
                as
            });
            return null;
        }

        protected void a()
        {
            super.a();
        }

        public void a(a a1, String s)
        {
            if (TextUtils.isEmpty(s))
            {
                g.put(d, a1);
                return;
            } else
            {
                g.put((new StringBuilder()).append(s).append("_").append(d).toString(), a1);
                return;
            }
        }

        protected volatile void a(Object obj)
        {
            a((Void)obj);
        }

        protected void a(Void void1)
        {
            super.a(void1);
        }

        protected volatile void b(Object aobj[])
        {
            b((String[])aobj);
        }

        protected transient void b(String as[])
        {
            super.b(as);
            if (f != null)
            {
                for (Iterator iterator = g.entrySet().iterator(); iterator.hasNext(); ((a)((java.util.Map.Entry)iterator.next()).getValue()).a(as[0], d)) { }
            }
            com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.a(c, d);
        }

        public b(a a2, String s, String s1, String s2)
        {
            c = com.qihoo.security.opti.trashclear.ui.mainpage.opti.a.this;
            super();
            f = a2;
            d = s1;
            e = s2;
            a(a2, s);
        }
    }


    private static com.qihoo.security.opti.trashclear.ui.mainpage.opti.a a;
    private final Context b = SecurityApplication.a();
    private final HashMap c = new HashMap();
    private final Map d = new HashMap();

    private com.qihoo.security.opti.trashclear.ui.mainpage.opti.a()
    {
    }

    static Context a(com.qihoo.security.opti.trashclear.ui.mainpage.opti.a a1)
    {
        return a1.b;
    }

    public static com.qihoo.security.opti.trashclear.ui.mainpage.opti.a a()
    {
        if (a == null)
        {
            a = new com.qihoo.security.opti.trashclear.ui.mainpage.opti.a();
        }
        return a;
    }

    static void a(com.qihoo.security.opti.trashclear.ui.mainpage.opti.a a1, String s)
    {
        a1.a(s);
    }

    private void a(String s)
    {
        if (!TextUtils.isEmpty(s) && c.containsKey(s))
        {
            c.remove(s);
        }
    }

    static Map b(com.qihoo.security.opti.trashclear.ui.mainpage.opti.a a1)
    {
        return a1.d;
    }

    public void a(a a1, String s, String s1, String s2)
    {
        if (TextUtils.isEmpty(s1) || a1 == null)
        {
            return;
        }
        Object obj = (SoftReference)d.get(s1);
        if (obj != null)
        {
            obj = (String)((SoftReference) (obj)).get();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            a1.a(((String) (obj)), s1);
            return;
        }
        obj = (b)c.get(s1);
        if (obj == null)
        {
            a1 = new b(a1, s, s1, s2);
            a1.c(new String[0]);
            c.put(s1, a1);
            return;
        } else
        {
            ((b) (obj)).a(a1, s);
            return;
        }
    }
}
