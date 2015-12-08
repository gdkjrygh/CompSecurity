// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Intent;
import android.os.Bundle;
import arc;
import ark;
import arp;
import java.util.Collection;

// Referenced classes of package com.facebook:
//            AuthorizationClient, AccessTokenSource, AccessToken

class > extends >
{

    private static final long serialVersionUID = 1L;
    private String applicationId;
    final AuthorizationClient this$0;

    final String a()
    {
        return "katana_proxy_auth";
    }

    final boolean a(int i, Intent intent)
    {
        if (intent == null)
        {
            intent = >(pendingRequest, "Operation canceled");
        } else
        if (i == 0)
        {
            intent = >(pendingRequest, intent.getStringExtra("error"));
        } else
        if (i != -1)
        {
            intent = >(pendingRequest, "Unexpected resultCode from authorization.", null);
        } else
        {
            Bundle bundle = intent.getExtras();
            String s = bundle.getString("error");
            intent = s;
            if (s == null)
            {
                intent = bundle.getString("error_type");
            }
            String s2 = bundle.getString("error_code");
            String s1 = bundle.getString("error_message");
            s = s1;
            if (s1 == null)
            {
                s = bundle.getString("error_description");
            }
            s1 = bundle.getString("e2e");
            if (!arp.a(s1))
            {
                AuthorizationClient.a(AuthorizationClient.this, applicationId, s1);
            }
            if (intent == null && s2 == null && s == null)
            {
                intent = AccessToken.a(pendingRequest.rmissions, bundle, AccessTokenSource.b);
                intent = rmissions(pendingRequest, intent);
            } else
            if (ark.a.contains(intent))
            {
                intent = null;
            } else
            if (ark.b.contains(intent))
            {
                intent = rmissions(pendingRequest, null);
            } else
            {
                intent = rmissions(pendingRequest, intent, s, s2);
            }
        }
        if (intent != null)
        {
            AuthorizationClient.this.a(intent);
        } else
        {
            AuthorizationClient.this.a();
        }
        return true;
    }

    final boolean a(rmissions rmissions)
    {
        applicationId = rmissions.plicationId;
        String s = AuthorizationClient.c();
        Intent intent = arc.a(AuthorizationClient.this.a, rmissions.plicationId, rmissions.rmissions, s, rmissions.Rerequest, rmissions.faultAudience);
        a("e2e", s);
        return a(intent, rmissions.questCode);
    }

    ()
    {
        this$0 = AuthorizationClient.this;
        super(AuthorizationClient.this);
    }
}
