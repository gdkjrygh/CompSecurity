// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.auth.oauth2;

import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.security.AccessControlException;
import java.util.Locale;

// Referenced classes of package com.google.api.client.googleapis.auth.oauth2:
//            OAuth2Utils, GoogleCredential

class DefaultCredentialProvider
{
    private static class ComputeGoogleCredential extends GoogleCredential
    {

        private static final String TOKEN_SERVER_ENCODED_URL = "http://metadata/computeMetadata/v1/instance/service-accounts/default/token";

        protected TokenResponse executeRefreshToken()
            throws IOException
        {
            Object obj = new GenericUrl(getTokenServerEncodedUrl());
            Object obj1 = getTransport().createRequestFactory().buildGetRequest(((GenericUrl) (obj)));
            obj = new JsonObjectParser(getJsonFactory());
            ((HttpRequest) (obj1)).setParser(((com.google.api.client.util.ObjectParser) (obj)));
            ((HttpRequest) (obj1)).getHeaders().set("X-Google-Metadata-Request", Boolean.valueOf(true));
            ((HttpRequest) (obj1)).setThrowExceptionOnExecuteError(false);
            obj1 = ((HttpRequest) (obj1)).execute();
            int i = ((HttpResponse) (obj1)).getStatusCode();
            if (i == 200)
            {
                InputStream inputstream = ((HttpResponse) (obj1)).getContent();
                if (inputstream == null)
                {
                    throw new IOException("Empty content from metadata token server request.");
                } else
                {
                    return (TokenResponse)((JsonObjectParser) (obj)).parseAndClose(inputstream, ((HttpResponse) (obj1)).getContentCharset(), com/google/api/client/auth/oauth2/TokenResponse);
                }
            }
            if (i == 404)
            {
                throw new IOException(String.format("Error code %s trying to get security access token from Compute Engine metadata for the default service account. This may be because the virtual machine instance does not have permission scopes specified.", new Object[] {
                    Integer.valueOf(i)
                }));
            } else
            {
                throw new IOException(String.format("Unexpected Error code %s trying to get security access token from Compute Engine metadata for the default service account: %s", new Object[] {
                    Integer.valueOf(i), ((HttpResponse) (obj1)).parseAsString()
                }));
            }
        }

        ComputeGoogleCredential(HttpTransport httptransport, JsonFactory jsonfactory)
        {
            super((new GoogleCredential.Builder()).setTransport(httptransport).setJsonFactory(jsonfactory).setTokenServerEncodedUrl("http://metadata/computeMetadata/v1/instance/service-accounts/default/token"));
        }
    }


    static final String APP_ENGINE_CREDENTIAL_CLASS = "com.google.api.client.googleapis.extensions.appengine.auth.oauth2.AppIdentityCredential$AppEngineCredentialWrapper";
    static final String CLOUDSDK_CONFIG_DIRECTORY = "gcloud";
    static final String CREDENTIAL_ENV_VAR = "GOOGLE_APPLICATION_CREDENTIALS";
    static final String HELP_PERMALINK = "https://developers.google.com/accounts/docs/application-default-credentials";
    static final String WELL_KNOWN_CREDENTIALS_FILE = "application_default_credentials.json";
    private GoogleCredential cachedCredential;
    private boolean checkedAppEngine;
    private boolean checkedComputeEngine;

    DefaultCredentialProvider()
    {
        cachedCredential = null;
        checkedAppEngine = false;
        checkedComputeEngine = false;
    }

