// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import com.cardinalblue.android.b.k;
import com.cardinalblue.android.piccollage.view.VideoPlayerWebView;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseFragmentActivity

public class VideoScrapPreviewActivity extends BaseFragmentActivity
{

    private VideoPlayerWebView a;
    private String b;
    private String c;
    private String d;

    public VideoScrapPreviewActivity()
    {
    }

    private void a(Bundle bundle)
    {
        if (bundle.containsKey("extra_video_stream_url"))
        {
            c = bundle.getString("extra_video_stream_url", "");
            a.loadUrl(c);
        } else
        if (bundle.containsKey("extra_video_html_data"))
        {
            d = bundle.getString("extra_video_html_data", "");
            if (bundle.containsKey("extra_video_base_url"))
            {
                b = bundle.getString("extra_video_base_url", "");
                a.loadDataWithBaseURL(b, d, "text/html", "UTF-8", null);
                return;
            } else
            {
                a.loadData(d, "text/html", "UTF-8");
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(0x7f030040);
        a = (VideoPlayerWebView)findViewById(0x7f100104);
        if (bundle != null)
        {
            a(bundle);
            return;
        } else
        {
            a(getIntent().getExtras());
            return;
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        a.loadUrl("");
    }

    protected void onPause()
    {
        super.onPause();
        a.c();
    }

    protected void onResume()
    {
        super.onResume();
        a.b();
        if (!k.b(this))
        {
            k.a(this, 0x7f07021d, 1);
            finish();
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (!TextUtils.isEmpty(b))
        {
            bundle.putString("extra_video_base_url", b);
        }
        if (!TextUtils.isEmpty(c))
        {
            bundle.putString("extra_video_stream_url", c);
        }
        if (!TextUtils.isEmpty(d))
        {
            bundle.putString("extra_video_html_data", d);
        }
    }
}
