// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth;

import android.os.Bundle;
import android.text.TextUtils;
import com.pinterest.analytics.PinterestDeepLinkMetaData;
import com.pinterest.network.json.PinterestJsonObject;

public class GroupBoardSignupHelper
{

    public static final String BOARD_INVITE_CODE = "board_invite_code";
    public static final String INVITEE_FIRST_NAME = "invitee_first_name";
    public static final String INVITER_USER_ID = "inviter_user_id";

    public GroupBoardSignupHelper()
    {
    }

    public static Bundle getBoardInviteArgs()
    {
        String as[] = getMetaDataByKeys(new String[] {
            "board_invite_code", "inviter_user_id", "invitee_first_name"
        });
        if (as == null)
        {
            return Bundle.EMPTY;
        }
        if (TextUtils.isEmpty(as[0]) || TextUtils.isEmpty(as[1]))
        {
            return Bundle.EMPTY;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putString("board_invite_code", as[0]);
            bundle.putString("inviter_user_id", as[1]);
            bundle.putString("invitee_first_name", as[2]);
            return bundle;
        }
    }

    private static String[] getMetaDataByKeys(String as[])
    {
        Object obj = PinterestDeepLinkMetaData.c();
        if (obj != null)
        {
            obj = new PinterestJsonObject(((String) (obj)));
            String as1[] = new String[as.length];
            for (int i = 0; i < as1.length; i++)
            {
                as1[i] = ((PinterestJsonObject) (obj)).a(as[i], null);
            }

            return as1;
        } else
        {
            return null;
        }
    }
}
