// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.util;

import android.app.Activity;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.UserApi;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import java.util.Collection;
import java.util.Iterator;

public class InviteUtil
{

    public static final int CONTACTS_INDEX = 0;
    public static final int EMAIL_INDEX = 0;
    public static final String INVITE_CODE = "invite_code";
    public static final String INVITE_CODE_TYPE_EMAIL_APP = "register_invite_email_app";
    public static final String INVITE_CODE_TYPE_FB_MESSENGER = "register_invite_fb_messenger";
    public static final String INVITE_CODE_TYPE_LINE = "register_invite_line";
    public static final String INVITE_CODE_TYPE_SMS = "register_invite_sms";
    public static final String INVITE_CODE_TYPE_WHATSAPP = "register_invite_whatsapp";
    public static final String INVITE_OBJECT = "invite_object";
    public static final int SMS_INDEX = 1;
    public static final String SOURCE_NAG_PREFIX = "nag_";
    public static final String SOURCE_SEND_SHARE_MAIN_DIALOG = "send_share_main_dialog";
    public static final String SOURCE_SEND_SHARE_MORE_APPS_DIALOG = "send_share_more_apps_dialog";
    public static final String SOURCE_SEND_SHARE_SEARCH = "send_share_search";
    public static final String SOURCE_USER_PROFILE_FIND_FRIENDS = "user_profile_find_friends";
    public static final String SOURCE_USER_PROFILE_INVITE_FRIENDS = "user_profile_invite_friends";
    public static final String SOURCE_USER_PROFILE_NAVBAR_FIND_FRIENDS = "user_profile_navbar_find_friends";
    private static String _inviteSource;

    public InviteUtil()
    {
    }

    public static String getInviteSource()
    {
        return _inviteSource;
    }

    public static void inviteUserSMS(final Activity activity, String s, final String phoneNumber, final String tag)
    {
        Pinalytics.a(ElementType.USER_FEED_INVITE_SMS, ComponentType.USER_FEED);
        UserApi.k(s, new _cls1(), tag);
    }

    public static String joinEmails(Collection collection)
    {
        StringBuffer stringbuffer = new StringBuffer();
        Iterator iterator = collection.iterator();
        for (collection = ""; iterator.hasNext(); collection = ",")
        {
            String s = (String)iterator.next();
            stringbuffer.append(collection).append(s);
        }

        return stringbuffer.toString();
    }

    public static void setInviteSource(String s)
    {
        _inviteSource = s;
    }

    private class _cls1 extends BaseApiResponseHandler
    {

        final Activity val$activity;
        final String val$phoneNumber;
        final String val$tag;

        private Intent getSMSIntent(String s, String s1)
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse((new StringBuilder("sms:")).append(s).toString()));
            intent.putExtra("sms_body", s1);
            intent.putExtra("exit_on_sent", true);
            return intent;
        }

        public final void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            Application.showToast(apiresponse.getMessage());
        }

        public final void onSuccess(ApiResponse apiresponse)
        {
            String s;
            apiresponse = ((ApiResponse) (apiresponse.getData()));
            if (!(apiresponse instanceof PinterestJsonObject))
            {
                break MISSING_BLOCK_LABEL_64;
            }
            apiresponse = (PinterestJsonObject)apiresponse;
            s = apiresponse.a("message", "");
            UserApi.a("register_invite_sms", apiresponse.a("invite_code", ""), InviteUtil.getInviteSource(), tag);
            activity.startActivityForResult(getSMSIntent(phoneNumber, s), 106);
            return;
            apiresponse;
            Application.showToast(0x7f070567);
            return;
        }

        _cls1()
        {
            tag = s;
            activity = activity1;
            phoneNumber = s1;
            super();
        }
    }

}
