// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.camera.model.CameraModel;

public final class qJ
{

    protected rj a;
    protected CameraModel b;

    public qJ()
    {
        SnapchatApplication.getDIComponent().a(this);
    }

    public final void a(qw qw1, qx qx, qI qi)
    {
        if (!a.a)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        if (!b.a()) goto _L2; else goto _L1
_L1:
        qi.a(true);
        (new Handler()).postDelayed(new Runnable(qw1, qx, qi) {

            private qw a;
            private qx b;
            private qI c;
            private qJ d;

            public final void run()
            {
                a.a(d.b.g, b);
                c.a(false);
            }

            
            {
                d = qJ.this;
                a = qw1;
                b = qx;
                c = qi;
                super();
            }
        }, 700L);
_L4:
        return;
_L2:
        qP.b b1 = b.i;
        if (b1 == null) goto _L4; else goto _L3
_L3:
        qi.b(true);
        b1.a(new qS(new Handler(Looper.getMainLooper()), new qP.c(qw1, qx, qi) {

            private qw a;
            private qx b;
            private qI c;
            private qJ d;

            public final void a()
            {
                a.a(d.b.g, b);
                c.b(false);
            }

            
            {
                d = qJ.this;
                a = qw1;
                b = qx;
                c = qi;
                super();
            }
        }));
        return;
        qw1.a(b.g, qx);
        return;
    }

    public final void b(qw qw1, qx qx, qI qi)
    {
        if (a.a)
        {
            qi.a(false);
        }
        qw1.a(b.g, qx);
    }
}
