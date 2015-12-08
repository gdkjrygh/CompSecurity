// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.photos.pager.HostPhotoPagerActivity;

public final class gne
{

    public final Intent a;

    public gne(Context context, int i)
    {
        a = new Intent(context, com/google/android/apps/photos/pager/HostPhotoPagerActivity);
        a.putExtra("account_id", i);
    }

    public final gne a(int i)
    {
        a.setFlags(i);
        return this;
    }

    public final gne a(Uri uri, String s)
    {
        a.setDataAndType(uri, s);
        return this;
    }

    public final gne a(ekp ekp)
    {
        a.putExtra("com.google.android.apps.photos.core.media", ekp);
        return this;
    }

    public final gne a(ekq ekq)
    {
        a.putExtra("com.google.android.apps.photos.core.media_collection", ekq);
        return this;
    }

    public final gne a(boolean flag)
    {
        a.putExtra("up_as_back", flag);
        return this;
    }

    public final gne b(boolean flag)
    {
        a.putExtra("com.google.android.apps.photos.pager.prevent_trash", flag);
        return this;
    }

    public final gne c(boolean flag)
    {
        a.putExtra("com.google.android.apps.photos.pager.prevent_edit", true);
        return this;
    }

    public final gne d(boolean flag)
    {
        a.putExtra("disable_slideshow", true);
        return this;
    }

    public final gne e(boolean flag)
    {
        a.putExtra("com.google.android.apps.photos.pager.prevent_print", true);
        return this;
    }

    public final gne f(boolean flag)
    {
        a.putExtra("com.google.android.apps.photos.pager.prevent_set_as", true);
        return this;
    }

    public final gne g(boolean flag)
    {
        a.putExtra("com.google.android.apps.photos.pager.prevent_share", flag);
        return this;
    }

    public final gne h(boolean flag)
    {
        a.putExtra("auto_play_enabled", flag);
        return this;
    }
}
