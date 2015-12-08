// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import com.spotify.mobile.android.provider.PaymentState;
import com.spotify.mobile.android.spotlets.tinkerbell.BannerView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;

public final class geo
{

    public static final gip a = gip.b("payment_failure_dismissed_timestamp");
    public static final gip b = gip.b("payment_failure_dismissed_payment_state");
    public final BannerView c;
    public final PaymentState d;
    public final gin e;
    public final Verified f;

    public geo(BannerView bannerview, PaymentState paymentstate, gin gin, Verified verified)
    {
        c = bannerview;
        d = paymentstate;
        e = gin;
        f = verified;
        if (paymentstate != null)
        {
            bannerview.a = new gep(bannerview.getContext(), paymentstate, gin, verified);
        }
    }

    public static Uri a(PaymentState paymentstate)
    {
        int i = paymentstate.b();
        if (i < 0)
        {
            paymentstate = "tinkerbell_paymentfailure_unknown";
        } else
        {
            paymentstate = (new StringBuilder("tinkerbell_paymentfailure_")).append(i).toString();
        }
        return Uri.parse("https://www.spotify.com/redirect/generic/?redirect_key=android_paymentfailure&utm_source=spotify&utm_medium=tinkerbell").buildUpon().appendQueryParameter("utm_campaign", paymentstate).build();
    }

    public static void a(Context context, Verified verified, PaymentState paymentstate, ClientEvent clientevent)
    {
        clientevent.a("retry_number", Integer.toString(paymentstate.b()));
        dmz.a(fop);
        fop.a(context, verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.P, clientevent);
    }

    static void b(Context context, Verified verified, PaymentState paymentstate, ClientEvent clientevent)
    {
        a(context, verified, paymentstate, clientevent);
    }

}
