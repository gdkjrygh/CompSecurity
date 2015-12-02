// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

abstract class ccq
    implements cct
{

    private bzz a;

    protected ccq(bzz bzz1)
    {
        a = bzz1;
    }

    private String a(buw buw1, boolean flag)
    {
        String s = (new StringBuilder()).append(buu.b).append(":").append(b()).append(":").append(buw1.a()).toString();
        buw1 = s;
        if (flag)
        {
            buw1 = (new StringBuilder()).append(s).append("|error").toString();
        }
        return buw1;
    }

    protected final bzz a()
    {
        return a;
    }

    public final void a(buw buw1, boolean flag, String s, String s1, String s2)
    {
        bun.a();
        String s4 = Locale.getDefault().toString();
        HashMap hashmap = new HashMap();
        String s3;
        boolean flag1;
        if (!bwq.a(s))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        hashmap.put("gn", a(buw1, flag1));
        hashmap.put("v31", a(buw1, flag1));
        s3 = (new StringBuilder()).append(a(buw1, flag1)).append(":").append(buw1.a(a.d(), flag)).toString();
        if (flag1)
        {
            s3 = (new StringBuilder()).append(s3).append("|error").toString();
        }
        hashmap.put("c25", s3);
        hashmap.put("v25", "D=c25");
        hashmap.put("c37", (new StringBuilder()).append(buu.a).append("::").toString());
        hashmap.put("c50", s4);
        hashmap.put("c35", "out");
        a(((Map) (hashmap)), buw1, s1, s2);
        if (s != null)
        {
            hashmap.put("c29", s);
        }
        a("2.9.10", ((Map) (hashmap)));
    }

    abstract void a(String s, Map map);

    protected void a(Map map, buw buw1, String s, String s1)
    {
    }

    protected abstract String b();
}
