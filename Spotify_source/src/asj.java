// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public class asj
{

    private String a;
    public Context c;
    public String d;
    public int e;
    public asl f;
    public Bundle g;

    protected asj(Context context, String s, String s1, Bundle bundle)
    {
        e = 0x1030010;
        String s2 = s;
        if (s == null)
        {
            s2 = arp.a(context);
        }
        ars.a(s2, "applicationId");
        d = s2;
        c = context;
        a = s1;
        if (bundle != null)
        {
            g = bundle;
            return;
        } else
        {
            g = new Bundle();
            return;
        }
    }

    public ash a()
    {
        g.putString("app_id", d);
        return new ash(c, a, g, e, f);
    }
}
