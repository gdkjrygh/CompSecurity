// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class hee
{

    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public String f;
    public String g;
    public ekw h;
    public boolean i;
    public ekq j;
    public ekp k;
    private final Context l;
    private final hef m;

    public hee(Context context)
    {
        a = -1;
        b = 2;
        c = 1;
        d = 0x7fffffff;
        e = 0x7fffffffL;
        h = ekw.a;
        l = context;
        m = (hef)olm.a(context, hef);
    }

    public final Intent a()
    {
        Intent intent = m.a(l);
        intent.putExtra("com.google.android.apps.photos.core.query_options", h);
        if (a != -1)
        {
            intent.putExtra("account_id", a);
        }
        intent.putExtra("com.google.android.apps.photos.selection.ExtraPhotoPickerMode", b);
        intent.putExtra("com.google.android.apps.photos.selection.cabmode.extra_min_selection_count", c);
        if (d != 0x7fffffff)
        {
            intent.putExtra("com.google.android.apps.photos.selection.cabmode.extra_max_selection_count", d);
        }
        if (f != null)
        {
            intent.putExtra("com.google.android.apps.photos.selection.cabmode.extra_selection_title", f);
        }
        if (g != null)
        {
            intent.putExtra("com.google.android.apps.photos.selection.cabmode.extra_selection_button_text", g);
        }
        if (e != 0x7fffffffL)
        {
            intent.putExtra("max_time_delta", e);
        }
        if (i)
        {
            intent.putExtra("use_large_selection", i);
        }
        if (j != null)
        {
            intent.putExtra("com.google.android.apps.photos.core.media_collection", j);
        }
        if (k != null)
        {
            intent.putExtra("scroll_to_media", k);
        }
        return intent;
    }

    public final hee a(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
        b = i1;
        return this;
    }
}
