// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api;

import android.os.Looper;
import com.c.a.A;
import com.c.a.B;
import com.c.a.a.i;
import com.c.a.e;
import com.c.a.r;
import com.c.a.s;
import com.c.a.t;
import com.c.a.w;
import com.c.a.x;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.ads.AdIdHelper;
import com.soundcloud.android.api.json.JsonTransformer;
import com.soundcloud.android.api.legacy.model.UnknownResource;
import com.soundcloud.android.api.oauth.OAuth;
import com.soundcloud.android.api.oauth.Token;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.java.reflect.TypeToken;
import com.soundcloud.java.strings.Charsets;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.soundcloud.android.api:
//            ApiMapperException, ApiObjectContentRequest, ApiMultipartRequest, FormPart, 
//            StringPart, FilePart, ProgressRequestBody, ApiRequest, 
//            ApiResponse, ApiRequestException, ApiUrlBuilder, UnauthorisedRequestRegistry

public class ApiClient
{

    private static final String TAG = "ApiClient";
    private final AccountOperations accountOperations;
    private final AdIdHelper adIdHelper;
    private boolean assertBackgroundThread;
    private final DeviceHelper deviceHelper;
    private final t httpClient;
    private final JsonTransformer jsonTransformer;
    private final OAuth oAuth;
    private final UnauthorisedRequestRegistry unauthorisedRequestRegistry;
    private final ApiUrlBuilder urlBuilder;

    public ApiClient(t t1, ApiUrlBuilder apiurlbuilder, JsonTransformer jsontransformer, DeviceHelper devicehelper, AdIdHelper adidhelper, OAuth oauth, UnauthorisedRequestRegistry unauthorisedrequestregistry, 
            AccountOperations accountoperations)
    {
        httpClient = t1;
        urlBuilder = apiurlbuilder;
        jsonTransformer = jsontransformer;
        deviceHelper = devicehelper;
        adIdHelper = adidhelper;
        oAuth = oauth;
        unauthorisedRequestRegistry = unauthorisedrequestregistry;
        accountOperations = accountoperations;
    }

    private x getJsonRequestBody(ApiObjectContentRequest apiobjectcontentrequest)
        throws UnsupportedEncodingException, ApiMapperException
    {
        return x.create(r.a(apiobjectcontentrequest.getContentType()), jsonTransformer.toJson(apiobjectcontentrequest.getContent()).getBytes(Charsets.UTF_8.name()));
    }

    private x getMultipartRequestBody(ApiMultipartRequest apimultipartrequest)
    {
        Object obj = new s();
        Object obj1 = s.e;
        if (obj1 == null)
        {
            throw new NullPointerException("type == null");
        }
        if (!((r) (obj1)).a.equals("multipart"))
        {
            throw new IllegalArgumentException((new StringBuilder("multipart != ")).append(obj1).toString());
        }
        obj.g = ((r) (obj1));
        obj1 = apimultipartrequest.getParts().iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            Object obj2 = (FormPart)((Iterator) (obj1)).next();
            if (obj2 instanceof StringPart)
            {
                String s1 = ((StringPart)obj2).getValue();
                ((s) (obj)).a(((FormPart) (obj2)).getPartName(), null, x.create(null, s1));
            } else
            if (obj2 instanceof FilePart)
            {
                FilePart filepart = (FilePart)obj2;
                obj2 = x.create(r.a(((FormPart) (obj2)).getContentType()), filepart.getFile());
                ((s) (obj)).a(filepart.getPartName(), filepart.getFileName(), ((x) (obj2)));
            }
        } while (true);
        if (((s) (obj)).h.isEmpty())
        {
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
        obj = new com.c.a.s.a(((s) (obj)).g, ((s) (obj)).f, ((s) (obj)).h, ((s) (obj)).i);
        if (apimultipartrequest.hasProgressListener())
        {
            return new ProgressRequestBody(((x) (obj)), apimultipartrequest.getProgressListener());
        } else
        {
            return ((x) (obj));
        }
    }

    private x getRequestBody(ApiRequest apirequest)
        throws ApiMapperException, UnsupportedEncodingException
    {
        if (apirequest instanceof ApiObjectContentRequest)
        {
            return getJsonRequestBody((ApiObjectContentRequest)apirequest);
        }
        if (apirequest instanceof ApiMultipartRequest)
        {
            return getMultipartRequestBody((ApiMultipartRequest)apirequest);
        } else
        {
            return x.create(r.a(apirequest.getAcceptMediaType()), "");
        }
    }

    private void logRequest(w w1)
    {
        (new StringBuilder("[OkHttp][")).append(Thread.currentThread().getName()).append("] ").append(w1.b).append(" ").append(w1.a).append("; headers = ").append(w1.c);
    }

    private void logResponse(A a)
    {
        (new StringBuilder("[OkHttp] ")).append(a);
    }

    private Object parseJsonResponse(ApiResponse apiresponse, TypeToken typetoken)
        throws IOException, ApiMapperException
    {
        apiresponse = ((ApiResponse) (jsonTransformer.fromJson(apiresponse.getResponseBody(), typetoken)));
        if (apiresponse == null || com/soundcloud/android/api/legacy/model/UnknownResource.isAssignableFrom(apiresponse.getClass()))
        {
            throw new ApiMapperException("Response could not be deserialized, or types do not match");
        } else
        {
            return apiresponse;
        }
    }

