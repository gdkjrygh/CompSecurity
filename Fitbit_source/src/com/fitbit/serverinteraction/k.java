// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.serverinteraction.b.g;
import java.io.InputStream;

public abstract class k
{

    protected static final String a = "ParsedResponse";
    private Object b;

    public k()
    {
        b = null;
    }

    public void a(g g1, InputStream inputstream, String s)
        throws ServerCommunicationException, Throwable
    {
        if (b == null && inputstream != null && g1 != null)
        {
            b = g1.b(inputstream, s);
        }
    }

    public Object f()
    {
        return b;
    }
}
