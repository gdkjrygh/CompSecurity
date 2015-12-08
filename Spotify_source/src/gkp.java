// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.ResourceBusyException;
import android.os.Handler;
import com.spotify.mobile.android.util.logging.Logger;

public final class gkp
    implements gks
{

    public Handler a;
    public gks b;

    public gkp()
    {
    }

    public final void a(Exception exception)
    {
        if (exception instanceof ResourceBusyException)
        {
            Logger.b(exception, "Got ResourceBusyException from drm session manager", new Object[0]);
        }
        if (a != null && b != null)
        {
            a.post(new Runnable(exception) {

                private Exception a;
                private gkp b;

                public final void run()
                {
                    b.b.a(a);
                }

            
            {
                b = gkp.this;
                a = exception;
                super();
            }
            });
        }
    }

    public final void b()
    {
        if (a != null && b != null)
        {
            a.post(new Runnable() {

                private gkp a;

                public final void run()
                {
                    a.b.b();
                }

            
            {
                a = gkp.this;
                super();
            }
            });
        }
    }

    public final void m()
    {
        if (a != null && b != null)
        {
            a.post(new Runnable() {

                private gkp a;

                public final void run()
                {
                    a.b.m();
                }

            
            {
                a = gkp.this;
                super();
            }
            });
        }
    }
}
