// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public final class gob
{

    public final Bundle a = new Bundle();

    gob()
    {
    }

    public final gnw a()
    {
        gnw gnw1 = new gnw();
        if (a.getParcelable("com.google.android.apps.photos.core.media_collection") == null)
        {
            a.putParcelable("com.google.android.apps.photos.core.media_collection", ((ekp)a.getParcelable("com.google.android.apps.photos.core.media")).e());
        }
        gnw1.f(a);
        return gnw1;
    }

    public final gob a(ekp ekp1)
    {
        a.putParcelable("com.google.android.apps.photos.core.media", ekp1);
        return this;
    }

    public final gob a(ekq ekq)
    {
        a.putParcelable("com.google.android.apps.photos.core.media_collection", ekq);
        return this;
    }

    public final gob a(ekw ekw)
    {
        a.putParcelable("com.google.android.apps.photos.core.query_options", ekw);
        return this;
    }

    public final gob a(boolean flag)
    {
        a.putBoolean("auto_play_enabled", flag);
        return this;
    }

    public final gob b(boolean flag)
    {
        a.putBoolean("com.google.android.apps.photos.pager.allow_delete_device_copy", flag);
        return this;
    }

    public final gob c(boolean flag)
    {
        a.putBoolean("com.google.android.apps.photos.pager.allow_delete_from_trash", flag);
        return this;
    }

    public final gob d(boolean flag)
    {
        a.putBoolean("com.google.android.apps.photos.pager.allow_restore", flag);
        return this;
    }

    public final gob e(boolean flag)
    {
        a.putBoolean("com.google.android.apps.photos.pager.allow_remove", flag);
        return this;
    }

    public final gob f(boolean flag)
    {
        a.putBoolean("com.google.android.apps.photos.pager.allow_save", flag);
        return this;
    }

    public final gob g(boolean flag)
    {
        a.putBoolean("com.google.android.apps.photos.pager.allow_use_as_album_cover", flag);
        return this;
    }

    public final gob h(boolean flag)
    {
        a.putBoolean("com.google.android.apps.photos.pager.prevent_trash", flag);
        return this;
    }

    public final gob i(boolean flag)
    {
        a.putBoolean("disable_slideshow", flag);
        return this;
    }

    public final gob j(boolean flag)
    {
        a.putBoolean("com.google.android.apps.photos.pager.prevent_share", flag);
        return this;
    }

    public final gob k(boolean flag)
    {
        a.putBoolean("com.google.android.apps.photos.pager.allow_slomo_edit", flag);
        return this;
    }

    public final gob l(boolean flag)
    {
        a.putBoolean("com.google.android.apps.photos.pager.prevent_details", flag);
        return this;
    }

    public final gob m(boolean flag)
    {
        a.putBoolean("com.google.android.apps.photos.pager.prevent_edit", flag);
        return this;
    }

    public final gob n(boolean flag)
    {
        a.putBoolean("com.google.android.apps.photos.pager.prevent_print", flag);
        return this;
    }

    public final gob o(boolean flag)
    {
        a.putBoolean("com.google.android.apps.photos.pager.prevent_set_as", flag);
        return this;
    }

    public final gob p(boolean flag)
    {
        a.putBoolean("com.google.android.libraries.social.photoscast.disable_chromecast", flag);
        return this;
    }

    public final gob q(boolean flag)
    {
        a.putBoolean("com.google.android.apps.photos.pager.prevent_add_to_album", flag);
        return this;
    }
}
