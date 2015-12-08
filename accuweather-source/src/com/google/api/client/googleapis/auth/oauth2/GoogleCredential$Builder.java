// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.ClientParametersAuthentication;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.CredentialRefreshListener;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Clock;
import com.google.api.client.util.PemReader;
import com.google.api.client.util.SecurityUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Collection;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            GoogleCredential, GoogleClientSecrets

public static class setTokenServerEncodedUrl extends com.google.api.client.auth.oauth2.al.Builder
{

    String serviceAccountId;
    PrivateKey serviceAccountPrivateKey;
    String serviceAccountPrivateKeyId;
    Collection serviceAccountScopes;
    String serviceAccountUser;

    public volatile com.google.api.client.auth.oauth2. addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
    {
        return addRefreshListener(credentialrefreshlistener);
    }

    public addRefreshListener addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
    {
        return (addRefreshListener)super.reshListener(credentialrefreshlistener);
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

    public volatile com.google.api.client.auth.oauth2.al.Builder setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return setClientAuthentication(httpexecuteinterceptor);
    }

    public setClientAuthentication setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return (setClientAuthentication)super.entAuthentication(httpexecuteinterceptor);
    }

    public cation setClientSecrets(GoogleClientSecrets googleclientsecrets)
    {
        googleclientsecrets = googleclientsecrets.getDetails();
        setClientAuthentication(new ClientParametersAuthentication(googleclientsecrets.getClientId(), googleclientsecrets.getClientSecret()));
        return this;
    }

    public ls.getClientSecret setClientSecrets(String s, String s1)
    {
        setClientAuthentication(new ClientParametersAuthentication(s, s1));
        return this;
    }

    public volatile com.google.api.client.auth.oauth2.al.Builder setClock(Clock clock)
    {
        return setClock(clock);
    }

    public setClock setClock(Clock clock)
    {
        return (setClock)super.ck(clock);
    }

    public volatile com.google.api.client.auth.oauth2.al.Builder setJsonFactory(JsonFactory jsonfactory)
    {
        return setJsonFactory(jsonfactory);
    }

    public setJsonFactory setJsonFactory(JsonFactory jsonfactory)
    {
        return (setJsonFactory)super.nFactory(jsonfactory);
    }

    public volatile com.google.api.client.auth.oauth2.al.Builder setRefreshListeners(Collection collection)
    {
        return setRefreshListeners(collection);
    }

    public setRefreshListeners setRefreshListeners(Collection collection)
    {
        return (setRefreshListeners)super.reshListeners(collection);
    }

    public volatile com.google.api.client.auth.oauth2.al.Builder setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return setRequestInitializer(httprequestinitializer);
    }

    public setRequestInitializer setRequestInitializer(HttpRequestInitializer httprequestinitializer)
    {
        return (setRequestInitializer)super.uestInitializer(httprequestinitializer);
    }

    public izer setServiceAccountId(String s)
    {
        serviceAccountId = s;
        return this;
    }

    public serviceAccountId setServiceAccountPrivateKey(PrivateKey privatekey)
    {
        serviceAccountPrivateKey = privatekey;
        return this;
    }

    public serviceAccountPrivateKey setServiceAccountPrivateKeyFromP12File(File file)
        throws GeneralSecurityException, IOException
    {
        serviceAccountPrivateKey = SecurityUtils.loadPrivateKeyFromKeyStore(SecurityUtils.getPkcs12KeyStore(), new FileInputStream(file), "notasecret", "privatekey", "notasecret");
        return this;
    }

    public serviceAccountPrivateKey setServiceAccountPrivateKeyFromPemFile(File file)
        throws GeneralSecurityException, IOException
    {
        file = PemReader.readFirstSectionAndClose(new FileReader(file), "PRIVATE KEY")._mth64DecodedBytes();
        serviceAccountPrivateKey = SecurityUtils.getRsaKeyFactory().generatePrivate(new PKCS8EncodedKeySpec(file));
        return this;
    }

    public serviceAccountPrivateKey setServiceAccountPrivateKeyId(String s)
    {
        serviceAccountPrivateKeyId = s;
        return this;
    }

    public serviceAccountPrivateKeyId setServiceAccountScopes(Collection collection)
    {
        serviceAccountScopes = collection;
        return this;
    }

    public serviceAccountScopes setServiceAccountUser(String s)
    {
        serviceAccountUser = s;
        return this;
    }

    public volatile com.google.api.client.auth.oauth2.al.Builder setTokenServerEncodedUrl(String s)
    {
        return setTokenServerEncodedUrl(s);
    }

    public setTokenServerEncodedUrl setTokenServerEncodedUrl(String s)
    {
        return (setTokenServerEncodedUrl)super.enServerEncodedUrl(s);
    }

    public volatile com.google.api.client.auth.oauth2.al.Builder setTokenServerUrl(GenericUrl genericurl)
    {
        return setTokenServerUrl(genericurl);
    }

    public setTokenServerUrl setTokenServerUrl(GenericUrl genericurl)
    {
        return (setTokenServerUrl)super.enServerUrl(genericurl);
    }

    public volatile com.google.api.client.auth.oauth2.al.Builder setTransport(HttpTransport httptransport)
    {
        return setTransport(httptransport);
    }

    public setTransport setTransport(HttpTransport httptransport)
    {
        return (setTransport)super.nsport(httptransport);
    }

    public ls()
    {
        super(BearerToken.authorizationHeaderAccessMethod());
        setTokenServerEncodedUrl("https://accounts.google.com/o/oauth2/token");
    }
}
