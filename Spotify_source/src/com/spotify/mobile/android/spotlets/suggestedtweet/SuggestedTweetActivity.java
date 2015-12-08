// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.suggestedtweet;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.spotify.android.paste.widget.DialogLayout;
import com.spotify.mobile.android.util.Assertion;
import dgp;
import dmz;
import fou;
import gcz;
import ggg;

public class SuggestedTweetActivity extends fou
{

    private Button d;
    private Intent i;

    public SuggestedTweetActivity()
    {
    }

    static void a(SuggestedTweetActivity suggestedtweetactivity)
    {
        suggestedtweetactivity.startActivityForResult(suggestedtweetactivity.i, 0);
    }

    protected void onActivityResult(int j, int k, Intent intent)
    {
        if (j == 0)
        {
            setResult(-1);
            finish();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj = getIntent().getExtras();
        Object obj1 = ((Bundle) (obj)).getString("tweet");
        ggg ggg1 = new ggg(this);
        bundle = new Intent("android.intent.action.SEND");
        bundle.setType("text/plain");
        bundle.putExtra("android.intent.extra.TEXT", ((String) (obj1)));
        obj1 = ggg1.a(bundle);
        if (obj1 == null)
        {
            bundle = null;
        } else
        {
            bundle.setComponent(((android.content.ComponentName) (obj1)));
        }
        i = bundle;
        if (i == null)
        {
            Assertion.b("Can't find Twitter");
            setResult(0);
            finish();
            return;
        }
        bundle = new DialogLayout(this);
        bundle.a(((Bundle) (obj)).getString("title"));
        bundle.b(((Bundle) (obj)).getString("body"));
        boolean flag;
        if (((gcz)dmz.a(gcz)).c() >= getResources().getDimensionPixelSize(0x7f0c0154))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            bundle.b(((Bundle) (obj)).getInt("image_resource_id"));
        }
        d = dgp.b(this, bundle);
        d.setText(0x7f080541);
        d.setBackgroundResource(0x7f02009c);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            private SuggestedTweetActivity a;

            public final void onClick(View view)
            {
                SuggestedTweetActivity.a(a);
            }

            
            {
                a = SuggestedTweetActivity.this;
                super();
            }
        });
        obj = new FrameLayout(this);
        obj1 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        obj1.bottomMargin = getResources().getDimensionPixelOffset(0x7f0c0153);
        if (flag)
        {
            obj1.topMargin = ((android.widget.FrameLayout.LayoutParams) (obj1)).bottomMargin;
        }
        ((FrameLayout) (obj)).addView(d, ((android.view.ViewGroup.LayoutParams) (obj1)));
        bundle.a(((View) (obj)));
        setContentView(bundle);
    }
}
