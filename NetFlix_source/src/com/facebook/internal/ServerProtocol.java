// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.util.Collection;

// Referenced classes of package com.facebook.internal:
//            Utility

public final class ServerProtocol
{

    public static final String BATCHED_REST_METHOD_URL_BASE = "method/";
    public static final String DIALOG_AUTHORITY = "m.facebook.com";
    public static final String DIALOG_PARAM_ACCESS_TOKEN = "access_token";
    public static final String DIALOG_PARAM_APP_ID = "app_id";
    public static final String DIALOG_PARAM_CLIENT_ID = "client_id";
    public static final String DIALOG_PARAM_DISPLAY = "display";
    public static final String DIALOG_PARAM_REDIRECT_URI = "redirect_uri";
    public static final String DIALOG_PARAM_SCOPE = "scope";
    public static final String DIALOG_PARAM_TYPE = "type";
    public static final String DIALOG_PATH = "dialog/";
    static final String FACEBOOK_COM = "facebook.com";
    public static final String GRAPH_URL = "https://graph.facebook.com";
    public static final String GRAPH_URL_BASE = "https://graph.facebook.com/";
    public static final String REST_URL_BASE = "https://api.facebook.com/method/";
    public static final Collection errorsProxyAuthDisabled = Utility.unmodifiableCollection(new String[] {
        "service_disabled", "AndroidAuthKillSwitchException"
    });
    public static final Collection errorsUserCanceled = Utility.unmodifiableCollection(new String[] {
        "access_denied", "OAuthAccessDeniedException"
    });

    public ServerProtocol()
    {
    }

}
