// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import org.json.JSONException;

public interface h
{
    public static interface a
    {

        public abstract boolean a();
    }


    public abstract void a(a a1)
        throws ServerCommunicationException, JSONException;
}
