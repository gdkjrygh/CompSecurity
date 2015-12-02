// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice.richmedia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.util.LangUtils;

// Referenced classes of package com.baidu.android.pushservice.richmedia:
//            l

public class n
{

    public String a;
    public String b;
    public String c;
    public String d;
    protected a e;
    public List f;
    public boolean g;
    public boolean h;
    private l i;
    private String j;
    private Map k;
    private String l;
    private String m;
    private String n;

    public n()
    {
        i = com.baidu.android.pushservice.richmedia.l.a(com/baidu/android/pushservice/richmedia/n.getName());
        k = new HashMap();
        g = true;
        h = false;
        f = new ArrayList();
    }

    public Map a()
    {
        return k;
    }

    public void a(a a1)
    {
        e = a1;
    }

    public void a(String s)
    {
        l = s;
    }

    public a b()
    {
        return e;
    }

    public void b(String s)
    {
        m = s;
    }

    public String c()
    {
        if (l == null)
        {
            return "GET";
        } else
        {
            return l;
        }
    }

    public String d()
    {
        StringBuffer stringbuffer = new StringBuffer();
        if (m != null)
        {
            stringbuffer.append(m);
        }
        m = stringbuffer.toString();
        if (m.endsWith("&"))
        {
            return m.substring(0, m.length() - 1);
        } else
        {
            return m;
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj instanceof n)
            {
                obj = (n)obj;
                if ((j != null ? !j.equals(((n) (obj)).j) : ((n) (obj)).j != null) || (e != null ? !e.equals(((n) (obj)).e) : ((n) (obj)).e != null) || (k != null ? !k.equals(((n) (obj)).k) : ((n) (obj)).k != null) || (l != null ? !l.equals(((n) (obj)).l) : ((n) (obj)).l != null) || (m != null ? !m.equals(((n) (obj)).m) : ((n) (obj)).m != null) || (n != null ? !n.equals(((n) (obj)).n) : ((n) (obj)).n != null) || (f != null ? !f.equals(((n) (obj)).f) : ((n) (obj)).f != null) || h != ((n) (obj)).h)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, j), e), k), l), m), n), f), h);
    }

    private class a extends Enum
    {

        public static final a a;
        private static final a b[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/baidu/android/pushservice/richmedia/n$a, s);
        }

        public static a[] values()
        {
            return (a[])b.clone();
        }

        static 
        {
            a = new a("REQ_TYPE_GET_ZIP", 0);
            b = (new a[] {
                a
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }

}
