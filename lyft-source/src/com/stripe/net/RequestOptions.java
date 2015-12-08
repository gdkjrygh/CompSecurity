// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.stripe.net;

import com.stripe.Stripe;

public class RequestOptions
{

    private final String apiKey;
    private final String idempotencyKey;
    private final String stripeAccount;
    private final String stripeVersion;

    private RequestOptions(String s, String s1, String s2, String s3)
    {
        apiKey = s;
        stripeVersion = s1;
        idempotencyKey = s2;
        stripeAccount = s3;
    }


    public static RequestOptionsBuilder builder()
    {
        return new RequestOptionsBuilder();
    }

    public static RequestOptions getDefault()
    {
        return new RequestOptions(Stripe.apiKey, Stripe.apiVersion, null, null);
    }

    private static String normalizeApiKey(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            String s1 = s.trim();
            s = s1;
            if (s1.isEmpty())
            {
                throw new InvalidRequestOptionsException("Empty API key specified!");
            }
        }
        return s;
    }

    private static String normalizeIdempotencyKey(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            String s1 = s.trim();
            if (s1.isEmpty())
            {
                throw new InvalidRequestOptionsException("Empty Idempotency Key Specified!");
            }
            s = s1;
            if (s1.length() > 255)
            {
                throw new InvalidRequestOptionsException(String.format("Idempotency Key length was %d, which is larger than the 255 character maximum!", new Object[] {
                    Integer.valueOf(s1.length())
                }));
            }
        }
        return s;
    }

    private static String normalizeStripeAccount(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            String s1 = s.trim();
            s = s1;
            if (s1.isEmpty())
            {
                throw new InvalidRequestOptionsException("Empty stripe account specified!");
            }
        }
        return s;
    }

    private static String normalizeStripeVersion(String s)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            String s1 = s.trim();
            s = s1;
            if (s1.isEmpty())
            {
                throw new InvalidRequestOptionsException("Empty Stripe version specified!");
            }
        }
        return s;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (RequestOptions)obj;
            if (apiKey == null ? ((RequestOptions) (obj)).apiKey != null : !apiKey.equals(((RequestOptions) (obj)).apiKey))
            {
                return false;
            }
            if (idempotencyKey == null ? ((RequestOptions) (obj)).idempotencyKey != null : !idempotencyKey.equals(((RequestOptions) (obj)).idempotencyKey))
            {
                return false;
            }
            if (stripeVersion == null ? ((RequestOptions) (obj)).stripeVersion != null : !stripeVersion.equals(((RequestOptions) (obj)).stripeVersion))
            {
                return false;
            }
        }
        return true;
    }

    public String getApiKey()
    {
        return apiKey;
    }

    public String getIdempotencyKey()
    {
        return idempotencyKey;
    }

    public String getStripeAccount()
    {
        return stripeAccount;
    }

    public String getStripeVersion()
    {
        return stripeVersion;
    }

    public int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (apiKey != null)
        {
            i = apiKey.hashCode();
        } else
        {
            i = 0;
        }
        if (stripeVersion != null)
        {
            j = stripeVersion.hashCode();
        } else
        {
            j = 0;
        }
        if (idempotencyKey != null)
        {
            k = idempotencyKey.hashCode();
        }
        return (j + i * 31) * 31 + k;
    }

    public RequestOptionsBuilder toBuilder()
    {
        return (new RequestOptionsBuilder()).setApiKey(apiKey).setStripeVersion(stripeVersion).setStripeAccount(stripeAccount);
    }





    private class RequestOptionsBuilder
    {

        private String apiKey;
        private String idempotencyKey;
        private String stripeAccount;
        private String stripeVersion;

        public RequestOptions build()
        {
            return new RequestOptions(RequestOptions.normalizeApiKey(apiKey), RequestOptions.normalizeStripeVersion(stripeVersion), RequestOptions.normalizeIdempotencyKey(idempotencyKey), RequestOptions.normalizeStripeAccount(stripeAccount));
        }

        public RequestOptionsBuilder clearApiKey()
        {
            apiKey = null;
            return this;
        }

        public RequestOptionsBuilder clearIdempotencyKey()
        {
            idempotencyKey = null;
            return this;
        }

        public RequestOptionsBuilder clearStripeAccount()
        {
            return setStripeAccount(null);
        }

        public RequestOptionsBuilder clearStripeVersion()
        {
            stripeVersion = null;
            return this;
        }

        public String getApiKey()
        {
            return apiKey;
        }

        public String getIdempotencyKey()
        {
            return idempotencyKey;
        }

        public String getStripeAccount()
        {
            return stripeAccount;
        }

        public RequestOptionsBuilder setApiKey(String s)
        {
            apiKey = RequestOptions.normalizeApiKey(s);
            return this;
        }

        public RequestOptionsBuilder setIdempotencyKey(String s)
        {
            idempotencyKey = s;
            return this;
        }

        public RequestOptionsBuilder setStripeAccount(String s)
        {
            stripeAccount = s;
            return this;
        }

        public RequestOptionsBuilder setStripeVersion(String s)
        {
            stripeVersion = RequestOptions.normalizeStripeVersion(s);
            return this;
        }

        public RequestOptionsBuilder()
        {
            apiKey = Stripe.apiKey;
            stripeVersion = Stripe.apiVersion;
        }
    }


    private class InvalidRequestOptionsException extends RuntimeException
    {

        public InvalidRequestOptionsException(String s)
        {
            super(s);
        }
    }

}
