// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;

import java.util.Map;

// Referenced classes of package com.crashlytics.android.internal:
//            v

final class u
{

    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final v j;
    public final Map k;
    private String l;

    private u(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, long l1, v v, Map map)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = s5;
        g = s6;
        h = s7;
        i = l1;
        j = v;
        k = map;
    }

    public static final u a(String s, String s1, String s2, String s3, String s4, String s5, String s6, String s7, 
            v v, Map map)
    {
        return new u(s, s1, s2, s3, s4, s5, s6, s7, System.currentTimeMillis(), v, map);
    }

    public final String toString()
    {
        if (l == null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("[");
            stringbuilder.append(getClass().getSimpleName());
            stringbuilder.append(": appBundleId=");
            stringbuilder.append(a);
            stringbuilder.append(", executionId=");
            stringbuilder.append(b);
            stringbuilder.append(", installationId=");
            stringbuilder.append(c);
            stringbuilder.append(", androidId=");
            stringbuilder.append(d);
            stringbuilder.append(", osVersion=");
            stringbuilder.append(e);
            stringbuilder.append(", deviceModel=");
            stringbuilder.append(f);
            stringbuilder.append(", appVersionCode=");
            stringbuilder.append(g);
            stringbuilder.append(", appVersionName=");
            stringbuilder.append(h);
            stringbuilder.append(", timestamp=");
            stringbuilder.append(i);
            stringbuilder.append(", type=");
            stringbuilder.append(j);
            stringbuilder.append(", details=");
            stringbuilder.append(k.toString());
            stringbuilder.append("]");
            l = stringbuilder.toString();
        }
        return l;
    }
}
