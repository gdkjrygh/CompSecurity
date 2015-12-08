// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.nccp;

import android.content.Context;
import android.util.Base64;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.nccp.response.EmptyReponse;
import com.netflix.mediaclient.nccp.response.NccpTransactionHttpError;
import com.netflix.mediaclient.repository.SecurityRepository;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.util.AndroidManifestUtils;
import com.netflix.mediaclient.util.AndroidUtils;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.util.EntityUtils;

// Referenced classes of package com.netflix.mediaclient.nccp:
//            NccpTransaction, NccpResponseHandler, NccpResponse

public abstract class BaseNccpTransaction
    implements NccpTransaction
{

    protected static final String ENDPOINT = "https://android.nccp.netflix.com";
    protected static final String NS = "nccp";
    protected static final String TAG = "nf_nccp";
    protected static final String nccp_bcp47 = "nccp:bcp47";
    protected static final String nccp_certificationversion = "nccp:certificationversion";
    protected static final String nccp_header = "nccp:header";
    protected static final String nccp_index = "nccp:index";
    protected static final String nccp_language = "nccp:language";
    protected static final String nccp_payload = "nccp:payload";
    protected static final String nccp_platformselectedlanguages = "nccp:platformselectedlanguages";
    protected static final String nccp_preferredlanguages = "nccp:preferredlanguages";
    protected static final String nccp_request = "nccp:request";
    protected static final String nccp_sdkversion = "nccp:sdkversion";
    protected static final String nccp_softwareversion = "nccp:softwareversion";
    protected static final String nccp_uiversion = "nccp:uiversion";
    protected Context mContext;
    protected EsnProvider mEsn;
    protected NccpResponseHandler responseHandler;
    protected String userAgent;

    public BaseNccpTransaction(Context context, EsnProvider esnprovider, NccpResponseHandler nccpresponsehandler)
    {
        mContext = context;
        mEsn = esnprovider;
        responseHandler = nccpresponsehandler;
        userAgent = AndroidUtils.getUserAgent(context);
    }

    protected abstract StringBuilder createCustomRequest(StringBuilder stringbuilder);

    protected StringBuilder createHeader(StringBuilder stringbuilder)
    {
        StringBuilder stringbuilder1 = stringbuilder;
        if (stringbuilder == null)
        {
            stringbuilder1 = new StringBuilder();
        }
        stringbuilder1.append("<nccp:header>");
        stringbuilder1.append("<nccp:sdkversion>").append(SecurityRepository.getNrdLibVersion()).append("</nccp:sdkversion>");
        String s = AndroidManifestUtils.getVersionName(mContext);
        stringbuilder = s;
        if (s == null)
        {
            stringbuilder = "N/A";
        }
        stringbuilder1.append("<nccp:softwareversion>").append(stringbuilder).append("</nccp:softwareversion>");
        stringbuilder1.append("<nccp:uiversion>").append(stringbuilder).append("</nccp:uiversion>");
        stringbuilder1.append("<nccp:certificationversion>").append(0).append("</nccp:certificationversion>");
        createLanguages(stringbuilder1);
        createHeaderPayload(stringbuilder1);
        stringbuilder1.append("</nccp:header>");
        return stringbuilder1;
    }

    protected StringBuilder createHeaderPayload(StringBuilder stringbuilder)
    {
        StringBuilder stringbuilder1 = stringbuilder;
        if (stringbuilder == null)
        {
            stringbuilder1 = new StringBuilder();
        }
        stringbuilder1.append("<").append("nccp:payload").append(" compressed=\"false\" encrypted=\"false\"").append(">");
        stringbuilder1.append(Base64.encodeToString(createHeaderPayloadValue().toString().getBytes(), 2));
        stringbuilder1.append("</").append("nccp:payload").append(">");
        return stringbuilder1;
    }

    protected StringBuilder createHeaderPayloadValue()
    {
        StringBuilder stringbuilder = new StringBuilder();
        long l = System.currentTimeMillis() / 1000L;
        stringbuilder.append("<nccp:clientservertimes>");
        stringbuilder.append("<nccp:clienttime>").append(l).append("</nccp:clienttime>");
        stringbuilder.append("<nccp:servertime>").append(l).append("</nccp:servertime>");
        stringbuilder.append("</nccp:clientservertimes>");
        return stringbuilder;
    }

    protected StringBuilder createLanguages(StringBuilder stringbuilder)
    {
        StringBuilder stringbuilder1 = stringbuilder;
        if (stringbuilder == null)
        {
            stringbuilder1 = new StringBuilder();
        }
        stringbuilder1.append("<").append("nccp:preferredlanguages").append(">");
        stringbuilder1.append("<").append("nccp:platformselectedlanguages").append(">");
        stringbuilder1.append("<").append("nccp:language").append(">");
        stringbuilder1.append("<").append("nccp:index").append(">");
        stringbuilder1.append("0");
        stringbuilder1.append("</").append("nccp:index").append(">");
        stringbuilder1.append("<").append("nccp:bcp47").append(">");
        stringbuilder1.append("en-US");
        stringbuilder1.append("</").append("nccp:bcp47").append(">");
        stringbuilder1.append("</").append("nccp:language").append(">");
        stringbuilder1.append("</").append("nccp:platformselectedlanguages").append(">");
        stringbuilder1.append("</").append("nccp:preferredlanguages").append(">");
        return stringbuilder1;
    }

    protected StringBuilder createRequest(StringBuilder stringbuilder)
    {
        StringBuilder stringbuilder1 = stringbuilder;
        if (stringbuilder == null)
        {
            stringbuilder1 = new StringBuilder();
        }
        stringbuilder1.append("<?xml version='1.0' encoding='UTF-8'?>\n");
        stringbuilder1.append("<nccp:request xmlns:nccp=\"http://www.netflix.com/eds/nccp/").append(getNccpVersion()).append("\">");
        createHeader(stringbuilder1);
        createCustomRequest(stringbuilder1);
        stringbuilder1.append("</nccp:request>");
        return stringbuilder1;
    }

    public String getContentType()
    {
        return "text/xml";
    }

    public String getEndpoint()
    {
        return (new StringBuilder()).append("https://android.nccp.netflix.com/nccp/controller/").append(getNccpVersion()).append("/").append(getName()).toString();
    }

    public String getNccpVersion()
    {
        return "2.15";
    }

    public String getRequestBody()
    {
        return createRequest(null).toString();
    }

    public NccpResponseHandler getResponseHandler()
    {
        return responseHandler;
    }

    public String getUserAgent()
    {
        return userAgent;
    }

    public NccpResponse processResponse(HttpResponse httpresponse)
        throws IOException
    {
        int i = httpresponse.getStatusLine().getStatusCode();
        if (i == 200)
        {
            Log.d("nf_nccp", "Response status OK");
            httpresponse = EntityUtils.toByteArray(httpresponse.getEntity());
            if (httpresponse == null)
            {
                Log.d("nf_nccp", "Response body is null");
                return new EmptyReponse(getName());
            }
        } else
        {
            if (Log.isLoggable("nf_nccp", 3))
            {
                Log.d("nf_nccp", (new StringBuilder()).append("Server returned HTTP error code ").append(i).toString());
            }
            return new NccpTransactionHttpError(i, getName());
        }
        httpresponse = new String(httpresponse);
        if (Log.isLoggable("nf_nccp", 3))
        {
            Log.d("nf_nccp", (new StringBuilder()).append("Response body is ").append(httpresponse).toString());
        }
        return processResponseBody(httpresponse);
    }

    public abstract NccpResponse processResponseBody(String s);
}
