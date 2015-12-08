// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.request;

import android.text.TextUtils;
import com.microsoft.onlineid.d;
import com.microsoft.onlineid.sts.t;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Element;

// Referenced classes of package com.microsoft.onlineid.sts.request:
//            a, g, f

public abstract class c extends a
{

    public c()
    {
    }

    protected void a(Element element)
    {
        super.a(element);
        com.microsoft.onlineid.sts.request.g.a(element, "ps:HostingApp", "{F501FD64-9070-46AB-993C-6F7B71D8D883}");
    }

    protected final void c(Element element)
    {
        List list = g();
        Element element1 = element;
        if (list.size() > 1)
        {
            element = com.microsoft.onlineid.sts.request.g.a(element, "ps:RequestMultipleSecurityTokens");
            element.setAttribute("xmlns:ps", "http://schemas.microsoft.com/Passport/SoapServices/PPCRL");
            element.setAttribute("Id", "RSTS");
            element1 = element;
            if (this instanceof f)
            {
                ((f)this).g_().a(element);
                element1 = element;
            }
        }
        int i = 0;
        for (element = list.iterator(); element.hasNext();)
        {
            Object obj = (d)element.next();
            Element element2 = com.microsoft.onlineid.sts.request.g.a(element1, "wst:RequestSecurityToken");
            element2.setAttribute("xmlns:wst", "http://schemas.xmlsoap.org/ws/2005/02/trust");
            com.microsoft.onlineid.sts.request.g.a(element2, "wst:RequestType", "http://schemas.xmlsoap.org/ws/2005/02/trust/Issue");
            Element element3 = com.microsoft.onlineid.sts.request.g.a(element2, "wsp:AppliesTo");
            element3.setAttribute("xmlns:wsp", "http://schemas.xmlsoap.org/ws/2004/09/policy");
            element3 = com.microsoft.onlineid.sts.request.g.a(element3, "wsa:EndpointReference");
            element3.setAttribute("xmlns:wsa", "http://www.w3.org/2005/08/addressing");
            com.microsoft.onlineid.sts.request.g.a(element3, "wsa:Address", ((d) (obj)).a());
            obj = ((d) (obj)).b();
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                Element element4 = com.microsoft.onlineid.sts.request.g.a(element2, "wsp:PolicyReference");
                element4.setAttribute("xmlns:wsp", "http://schemas.xmlsoap.org/ws/2004/09/policy");
                element4.setAttribute("URI", ((String) (obj)));
            }
            element2.setAttribute("Id", (new StringBuilder("RST")).append(i).toString());
            i++;
        }

    }

    protected abstract List g();
}
