// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.auth.broadcast;

import android.content.Context;
import android.os.Handler;

// Referenced classes of package com.facebook.auth.broadcast:
//            n

public class m
{

    private final Context a;
    private final Handler b;

    public m(Context context, Handler handler)
    {
        a = context;
        b = handler;
    }

    static Context a(m m1)
    {
        return m1.a;
    }

    public void a(String s)
    {
        a(s, 0);
    }

    public void a(String s, int i)
    {
        b.post(new n(this, s, i));
    }
}
