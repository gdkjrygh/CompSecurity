// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.g.h;

// Referenced classes of package com.bumptech.glide.load.engine:
//            j

class k
{
    private static class a
        implements android.os.Handler.Callback
    {

        public boolean handleMessage(Message message)
        {
            if (message.what == 1)
            {
                ((j)message.obj).d();
                return true;
            } else
            {
                return false;
            }
        }

        private a()
        {
        }

    }


    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new a());

    k()
    {
    }

    public void a(j j1)
    {
        h.a();
        if (a)
        {
            b.obtainMessage(1, j1).sendToTarget();
            return;
        } else
        {
            a = true;
            j1.d();
            a = false;
            return;
        }
    }
}
