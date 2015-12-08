// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.webkit.CookieSyncManager;
import aof;
import arp;
import asl;

// Referenced classes of package com.facebook:
//            AccessTokenSource, AccessToken, AuthorizationClient, FacebookOperationCanceledException, 
//            FacebookException, FacebookServiceException, FacebookRequestError

final class a
    implements asl
{

    private is._cls0 a;
    private is._cls0 b;

    public final void a(Bundle bundle, FacebookException facebookexception)
    {
        a a1 = b;
        Object obj = a;
        if (bundle != null)
        {
            if (bundle.containsKey("e2e"))
            {
                a1.e = bundle.getString("e2e");
            }
            bundle = AccessToken.a(((e) (obj)).permissions, bundle, AccessTokenSource.e);
            facebookexception = permissions(a1._fld0.pendingRequest, bundle);
            CookieSyncManager.createInstance(a1._fld0.a).sync();
            bundle = ((AccessToken) (bundle)).token;
            obj = a1._fld0.b().a().getSharedPreferences("com.facebook.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit();
            ((android.content._cls0) (obj))._mth0("TOKEN", bundle);
            bundle = facebookexception;
            if (!((android.content._cls0) (obj))._mth0())
            {
                arp.b("Facebook-AuthorizationClient", "Could not update saved web view auth handler token.");
                bundle = facebookexception;
            }
        } else
        if (facebookexception instanceof FacebookOperationCanceledException)
        {
            bundle = is._mth0(a1._fld0.pendingRequest, "User canceled log in.");
        } else
        {
            a1.e = null;
            bundle = facebookexception.getMessage();
            if (facebookexception instanceof FacebookServiceException)
            {
                facebookexception = ((FacebookServiceException)facebookexception).error;
                bundle = String.format("%d", new Object[] {
                    Integer.valueOf(((FacebookRequestError) (facebookexception)).b)
                });
                facebookexception = facebookexception.toString();
            } else
            {
                facebookexception = bundle;
                bundle = null;
            }
            bundle = e(a1._fld0.pendingRequest, null, facebookexception, bundle);
        }
        if (!arp.a(a1.e))
        {
            AuthorizationClient.a(a1._fld0, a1.plicationId, a1.e);
        }
        a1._fld0.a(bundle);
    }

    ( ,  1)
    {
        b = ;
        a = 1;
        super();
    }
}
