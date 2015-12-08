// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.stories;

import am;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import ay;
import b;
import inf;
import ini;
import mnk;
import moy;
import moz;
import msr;
import njh;
import nwn;
import nws;
import nww;
import oka;
import olm;
import ome;
import rv;
import s;

public class StoryElementPickerActivity extends ome
    implements moy, msr, nwn
{

    private inf d;

    public StoryElementPickerActivity()
    {
        new nww(this, g);
        (new oka(this, g)).a(f);
        (new njh(this, g, s.bA)).a("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
        (new nws(this, g, this)).a(f);
        (new mnk(this, g)).a(f).a = true;
        d = new inf(this, s.bA);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        f.a(msr, this);
    }

    public final void a(moz moz)
    {
    }

    public final void a(rv rv1)
    {
        rv1.a(true);
    }

    public final boolean a(MenuItem menuitem)
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle == null)
        {
            bundle = new ini();
            Object obj = getIntent();
            Bundle bundle1 = new Bundle();
            bundle1.putParcelableArray("story_render_sizes", ((Intent) (obj)).getParcelableArrayExtra("story_render_sizes"));
            bundle1.putParcelable("story_element_ref", ((Intent) (obj)).getParcelableExtra("story_element_ref"));
            bundle1.putParcelable("story_media_collection", ((Intent) (obj)).getParcelableExtra("story_media_collection"));
            bundle.f(bundle1);
            obj = d;
            ((inf) (obj)).a(bundle, ((inf) (obj)).a, "default");
        }
        setContentView(b.AO);
    }

    public final am u()
    {
        return c().a(s.bA);
    }
}
