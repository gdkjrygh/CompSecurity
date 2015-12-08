// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http;

import java.util.Locale;

// Referenced classes of package org.apache.http:
//            HttpMessage, HttpEntity, StatusLine, ProtocolVersion

public interface HttpResponse
    extends HttpMessage
{

    public abstract HttpEntity getEntity();

    public abstract Locale getLocale();

    public abstract StatusLine getStatusLine();

    public abstract void setEntity(HttpEntity httpentity);

    public abstract void setLocale(Locale locale);

    public abstract void setReasonPhrase(String s);

    public abstract void setStatusCode(int i);

    public abstract void setStatusLine(ProtocolVersion protocolversion, int i);

    public abstract void setStatusLine(ProtocolVersion protocolversion, int i, String s);

    public abstract void setStatusLine(StatusLine statusline);
}
