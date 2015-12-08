// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import org.json.JSONObject;
import p.cw.c;

// Referenced classes of package com.pandora.radio.util:
//            m, i

public abstract class n
{
    public static class a extends n
    {

        public boolean a()
        {
            return a(i.a());
        }

        public a(JSONObject jsonobject)
        {
            super(jsonobject);
        }
    }

    public static class b extends n
    {

        public boolean a()
        {
            String s = c.z.B();
            int i = 0;
            do
            {
label0:
                {
                    if (i < s.length())
                    {
                        char c1 = s.charAt(i);
                        if (c1 == '.' || c1 >= '0' && c1 <= '9')
                        {
                            break label0;
                        }
                        s = s.substring(0, i);
                    }
                    return a(s);
                }
                i++;
            } while (true);
        }

        public b(JSONObject jsonobject)
        {
            super(jsonobject);
        }
    }


    private static final String a = Integer.toString(0x7fffffff);
    private String b;
    private String c;

    public n(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            b = "0";
            c = a;
        } else
        {
            b = jsonobject.optString("low", "0");
            c = jsonobject.optString("high", a);
            if ("*".equals(b))
            {
                b = "0";
            }
            if ("*".equals(c))
            {
                c = a;
                return;
            }
        }
    }

    public abstract boolean a();

    protected boolean a(String s)
    {
        if (!"*".equals(s))
        {
            m m1 = new m(b);
            m m2 = new m(c);
            s = new m(s);
            int i = m1.a(s);
            int j = m2.a(s);
            if (i > 0 || j < 0)
            {
                return false;
            }
        }
        return true;
    }

    public String toString()
    {
        return String.format("%s:%s", new Object[] {
            b, c
        });
    }

}
