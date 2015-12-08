// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.android.gms.ads.internal.request.AdResponseParcel;

public class chs extends chl
    implements cky
{

    chs(Context context, ciu ciu, ckw ckw1, chq chq)
    {
        super(context, ciu, ckw1, chq);
    }

    protected final void a()
    {
        if (c.e != -2)
        {
            return;
        } else
        {
            b.k().d = this;
            e();
            bka.d("Loading HTML in WebView.");
            ckw ckw1 = b;
            bkv.e();
            ckw1.loadDataWithBaseURL(cjj.a(c.b), c.c, "text/html", "UTF-8", null);
            return;
        }
    }

    protected void e()
    {
    }
}
