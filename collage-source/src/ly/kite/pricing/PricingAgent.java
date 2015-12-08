// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.pricing;

import android.content.Context;
import java.net.URLEncoder;
import ly.kite.KiteSDK;
import ly.kite.address.Address;
import ly.kite.address.Country;
import ly.kite.catalogue.PrintOrder;
import ly.kite.util.ACache;
import ly.kite.util.HTTPJSONRequest;

// Referenced classes of package ly.kite.pricing:
//            IPricingConsumer, OrderPricing

public class PricingAgent extends ACache
{

    private static final String LOG_TAG = "PricingAgent";
    private static final String REQUEST_FORMAT_STRING = "%s/price/?basket=%s&shipping_country_code=%s&promo_code=%s";
    private static PricingAgent sPricingAgent;

    private PricingAgent()
    {
    }

    public static PricingAgent getInstance()
    {
        if (sPricingAgent == null)
        {
            sPricingAgent = new PricingAgent();
        }
        return sPricingAgent;
    }

    protected void onError(Exception exception, IPricingConsumer ipricingconsumer)
    {
        ipricingconsumer.paOnError(exception);
    }

    protected volatile void onError(Exception exception, ly.kite.util.ACache.IConsumer iconsumer)
    {
        onError(exception, (IPricingConsumer)iconsumer);
    }

    protected volatile void onValueAvailable(Object obj, ly.kite.util.ACache.IConsumer iconsumer)
    {
        onValueAvailable((OrderPricing)obj, (IPricingConsumer)iconsumer);
    }

    protected void onValueAvailable(OrderPricing orderpricing, IPricingConsumer ipricingconsumer)
    {
        ipricingconsumer.paOnSuccess(orderpricing);
    }

    public OrderPricing requestPricing(Context context, PrintOrder printorder, IPricingConsumer ipricingconsumer)
    {
        Object obj;
        KiteSDK kitesdk;
        String s1;
        kitesdk = KiteSDK.getInstance(context);
        s1 = printorder.toBasketString();
        obj = printorder.getShippingAddress();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = ((Address) (obj)).getCountry();
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = ((Country) (obj)).iso3Code();
_L5:
        String s = printorder.getPromoCode();
        printorder = s;
        if (s == null)
        {
            printorder = "";
        }
        printorder = String.format("%s/price/?basket=%s&shipping_country_code=%s&promo_code=%s", new Object[] {
            kitesdk.getAPIEndpoint(), s1, obj, URLEncoder.encode(printorder)
        });
        obj = (OrderPricing)getCachedValue(printorder);
        if (obj != null)
        {
            return ((OrderPricing) (obj));
        }
        break; /* Loop/switch isn't completed */
_L2:
        obj = Country.getInstance().iso3Code();
        if (true) goto _L5; else goto _L4
_L4:
    /* block-local class not found */
    class PriceRequestListener {}

        if (!requestAlreadyStarted(printorder, ipricingconsumer))
        {
            (new HTTPJSONRequest(context, ly.kite.util.HTTPJSONRequest.HttpMethod.GET, printorder, null, null)).start(new PriceRequestListener(printorder));
        }
        return null;
    }



}
