// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.Window;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzd;

public final class bhp extends cjc
{

    final zzd a;

    private bhp(zzd zzd1)
    {
        a = zzd1;
        super();
    }

    public bhp(zzd zzd1, byte byte0)
    {
        this(zzd1);
    }

    public final void a()
    {
        bkv.e();
        Object obj = cjj.b(zzd.a(a), a.b.q.d);
        if (obj != null)
        {
            obj = bkv.g().a(zzd.a(a), ((android.graphics.Bitmap) (obj)), a.b.q.e, a.b.q.f);
            cjj.a.post(new Runnable(((Drawable) (obj))) {

                private Drawable a;
                private bhp b;

                public final void run()
                {
                    zzd.a(b.a).getWindow().setBackgroundDrawable(a);
                }

            
            {
                b = bhp.this;
                a = drawable;
                super();
            }
            });
        }
    }

    public final void b()
    {
    }
}
