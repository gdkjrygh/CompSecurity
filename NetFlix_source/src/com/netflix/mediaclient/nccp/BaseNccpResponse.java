// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.nccp;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.XmlDomUtils;
import java.io.IOException;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

// Referenced classes of package com.netflix.mediaclient.nccp:
//            NccpResponse, NccpError

public abstract class BaseNccpResponse
    implements NccpResponse
{

    protected static final String RESPONSE = "nccp:response";
    protected static final String RESPONSE_HEADER = "nccp:responseheader";
    protected static final String RESPONSE_HEADER_PAYLOAD = "nccp:payload";
    protected static final String RESPONSE_PARAMETERS = "nccp:parameters";
    protected static final String RESPONSE_RESULT = "nccp:result";
    protected static final String RESPONSE_RESULT_STATUS_ERROR_ACTIONID = "nccp:actionid";
    protected static final String RESPONSE_RESULT_STATUS_ERROR_CODE = "nccp:code";
    protected static final String RESPONSE_RESULT_STATUS_ERROR_DESC = "nccp:description";
    protected static final String RESPONSE_RESULT_STATUS_SUCCESS = "nccp:success";
    protected static final String TAG = "nf_nccp";
    protected NccpError error;
    protected boolean success;

    public BaseNccpResponse(String s)
        throws IOException, ParserConfigurationException, SAXException
    {
        s = XmlDomUtils.createDocument(s);
        if (Log.isLoggable("nf_nccp", 3))
        {
            Log.d("nf_nccp", (new StringBuilder()).append("Doc: ").append(s).toString());
        }
        s = s.getDocumentElement();
        parseHeader(s);
        if (parseStatuses(s))
        {
            s = s.getElementsByTagName("nccp:result");
            verify(s, "No result in response!");
            parseResult(s);
            return;
        } else
        {
            Log.d("nf_nccp", (new StringBuilder()).append("NCCP request failed: ").append(error).toString());
            return;
        }
    }

    private void parseHeader(Element element)
    {
        element = XmlDomUtils.getFirstFoundElementValueByTagName(element, "nccp:payload");
        if (element == null)
        {
            throw new IllegalArgumentException("No payload found in response!");
        } else
        {
            Log.d("nf_nccp", (new StringBuilder()).append("Payload found ").append(element).toString());
            return;
        }
    }

    private boolean parseStatuses(Element element)
    {
        String s = XmlDomUtils.getFirstFoundElementValueByTagName(element, "nccp:success");
        if (Log.isLoggable("nf_nccp", 3))
        {
            Log.d("nf_nccp", (new StringBuilder()).append("Status: ").append(s).toString());
        }
        success = "true".equalsIgnoreCase(s);
        if (!success)
        {
            Log.d("nf_nccp", "Request failed, extract error data");
            error = new NccpError(XmlDomUtils.getFirstFoundElementValueByTagName(element, "nccp:code"), XmlDomUtils.getFirstFoundElementValueByTagName(element, "nccp:description"), XmlDomUtils.getFirstFoundElementValueByTagName(element, "nccp:actionid"));
        }
        return success;
    }

    private void verify(NodeList nodelist, String s)
        throws IllegalArgumentException
    {
        verify(nodelist, s, true);
    }

    private boolean verify(NodeList nodelist, String s, boolean flag)
        throws IllegalArgumentException
    {
        boolean flag1 = true;
        if (nodelist == null || nodelist.getLength() < 1)
        {
            if (flag)
            {
                throw new IllegalArgumentException(s);
            }
            Log.w("nf_nccp", (new StringBuilder()).append("Verify error: ").append(s).toString());
            flag1 = false;
        }
        return flag1;
    }

    public NccpError getError()
    {
        return error;
    }

    public boolean isSuccess()
    {
        return success;
    }

    protected abstract void parseResult(NodeList nodelist);
}
