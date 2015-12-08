// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.scribe.builder.api;

import org.scribe.model.OAuthConfig;
import org.scribe.oauth.OAuthService;

public interface Api
{

    public abstract OAuthService createService(OAuthConfig oauthconfig);
}
