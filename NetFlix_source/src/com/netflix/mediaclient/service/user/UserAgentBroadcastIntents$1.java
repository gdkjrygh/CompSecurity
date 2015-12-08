// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user;

import java.util.HashSet;

// Referenced classes of package com.netflix.mediaclient.service.user:
//            UserAgentBroadcastIntents

static final class add extends HashSet
{

    ()
    {
        add("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_ACTIVE");
        add("com.netflix.mediaclient.intent.action.NOTIFY_USER_ACCOUNT_DEACTIVE");
        add("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_ACTIVE");
        add("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_DEACTIVE");
        add("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_READY_TO_SELECT");
        add("com.netflix.mediaclient.intent.action.NOTIFY_USER_PROFILE_SELECTION_RESULT");
    }
}
