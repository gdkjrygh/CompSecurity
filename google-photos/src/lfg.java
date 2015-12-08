// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.URI;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;

public final class lfg extends HttpEntityEnclosingRequestBase
{

    public lfg()
    {
    }

    public lfg(String s)
    {
        setURI(URI.create(s));
    }

    public final String getMethod()
    {
        return "PATCH";
    }
}
