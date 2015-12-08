// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.scribe.builder;

import java.io.OutputStream;
import org.scribe.builder.api.Api;
import org.scribe.exceptions.OAuthException;
import org.scribe.model.OAuthConfig;
import org.scribe.model.SignatureType;
import org.scribe.oauth.OAuthService;
import org.scribe.utils.Preconditions;

public class ServiceBuilder
{

    private Api api;
    private String apiKey;
    private String apiSecret;
    private String callback;
    private OutputStream debugStream;
    private String scope;
    private SignatureType signatureType;

    public ServiceBuilder()
    {
        callback = "oob";
        signatureType = SignatureType.Header;
        debugStream = null;
    }

    private Api createApi(Class class1)
    {
        Preconditions.checkNotNull(class1, "Api class cannot be null");
        try
        {
            class1 = (Api)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new OAuthException("Error while creating the Api object", class1);
        }
        return class1;
    }

    public ServiceBuilder apiKey(String s)
    {
        Preconditions.checkEmptyString(s, "Invalid Api key");
        apiKey = s;
        return this;
    }

    public ServiceBuilder apiSecret(String s)
    {
        Preconditions.checkEmptyString(s, "Invalid Api secret");
        apiSecret = s;
        return this;
    }

    public OAuthService build()
    {
        Preconditions.checkNotNull(api, "You must specify a valid api through the provider() method");
        Preconditions.checkEmptyString(apiKey, "You must provide an api key");
        Preconditions.checkEmptyString(apiSecret, "You must provide an api secret");
        return api.createService(new OAuthConfig(apiKey, apiSecret, callback, signatureType, scope, debugStream));
    }

    public ServiceBuilder callback(String s)
    {
        Preconditions.checkNotNull(s, "Callback can't be null");
        callback = s;
        return this;
    }

    public ServiceBuilder debug()
    {
        debugStream(System.out);
        return this;
    }

    public ServiceBuilder debugStream(OutputStream outputstream)
    {
        Preconditions.checkNotNull(outputstream, "debug stream can't be null");
        debugStream = outputstream;
        return this;
    }

    public ServiceBuilder provider(Class class1)
    {
        api = createApi(class1);
        return this;
    }

    public ServiceBuilder provider(Api api1)
    {
        Preconditions.checkNotNull(api1, "Api cannot be null");
        api = api1;
        return this;
    }

    public ServiceBuilder scope(String s)
    {
        Preconditions.checkEmptyString(s, "Invalid OAuth scope");
        scope = s;
        return this;
    }

    public ServiceBuilder signatureType(SignatureType signaturetype)
    {
        Preconditions.checkNotNull(signaturetype, "Signature type can't be null");
        signatureType = signaturetype;
        return this;
    }
}
