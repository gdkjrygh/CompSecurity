// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl.a;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import org.json.JSONException;

public interface a
{

    public abstract boolean b(com.fitbit.data.bl.h.a a1)
        throws ServerCommunicationException, JSONException;

    public abstract String c();
}
