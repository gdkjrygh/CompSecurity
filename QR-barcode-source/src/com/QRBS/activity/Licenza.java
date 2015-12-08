// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.QRBS.activity;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;
import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.google.android.gms.ads.AdView;

public class Licenza extends SherlockFragmentActivity
{

    public Licenza()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03002e);
        bundle = getSupportActionBar();
        bundle.setIcon(0x7f0200d4);
        bundle.setTitle(0x7f0800b1);
        bundle.setSubtitle(getResources().getString(0x7f0800f4));
        bundle.setHomeButtonEnabled(true);
        ((AdView)findViewById(0x7f0d0061)).loadAd((new com.google.android.gms.ads.AdRequest.Builder()).build());
        bundle = Typeface.createFromAsset(getAssets(), "a.otf");
        TextView textview = (TextView)findViewById(0x7f0d009e);
        textview.setTypeface(bundle);
        TextView textview1 = (TextView)findViewById(0x7f0d009f);
        textview1.setTypeface(bundle);
        textview.setText((new StringBuilder(String.valueOf(getResources().getString(0x7f0800b1)))).append(" ").append(getResources().getString(0x7f0800f5)).toString());
        textview1.setText((new StringBuilder(String.valueOf(getResources().getString(0x7f0800f6)))).append("\n").append("https://github.com/zxing/zxing").append("\n").append(getResources().getString(0x7f0800f7)).append("\n").append("http://www.apache.org/licenses/LICENSE-2.0").toString());
        Linkify.addLinks(textview1, 1);
    }
}
