// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.net.a;

import java.net.URI;
import kik.a.d.j;
import kik.a.z;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.params.HttpConnectionParams;

public abstract class k extends HttpEntityEnclosingRequestBase
{

    public k(String s, z z1)
    {
        setURI(URI.create(s));
        addHeader("x-kik-jid", z1.a().a());
        addHeader("x-kik-password", z1.b());
    }

    public final void a()
    {
        org.apache.http.params.HttpParams httpparams = getParams();
        HttpConnectionParams.setSoTimeout(httpparams, 20000);
        HttpConnectionParams.setConnectionTimeout(httpparams, 20000);
        setParams(httpparams);
    }
}