    private void setHttpHeaders(ApiRequest apirequest, com.c.a.w.a a)
    {
        a.a("Accept", apirequest.getAcceptMediaType());
        a.a("User-Agent", deviceHelper.getUserAgent());
        a.a("App-Version", "313");
        if (accountOperations.getSoundCloudToken().valid())
        {
            a.a("Authorization", oAuth.getAuthorizationHeaderValue());
        }
        a.a("UDID", deviceHelper.getUdid());
        Optional optional = adIdHelper.getAdId();
        if (optional.isPresent())
        {
            a.a("ADID", (String)optional.get());
            a.a("ADID-TRACKING", String.valueOf(adIdHelper.getAdIdTracking()));
        }
        java.util.Map.Entry entry;
        for (apirequest = apirequest.getHeaders().entrySet().iterator(); apirequest.hasNext(); a.a((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)apirequest.next();
        }

    }

    public Object fetchMappedResponse(ApiRequest apirequest, TypeToken typetoken)
        throws IOException, ApiRequestException, ApiMapperException
    {
        return mapResponse(fetchResponse(apirequest), typetoken);
    }

    public Object fetchMappedResponse(ApiRequest apirequest, Class class1)
        throws IOException, ApiRequestException, ApiMapperException
    {
        return fetchMappedResponse(apirequest, TypeToken.of(class1));
    }

    public ApiResponse fetchResponse(ApiRequest apirequest)
    {
        Object obj;
        Object obj1;
        int j;
        j = 0;
        if (assertBackgroundThread)
        {
            boolean flag;
            if (Thread.currentThread() != Looper.getMainLooper().getThread())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Detected execution of API request on main thread");
        }
        obj = new com.c.a.w.a();
        obj1 = apirequest.getQueryParameters();
        ((com.c.a.w.a) (obj)).a(urlBuilder.from(apirequest).withQueryParams(((com.soundcloud.java.collections.MultiMap) (obj1))).build());
        setHttpHeaders(apirequest, ((com.c.a.w.a) (obj)));
        obj1 = apirequest.getMethod();
        ((String) (obj1)).hashCode();
        JVM INSTR lookupswitch 4: default 434
    //                   70454: 172
    //                   79599: 201
    //                   2461856: 185
    //                   2012838315: 217;
           goto _L1 _L2 _L3 _L4 _L5
_L14:
        throw new IllegalArgumentException((new StringBuilder("Unsupported HTTP method: ")).append(apirequest.getMethod()).toString());
_L2:
        if (!((String) (obj1)).equals("GET")) goto _L1; else goto _L6
_L4:
        if (!((String) (obj1)).equals("POST")) goto _L1; else goto _L7
_L7:
        j = 1;
          goto _L6
_L3:
        if (!((String) (obj1)).equals("PUT")) goto _L1; else goto _L8
_L8:
        j = 2;
          goto _L6
_L5:
        if (!((String) (obj1)).equals("DELETE")) goto _L1; else goto _L9
_L9:
        j = 3;
          goto _L6
_L15:
        ((com.c.a.w.a) (obj)).a("GET", null);
_L12:
        byte abyte0[];
        r r1;
        obj = ((com.c.a.w.a) (obj)).a();
        logRequest(((w) (obj)));
        obj = httpClient.a(((w) (obj))).a();
        if (((A) (obj)).c == 401 && accountOperations.hasValidToken())
        {
            unauthorisedRequestRegistry.updateObservedUnauthorisedRequestTimestamp();
        }
        logResponse(((A) (obj)));
        j = ((A) (obj)).c;
        obj = ((A) (obj)).g;
        abyte0 = ((B) (obj)).d();
        r1 = ((B) (obj)).a();
        if (r1 == null) goto _L11; else goto _L10
_L10:
        obj = i.c;
        if (r1.b != null)
        {
            obj = Charset.forName(r1.b);
        }
_L13:
        obj = new ApiResponse(apirequest, j, new String(abyte0, ((Charset) (obj)).name()));
        return ((ApiResponse) (obj));
_L16:
        try
        {
            ((com.c.a.w.a) (obj)).a("POST", getRequestBody(apirequest));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return new ApiResponse(ApiRequestException.networkError(apirequest, ((IOException) (obj))));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return new ApiResponse(ApiRequestException.malformedInput(apirequest, ((ApiMapperException) (obj))));
        }
          goto _L12
_L17:
        ((com.c.a.w.a) (obj)).a("PUT", getRequestBody(apirequest));
          goto _L12
_L18:
        ((com.c.a.w.a) (obj)).a("DELETE", null);
          goto _L12
_L11:
        obj = i.c;
          goto _L13
_L1:
        j = -1;
_L6:
        j;
        JVM INSTR tableswitch 0 3: default 468
    //                   0 233
    //                   1 383
    //                   2 399
    //                   3 415;
           goto _L14 _L15 _L16 _L17 _L18
    }

    Object mapResponse(ApiResponse apiresponse, TypeToken typetoken)
        throws IOException, ApiRequestException, ApiMapperException
    {
        if (apiresponse.isSuccess())
        {
            if (apiresponse.hasResponseBody())
            {
                return parseJsonResponse(apiresponse, typetoken);
            } else
            {
                throw new ApiMapperException("Empty response body");
            }
        } else
        {
            throw apiresponse.getFailure();
        }
    }

    public void setAssertBackgroundThread(boolean flag)
    {
        assertBackgroundThread = flag;
    }
}
