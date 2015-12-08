// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;

// Referenced classes of package org.apache.http.message:
//            AbstractHttpMessage, BasicStatusLine

public class BasicHttpResponse extends AbstractHttpMessage
    implements HttpResponse
{

    private HttpEntity entity;
    private Locale locale;
    private ReasonPhraseCatalog reasonCatalog;
    private StatusLine statusline;

    public BasicHttpResponse(ProtocolVersion protocolversion, int i, String s)
    {
        this(((StatusLine) (new BasicStatusLine(protocolversion, i, s))), ((ReasonPhraseCatalog) (null)), ((Locale) (null)));
    }

    public BasicHttpResponse(StatusLine statusline1)
    {
        this(statusline1, ((ReasonPhraseCatalog) (null)), ((Locale) (null)));
    }

    public BasicHttpResponse(StatusLine statusline1, ReasonPhraseCatalog reasonphrasecatalog, Locale locale1)
    {
        if (statusline1 == null)
        {
            throw new IllegalArgumentException("Status line may not be null.");
        }
        statusline = statusline1;
        reasonCatalog = reasonphrasecatalog;
        if (locale1 == null)
        {
            locale1 = Locale.getDefault();
        }
        locale = locale1;
    }

    public HttpEntity getEntity()
    {
        return entity;
    }

    public Locale getLocale()
    {
        return locale;
    }

    public ProtocolVersion getProtocolVersion()
    {
        return statusline.getProtocolVersion();
    }

    protected String getReason(int i)
    {
        if (reasonCatalog == null)
        {
            return null;
        } else
        {
            return reasonCatalog.getReason(i, locale);
        }
    }

    public StatusLine getStatusLine()
    {
        return statusline;
    }

    public void setEntity(HttpEntity httpentity)
    {
        entity = httpentity;
    }

    public void setLocale(Locale locale1)
    {
        if (locale1 == null)
        {
            throw new IllegalArgumentException("Locale may not be null.");
        } else
        {
            locale = locale1;
            int i = statusline.getStatusCode();
            statusline = new BasicStatusLine(statusline.getProtocolVersion(), i, getReason(i));
            return;
        }
    }

    public void setReasonPhrase(String s)
    {
        if (s != null && (s.indexOf('\n') >= 0 || s.indexOf('\r') >= 0))
        {
            throw new IllegalArgumentException("Line break in reason phrase.");
        } else
        {
            statusline = new BasicStatusLine(statusline.getProtocolVersion(), statusline.getStatusCode(), s);
            return;
        }
    }

    public void setStatusCode(int i)
    {
        statusline = new BasicStatusLine(statusline.getProtocolVersion(), i, getReason(i));
    }

    public void setStatusLine(ProtocolVersion protocolversion, int i)
    {
        statusline = new BasicStatusLine(protocolversion, i, getReason(i));
    }

    public void setStatusLine(ProtocolVersion protocolversion, int i, String s)
    {
        statusline = new BasicStatusLine(protocolversion, i, s);
    }

    public void setStatusLine(StatusLine statusline1)
    {
        if (statusline1 == null)
        {
            throw new IllegalArgumentException("Status line may not be null");
        } else
        {
            statusline = statusline1;
            return;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(statusline).append(" ").append(headergroup).toString();
    }
}
