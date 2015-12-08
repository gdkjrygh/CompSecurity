// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook:
//            AccessTokenManager, AccessToken, GraphRequestBatch

class val.declinedPermissions
    implements lback
{

    final AccessTokenManager this$0;
    final AccessToken val$accessToken;
    final Set val$declinedPermissions;
    final Set val$permissions;
    final AtomicBoolean val$permissionsCallSucceeded;
    final freshResult val$refreshResult;

    public void onBatchCompleted(GraphRequestBatch graphrequestbatch)
    {
        if (AccessTokenManager.getInstance().getCurrentAccessToken() == null || AccessTokenManager.getInstance().getCurrentAccessToken().getUserId() != val$accessToken.getUserId())
        {
            return;
        }
        int i;
        if (val$permissionsCallSucceeded.get() || val$refreshResult.accessToken != null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        i = val$refreshResult.expiresAt;
        if (i == 0)
        {
            AccessTokenManager.access$200(AccessTokenManager.this).set(false);
            return;
        }
        if (val$refreshResult.accessToken == null) goto _L2; else goto _L1
_L1:
        graphrequestbatch = val$refreshResult.accessToken;
_L9:
        String s;
        String s1;
        s = val$accessToken.getApplicationId();
        s1 = val$accessToken.getUserId();
        if (!val$permissionsCallSucceeded.get()) goto _L4; else goto _L3
_L3:
        Set set = val$permissions;
_L10:
        if (!val$permissionsCallSucceeded.get()) goto _L6; else goto _L5
_L5:
        Set set1 = val$declinedPermissions;
_L11:
        AccessTokenSource accesstokensource = val$accessToken.getSource();
        if (val$refreshResult.expiresAt == 0) goto _L8; else goto _L7
_L7:
        Date date = new Date((long)val$refreshResult.expiresAt * 1000L);
_L12:
        graphrequestbatch = new AccessToken(graphrequestbatch, s, s1, set, set1, accesstokensource, date, new Date());
        AccessTokenManager.getInstance().setCurrentAccessToken(graphrequestbatch);
        AccessTokenManager.access$200(AccessTokenManager.this).set(false);
        return;
_L2:
        graphrequestbatch = val$accessToken.getToken();
          goto _L9
_L4:
        set = val$accessToken.getPermissions();
          goto _L10
_L6:
        set1 = val$accessToken.getDeclinedPermissions();
          goto _L11
_L8:
        date = val$accessToken.getExpires();
          goto _L12
        graphrequestbatch;
        AccessTokenManager.access$200(AccessTokenManager.this).set(false);
        throw graphrequestbatch;
          goto _L9
    }

    freshResult()
    {
        this$0 = final_accesstokenmanager;
        val$accessToken = accesstoken;
        val$permissionsCallSucceeded = atomicboolean;
        val$refreshResult = freshresult;
        val$permissions = set;
        val$declinedPermissions = Set.this;
        super();
    }
}
