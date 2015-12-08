// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public class gxg
{

    boolean a;
    public boolean b;
    boolean c;
    public boolean d;
    boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    boolean i;
    public boolean j;
    boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    boolean o;
    boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;

    public gxg(Bundle bundle)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (!bundle.getBoolean("com.google.android.apps.photos.pager.prevent_background_fragment", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        i = bundle.getBoolean("for_animation", false);
        if (i)
        {
            return;
        }
        if (bundle.getBoolean("force_return_edit_list", false))
        {
            h = true;
            return;
        }
        a = true;
        e = bundle.getBoolean("com.google.android.apps.photos.pager.allow_delete_device_copy", false);
        f = bundle.getBoolean("com.google.android.apps.photos.pager.allow_delete_from_trash", false);
        k = bundle.getBoolean("com.google.android.apps.photos.pager.allow_remove", false);
        l = bundle.getBoolean("com.google.android.apps.photos.pager.allow_report_abuse", false);
        m = bundle.getBoolean("com.google.android.apps.photos.pager.allow_restore", false);
        n = bundle.getBoolean("com.google.android.apps.photos.pager.allow_save", false);
        p = bundle.getBoolean("com.google.android.apps.photos.pager.allow_envelope_save", false);
        q = bundle.getBoolean("com.google.android.apps.photos.pager.allow_use_as_album_cover", false);
        if (!bundle.getBoolean("com.google.android.apps.photos.pager.prevent_add_to_album", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        if (!bundle.getBoolean("com.google.android.libraries.social.photoscast.disable_chromecast", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (!bundle.getBoolean("com.google.android.apps.photos.pager.prevent_details", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (!bundle.getBoolean("com.google.android.apps.photos.pager.prevent_edit", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (!bundle.getBoolean("com.google.android.apps.photos.pager.prevent_print", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        if (!bundle.getBoolean("com.google.android.apps.photos.pager.prevent_set_as", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r = flag;
        if (!bundle.getBoolean("com.google.android.apps.photos.pager.prevent_share", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = flag;
        o = bundle.getBoolean("com.google.android.apps.photos.pager.allow_slomo_edit", true);
        if (!bundle.getBoolean("com.google.android.apps.photos.pager.prevent_trash", false))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        t = flag;
    }
}
