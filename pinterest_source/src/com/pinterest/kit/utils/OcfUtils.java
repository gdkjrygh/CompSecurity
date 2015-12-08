// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.utils;

import android.app.Activity;
import android.content.Intent;
import com.pinterest.api.model.Board;
import com.pinterest.api.model.Partner;
import com.pinterest.api.model.User;
import com.pinterest.base.Constants;

public class OcfUtils
{

    public static final boolean ENABLED = true;
    public static final String FOLLOW = "follow";

    public OcfUtils()
    {
    }

    public static void addOcfFlag(Intent intent, boolean flag)
    {
        if (flag)
        {
            intent.putExtra("com.pinterest.EXTRA_OCF_FLAG", true);
        }
    }

    public static boolean hasOcfFlagOn(Activity activity)
    {
        return activity.getIntent().getBooleanExtra("com.pinterest.EXTRA_OCF_FLAG", false);
    }

    public static boolean isOcfEnabled(Board board)
    {
        if (board != null);
        return false;
    }

    public static boolean isOcfEnabled(User user)
    {
        if (user == null || user.getPartner() == null)
        {
            return false;
        } else
        {
            return Constants.isTrue(user.getPartner().getAutoFollowAllowed());
        }
    }

    public static void removeOcfFlag(Activity activity)
    {
        activity.getIntent().removeExtra("com.pinterest.EXTRA_OCF_FLAG");
    }
}
