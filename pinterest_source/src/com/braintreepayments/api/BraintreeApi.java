// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.braintreepayments.api.exceptions.BraintreeException;
import com.braintreepayments.api.exceptions.ErrorWithResponse;
import com.braintreepayments.api.exceptions.InvalidArgumentException;
import com.braintreepayments.api.exceptions.ServerException;
import com.braintreepayments.api.internal.HttpRequest;
import com.braintreepayments.api.internal.HttpResponse;
import com.braintreepayments.api.models.AnalyticsConfiguration;
import com.braintreepayments.api.models.AnalyticsRequest;
import com.braintreepayments.api.models.AndroidPayCard;
import com.braintreepayments.api.models.AndroidPayConfiguration;
import com.braintreepayments.api.models.ClientToken;
import com.braintreepayments.api.models.Configuration;
import com.braintreepayments.api.models.PayPalAccountBuilder;
import com.braintreepayments.api.models.PaymentMethod;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.wallet.Cart;
import com.google.android.gms.wallet.FullWallet;
import com.google.android.gms.wallet.PaymentMethodToken;
import com.google.gson.Gson;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.braintreepayments.api:
//            VenmoAppSwitch, Coinbase, AndroidPay, PayPalHelper

public class BraintreeApi
{

    private Context a;
    private ClientToken b;
    private Configuration c;
    private HttpRequest d;
    private VenmoAppSwitch e;
    private Coinbase f;
    private AndroidPay g;
    private Object h;

    protected BraintreeApi(Context context, ClientToken clienttoken)
    {
        a = context.getApplicationContext();
        b = clienttoken;
        d = new HttpRequest(b.b());
    }

    private BraintreeApi(Context context, ClientToken clienttoken, Configuration configuration, HttpRequest httprequest)
    {
        a = context.getApplicationContext();
        b = clienttoken;
        c = configuration;
        d = httprequest;
        if (configuration != null)
        {
            d.a(configuration.a());
        }
        h = null;
        e = new VenmoAppSwitch(a, c);
        f = new Coinbase(a, c);
    }

    public BraintreeApi(Context context, String s)
    {
        String s1 = s;
        if (Pattern.compile("([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)").matcher(s).matches())
        {
            s1 = new String(Base64.decode(s, 0));
        }
        b = ClientToken.a(s1);
        a = context.getApplicationContext();
        c = Configuration.a(s1);
        d = new HttpRequest(b.b());
        d.a(c.a());
        h = null;
        e = new VenmoAppSwitch(context, c);
        f = new Coinbase(context, c);
    }

    protected BraintreeApi(Context context, String s, String s1)
    {
        this(context, ClientToken.a(s), Configuration.a(s1), new HttpRequest(ClientToken.a(s).b()));
    }

    protected static AndroidPayCard a(Intent intent)
    {
        if (AndroidPay.b(intent))
        {
            intent = (new JSONObject(((FullWallet)intent.getParcelableExtra("com.google.android.gms.wallet.EXTRA_FULL_WALLET")).getPaymentMethodToken().getToken())).getJSONArray("androidPayCards");
            if (intent.length() > 0)
            {
                return (AndroidPayCard)(new Gson()).fromJson(intent.getString(0), com/braintreepayments/api/models/AndroidPayCard);
            }
        }
        return null;
    }

    private static String b(String s)
    {
        return (new StringBuilder("/v1/")).append(s).toString();
    }

    private static String b(String s, String s1)
    {
        try
        {
            s = (new JSONObject(s)).getJSONArray(s1).get(0).toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new ServerException("Parsing server response failed");
        }
        return s;
    }

    public final PayPalAccountBuilder a(Activity activity, int k, Intent intent)
    {
        PayPalHelper.a(a);
        return PayPalHelper.a(activity, k, intent);
    }

    public final PaymentMethod a(com.braintreepayments.api.models.PaymentMethod.Builder builder)
    {
        return builder.fromJson(b(d.a(b((new StringBuilder("payment_methods/")).append(builder.getApiPath()).toString()), builder.toJsonString()).a(), builder.getApiResource()));
    }

    protected final PaymentMethod a(String s)
    {
        s = PaymentMethod.g(d.b(b((new StringBuilder("payment_methods/")).append(s).toString())).a());
        if (s.size() == 1)
        {
            return (PaymentMethod)s.get(0);
        }
        if (s.size() > 1)
        {
            throw new ServerException("Expected one payment method, got multiple payment methods");
        } else
        {
            throw new ServerException("No payment methods were found for nonce");
        }
    }

    public final void a(Activity activity, int k)
    {
        e.a(activity, k);
    }

    protected final void a(Activity activity, int k, Cart cart, String s)
    {
        if (g == null)
        {
            g = new AndroidPay(c);
        }
        if (cart != null)
        {
            g.a(cart);
        }
        g.a(activity, k, s);
    }

    protected final void a(Activity activity, int k, Cart cart, boolean flag, boolean flag1, boolean flag2)
    {
        if (flag && cart != null)
        {
            throw new InvalidArgumentException("The cart must be null when isBillingAgreement is true");
        }
        if (!flag && cart == null)
        {
            throw new InvalidArgumentException("Cart cannot be null unless isBillingAgreement is true");
        }
        if (g == null)
        {
            g = new AndroidPay(c);
        }
        g.a(cart);
        g.a(activity, k, flag, flag1, flag2);
    }

    public final void a(Activity activity, int k, List list)
    {
        PayPalHelper.a(activity.getApplicationContext(), c.e());
        PayPalHelper.a(activity, k, c.e(), list);
    }

    public final void a(String s, String s1)
    {
        if (!c.i())
        {
            break MISSING_BLOCK_LABEL_53;
        }
        s = new AnalyticsRequest(a, s, s1);
        d.a(c.j().a(), (new Gson()).toJson(s));
        return;
        s;
        return;
        s;
    }

    protected final boolean a()
    {
        return c != null;
    }

    protected final void b()
    {
        String s = Uri.parse(b.a()).buildUpon().appendQueryParameter("configVersion", "3").build().toString();
        c = Configuration.a(d.b(s).a());
        d.a(c.a());
        h = null;
        e = new VenmoAppSwitch(a, c);
        f = new Coinbase(a, c);
    }

    protected final String c()
    {
        if (c != null)
        {
            return (new Gson()).toJson(c);
        } else
        {
            return null;
        }
    }

    public final boolean d()
    {
        return c.d();
    }

    public final boolean e()
    {
        return e.a();
    }

    protected final boolean f()
    {
label0:
        {
            boolean flag1 = false;
            boolean flag = flag1;
            int k;
            try
            {
                if (!c.f().a())
                {
                    break label0;
                }
                k = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(a);
            }
            catch (NoClassDefFoundError noclassdeffounderror)
            {
                return false;
            }
            flag = flag1;
            if (k == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final boolean g()
    {
        return c.b();
    }

    public final boolean h()
    {
        return c.c();
    }

    protected final void i()
    {
        if (g != null)
        {
            g.a();
        }
    }

    public final List j()
    {
        return PaymentMethod.g(d.b(b("payment_methods")).a());
    }
}
