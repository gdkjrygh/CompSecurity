// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bg;

import java.util.Hashtable;
import p.bd.h;

public class y extends h
{

    public y()
    {
    }

    public y(Hashtable hashtable)
    {
        super(hashtable);
    }

    public String a()
    {
        return (String)d.get("ContentType");
    }

    public Integer b()
    {
        return (Integer)d.get("ConnectTimeout");
    }

    public Boolean c()
    {
        return (Boolean)d.get("DoOutput");
    }

    public Boolean d()
    {
        return (Boolean)d.get("DoInput");
    }

    public Boolean e()
    {
        return (Boolean)d.get("UseCaches");
    }

    public String f()
    {
        return (String)d.get("RequestMethod");
    }

    public Integer i()
    {
        return (Integer)d.get("ReadTimeout");
    }

    public Boolean j()
    {
        return (Boolean)d.get("InstanceFollowRedirects");
    }

    public String k()
    {
        return (String)d.get("charset");
    }

    public Integer l()
    {
        return (Integer)d.get("Content-Length");
    }
}
