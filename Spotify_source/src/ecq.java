// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.RemoteViews;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.service.ForceInCollection;
import com.spotify.mobile.android.util.Assertion;
import com.squareup.picasso.Picasso;

public abstract class ecq
{

    private android.os.Handler.Callback a;
    private Context b;
    protected final eco c;
    protected final Handler d;
    protected final Handler e;
    Notification f;
    private fnu g;
    private gwi h;

    public ecq(Context context, eco eco1, Handler handler)
    {
        a = new android.os.Handler.Callback() {

            private ecq a;

            public final boolean handleMessage(Message message)
            {
                message.what;
                JVM INSTR tableswitch 10 10: default 24
            //                           10 48;
                   goto _L1 _L2
_L1:
                Assertion.a((new StringBuilder("Unexpected message ")).append(message.what).toString());
_L4:
                return true;
_L2:
                ecq.a(a, (fnu)message.obj);
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                a = ecq.this;
                super();
            }
        };
        e = new Handler(Looper.getMainLooper(), a);
        g = fnv.a;
        h = new gwi() {

            private ecq a;

            public final void a(Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedfrom)
            {
                if (a.f == null)
                {
                    return;
                }
                loadedfrom = a.f;
                ctz.a(loadedfrom);
                if (gcl.f)
                {
                    ((RemoteViews)ctz.a(((Notification) (loadedfrom)).bigContentView)).setBitmap(0x7f110447, "setImageBitmap", bitmap);
                }
                ((RemoteViews)ctz.a(((Notification) (loadedfrom)).contentView)).setBitmap(0x7f110447, "setImageBitmap", bitmap);
                a.c.a(1, a.f);
            }

            public final void a(Drawable drawable)
            {
                if (a.f == null)
                {
                    return;
                }
                drawable = a.f;
                ctz.a(drawable);
                if (gcl.f)
                {
                    ((RemoteViews)ctz.a(((Notification) (drawable)).bigContentView)).setImageViewResource(0x7f110447, 0x7f02006b);
                }
                ((RemoteViews)ctz.a(((Notification) (drawable)).contentView)).setImageViewResource(0x7f110447, 0x7f02006b);
                a.c.a(1, a.f);
            }

            public final void b(Drawable drawable)
            {
            }

            
            {
                a = ecq.this;
                super();
            }
        };
        b = context;
        c = eco1;
        d = handler;
    }

    static void a(ecq ecq1, fnu fnu1)
    {
        if (fnu1.b() && !fnu1.equals(ecq1.g))
        {
            Uri uri = ((ecp)fnu1.a()).b;
            boolean flag;
            if (!ecq1.g.b() || !((ecp)ecq1.g.a()).b.equals(uri))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ecq1.g = fnu1;
            ecq1.f = gic.a(ecq1.b, (ecp)fnu1.a()).b();
            if (flag)
            {
                ((gft)dmz.a(gft)).a().a(uri).a(0x7f0c00fb, 0x7f0c00fb).b().a(ecq1.h);
            }
            ecq1.c.a(1, ecq1.f);
        }
    }

    public void a()
    {
        c.a(1);
        g = fnv.a;
    }

    public abstract void a(ForceInCollection forceincollection, Player player);
}
