// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.address;

import android.content.Context;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import ly.kite.KiteSDK;
import ly.kite.util.HTTPJSONRequest;

// Referenced classes of package ly.kite.address:
//            Country, AddressSearchRequestListener, Address

public class AddressSearchRequest
{

    private HTTPJSONRequest searchRequest;

    public AddressSearchRequest()
    {
    }

    private void startSearch(Context context, String s, Country country, AddressSearchRequestListener addresssearchrequestlistener)
    {
        searchRequest = new HTTPJSONRequest(context, ly.kite.util.HTTPJSONRequest.HttpMethod.GET, s, null, null);
        searchRequest.start(new _cls1(addresssearchrequestlistener, country));
    }

    public void cancelSearch()
    {
        if (searchRequest != null)
        {
            searchRequest.cancel();
            searchRequest = null;
        }
    }

    public void search(Context context, String s, Country country, AddressSearchRequestListener addresssearchrequestlistener)
    {
        try
        {
            s = String.format("search_term=%s&country_code=%s", new Object[] {
                URLEncoder.encode(s, "utf-8"), country.iso3Code()
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            addresssearchrequestlistener.onError(this, context);
            return;
        }
        startSearch(context, String.format("%s/address/search?%s", new Object[] {
            KiteSDK.getInstance(context).getAPIEndpoint(), s
        }), country, addresssearchrequestlistener);
    }

    public void search(Context context, Address address, AddressSearchRequestListener addresssearchrequestlistener)
    {
        if (address.getId() != null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (!address.getCountry().iso3Code().equals("GBR") || address.getZipOrPostalCode() == null || address.getZipOrPostalCode().length() <= 0) goto _L2; else goto _L1
_L1:
        String s;
        if (address.getLine1() == null)
        {
            s = "";
        } else
        {
            try
            {
                s = address.getLine1();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                addresssearchrequestlistener.onError(this, context);
                return;
            }
        }
        s = String.format("postcode=%s&address_line_1=%s&country_code=GBR", new Object[] {
            URLEncoder.encode(address.getZipOrPostalCode(), "utf-8"), URLEncoder.encode(s, "utf-8")
        });
_L3:
        startSearch(context, String.format("%s/address/search?%s", new Object[] {
            KiteSDK.getInstance(context).getAPIEndpoint(), s
        }), address.getCountry(), addresssearchrequestlistener);
        return;
_L2:
        s = String.format("search_term=%s&country_code=%s", new Object[] {
            URLEncoder.encode(address.getDisplayAddressWithoutRecipient(), "utf-8"), address.getCountry().iso3Code()
        });
          goto _L3
        s = String.format("address_id=%s&country_code=%s", new Object[] {
            URLEncoder.encode(address.getId(), "utf-8"), address.getCountry().iso3Code()
        });
          goto _L3
    }


/*
    static HTTPJSONRequest access$002(AddressSearchRequest addresssearchrequest, HTTPJSONRequest httpjsonrequest)
    {
        addresssearchrequest.searchRequest = httpjsonrequest;
        return httpjsonrequest;
    }

*/

    /* member class not found */
    class _cls1 {}

}
