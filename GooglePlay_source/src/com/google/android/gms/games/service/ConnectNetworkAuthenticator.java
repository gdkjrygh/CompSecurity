// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.internal.ClientContext;

public interface ConnectNetworkAuthenticator
{

    public abstract String getAuthToken(Context context, ClientContext clientcontext, boolean flag)
        throws GoogleAuthException;
}
