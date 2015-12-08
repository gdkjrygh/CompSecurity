// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import android.content.Context;
import com.android.volley.a.a;
import com.android.volley.a.c;
import com.android.volley.a.g;
import com.android.volley.h;

// Referenced classes of package com.taplytics:
//            ox

public final class dp
{

    public ox a;
    public String b;
    public String c;
    public String d;
    public String e;
    h f;

    public dp(Context context)
    {
        a = ox.b;
        b = "api.taplytics.com";
        c = "ping.taplytics.com";
        d = "socketio.taplytics.com";
        e = "https://";
        f = new h(new c(context.getCacheDir(), 0x2300000), new a(new g()), (byte)0);
        f.a();
    }
}
