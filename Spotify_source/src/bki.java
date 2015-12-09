// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class bki
    implements bkh
{

    private final ciu a;
    private final ckw b;

    public bki(ciu ciu1, ckw ckw1)
    {
        a = ciu1;
        b = ckw1;
    }

    public final void a(String s)
    {
        bka.a("An auto-clicking creative is blocked");
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("https");
        builder.path("//pagead2.googlesyndication.com/pagead/gen_204");
        builder.appendQueryParameter("id", "gmob-apps-blocked-navigation");
        if (!TextUtils.isEmpty(s))
        {
            builder.appendQueryParameter("navigationURL", s);
        }
        if (a != null && a.b != null && !TextUtils.isEmpty(a.b.o))
        {
            builder.appendQueryParameter("debugDialog", a.b.o);
        }
        bkv.e();
        cjj.a(b.getContext(), b.n().b, builder.toString());
    }
}
