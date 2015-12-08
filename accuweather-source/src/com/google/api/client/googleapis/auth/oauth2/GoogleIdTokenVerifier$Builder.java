// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.openidconnect.IdTokenVerifier;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Preconditions;
import java.util.Collection;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            GoogleIdTokenVerifier, GooglePublicKeysManager

public static class  extends com.google.api.client.auth.openidconnect.der
{

    GooglePublicKeysManager publicKeys;

    public volatile IdTokenVerifier build()
    {
        return build();
    }

    public GoogleIdTokenVerifier build()
    {
        return new GoogleIdTokenVerifier(this);
    }

    public final JsonFactory getJsonFactory()
    {
        return publicKeys.getJsonFactory();
    }

    public final GooglePublicKeysManager getPublicCerts()
    {
        return publicKeys;
    }

    public final String getPublicCertsEncodedUrl()
    {
        return publicKeys.getPublicCertsEncodedUrl();
    }

    public final HttpTransport getTransport()
    {
        return publicKeys.getTransport();
    }

    public volatile com.google.api.client.auth.openidconnect.der setAcceptableTimeSkewSeconds(long l)
    {
        return setAcceptableTimeSkewSeconds(l);
    }

    public setAcceptableTimeSkewSeconds setAcceptableTimeSkewSeconds(long l)
    {
        return (setAcceptableTimeSkewSeconds)super.eptableTimeSkewSeconds(l);
    }

    public volatile com.google.api.client.auth.openidconnect.der setAudience(Collection collection)
    {
        return setAudience(collection);
    }

    public setAudience setAudience(Collection collection)
    {
        return (setAudience)super.ience(collection);
    }

    public volatile com.google.api.client.auth.openidconnect.der setClock(Clock clock)
    {
        return setClock(clock);
    }

    public setClock setClock(Clock clock)
    {
        return (setClock)super.ck(clock);
    }

    public volatile com.google.api.client.auth.openidconnect.der setIssuer(String s)
    {
        return setIssuer(s);
    }

    public setIssuer setIssuer(String s)
    {
        return (setIssuer)super.uer(s);
    }

    public setIssuer setPublicCertsEncodedUrl(String s)
    {
        publicKeys = (new r(getTransport(), getJsonFactory())).setPublicCertsEncodedUrl(s).setClock(publicKeys.getClock()).build();
        return this;
    }

    public r(GooglePublicKeysManager googlepublickeysmanager)
    {
        publicKeys = (GooglePublicKeysManager)Preconditions.checkNotNull(googlepublickeysmanager);
        setIssuer("accounts.google.com");
    }

    public setIssuer(HttpTransport httptransport, JsonFactory jsonfactory)
    {
        this(new GooglePublicKeysManager(httptransport, jsonfactory));
    }
}
