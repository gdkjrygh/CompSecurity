// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.validators;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.exceptions.ServerValidationException;
import java.io.IOException;
import java.net.HttpURLConnection;

public interface a
{

    public abstract void a(HttpURLConnection httpurlconnection)
        throws Throwable, ServerCommunicationException, ServerValidationException, IOException;
}
