// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.a;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.common.utils.l;
import org.json.JSONException;

// Referenced classes of package com.aviary.android.feather.a:
//            b, a, c

static final class b extends Handler
{

    com.aviary.android.feather.common.a.d a;
    private Context b;
    private Handler c;

    private void a()
    {
        a.b("init");
        c = new <init>(b, b.c.getLooper());
    }

    private void a(com.aviary.android.feather.a.a a1)
        throws JSONException
    {
        org.json.JSONObject jsonobject = a1.a(b);
        long l1 = com.aviary.android.feather.a.c.a(b).a(jsonobject, a1.d);
        a.b("added ticket with id: %d", new Object[] {
            Long.valueOf(l1)
        });
    }

    private void b()
    {
    }

    private void c()
    {
    }

    private void d()
    {
        a.b("upload");
        c.sendEmptyMessage(1);
    }

    public void handleMessage(Message message)
    {
        a.c("handleMessage: %d", new Object[] {
            Integer.valueOf(message.what)
        });
        l.b(b);
        message.what;
        JVM INSTR lookupswitch 5: default 165
    //                   1: 114
    //                   2: 138
    //                   3: 143
    //                   4: 148
    //                   100: 153;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        a.d("didn't handle message: %d", new Object[] {
            Integer.valueOf(message.what)
        });
        return;
_L2:
        try
        {
            a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            message.printStackTrace();
        }
        a.d(message.getMessage());
        return;
_L3:
        b();
        return;
_L4:
        c();
        return;
_L5:
        d();
        return;
_L6:
        a((com.aviary.android.feather.a.a)message.obj);
        return;
    }

    .a.l(Context context, Looper looper)
    {
        super(looper);
        a = com.aviary.android.feather.common.a.a.a(com/aviary/android/feather/a/b$a.getSimpleName(), com.aviary.android.feather.common.a.a);
        b = context;
    }
}
