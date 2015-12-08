// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.partner;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.skype.android.util.chained.AbstractChainedStringRetriever;
import java.io.File;
import java.io.FilenameFilter;

public class FirmwareApkTrackingIDRetriever extends AbstractChainedStringRetriever
{

    private static final String PRELOAD_APP_PATH1 = "/system/app/MSSkype_stub/MSSkype_stub.apk";
    private static final String PRELOAD_APP_PATH2 = "/system/app/MSSkype_stub.apk";
    private static final String PRELOAD_APP_PREFIX = "skype_raider_stub";
    private Context context;

    public FirmwareApkTrackingIDRetriever(Context context1)
    {
        context = context1;
    }

    private String extractPartnerIdFromApk(String s)
    {
        s = context.getPackageManager().getPackageArchiveInfo(s, 0);
        if (s != null && !TextUtils.isEmpty(((PackageInfo) (s)).versionName))
        {
            return ((PackageInfo) (s)).versionName.split("[\\.\\-]")[2];
        } else
        {
            return null;
        }
    }

    protected volatile Object tryGetValue()
    {
        return tryGetValue();
    }

    protected String tryGetValue()
    {
        String s1 = null;
        String as[] = (new File("/system/app/")).list(new FilenameFilter() {

            final FirmwareApkTrackingIDRetriever this$0;

            public final boolean accept(File file, String s2)
            {
                return s2.endsWith("apk") && s2.startsWith("skype_raider_stub");
            }

            
            {
                this$0 = FirmwareApkTrackingIDRetriever.this;
                super();
            }
        });
        String s = s1;
        if (as != null)
        {
            s = s1;
            if (as.length > 0)
            {
                as = as[0].split("[-.]+");
                s = s1;
                if (as.length >= 6)
                {
                    s = s1;
                    if (Integer.parseInt(as[3]) != 0)
                    {
                        s = as[3];
                    }
                }
            }
        }
        s1 = s;
        if (TextUtils.isEmpty(s))
        {
            if ((new File("/system/app/MSSkype_stub/MSSkype_stub.apk")).exists())
            {
                s = extractPartnerIdFromApk("/system/app/MSSkype_stub/MSSkype_stub.apk");
            }
            s1 = s;
            if (TextUtils.isEmpty(s))
            {
                s1 = s;
                if ((new File("/system/app/MSSkype_stub.apk")).exists())
                {
                    s1 = extractPartnerIdFromApk("/system/app/MSSkype_stub.apk");
                }
            }
        }
        return s1;
    }
}
