// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.common.w.e;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.p;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.d;
import com.facebook.ui.media.b.a;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.et;
import org.apache.http.message.BasicNameValuePair;

public class bd
    implements f
{

    private final d a;
    private final a b;

    public bd(d d1, a a1)
    {
        a = d1;
        b = a1;
    }

    public n a(MediaResource mediaresource)
    {
        mediaresource = a.a(mediaresource);
        com.facebook.http.protocol.ab ab = b.a(mediaresource);
        et et1 = es.e();
        et1.b(new BasicNameValuePair("attached_files", "attach"));
        et1.b(new BasicNameValuePair("messaging_attachment", "true"));
        return n.newBuilder().a("attachment-upload").b("POST").c(mediaresource.d()).a(et1.b()).a(t.JSON).b(es.a(new com.facebook.http.a.a.a.a("attach", ab))).k();
    }

    public volatile n a(Object obj)
    {
        return a((MediaResource)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((MediaResource)obj, r1);
    }

    public String a(MediaResource mediaresource, r r1)
    {
        return e.b(r1.c().get("id"));
    }
}
