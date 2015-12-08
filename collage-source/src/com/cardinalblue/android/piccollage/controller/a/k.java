// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.YoutubeActivity;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;
import com.cardinalblue.android.piccollage.model.InstallRequirement;
import com.cardinalblue.android.piccollage.model.StickerBundle;

public class k
{
    private static class a
        implements b
    {

        public void a(Fragment fragment, Object obj)
        {
            obj = new Intent(fragment.getActivity(), com/cardinalblue/android/piccollage/auth/PicLoginActivity);
            ((Intent) (obj)).putExtra("from", "login stickers");
            fragment.startActivityForResult(((Intent) (obj)), 200);
        }

        public boolean a()
        {
            return PicAuth.h().b();
        }

        public int b()
        {
            return 0x7f0701ff;
        }

        private a()
        {
        }

    }

    public static interface b
    {

        public abstract void a(Fragment fragment, Object obj);

        public abstract boolean a();

        public abstract int b();
    }

    public static class c
        implements b
    {

        private boolean a;

        public void a(Fragment fragment, Object obj)
        {
            com.cardinalblue.android.piccollage.a.b.bI();
            com.cardinalblue.android.piccollage.controller.d.a().c(new com.cardinalblue.android.piccollage.view.fragments.FreeStickerBundleFragment.OnWatchVideoForDownloadPackEvent((StickerBundle)obj));
        }

        public void a(boolean flag)
        {
            a = flag;
        }

        public boolean a()
        {
            return !a;
        }

        public int b()
        {
            return 0x7f07012f;
        }

        public c()
        {
            a = false;
        }
    }

    private static class d
        implements b
    {

        private final InstallRequirement a;

        public void a(Fragment fragment, Object obj)
        {
            obj = new Intent(fragment.getActivity(), com/cardinalblue/android/piccollage/activities/YoutubeActivity);
            ((Intent) (obj)).putExtra("extra_video_id", a.b());
            fragment.startActivityForResult(((Intent) (obj)), 201);
        }

        public boolean a()
        {
            return false;
        }

        public int b()
        {
            return 0x7f07012f;
        }

        public d(InstallRequirement installrequirement)
        {
            a = installrequirement;
        }
    }


    public k()
    {
    }

    public static b a(InstallRequirement installrequirement)
    {
        if (installrequirement == null)
        {
            return null;
        }
        String s = installrequirement.a();
        if ("cb_login".equals(s))
        {
            return new a();
        }
        if ("youtube_video".equals(s))
        {
            return new d(installrequirement);
        }
        if ("video_ad".equals(s))
        {
            return new c();
        } else
        {
            f.a(new IllegalArgumentException((new StringBuilder()).append("unknown requirement: ").append(s).toString()));
            return null;
        }
    }
}
