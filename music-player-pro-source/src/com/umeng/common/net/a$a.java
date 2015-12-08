// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.os.Bundle;

// Referenced classes of package com.umeng.common.net:
//            a

static class c
{

    public String a;
    public String b;
    public String c;
    public String d[];
    public boolean e;

    public static c a(Bundle bundle)
    {
        c c1 = new <init>(bundle.getString("mComponentName"), bundle.getString("mTitle"), bundle.getString("mUrl"));
        c1.d = bundle.getStringArray("reporturls");
        c1.e = bundle.getBoolean("rich_notification");
        return c1;
    }

    public Bundle a()
    {
        Bundle bundle = new Bundle();
        bundle.putString("mComponentName", a);
        bundle.putString("mTitle", b);
        bundle.putString("mUrl", c);
        bundle.putStringArray("reporturls", d);
        bundle.putBoolean("rich_notification", e);
        return bundle;
    }

    public (String s, String s1, String s2)
    {
        d = null;
        e = false;
        a = s;
        b = s1;
        c = s2;
    }
}
