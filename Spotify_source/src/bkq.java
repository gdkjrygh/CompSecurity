// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

final class bkq extends cjc
{

    final bko a;
    private final Bitmap b;
    private final String c;

    public bkq(bko bko1, Bitmap bitmap, String s)
    {
        a = bko1;
        super();
        b = bitmap;
        c = s;
    }

    public final void a()
    {
        Object obj;
        int i;
        int j;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (a.c.E)
        {
            bkv.e();
            flag = cjj.a(a.c.c, b, c);
        } else
        {
            flag = false;
        }
        flag1 = a.c.E;
        flag2 = a.B();
        if (flag)
        {
            obj = c;
        } else
        {
            obj = null;
        }
        obj = new InterstitialAdParameterParcel(flag1, flag2, ((String) (obj)), bko.a(a), bko.b(a));
        j = a.c.j.b.p();
        i = j;
        if (j == -1)
        {
            i = a.c.j.g;
        }
        obj = new AdOverlayInfoParcel(a, a, a, a.c.j.b, i, a.c.e, a.c.j.t, ((InterstitialAdParameterParcel) (obj)));
        cjj.a.post(new Runnable(((AdOverlayInfoParcel) (obj))) {

            private AdOverlayInfoParcel a;
            private bkq b;

            public final void run()
            {
                bkv.c();
                bhq.a(b.a.c.c, a, true);
            }

            
            {
                b = bkq.this;
                a = adoverlayinfoparcel;
                super();
            }
        });
    }

    public final void b()
    {
    }
}
