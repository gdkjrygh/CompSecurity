// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.util.ArrayList;

// Referenced classes of package com.facebook:
//            AuthorizationClient, AccessToken, RequestBatch

class val.declinedPermissions
    implements val.declinedPermissions
{

    final AuthorizationClient this$0;
    final ArrayList val$declinedPermissions;
    final ArrayList val$fbids;
    final ArrayList val$grantedPermissions;
    final sult val$pendingResult;

    public void onBatchCompleted(RequestBatch requestbatch)
    {
        if (val$fbids.size() != 2 || val$fbids.get(0) == null || val$fbids.get(1) == null || !((String)val$fbids.get(0)).equals(val$fbids.get(1)))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        requestbatch = AccessToken.createFromTokenWithRefreshedPermissions(val$pendingResult.token, val$grantedPermissions, val$declinedPermissions);
        requestbatch = sult.createTokenResult(pendingRequest, requestbatch);
_L1:
        complete(requestbatch);
        AuthorizationClient.access$000(AuthorizationClient.this);
        return;
        requestbatch = sult.createErrorResult(pendingRequest, "User logged in as different Facebook user.", null);
          goto _L1
        requestbatch;
        complete(sult.createErrorResult(pendingRequest, "Caught exception", requestbatch.getMessage()));
        AuthorizationClient.access$000(AuthorizationClient.this);
        return;
        requestbatch;
        AuthorizationClient.access$000(AuthorizationClient.this);
        throw requestbatch;
    }

    sult()
    {
        this$0 = final_authorizationclient;
        val$fbids = arraylist;
        val$pendingResult = sult;
        val$grantedPermissions = arraylist1;
        val$declinedPermissions = ArrayList.this;
        super();
    }
}
