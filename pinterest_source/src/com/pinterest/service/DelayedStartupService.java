// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import android.app.IntentService;
import android.content.Intent;
import com.pinterest.activity.contacts.InviterManager;
import com.pinterest.activity.contacts.UploadContactsUtil;
import com.pinterest.activity.explore.util.ExploreInterestsData;
import com.pinterest.activity.notifications.util.RecentConversations;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.ApiServices;
import com.pinterest.api.remote.SendApi;
import com.pinterest.base.Application;
import com.pinterest.di.components.ApplicationComponent;
import com.pinterest.kit.log.PLog;

public class DelayedStartupService extends IntentService
{

    public static final String ACTION_CACHE_SHARE_SUGGESTIONS = "com.pinterest.action.CACHE_SHARE_SUGGESTIONS";
    public static final String ACTION_LOAD_CONVERSATIONS = "com.pinterest.action.LOAD_CONVERSATIONS";
    public static final String ACTION_LOAD_INTERESTS = "com.pinterest.action.LOAD_INTERESTS";
    public static final String ACTION_UPDATE_INVITABILITY = "com.pinterest.action.UPDATE_INVITABILITY";
    public static final String ACTION_UPLOAD_CONTACTS = "com.pinterest.action.UPLOAD_CONTACTS";

    public DelayedStartupService()
    {
        super(com/pinterest/service/DelayedStartupService.getName());
    }

    protected void onHandleIntent(Intent intent)
    {
        byte byte0;
        byte0 = 0;
        if (intent == null)
        {
            return;
        }
        intent = intent.getAction();
        if (intent == null)
        {
            PLog.error("No action in intent passed to DelayedStartupService.", new Object[0]);
            return;
        }
        intent.hashCode();
        JVM INSTR lookupswitch 5: default 80
    //                   -305689586: 121
    //                   10464583: 133
    //                   1703084013: 147
    //                   1910979995: 161
    //                   2004811962: 175;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        byte0 = -1;
          goto _L7
_L2:
        if (!intent.equals("com.pinterest.action.LOAD_CONVERSATIONS")) goto _L1; else goto _L7
_L3:
        if (!intent.equals("com.pinterest.action.LOAD_INTERESTS")) goto _L1; else goto _L8
_L8:
        byte0 = 1;
          goto _L7
_L4:
        if (!intent.equals("com.pinterest.action.UPDATE_INVITABILITY")) goto _L1; else goto _L9
_L9:
        byte0 = 2;
          goto _L7
_L5:
        if (!intent.equals("com.pinterest.action.CACHE_SHARE_SUGGESTIONS")) goto _L1; else goto _L10
_L10:
        byte0 = 3;
          goto _L7
_L6:
        if (!intent.equals("com.pinterest.action.UPLOAD_CONTACTS")) goto _L1; else goto _L11
_L11:
        byte0 = 4;
_L7:
        switch (byte0)
        {
        default:
            return;

        case 0: // '\0'
            RecentConversations.loadCachedConversations();
            return;

        case 1: // '\001'
            ExploreInterestsData.loadCachedInterests();
            return;

        case 2: // '\002'
            intent = ((Application)getApplication()).getComponent();
            intent.inviterManager().updateInvitabilityConfigs(intent.apiServices().a);
            return;

        case 3: // '\003'
            ((Application)getApplication()).getComponent().apiServices().b.a(new BaseApiResponseHandler(), "SEND_API_CACHE");
            return;

        case 4: // '\004'
            UploadContactsUtil.uploadContacts();
            break;
        }
        return;
    }
}
