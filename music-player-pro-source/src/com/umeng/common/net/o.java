// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import org.json.JSONObject;

// Referenced classes of package com.umeng.common.net:
//            t

public class o extends t
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/umeng/common/net/o$a, s);
        }

        public static a[] values()
        {
            a aa[] = c;
            int i = aa.length;
            a aa1[] = new a[i];
            System.arraycopy(aa, 0, aa1, 0, i);
            return aa1;
        }

        static 
        {
            a = new a("SUCCESS", 0);
            b = new a("FAIL", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public a a;

    public o(JSONObject jsonobject)
    {
        super(jsonobject);
        if ("ok".equalsIgnoreCase(jsonobject.optString("status")) || "ok".equalsIgnoreCase(jsonobject.optString("success")))
        {
            a = a.a;
            return;
        } else
        {
            a = a.b;
            return;
        }
    }
}
