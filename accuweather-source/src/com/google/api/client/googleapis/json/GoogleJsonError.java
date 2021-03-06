// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.json;

import com.google.api.client.http.HttpResponse;
import com.google.api.client.json.GenericJson;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.Data;
import com.google.api.client.util.GenericData;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class GoogleJsonError extends GenericJson
{
    public static class ErrorInfo extends GenericJson
    {

        private String domain;
        private String location;
        private String locationType;
        private String message;
        private String reason;

        public ErrorInfo clone()
        {
            return (ErrorInfo)super.clone();
        }

        public volatile GenericJson clone()
        {
            return clone();
        }

        public volatile GenericData clone()
        {
            return clone();
        }

        public volatile Object clone()
            throws CloneNotSupportedException
        {
            return clone();
        }

        public final String getDomain()
        {
            return domain;
        }

        public final String getLocation()
        {
            return location;
        }

        public final String getLocationType()
        {
            return locationType;
        }

        public final String getMessage()
        {
            return message;
        }

        public final String getReason()
        {
            return reason;
        }

        public ErrorInfo set(String s, Object obj)
        {
            return (ErrorInfo)super.set(s, obj);
        }

        public volatile GenericJson set(String s, Object obj)
        {
            return set(s, obj);
        }

        public volatile GenericData set(String s, Object obj)
        {
            return set(s, obj);
        }

        public final void setDomain(String s)
        {
            domain = s;
        }

        public final void setLocation(String s)
        {
            location = s;
        }

        public final void setLocationType(String s)
        {
            locationType = s;
        }

        public final void setMessage(String s)
        {
            message = s;
        }

        public final void setReason(String s)
        {
            reason = s;
        }

        public ErrorInfo()
        {
        }
    }


    private int code;
    private List errors;
    private String message;

    public GoogleJsonError()
    {
    }

    public static GoogleJsonError parse(JsonFactory jsonfactory, HttpResponse httpresponse)
        throws IOException
    {
        return (GoogleJsonError)(new com.google.api.client.json.JsonObjectParser.Builder(jsonfactory)).setWrapperKeys(Collections.singleton("error")).build().parseAndClose(httpresponse.getContent(), httpresponse.getContentCharset(), com/google/api/client/googleapis/json/GoogleJsonError);
    }

    public GoogleJsonError clone()
    {
        return (GoogleJsonError)super.clone();
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final int getCode()
    {
        return code;
    }

    public final List getErrors()
    {
        return errors;
    }

    public final String getMessage()
    {
        return message;
    }

    public GoogleJsonError set(String s, Object obj)
    {
        return (GoogleJsonError)super.set(s, obj);
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public final void setCode(int i)
    {
        code = i;
    }

    public final void setErrors(List list)
    {
        errors = list;
    }

    public final void setMessage(String s)
    {
        message = s;
    }

    static 
    {
        Data.nullOf(com/google/api/client/googleapis/json/GoogleJsonError$ErrorInfo);
    }
}