    private final GoogleCredential getDefaultCredentialUnsynchronized(HttpTransport httptransport, JsonFactory jsonfactory)
        throws IOException
    {
        Object obj;
        Object obj2;
        String s;
        obj2 = null;
        s = getEnv("GOOGLE_APPLICATION_CREDENTIALS");
        obj = obj2;
        if (s == null) goto _L2; else goto _L1
_L1:
        obj = obj2;
        if (s.length() <= 0) goto _L2; else goto _L3
_L3:
        Object obj1;
        Object obj3;
        File file;
        obj1 = null;
        file = null;
        obj3 = null;
        obj = obj1;
        File file1 = new File(s);
        obj = obj1;
        if (!file1.exists()) goto _L5; else goto _L4
_L4:
        obj = obj1;
        if (!file1.isDirectory()) goto _L6; else goto _L5
_L5:
        obj = obj1;
        throw new IOException("File does not exist.");
        httptransport;
        obj = obj3;
_L13:
        throw (IOException)OAuth2Utils.exceptionWithCause(new IOException(String.format("Error reading credential file from environment variable %s, value '%s': %s", new Object[] {
            "GOOGLE_APPLICATION_CREDENTIALS", s, httptransport.getMessage()
        })), httptransport);
        httptransport;
_L10:
        if (obj != null)
        {
            ((InputStream) (obj)).close();
        }
        throw httptransport;
_L6:
        obj = obj1;
        obj1 = new FileInputStream(file1);
        obj = GoogleCredential.fromStream(((InputStream) (obj1)), httptransport, jsonfactory);
        obj2 = obj;
        obj = obj2;
        if (obj1 != null)
        {
            ((InputStream) (obj1)).close();
            obj = obj2;
        }
_L2:
        obj1 = obj;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        file = getWellKnownCredentialsFile();
        obj1 = obj;
        boolean flag = fileExists(file);
        obj1 = obj;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        obj1 = null;
        obj3 = null;
        obj2 = new FileInputStream(file);
        obj1 = GoogleCredential.fromStream(((InputStream) (obj2)), httptransport, jsonfactory);
        obj = obj1;
        obj1 = obj;
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        obj1 = obj;
        ((InputStream) (obj2)).close();
        obj1 = obj;
_L7:
        obj = obj1;
        if (obj1 == null)
        {
            obj = tryGetAppEngineCredential(httptransport, jsonfactory);
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = tryGetComputeCredential(httptransport, jsonfactory);
        }
        return ((GoogleCredential) (obj1));
        obj;
        obj1 = file;
_L11:
        obj = obj2;
        if (obj1 != null)
        {
            ((InputStream) (obj1)).close();
            obj = obj2;
        }
          goto _L2
        obj2;
        obj1 = obj3;
_L9:
        throw new IOException(String.format("Error reading credential file from location %s: %s", new Object[] {
            file, ((IOException) (obj2)).getMessage()
        }));
        Object obj4;
        obj4;
        obj2 = obj1;
_L8:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_377;
        }
        obj1 = obj;
        ((InputStream) (obj2)).close();
        obj1 = obj;
        try
        {
            throw obj4;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
          goto _L7
        obj4;
          goto _L8
        obj4;
        obj1 = obj2;
        obj2 = obj4;
          goto _L9
        httptransport;
        obj = obj1;
          goto _L10
        obj;
          goto _L11
        httptransport;
        obj = obj1;
        if (true) goto _L13; else goto _L12
_L12:
    }

    private final File getWellKnownCredentialsFile()
    {
        File file;
        if (getProperty("os.name", "").toLowerCase(Locale.US).indexOf("windows") >= 0)
        {
            file = new File(new File(getEnv("APPDATA")), "gcloud");
        } else
        {
            file = new File(new File(getProperty("user.home", ""), ".config"), "gcloud");
        }
        return new File(file, "application_default_credentials.json");
    }

    private final GoogleCredential tryGetAppEngineCredential(HttpTransport httptransport, JsonFactory jsonfactory)
    {
        if (checkedAppEngine)
        {
            return null;
        }
        checkedAppEngine = true;
        httptransport = (GoogleCredential)forName("com.google.api.client.googleapis.extensions.appengine.auth.oauth2.AppIdentityCredential$AppEngineCredentialWrapper").getConstructor(new Class[] {
            com/google/api/client/http/HttpTransport, com/google/api/client/json/JsonFactory
        }).newInstance(new Object[] {
            httptransport, jsonfactory
        });
        return httptransport;
        httptransport;
_L2:
        return null;
        httptransport;
        continue; /* Loop/switch isn't completed */
        httptransport;
        continue; /* Loop/switch isn't completed */
        httptransport;
        continue; /* Loop/switch isn't completed */
        httptransport;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private final GoogleCredential tryGetComputeCredential(HttpTransport httptransport, JsonFactory jsonfactory)
    {
        if (!checkedComputeEngine)
        {
            boolean flag = OAuth2Utils.runningOnComputeEngine(httptransport);
            checkedComputeEngine = true;
            if (flag)
            {
                return new ComputeGoogleCredential(httptransport, jsonfactory);
            }
        }
        return null;
    }

    boolean fileExists(File file)
    {
        return file.exists() && !file.isDirectory();
    }

    Class forName(String s)
        throws ClassNotFoundException
    {
        return Class.forName(s);
    }

    final GoogleCredential getDefaultCredential(HttpTransport httptransport, JsonFactory jsonfactory)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (cachedCredential == null)
        {
            cachedCredential = getDefaultCredentialUnsynchronized(httptransport, jsonfactory);
        }
        if (cachedCredential == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        httptransport = cachedCredential;
        return httptransport;
        this;
        JVM INSTR monitorexit ;
        throw new IOException(String.format("The Application Default Credentials are not available. They are available if running in Google Compute Engine. Otherwise, the environment variable %s must be defined pointing to a file defining the credentials. See %s for more information.", new Object[] {
            "GOOGLE_APPLICATION_CREDENTIALS", "https://developers.google.com/accounts/docs/application-default-credentials"
        }));
        httptransport;
        this;
        JVM INSTR monitorexit ;
        throw httptransport;
    }

    String getEnv(String s)
    {
        return System.getenv(s);
    }

    String getProperty(String s, String s1)
    {
        return System.getProperty(s, s1);
    }
}
