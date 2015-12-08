// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import me.lyft.android.infrastructure.device.IDevice;
import rx.Observable;
import rx.functions.Func1;

public class SocialIntentProvider
{

    private static final String URI_SMS = "smsto:";
    private final ShareItem copy;
    private final IDevice device;
    private final ShareItem facebook;
    private final ShareItem gmail;
    private final ShareItem hangouts;
    private final PackageManager packageManager;
    private final ShareItem twitter;

    private SocialIntentProvider(PackageManager packagemanager, IDevice idevice, ShareItem shareitem, ShareItem shareitem1, ShareItem shareitem2, ShareItem shareitem3, ShareItem shareitem4)
    {
        packageManager = packagemanager;
        device = idevice;
        facebook = shareitem;
        twitter = shareitem1;
        gmail = shareitem2;
        hangouts = shareitem3;
        copy = shareitem4;
    }


    private Intent createSendIntent(String s)
    {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        s = findResolveInfo(intent, s);
        if (s != null)
        {
            intent.setClassName(((ResolveInfo) (s)).activityInfo.packageName, ((ResolveInfo) (s)).activityInfo.name);
            return intent;
        } else
        {
            return null;
        }
    }

    private ResolveInfo findResolveInfo(Intent intent, String s)
    {
        for (intent = packageManager.queryIntentActivities(intent, 0x10000).iterator(); intent.hasNext();)
        {
            ResolveInfo resolveinfo = (ResolveInfo)intent.next();
            if (resolveinfo.activityInfo.packageName.startsWith(s))
            {
                return resolveinfo;
            }
        }

        return null;
    }

    public Intent createShareIntent(ShareItem shareitem)
    {
        Intent intent = createSendIntent(shareitem.intentPkg);
        if (intent != null)
        {
            intent.putExtra("android.intent.extra.TEXT", shareitem.shareText);
            return intent;
        } else
        {
            return null;
        }
    }

    public Intent createSmsIntent(String s, String s1)
    {
        s = new Intent("android.intent.action.SENDTO", Uri.parse((new StringBuilder()).append("smsto:").append(s).toString()));
        s.putExtra("sms_body", s1);
        return s;
    }

    public ShareItem getCopyShareItem()
    {
        return copy;
    }

    public ShareItem getFacebookShareItem()
    {
        return facebook;
    }

    public ShareItem getGmailShareItem()
    {
        return gmail;
    }

    public ShareItem getHangoutsShareItem()
    {
        return hangouts;
    }

    public ShareItem getTwitterShareItem()
    {
        return twitter;
    }

    public Observable observeInstalledShareItems()
    {
        return Observable.just(facebook, twitter, gmail, hangouts, copy).filter(new Func1() {

            final SocialIntentProvider this$0;

            public Boolean call(ShareItem shareitem)
            {
                boolean flag;
                if (device.isPackageInstalled(shareitem.intentPkg) || shareitem == copy)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return Boolean.valueOf(flag);
            }

            public volatile Object call(Object obj)
            {
                return call((ShareItem)obj);
            }

            
            {
                this$0 = SocialIntentProvider.this;
                super();
            }
        });
    }



    private class ShareItem
    {

        final int iconResId;
        final String intentPkg;
        final String name;
        final String shareText;
        final int titleResId;

        public String getName()
        {
            return name;
        }

        ShareItem(String s, String s1, int i, int j, String s2)
        {
            shareText = s;
            intentPkg = s1;
            iconResId = i;
            titleResId = j;
            name = s2;
        }
    }

}
