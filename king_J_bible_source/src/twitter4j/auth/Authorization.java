// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.auth;

import java.io.Serializable;
import twitter4j.internal.http.HttpRequest;

public interface Authorization
    extends Serializable
{

    public abstract String getAuthorizationHeader(HttpRequest httprequest);

    public abstract boolean isEnabled();
}
