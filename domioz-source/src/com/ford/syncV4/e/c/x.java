// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.e.c;

import com.ford.syncV4.e.h;
import java.util.Hashtable;

public final class x extends h
{

    public x()
    {
    }

    public x(Hashtable hashtable)
    {
        super(hashtable);
    }

    public final String a()
    {
        return (String)d.get("ContentType");
    }

    public final Integer b()
    {
        return (Integer)d.get("ConnectTimeout");
    }

    public final Boolean c()
    {
        return (Boolean)d.get("DoOutput");
    }

    public final Boolean d()
    {
        return (Boolean)d.get("DoInput");
    }

    public final Boolean e()
    {
        return (Boolean)d.get("UseCaches");
    }

    public final String f()
    {
        return (String)d.get("RequestMethod");
    }

    public final Integer i()
    {
        return (Integer)d.get("ReadTimeout");
    }

    public final Boolean j()
    {
        return (Boolean)d.get("InstanceFollowRedirects");
    }

    public final String k()
    {
        return (String)d.get("charset");
    }

    public final Integer l()
    {
        return (Integer)d.get("Content-Length");
    }
}
