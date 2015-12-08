// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bi, az

public class e
{

    String a;
    String b;
    int c;
    String d;
    long e;
    String f;
    int g;
    int h;
    final bi i;

    public String a()
    {
        return az.b(a);
    }

    public int b()
    {
        return g;
    }

    public int c()
    {
        return h;
    }

    public String d()
    {
        return a;
    }

    public String e()
    {
        return f;
    }

    public String f()
    {
        return b;
    }

    public int g()
    {
        return c;
    }

    public long h()
    {
        return e;
    }

    public (bi bi1, JSONObject jsonobject)
        throws Exception
    {
        i = bi1;
        super();
        d = "";
        e = 0L;
        f = "";
        g = 0;
        h = 0;
        a = jsonobject.getString("video-url");
        b = jsonobject.getString("format");
        c = jsonobject.getInt("ad-size");
        f = jsonobject.getString("tag");
        if (!jsonobject.has("video-crc-32")) goto _L2; else goto _L1
_L1:
        e = jsonobject.getLong("video-crc-32");
_L4:
        bi1 = b.split("-")[1].split("x");
        g = Integer.parseInt(bi1[0]);
        h = Integer.parseInt(bi1[1]);
        return;
_L2:
        if (jsonobject.has("video-crc32"))
        {
            e = jsonobject.getLong("video-crc32");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
