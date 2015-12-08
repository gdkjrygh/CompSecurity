// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share.util;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import fia;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class AppInfoHelper
{

    private PackageManager a;
    private List b;

    public AppInfoHelper(PackageManager packagemanager)
    {
        a = packagemanager;
    }

    public final boolean a(App app)
    {
        return b(app) != null;
    }

    public final fia b(App app)
    {
        if (b == null)
        {
            Object obj = new Intent("android.intent.action.SEND");
            ((Intent) (obj)).setType("text/plain");
            Object obj1 = a.queryIntentActivities(((Intent) (obj)), 0);
            obj = new ArrayList();
            if (obj1 != null)
            {
                obj1 = ((List) (obj1)).iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj1)).next();
                    if (resolveinfo.activityInfo != null)
                    {
                        ((ArrayList) (obj)).add(resolveinfo.activityInfo);
                    }
                } while (true);
            }
            b = ((List) (obj));
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            ActivityInfo activityinfo = (ActivityInfo)iterator.next();
            if (activityinfo.packageName.equals(app.mPackageNameSpace))
            {
                return new fia(a, activityinfo);
            }
        }

        return null;
    }

    private class App extends Enum
    {

        public static final App a;
        public static final App b;
        public static final App c;
        public static final App d;
        public static final App e;
        public static final App f;
        public static final App g;
        public static final App h;
        public static final App i;
        public static final App j;
        private static final App k[];
        public int mId;
        public int mNameStringResId;
        public String mPackageNameSpace;

        public static App valueOf(String s)
        {
            return (App)Enum.valueOf(com/spotify/mobile/android/spotlets/share/util/AppInfoHelper$App, s);
        }

        public static App[] values()
        {
            return (App[])k.clone();
        }

        static 
        {
            a = new App("FACEBOOK", 0, 0x7f11010b, "com.facebook.katana", 0x7f0804b7);
            b = new App("FACEBOOK_MESSENGER", 1, 0x7f11010c, "com.facebook.orca", 0x7f0804b8);
            c = new App("GENERIC_EMAIL", 2, 0x7f11010d, "com.android.email", 0x7f0804b9);
            d = new App("GENERIC_MMS", 3, 0x7f11010e, "com.android.mms", 0x7f0804ba);
            e = new App("GENERIC_SMS", 4, 0x7f11010f, "com.android.sms", 0x7f0804bb);
            f = new App("GOOGLE_DOCS", 5, 0x7f110110, "com.google.android.apps.docs", 0x7f0804bc);
            g = new App("GOOGLE_HANGOUTS", 6, 0x7f110111, "com.google.android.talk", 0x7f0804bd);
            h = new App("TUMBLR", 7, 0x7f110112, "com.tumblr", 0x7f0804be);
            i = new App("TWITTER", 8, 0x7f110113, "com.twitter.android", 0x7f0804bf);
            j = new App("WHATS_APP", 9, 0x7f110114, "com.whatsapp", 0x7f0804c0);
            k = (new App[] {
                a, b, c, d, e, f, g, h, i, j
            });
        }

        private App(String s, int l, int i1, String s1, int j1)
        {
            super(s, l);
            mId = i1;
            mPackageNameSpace = s1;
            mNameStringResId = j1;
        }
    }

}
