// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.request;

import com.microsoft.onlineid.sts.b.b;
import com.microsoft.onlineid.sts.b.d;
import com.microsoft.onlineid.sts.h;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

// Referenced classes of package com.microsoft.onlineid.sts.request:
//            b, g

public final class e extends com.microsoft.onlineid.sts.request.b
{

    private h a;

    public e()
    {
    }

    public final Document a()
    {
        Document document = a(null, "DeviceAddRequest");
        Element element = document.getDocumentElement();
        Element element1 = g.a(element, "ClientInfo");
        element1.setAttribute("name", "MSAAndroidApp");
        element1.setAttribute("version", "1.0");
        element = g.a(element, "Authentication");
        g.a(element, "Membername", a.a());
        g.a(element, "Password", a.b());
        return document;
    }

    public final void a(h h1)
    {
        a = h1;
    }

    public final com.microsoft.onlineid.sts.n.b b()
    {
        return com.microsoft.onlineid.sts.n.b.c;
    }

    public final b f()
    {
        return new d();
    }
}
