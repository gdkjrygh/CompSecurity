// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;

public class ApplicationVersionUtil
{

    private static final String LOG_TAG = com/dominos/utils/ApplicationVersionUtil.getSimpleName();
    private Context mContext;

    public ApplicationVersionUtil(Context context)
    {
        mContext = context;
    }

    public boolean isLatestVersion(String s)
    {
        boolean flag = StringHelper.equals(mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0).versionName, s);
        if (flag)
        {
            return true;
        }
        break MISSING_BLOCK_LABEL_50;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        LogUtil.e(LOG_TAG, "Invalid package name", namenotfoundexception, new Object[] {
            s
        });
        return false;
    }

}
