// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.mopub.common.AdReport;
import com.mopub.common.CloseableLayout;

// Referenced classes of package com.mopub.mobileads:
//            m

abstract class l extends Activity
{

    protected AdReport a;
    private CloseableLayout b;
    private Long c;

    l()
    {
    }

    private static AdReport a(Intent intent)
    {
        try
        {
            intent = (AdReport)intent.getSerializableExtra("mopub-intent-ad-report");
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return null;
        }
        return intent;
    }

    final Long a()
    {
        return c;
    }

    protected final void b()
    {
        b.setCloseVisible(true);
    }

    protected final void c()
    {
        b.setCloseVisible(false);
    }

    public abstract View getAdView();

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent.hasExtra("broadcastIdentifier"))
        {
            bundle = Long.valueOf(intent.getLongExtra("broadcastIdentifier", -1L));
        } else
        {
            bundle = null;
        }
        c = bundle;
        a = a(intent);
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        bundle = getAdView();
        b = new CloseableLayout(this);
        b.setOnCloseListener(new m(this));
        b.addView(bundle, new android.widget.FrameLayout.LayoutParams(-1, -1));
        setContentView(b);
    }

    protected void onDestroy()
    {
        b.removeAllViews();
        super.onDestroy();
    }
}
