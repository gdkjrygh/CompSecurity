// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.os.Bundle;

public class d
{

    public String a;
    public String b;
    public String c;
    public String d;
    public boolean e;

    private d()
    {
    }

    public static d a(Bundle bundle)
    {
        d d1 = new d();
        d1.a = bundle.getString("app_patch_size");
        d1.b = bundle.getString("app_size");
        d1.c = bundle.getString("app_version");
        d1.e = "1".equals(bundle.getString("force"));
        d1.d = bundle.getString("app_desc");
        if (d1.d != null)
        {
            d1.d = d1.d.replaceAll("\\\\n", "\n");
        }
        return d1;
    }

    public boolean a()
    {
        boolean flag = false;
        int i;
        try
        {
            i = Integer.valueOf(a).intValue();
        }
        catch (Exception exception)
        {
            i = 0;
        }
        if (i > 0)
        {
            flag = true;
        }
        return flag;
    }

    public String toString()
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("[UpdateInfo] ");
        if (a != null)
        {
            stringbuffer.append(" patchSize: ").append(a);
        }
        if (b != null)
        {
            stringbuffer.append(" appSize: ").append(b);
        }
        if (c != null)
        {
            stringbuffer.append(" appVersion: ").append(c);
        }
        if (d != null)
        {
            stringbuffer.append(" description: ").append(d);
        }
        stringbuffer.append(" isForce: ").append(e);
        return stringbuffer.toString();
    }
}
