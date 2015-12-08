// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.ClientParametersAuthentication;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.CredentialRefreshListener;
import com.google.api.client.auth.oauth2.TokenRequest;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.googleapis.util.Utils;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.webtoken.JsonWebSignature;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Joiner;
import com.google.api.client.util.PemReader;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.SecurityUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            DefaultCredentialProvider, OAuth2Utils, GoogleClientSecrets

public class GoogleCredential extends Credential
{
    public static class Builder extends com.google.api.client.auth.oauth2.Credential.Builder
    {

        String serviceAccountId;
        PrivateKey serviceAccountPrivateKey;
        String serviceAccountPrivateKeyId;
        Collection serviceAccountScopes;
        String serviceAccountUser;

        public volatile com.google.api.client.auth.oauth2.Credential.Builder addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
        {
            return addRefreshListener(credentialrefreshlistener);
        }

        public Builder addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
        {
            return (Builder)super.addRefreshListener(credentialrefreshlistener);
        }

        public volatile Credential build()
        {
            return build();
        }

        public GoogleCredential build()
        {
            return new GoogleCredential(this);
        }

        public final String getServiceAccountId()
        {
            return serviceAccountId;
        }

        public final PrivateKey getServiceAccountPrivateKey()
        {
            return serviceAccountPrivateKey;
        }

        public final String getServiceAccountPrivateKeyId()
        {
            return serviceAccountPrivateKeyId;
        }

        public final Collection getServiceAccountScopes()
        {
            return serviceAccountScopes;
        }

