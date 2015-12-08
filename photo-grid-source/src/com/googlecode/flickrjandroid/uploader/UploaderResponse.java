// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.uploader;

import com.googlecode.flickrjandroid.Response;
import java.util.Collection;
import org.json.JSONObject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class UploaderResponse
    implements Response
{

    private String errorCode;
    private String errorMessage;
    private String photoId;
    private Element responsePayLoad;
    private String status;
    private String ticketId;

    public UploaderResponse()
    {
    }

    public JSONObject getData()
    {
        throw new UnsupportedOperationException();
    }

    public String getErrorCode()
    {
        return errorCode;
    }

    public String getErrorMessage()
    {
        return errorMessage;
    }

    public Element getPayload()
    {
        return responsePayLoad;
    }

    public Collection getPayloadCollection()
    {
        throw new UnsupportedOperationException();
    }

    public String getPhotoId()
    {
        return photoId;
    }

    public String getRawResponse()
    {
        throw new UnsupportedOperationException();
    }

    public String getStatus()
    {
        return status;
    }

    public String getTicketId()
    {
        return ticketId;
    }

    public boolean isError()
    {
        return errorMessage != null;
    }

    public void parse(String s)
    {
        throw new UnsupportedOperationException();
    }

    public void parse(Document document)
    {
        responsePayLoad = document.getDocumentElement();
        status = responsePayLoad.getAttribute("stat");
        if ("ok".equals(status))
        {
            document = (Element)responsePayLoad.getElementsByTagName("photoid").item(0);
            if (document != null)
            {
                photoId = ((Text)document.getFirstChild()).getData();
            } else
            {
                photoId = null;
            }
            document = (Element)responsePayLoad.getElementsByTagName("ticketid").item(0);
            if (document != null)
            {
                ticketId = ((Text)document.getFirstChild()).getData();
                return;
            } else
            {
                ticketId = null;
                return;
            }
        } else
        {
            document = (Element)responsePayLoad.getElementsByTagName("err").item(0);
            errorCode = document.getAttribute("code");
            errorMessage = document.getAttribute("msg");
            return;
        }
    }
}
