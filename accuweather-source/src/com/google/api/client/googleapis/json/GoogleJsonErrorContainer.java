// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.json;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

// Referenced classes of package com.google.api.client.googleapis.json:
//            GoogleJsonError

public class GoogleJsonErrorContainer extends GenericJson
{

    private GoogleJsonError error;

    public GoogleJsonErrorContainer()
    {
    }

    public GoogleJsonErrorContainer clone()
    {
        return (GoogleJsonErrorContainer)super.clone();
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public final GoogleJsonError getError()
    {
        return error;
    }

    public GoogleJsonErrorContainer set(String s, Object obj)
    {
        return (GoogleJsonErrorContainer)super.set(s, obj);
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public final void setError(GoogleJsonError googlejsonerror)
    {
        error = googlejsonerror;
    }
}
