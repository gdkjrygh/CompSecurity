// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.share;

import aa;
import ah;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.spotify.android.paste.app.FontSupport;
import com.spotify.mobile.android.ui.ActionBarManager;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import dgd;
import dge;
import dwx;
import dxc;
import fhn;
import fib;
import java.util.Locale;
import rx;

public class PostActivity extends rx
{

    Flags d;
    Intent e;
    Bundle f;
    fhn g;
    private dwx h;
    private dxc i;
    private fib j;

    public PostActivity()
    {
        h = new dwx() {

            private PostActivity a;

            public final void a(Flags flags)
            {
                PostActivity.a(a, flags);
                flags = a;
                if (((PostActivity) (flags)).d != null && ((PostActivity) (flags)).f == null && ((PostActivity) (flags)).g == null)
                {
                    flags.g = fhn.a(((PostActivity) (flags)).e, ((PostActivity) (flags)).d);
                    flags.a_().a().a(0x7f1100ff, ((PostActivity) (flags)).g, "post_to_fragment").c();
                    flags.setTitle(dge.a(((PostActivity) (flags)).g.a(flags, ((PostActivity) (flags)).d).toUpperCase(Locale.getDefault()), dgd.b(flags, 0x7f0101e4)));
                }
            }

            
            {
                a = PostActivity.this;
                super();
            }
        };
    }

    static Flags a(PostActivity postactivity, Flags flags)
    {
        postactivity.d = flags;
        return flags;
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        j.a(e.getStringExtra("spotify:share:posturi"));
    }

    public void onCreate(Bundle bundle)
    {
        FontSupport.a(this);
        super.onCreate(bundle);
        i = new dxc(this);
        i.a(h);
        e = (Intent)getIntent().getParcelableExtra("android.intent.extra.INTENT");
        j = new fib(this);
        FrameLayout framelayout = new FrameLayout(this);
        framelayout.setId(0x7f1100ff);
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutparams.setMargins(0, ActionBarManager.a(this), 0, 0);
        framelayout.setLayoutParams(layoutparams);
        setContentView(framelayout);
        f = bundle;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        i.b(h);
    }

    protected void onResume()
    {
        super.onResume();
    }

    protected void onStart()
    {
        super.onStart();
        i.a();
    }

    protected void onStop()
    {
        super.onStop();
        i.b();
    }
}
