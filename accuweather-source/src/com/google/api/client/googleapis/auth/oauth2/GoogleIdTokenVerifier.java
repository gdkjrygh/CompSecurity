// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.openidconnect.IdTokenVerifier;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            GooglePublicKeysManager, GoogleIdToken

public class GoogleIdTokenVerifier extends IdTokenVerifier
{
    public static class Builder extends com.google.api.client.auth.openidconnect.IdTokenVerifier.Builder
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

        public volatile com.google.api.client.auth.openidconnect.IdTokenVerifier.Builder setAcceptableTimeSkewSeconds(long l)
        {
            return setAcceptableTimeSkewSeconds(l);
        }

        public Builder setAcceptableTimeSkewSeconds(long l)
        {
            return (Builder)super.setAcceptableTimeSkewSeconds(l);
        }

        public volatile com.google.api.client.auth.openidconnect.IdTokenVerifier.Builder setAudience(Collection collection)
        {
            return setAudience(collection);
        }

        public Builder setAudience(Collection collection)
        {
            return (Builder)super.setAudience(collection);
        }

        public volatile com.google.api.client.auth.openidconnect.IdTokenVerifier.Builder setClock(Clock clock)
        {
            return setClock(clock);
        }

        public Builder setClock(Clock clock)
        {
            return (Builder)super.setClock(clock);
        }

        public volatile com.google.api.client.auth.openidconnect.IdTokenVerifier.Builder setIssuer(String s)
        {
            return setIssuer(s);
        }

        public Builder setIssuer(String s)
        {
            return (Builder)super.setIssuer(s);
        }

        public Builder setPublicCertsEncodedUrl(String s)
        {
            publicKeys = (new GooglePublicKeysManager.Builder(getTransport(), getJsonFactory())).setPublicCertsEncodedUrl(s).setClock(publicKeys.getClock()).build();
            return this;
        }

        public Builder(GooglePublicKeysManager googlepublickeysmanager)
        {
            publicKeys = (GooglePublicKeysManager)Preconditions.checkNotNull(googlepublickeysmanager);
            setIssuer("accounts.google.com");
        }

        public Builder(HttpTransport httptransport, JsonFactory jsonfactory)
        {
            this(new GooglePublicKeysManager(httptransport, jsonfactory));
        }
    }


    private final GooglePublicKeysManager publicKeys;

    protected GoogleIdTokenVerifier(Builder builder)
    {
        super(builder);
        publicKeys = builder.publicKeys;
    }

    public GoogleIdTokenVerifier(GooglePublicKeysManager googlepublickeysmanager)
    {
        this(new Builder(googlepublickeysmanager));
    }

    public GoogleIdTokenVerifier(HttpTransport httptransport, JsonFactory jsonfactory)
    {
        this(new Builder(httptransport, jsonfactory));
    }

    public final long getExpirationTimeMilliseconds()
    {
        return publicKeys.getExpirationTimeMilliseconds();
    }

    public final JsonFactory getJsonFactory()
    {
        return publicKeys.getJsonFactory();
    }

    public final String getPublicCertsEncodedUrl()
    {
        return publicKeys.getPublicCertsEncodedUrl();
    }

    public final List getPublicKeys()
        throws GeneralSecurityException, IOException
    {
        return publicKeys.getPublicKeys();
    }

    public final GooglePublicKeysManager getPublicKeysManager()
    {
        return publicKeys;
    }

    public final HttpTransport getTransport()
    {
        return publicKeys.getTransport();
    }

    public GoogleIdTokenVerifier loadPublicCerts()
        throws GeneralSecurityException, IOException
    {
        publicKeys.refresh();
        return this;
    }

    public GoogleIdToken verify(String s)
        throws GeneralSecurityException, IOException
    {
        s = GoogleIdToken.parse(getJsonFactory(), s);
        if (verify(((GoogleIdToken) (s))))
        {
            return s;
        } else
        {
            return null;
        }
    }

    public boolean verify(GoogleIdToken googleidtoken)
        throws GeneralSecurityException, IOException
    {
        if (super.verify(googleidtoken))
        {
            Iterator iterator = publicKeys.getPublicKeys().iterator();
            while (iterator.hasNext()) 
            {
                if (googleidtoken.verifySignature((PublicKey)iterator.next()))
                {
                    return true;
                }
            }
        }
        return false;
    }
}
