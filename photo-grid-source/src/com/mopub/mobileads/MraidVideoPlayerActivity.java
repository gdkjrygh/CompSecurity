// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Intents;
import com.mopub.mraid.MraidVideoViewController;

// Referenced classes of package com.mopub.mobileads:
//            BaseVideoPlayerActivity, BaseVideoViewController, VastVideoViewController, EventForwardingBroadcastReceiver

public class MraidVideoPlayerActivity extends BaseVideoPlayerActivity
    implements BaseVideoViewController.BaseVideoViewControllerListener
{

    private BaseVideoViewController a;
    private long b;

    public MraidVideoPlayerActivity()
    {
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        if (a != null)
        {
            a.a(i, j);
        }
    }

    public void onBackPressed()
    {
        if (a != null && a.backButtonEnabled())
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        b = getIntent().getLongExtra("broadcastIdentifier", -1L);
        bundle = getIntent().getStringExtra("video_view_class_name");
        if (!"vast".equals(bundle))
        {
            break MISSING_BLOCK_LABEL_90;
        }
        bundle = new VastVideoViewController(this, getIntent().getExtras(), b, this);
_L1:
        a = bundle;
        a.a();
        return;
        try
        {
            if (!"mraid".equals(bundle))
            {
                break MISSING_BLOCK_LABEL_135;
            }
            bundle = new MraidVideoViewController(this, getIntent().getExtras(), this);
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            EventForwardingBroadcastReceiver.a(this, b, "com.mopub.action.interstitial.fail");
            finish();
            return;
        }
          goto _L1
        throw new IllegalStateException((new StringBuilder("Unsupported video type: ")).append(bundle).toString());
    }

    protected void onDestroy()
    {
        if (a != null)
        {
            a.e();
        }
        super.onDestroy();
    }

    public void onFinish()
    {
        finish();
    }

    protected void onPause()
    {
        if (a != null)
        {
            a.c();
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        if (a != null)
        {
            a.d();
        }
    }

    public void onSetContentView(View view)
    {
        setContentView(view);
    }

    public void onSetRequestedOrientation(int i)
    {
        setRequestedOrientation(i);
    }

    public void onStartActivityForResult(Class class1, int i, Bundle bundle)
    {
        if (class1 == null)
        {
            return;
        }
        bundle = Intents.getStartActivityIntent(this, class1, bundle);
        try
        {
            startActivityForResult(bundle, i);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            MoPubLog.d((new StringBuilder("Activity ")).append(class1.getName()).append(" not found. Did you declare it in your AndroidManifest.xml?").toString());
        }
    }
}
