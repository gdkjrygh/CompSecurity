// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.paypal.android.sdk:
//            al, W, an, am

public final class aj extends al
{

    private Context a;
    private String b;
    private Handler c;

    public aj(Context context, String s, Handler handler)
    {
        a = context;
        b = s;
        c = handler;
    }

    public final void run()
    {
        if (c == null)
        {
            return;
        }
        c.sendMessage(Message.obtain(c, 10, b));
        W w = new W(a, b);
        c.sendMessage(Message.obtain(c, 12, w));
        an.a().b(this);
        return;
        Object obj;
        obj;
        c.sendMessage(Message.obtain(c, 11, obj));
        an.a().b(this);
        return;
        obj;
        an.a().b(this);
        throw obj;
    }
}
