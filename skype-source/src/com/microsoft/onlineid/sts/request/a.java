// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.request;

import com.microsoft.onlineid.sts.c;
import com.microsoft.onlineid.sts.f;
import com.microsoft.onlineid.sts.m;
import com.microsoft.onlineid.sts.t;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

// Referenced classes of package com.microsoft.onlineid.sts.request:
//            b, g, f

public abstract class a extends b
{

    public a()
    {
    }

    public final Document a()
    {
        Document document = a("http://www.w3.org/2003/05/soap-envelope", "s:Envelope");
        Element element = document.getDocumentElement();
        element.setAttribute("xmlns:ps", "http://schemas.microsoft.com/Passport/SoapServices/PPCRL");
        element.setAttribute("xmlns:wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
        element.setAttribute("xmlns:saml", "urn:oasis:names:tc:SAML:1.0:assertion");
        element.setAttribute("xmlns:wsp", "http://schemas.xmlsoap.org/ws/2004/09/policy");
        element.setAttribute("xmlns:wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
        element.setAttribute("xmlns:wsa", "http://www.w3.org/2005/08/addressing");
        element.setAttribute("xmlns:wssc", "http://schemas.xmlsoap.org/ws/2005/02/sc");
        element.setAttribute("xmlns:wst", "http://schemas.xmlsoap.org/ws/2005/02/trust");
        Element element1 = g.a(element, "s:Header");
        g.a(element1, "wsa:Action", "http://schemas.xmlsoap.org/ws/2005/02/trust/RST/Issue").setAttribute("s:mustUnderstand", "1");
        g.a(element1, "wsa:To", c().toString()).setAttribute("s:mustUnderstand", "1");
        g.a(element1, "wsa:MessageID", String.valueOf(System.currentTimeMillis()));
        Element element2 = g.a(element1, "ps:AuthInfo");
        element2.setAttribute("xmlns:ps", "http://schemas.microsoft.com/Passport/SoapServices/PPCRL");
        element2.setAttribute("Id", "PPAuthInfo");
        a(element2);
        if (this instanceof com.microsoft.onlineid.sts.request.f)
        {
            ((com.microsoft.onlineid.sts.request.f)this).g_().a(element2);
        }
        b(g.a(element1, "wsse:Security"));
        c(g.a(element, "s:Body"));
        if (this instanceof com.microsoft.onlineid.sts.request.f)
        {
            com.microsoft.onlineid.sts.request.f f1 = (com.microsoft.onlineid.sts.request.f)this;
            f1.g_().a(f1);
        }
        return document;
    }

    protected void a(Element element)
    {
        g.a(element, "ps:BinaryVersion", "11");
        g.a(element, "ps:DeviceType", "Android");
    }

    protected final void a(Element element, f f1)
    {
        element = g.a(element, "wsse:BinarySecurityToken", (new m(d().a(), f1)).a("{F501FD64-9070-46AB-993C-6F7B71D8D883}"));
        element.setAttribute("ValueType", "urn:liveid:sha1device");
        element.setAttribute("Id", "DeviceDAToken");
    }

    protected abstract void b(Element element);

    protected abstract void c(Element element);

    protected final void d(Element element)
    {
        element = g.a(element, "wsu:Timestamp");
        element.setAttribute("wsu:Id", "Timestamp");
        element.setAttribute("xmlns:wsu", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
        SimpleDateFormat simpledateformat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpledateformat.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date date = d().a();
        Date date1 = new Date(date.getTime() + 0x493e0L);
        g.a(element, "wsu:Created", simpledateformat.format(date));
        g.a(element, "wsu:Expires", simpledateformat.format(date1));
        if (this instanceof com.microsoft.onlineid.sts.request.f)
        {
            ((com.microsoft.onlineid.sts.request.f)this).g_().a(element);
        }
    }
}
