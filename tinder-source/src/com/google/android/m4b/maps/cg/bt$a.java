// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.m4b.maps.ay.a;
import com.google.android.m4b.maps.ay.t;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bt

static final class <init> extends a
{

    private final Handler a;
    private final Handler b;

    public final void a(int i, String s)
    {
    }

    public final void a(t t)
    {
        Message.obtain(a, 0, t).sendToTarget();
    }

    public final void b(t t)
    {
        Message.obtain(b, 0, t).sendToTarget();
    }

    private _cls2.a()
    {
        a = new Handler(Looper.getMainLooper()) {

            private bt.a a;

            public final void handleMessage(Message message)
            {
                ((t)message.obj).b();
            }

            
            {
                a = bt.a.this;
                super(looper);
            }
        };
        b = new Handler(Looper.getMainLooper()) {

            private bt.a a;

            public final void handleMessage(Message message)
            {
                ((t)message.obj).a();
            }

            
            {
                a = bt.a.this;
                super(looper);
            }
        };
    }

    _cls2(byte byte0)
    {
        this();
    }
}
