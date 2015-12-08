// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import com.soundcloud.android.api.oauth.Token;

public interface TokenListener
{

    public abstract Token onTokenInvalid(Token token);

    public abstract void onTokenRefreshed(Token token);
}
