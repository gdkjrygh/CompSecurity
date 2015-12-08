// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.s;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import p.ap.h;

// Referenced classes of package p.s:
//            k

class l
{
    private static class a
        implements android.os.Handler.Callback
    {

        public boolean handleMessage(Message message)
        {
            if (message.what == 1)
            {
                ((k)message.obj).d();
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

    l()
    {
    }

    public void a(k k1)
    {
        h.a();
        if (a)
        {
            b.obtainMessage(1, k1).sendToTarget();
            return;
        } else
        {
            a = true;
            k1.d();
            a = false;
            return;
        }
    }
}
