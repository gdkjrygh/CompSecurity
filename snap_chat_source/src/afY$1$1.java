// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import java.util.Queue;

final class g.Object
    implements Runnable
{

    private b a;
    private b b;

    public final void run()
    {
        b.b.a.add(a);
        b.b.a();
    }

    er(er er, er er1)
    {
        b = er;
        a = er1;
        super();
    }

    // Unreferenced inner class afY$1

/* anonymous class */
    final class afY._cls1 extends Handler
    {

        final afY a;

        public final void handleMessage(Message message)
        {
            message = (afY.b)a.a.poll();
            if (!((afY.b) (message)).c)
            {
                int i = ((afY.b) (message)).d - 1;
                message.d = i;
                boolean flag;
                if (i < 0)
                {
                    flag = false;
                } else
                {
                    flag = true;
                }
                if (flag)
                {
                    postDelayed(new afY._cls1._cls1(this, message), 3000L);
                }
            }
            a.b = false;
            a.a();
        }

            
            {
                a = afy;
                super();
            }
    }

}
