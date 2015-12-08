// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.io.Serializable;
import org.json.JSONException;

// Referenced classes of package com.facebook:
//            AppEventsLogger

private static class <init>
    implements Serializable
{

    private static final long serialVersionUID = 0xdd772aee317ab613L;
    private final boolean isImplicit;
    private final String jsonString;

    private Object readResolve()
        throws JSONException
    {
        return new <init>(jsonString, isImplicit, null);
    }

    private (String s, boolean flag)
    {
        jsonString = s;
        isImplicit = flag;
    }

    isImplicit(String s, boolean flag, isImplicit isimplicit)
    {
        this(s, flag);
    }
}
