// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.net;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.ChargeRefundCollection;
import com.stripe.model.ChargeRefundCollectionDeserializer;
import com.stripe.model.Dispute;
import com.stripe.model.DisputeDataDeserializer;
import com.stripe.model.EventData;
import com.stripe.model.EventDataDeserializer;
import com.stripe.model.ExternalAccountTypeAdapterFactory;
import com.stripe.model.FeeRefundCollection;
import com.stripe.model.FeeRefundCollectionDeserializer;
import com.stripe.model.StripeObject;
import com.stripe.model.StripeRawJsonObject;
import com.stripe.model.StripeRawJsonObjectDeserializer;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

// Referenced classes of package com.stripe.net:
//            LiveStripeResponseGetter, StripeResponseGetter, RequestOptions

public abstract class APIResource extends StripeObject
{

    public static final String CHARSET = "UTF-8";
    public static final Gson GSON;
    private static StripeResponseGetter stripeResponseGetter = new LiveStripeResponseGetter();

    public APIResource()
    {
    }

    private static String className(Class class1)
    {
        String s = class1.getSimpleName().toLowerCase().replace("$", " ");
        if (s.equals("applicationfee"))
        {
            class1 = "application_fee";
        } else
        {
            if (s.equals("fileupload"))
            {
                return "file";
            }
            class1 = s;
            if (s.equals("bitcoinreceiver"))
            {
                return "bitcoin_receiver";
            }
        }
        return class1;
    }

    protected static String classURL(Class class1)
    {
        return classURL(class1, Stripe.getApiBase());
    }

    protected static String classURL(Class class1, String s)
    {
        return String.format("%ss", new Object[] {
            singleClassURL(class1, s)
        });
    }

    protected static String instanceURL(Class class1, String s)
    {
        return instanceURL(class1, s, Stripe.getApiBase());
    }

    protected static String instanceURL(Class class1, String s, String s1)
    {
        try
        {
            class1 = String.format("%s/%s", new Object[] {
                classURL(class1, s1), urlEncode(s)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new InvalidRequestException("Unable to encode parameters to UTF-8. Please contact support@stripe.com for assistance.", null, class1);
        }
        return class1;
    }

    protected static Object multipartRequest(RequestMethod requestmethod, String s, Map map, Class class1, RequestOptions requestoptions)
    {
        return stripeResponseGetter.request(requestmethod, s, map, class1, RequestType.MULTIPART, requestoptions);
    }

    protected static Object request(RequestMethod requestmethod, String s, Map map, Class class1, RequestOptions requestoptions)
    {
        return stripeResponseGetter.request(requestmethod, s, map, class1, RequestType.NORMAL, requestoptions);
    }

    public static void setStripeResponseGetter(StripeResponseGetter striperesponsegetter)
    {
        stripeResponseGetter = striperesponsegetter;
    }

    protected static String singleClassURL(Class class1)
    {
        return singleClassURL(class1, Stripe.getApiBase());
    }

    protected static String singleClassURL(Class class1, String s)
    {
        return String.format("%s/v1/%s", new Object[] {
            s, className(class1)
        });
    }

    public static String urlEncode(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return URLEncoder.encode(s, "UTF-8");
        }
    }

    static 
    {
        GSON = (new GsonBuilder()).a(FieldNamingPolicy.d).a(com/stripe/model/EventData, new EventDataDeserializer()).a(com/stripe/model/ChargeRefundCollection, new ChargeRefundCollectionDeserializer()).a(com/stripe/model/FeeRefundCollection, new FeeRefundCollectionDeserializer()).a(com/stripe/model/StripeRawJsonObject, new StripeRawJsonObjectDeserializer()).a(com/stripe/model/Dispute, new DisputeDataDeserializer()).a(new ExternalAccountTypeAdapterFactory()).c();
    }

    private class RequestType extends Enum
    {

        private static final RequestType $VALUES[];
        public static final RequestType MULTIPART;
        public static final RequestType NORMAL;

        public static RequestType valueOf(String s)
        {
            return (RequestType)Enum.valueOf(com/stripe/net/APIResource$RequestType, s);
        }

        public static RequestType[] values()
        {
            return (RequestType[])$VALUES.clone();
        }

        static 
        {
            NORMAL = new RequestType("NORMAL", 0);
            MULTIPART = new RequestType("MULTIPART", 1);
            $VALUES = (new RequestType[] {
                NORMAL, MULTIPART
            });
        }

        private RequestType(String s, int i)
        {
            super(s, i);
        }
    }

}
