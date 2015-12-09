// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.jcp.b.b;
import com.jcp.g.a;
import com.jcp.util.z;
import com.jcp.views.JCPWebView;
import com.jcp.views.TouchImageView;
import com.squareup.a.ak;
import com.squareup.a.ba;

// Referenced classes of package com.jcp.activities:
//            an, b, a

public class AssistantsImageKnowledgeActivity extends an
{

    private String a;
    private String b;
    private JCPWebView c;
    private String d;
    private ProgressBar e;

    public AssistantsImageKnowledgeActivity()
    {
        a = "";
        b = "";
        d = "";
    }

    static ProgressBar a(AssistantsImageKnowledgeActivity assistantsimageknowledgeactivity)
    {
        return assistantsimageknowledgeactivity.e;
    }

    private void c()
    {
        String s = (new StringBuilder()).append("src='http://").append(b.b).append("/mobile").toString();
        b = b.replaceAll("src='/mobile", s);
    }

    private void g()
    {
        c = (JCPWebView)findViewById(0x7f0e0350);
        h();
        WebSettings websettings = c.getSettings();
        websettings.setSupportZoom(true);
        websettings.setBuiltInZoomControls(true);
        websettings.setJavaScriptEnabled(true);
        c.setWebViewClient(new com.jcp.activities.b(this));
    }

    private void h()
    {
        e = (ProgressBar)findViewById(0x7f0e0351);
        e.setVisibility(0);
    }

    protected String a()
    {
        return "KNOWLEDGEASSISTANTS";
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030097);
        bundle = getIntent().getExtras();
        getActionBar().hide();
        if (bundle != null)
        {
            a = bundle.getString("AssetReferenceURL");
            b = bundle.getString("Editor");
            d = bundle.getString("Title");
        }
        bundle = (TextView)findViewById(0x7f0e005a);
        bundle.setText(Html.fromHtml(d));
        bundle.setTypeface(z.a(this, 5));
        ((ImageView)findViewById(0x7f0e034d)).setOnClickListener(new com.jcp.activities.a(this));
        bundle = (RelativeLayout)findViewById(0x7f0e034f);
        bundle.setVisibility(8);
        TouchImageView touchimageview = (TouchImageView)findViewById(0x7f0e0352);
        touchimageview.setVisibility(8);
        if (!TextUtils.isEmpty(a))
        {
            touchimageview.setVisibility(0);
            bundle.setVisibility(8);
            com.jcp.g.a.a().a(a).b().a(0x7f020181).b(0x7f02017f).a(touchimageview);
            touchimageview.setMaxZoom(8F);
            return;
        }
        if (b != null && !TextUtils.isEmpty(b))
        {
            c();
            bundle.setVisibility(0);
            touchimageview.setVisibility(8);
            g();
            c.setWebViewClient(new com.jcp.activities.b(this));
            c.loadData(b, "text/html", "UTF-8");
            return;
        } else
        {
            touchimageview.setVisibility(8);
            bundle.setVisibility(8);
            finish();
            return;
        }
    }
}
