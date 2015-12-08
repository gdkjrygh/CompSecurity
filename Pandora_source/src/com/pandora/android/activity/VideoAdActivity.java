// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.h;
import android.support.v4.app.k;
import com.pandora.android.data.r;
import com.pandora.android.provider.b;
import com.pandora.android.provider.c;
import com.pandora.android.util.s;
import p.bz.aa;
import p.ca.be;
import p.ca.bf;
import p.df.a;

// Referenced classes of package com.pandora.android.activity:
//            BaseFragmentActivity

public class VideoAdActivity extends BaseFragmentActivity
{
    private class a
    {

        final VideoAdActivity a;

        public void onVideoCompleted(aa aa)
        {
            a.finish();
        }

        private a()
        {
            a = VideoAdActivity.this;
            super();
        }

    }


    private bf o;
    private a p;

    public VideoAdActivity()
    {
        o = null;
        p = null;
    }

    protected void a(Context context, Intent intent, String s1)
    {
    }

    protected void e(String s1)
    {
    }

    protected IntentFilter l()
    {
        return null;
    }

    public void m()
    {
        finish();
    }

    public void onBackPressed()
    {
        if (o == null || o.h())
        {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle)
    {
        int i;
        if (s.u())
        {
            i = 0x7f0d008e;
        } else
        {
            i = 0x7f0d0087;
        }
        setTheme(i);
        super.onCreate(bundle);
        setContentView(0x7f040057);
        bundle = getIntent().getExtras();
        if (bundle == null)
        {
            m();
            return;
        }
        com.pandora.android.data.s s1 = (com.pandora.android.data.s)c.a(bundle.getString("intent_video_ad_data_id"));
        if (s1 == null)
        {
            m();
            return;
        }
        p = new a();
        b.a.e().c(p);
        h h1 = f();
        o = (bf)h1.a(0x7f1000c9);
        if (o == null)
        {
            if (s1 instanceof r)
            {
                p.df.a.a("VideoAdActivity", "creating ValueExchangeVideoAdFragment");
                o = be.a(bundle);
            } else
            {
                o = bf.b(bundle);
            }
        }
        h1.a().a(0x7f1000c9, o).b();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        if (p != null)
        {
            b.a.e().b(p);
        }
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (intent != null && o != null)
        {
            o.c(intent.getExtras());
        }
    }

    public boolean onSearchRequested()
    {
        boolean flag = false;
        if (o.p())
        {
            flag = super.onSearchRequested();
        }
        return flag;
    }
}
