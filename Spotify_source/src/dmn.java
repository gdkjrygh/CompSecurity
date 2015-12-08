// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;

public abstract class dmn
    implements gqv
{

    private final Handler a = new Handler(Looper.getMainLooper());

    public dmn()
    {
    }

    public abstract void a(int i, String s);

    public final void a(grq grq, IOException ioexception)
    {
        a.post(new Runnable(grq, ioexception) {

            private grq a;
            private IOException b;
            private dmn c;

            public final void run()
            {
                c.b(a, b);
            }

            
            {
                c = dmn.this;
                a = grq;
                b = ioexception;
                super();
            }
        });
    }

    public final void a(grt grt1)
    {
        String s;
        Object obj1;
        obj1 = null;
        s = obj1;
        if (grt1.e() == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        s = grt1.e().f();
        grt1.e().close();
_L2:
        a.post(new Runnable(grt1, s) {

            private grt a;
            private String b;
            private dmn c;

            public final void run()
            {
                c.a(a.a(), b);
            }

            
            {
                c = dmn.this;
                a = grt1;
                b = s;
                super();
            }
        });
        return;
        Object obj;
        obj;
        Logger.b(((Throwable) (obj)), "Could not read response body as a string", new Object[0]);
        grt1.e().close();
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        grt1.e().close();
        throw obj;
    }

    public abstract void b(grq grq, IOException ioexception);
}