        public final String getServiceAccountUser()
        {
            return serviceAccountUser;
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
        {
            return setClientAuthentication(httpexecuteinterceptor);
        }

        public Builder setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
        {
            return (Builder)super.setClientAuthentication(httpexecuteinterceptor);
        }

        public Builder setClientSecrets(GoogleClientSecrets googleclientsecrets)
        {
            googleclientsecrets = googleclientsecrets.getDetails();
            setClientAuthentication(new ClientParametersAuthentication(googleclientsecrets.getClientId(), googleclientsecrets.getClientSecret()));
            return this;
        }

        public Builder setClientSecrets(String s, String s1)
        {
            setClientAuthentication(new ClientParametersAuthentication(s, s1));
            return this;
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setClock(Clock clock)
        {
            return setClock(clock);
        }

        public Builder setClock(Clock clock)
        {
            return (Builder)super.setClock(clock);
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setJsonFactory(JsonFactory jsonfactory)
        {
            return setJsonFactory(jsonfactory);
        }

        public Builder setJsonFactory(JsonFactory jsonfactory)
        {
            return (Builder)super.setJsonFactory(jsonfactory);
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setRefreshListeners(Collection collection)
        {
            return setRefreshListeners(collection);
        }

        public Builder setRefreshListeners(Collection collection)
        {
            return (Builder)super.setRefreshListeners(collection);
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            return setRequestInitializer(httprequestinitializer);
        }

        public Builder setRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            return (Builder)super.setRequestInitializer(httprequestinitializer);
        }

        public Builder setServiceAccountId(String s)
        {
            serviceAccountId = s;
            return this;
        }

        public Builder setServiceAccountPrivateKey(PrivateKey privatekey)
        {
            serviceAccountPrivateKey = privatekey;
            return this;
        }

        public Builder setServiceAccountPrivateKeyFromP12File(File file)
            throws GeneralSecurityException, IOException
        {
            serviceAccountPrivateKey = SecurityUtils.loadPrivateKeyFromKeyStore(SecurityUtils.getPkcs12KeyStore(), new FileInputStream(file), "notasecret", "privatekey", "notasecret");
            return this;
        }

        public Builder setServiceAccountPrivateKeyFromPemFile(File file)
            throws GeneralSecurityException, IOException
        {
            file = PemReader.readFirstSectionAndClose(new FileReader(file), "PRIVATE KEY").getBase64DecodedBytes();
            serviceAccountPrivateKey = SecurityUtils.getRsaKeyFactory().generatePrivate(new PKCS8EncodedKeySpec(file));
            return this;
        }

        public Builder setServiceAccountPrivateKeyId(String s)
        {
            serviceAccountPrivateKeyId = s;
            return this;
        }

        public Builder setServiceAccountScopes(Collection collection)
        {
            serviceAccountScopes = collection;
            return this;
        }

        public Builder setServiceAccountUser(String s)
        {
            serviceAccountUser = s;
            return this;
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setTokenServerEncodedUrl(String s)
        {
            return setTokenServerEncodedUrl(s);
        }

        public Builder setTokenServerEncodedUrl(String s)
        {
            return (Builder)super.setTokenServerEncodedUrl(s);
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setTokenServerUrl(GenericUrl genericurl)
        {
            return setTokenServerUrl(genericurl);
        }

        public Builder setTokenServerUrl(GenericUrl genericurl)
        {
            return (Builder)super.setTokenServerUrl(genericurl);
        }

        public volatile com.google.api.client.auth.oauth2.Credential.Builder setTransport(HttpTransport httptransport)
        {
            return setTransport(httptransport);
        }

        public Builder setTransport(HttpTransport httptransport)
        {
            return (Builder)super.setTransport(httptransport);
        }

        public Builder()
        {
            super(BearerToken.authorizationHeaderAccessMethod());
            setTokenServerEncodedUrl("https://accounts.google.com/o/oauth2/token");
        }
    }


    static final String SERVICE_ACCOUNT_FILE_TYPE = "service_account";
    static final String USER_FILE_TYPE = "authorized_user";
    private static DefaultCredentialProvider defaultCredentialProvider = new DefaultCredentialProvider();
    private String serviceAccountId;
    private PrivateKey serviceAccountPrivateKey;
    private String serviceAccountPrivateKeyId;
    private Collection serviceAccountScopes;
    private String serviceAccountUser;

    public GoogleCredential()
    {
        this(new Builder());
    }

    protected GoogleCredential(Builder builder)
    {
        super(builder);
        if (builder.serviceAccountPrivateKey == null)
        {
            boolean flag;
            if (builder.serviceAccountId == null && builder.serviceAccountScopes == null && builder.serviceAccountUser == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            return;
        } else
        {
            serviceAccountId = (String)Preconditions.checkNotNull(builder.serviceAccountId);
            serviceAccountScopes = Collections.unmodifiableCollection(builder.serviceAccountScopes);
            serviceAccountPrivateKey = builder.serviceAccountPrivateKey;
            serviceAccountPrivateKeyId = builder.serviceAccountPrivateKeyId;
            serviceAccountUser = builder.serviceAccountUser;
            return;
        }
    }

    public static GoogleCredential fromStream(InputStream inputstream)
        throws IOException
    {
        return fromStream(inputstream, Utils.getDefaultTransport(), Utils.getDefaultJsonFactory());
    }

    public static GoogleCredential fromStream(InputStream inputstream, HttpTransport httptransport, JsonFactory jsonfactory)
        throws IOException
    {
        Preconditions.checkNotNull(inputstream);
        Preconditions.checkNotNull(httptransport);
        Preconditions.checkNotNull(jsonfactory);
        inputstream = (GenericJson)(new JsonObjectParser(jsonfactory)).parseAndClose(inputstream, OAuth2Utils.UTF_8, com/google/api/client/json/GenericJson);
        String s = (String)inputstream.get("type");
        if (s == null)
        {
            throw new IOException("Error reading credentials from stream, 'type' field not specified.");
        }
        if ("authorized_user".equals(s))
        {
            return fromStreamUser(inputstream, httptransport, jsonfactory);
        }
        if ("service_account".equals(s))
        {
            return fromStreamServiceAccount(inputstream, httptransport, jsonfactory);
        } else
        {
            throw new IOException(String.format("Error reading credentials from stream, 'type' value '%s' not recognized. Expecting '%s' or '%s'.", new Object[] {
                s, "authorized_user", "service_account"
            }));
        }
    }

    private static GoogleCredential fromStreamServiceAccount(GenericJson genericjson, HttpTransport httptransport, JsonFactory jsonfactory)
        throws IOException
    {
        String s1 = (String)genericjson.get("client_id");
        String s = (String)genericjson.get("client_email");
        Object obj = (String)genericjson.get("private_key");
        genericjson = (String)genericjson.get("private_key_id");
        if (s1 == null || s == null || obj == null || genericjson == null)
        {
            throw new IOException("Error reading service account credential from stream, expecting  'client_id', 'client_email', 'private_key' and 'private_key_id'.");
        } else
        {
            PrivateKey privatekey = privateKeyFromPkcs8(((String) (obj)));
            obj = Collections.emptyList();
            return (new Builder()).setTransport(httptransport).setJsonFactory(jsonfactory).setServiceAccountId(s).setServiceAccountScopes(((Collection) (obj))).setServiceAccountPrivateKey(privatekey).setServiceAccountPrivateKeyId(genericjson).build();
        }
    }

    private static GoogleCredential fromStreamUser(GenericJson genericjson, HttpTransport httptransport, JsonFactory jsonfactory)
        throws IOException
    {
        String s = (String)genericjson.get("client_id");
        String s1 = (String)genericjson.get("client_secret");
        genericjson = (String)genericjson.get("refresh_token");
        if (s == null || s1 == null || genericjson == null)
        {
            throw new IOException("Error reading user credential from stream,  expecting 'client_id', 'client_secret' and 'refresh_token'.");
        } else
        {
            httptransport = (new Builder()).setClientSecrets(s, s1).setTransport(httptransport).setJsonFactory(jsonfactory).build();
            httptransport.setRefreshToken(genericjson);
            httptransport.refreshToken();
            return httptransport;
        }
    }

    public static GoogleCredential getApplicationDefault()
        throws IOException
    {
        return getApplicationDefault(Utils.getDefaultTransport(), Utils.getDefaultJsonFactory());
    }

    public static GoogleCredential getApplicationDefault(HttpTransport httptransport, JsonFactory jsonfactory)
        throws IOException
    {
        Preconditions.checkNotNull(httptransport);
        Preconditions.checkNotNull(jsonfactory);
        return defaultCredentialProvider.getDefaultCredential(httptransport, jsonfactory);
    }

    private static PrivateKey privateKeyFromPkcs8(String s)
        throws IOException
    {
        s = PemReader.readFirstSectionAndClose(new StringReader(s), "PRIVATE KEY");
        if (s == null)
        {
            throw new IOException("Invalid PKCS8 data.");
        }
        s = new PKCS8EncodedKeySpec(s.getBase64DecodedBytes());
        s = SecurityUtils.getRsaKeyFactory().generatePrivate(s);
        return s;
        s;
_L2:
        throw (IOException)OAuth2Utils.exceptionWithCause(new IOException("Unexpected exception reading PKCS data"), s);
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public GoogleCredential createScoped(Collection collection)
    {
        if (serviceAccountPrivateKey == null)
        {
            return this;
        } else
        {
            return (new Builder()).setServiceAccountPrivateKey(serviceAccountPrivateKey).setServiceAccountPrivateKeyId(serviceAccountPrivateKeyId).setServiceAccountId(serviceAccountId).setServiceAccountUser(serviceAccountUser).setServiceAccountScopes(collection).setTransport(getTransport()).setJsonFactory(getJsonFactory()).setClock(getClock()).build();
        }
    }

    public boolean createScopedRequired()
    {
        while (serviceAccountPrivateKey == null || serviceAccountScopes != null && !serviceAccountScopes.isEmpty()) 
        {
            return false;
        }
        return true;
    }

    protected TokenResponse executeRefreshToken()
        throws IOException
    {
        if (serviceAccountPrivateKey == null)
        {
            return super.executeRefreshToken();
        }
        Object obj = new com.google.api.client.json.webtoken.JsonWebSignature.Header();
        ((com.google.api.client.json.webtoken.JsonWebSignature.Header) (obj)).setAlgorithm("RS256");
        ((com.google.api.client.json.webtoken.JsonWebSignature.Header) (obj)).setType("JWT");
        ((com.google.api.client.json.webtoken.JsonWebSignature.Header) (obj)).setKeyId(serviceAccountPrivateKeyId);
        Object obj1 = new com.google.api.client.json.webtoken.JsonWebToken.Payload();
        long l = getClock().currentTimeMillis();
        ((com.google.api.client.json.webtoken.JsonWebToken.Payload) (obj1)).setIssuer(serviceAccountId);
        ((com.google.api.client.json.webtoken.JsonWebToken.Payload) (obj1)).setAudience(getTokenServerEncodedUrl());
        ((com.google.api.client.json.webtoken.JsonWebToken.Payload) (obj1)).setIssuedAtTimeSeconds(Long.valueOf(l / 1000L));
        ((com.google.api.client.json.webtoken.JsonWebToken.Payload) (obj1)).setExpirationTimeSeconds(Long.valueOf(l / 1000L + 3600L));
        ((com.google.api.client.json.webtoken.JsonWebToken.Payload) (obj1)).setSubject(serviceAccountUser);
        ((com.google.api.client.json.webtoken.JsonWebToken.Payload) (obj1)).put("scope", Joiner.on(' ').join(serviceAccountScopes));
        try
        {
            obj = JsonWebSignature.signUsingRsaSha256(serviceAccountPrivateKey, getJsonFactory(), ((com.google.api.client.json.webtoken.JsonWebSignature.Header) (obj)), ((com.google.api.client.json.webtoken.JsonWebToken.Payload) (obj1)));
            obj1 = new TokenRequest(getTransport(), getJsonFactory(), new GenericUrl(getTokenServerEncodedUrl()), "urn:ietf:params:oauth:grant-type:jwt-bearer");
            ((TokenRequest) (obj1)).put("assertion", obj);
            obj = ((TokenRequest) (obj1)).execute();
        }
        catch (GeneralSecurityException generalsecurityexception)
        {
            IOException ioexception = new IOException();
            ioexception.initCause(generalsecurityexception);
            throw ioexception;
        }
        return ((TokenResponse) (obj));
    }

    public final String getServiceAccountId()
    {
        return serviceAccountId;
    }

    public final PrivateKey getServiceAccountPrivateKey()
    {
        return serviceAccountPrivateKey;
    }

    public final String getServiceAccountPrivateKeyId()
    {
        return serviceAccountPrivateKeyId;
    }

    public final Collection getServiceAccountScopes()
    {
        return serviceAccountScopes;
    }

    public final String getServiceAccountScopesAsString()
    {
        if (serviceAccountScopes == null)
        {
            return null;
        } else
        {
            return Joiner.on(' ').join(serviceAccountScopes);
        }
    }

    public final String getServiceAccountUser()
    {
        return serviceAccountUser;
    }

    public volatile Credential setAccessToken(String s)
    {
        return setAccessToken(s);
    }

    public GoogleCredential setAccessToken(String s)
    {
        return (GoogleCredential)super.setAccessToken(s);
    }

    public volatile Credential setExpirationTimeMilliseconds(Long long1)
    {
        return setExpirationTimeMilliseconds(long1);
    }

    public GoogleCredential setExpirationTimeMilliseconds(Long long1)
    {
        return (GoogleCredential)super.setExpirationTimeMilliseconds(long1);
    }

    public volatile Credential setExpiresInSeconds(Long long1)
    {
        return setExpiresInSeconds(long1);
    }

    public GoogleCredential setExpiresInSeconds(Long long1)
    {
        return (GoogleCredential)super.setExpiresInSeconds(long1);
    }

    public volatile Credential setFromTokenResponse(TokenResponse tokenresponse)
    {
        return setFromTokenResponse(tokenresponse);
    }

    public GoogleCredential setFromTokenResponse(TokenResponse tokenresponse)
    {
        return (GoogleCredential)super.setFromTokenResponse(tokenresponse);
    }

    public volatile Credential setRefreshToken(String s)
    {
        return setRefreshToken(s);
    }

    public GoogleCredential setRefreshToken(String s)
    {
        if (s != null)
        {
            boolean flag;
            if (getJsonFactory() != null && getTransport() != null && getClientAuthentication() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag, "Please use the Builder and call setJsonFactory, setTransport and setClientSecrets");
        }
        return (GoogleCredential)super.setRefreshToken(s);
    }

}
