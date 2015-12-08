// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.spotify.cosmos.router.Response;

interface 
{

    public abstract void onError(Throwable throwable);

    public abstract void onSuccess(Response response);
}
