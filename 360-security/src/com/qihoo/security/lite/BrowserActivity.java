// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.lite;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import com.qihoo.security.app.BaseActivity;
import com.qihoo.security.locale.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BrowserActivity extends BaseActivity
{

    private WebView A;
    private final String y = "text/html";
    private final String z = "utf-8";

    public BrowserActivity()
    {
    }

    private void o()
    {
        if (A != null)
        {
            A.stopLoading();
            A.destroy();
            A.removeAllViews();
            A = null;
        }
    }

    protected void j()
    {
        super.j();
        if (r != null)
        {
            b(o.a(0x7f0c01d3));
        }
    }

    public void onBackPressed()
    {
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        String s;
        int i;
        Intent intent = getIntent();
        s = intent.getStringExtra("weburl");
        super.onCreate(bundle);
        setContentView(0x7f0300b0);
        A = (WebView)findViewById(0x7f0b024f);
        A.setOnLongClickListener(new android.view.View.OnLongClickListener() {

            final BrowserActivity a;

            public boolean onLongClick(View view)
            {
                return true;
            }

            
            {
                a = BrowserActivity.this;
                super();
            }
        });
        i = intent.getIntExtra("webdata", -1);
        if (i == -1)
        {
            if (!TextUtils.isEmpty(s))
            {
                A.loadUrl(s);
            }
            return;
        }
        bundle = new StringBuffer();
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(getResources().openRawResource(i)));
_L1:
        String s1 = bufferedreader.readLine();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        bundle.append(s1);
          goto _L1
        IOException ioexception;
        ioexception;
        if (!TextUtils.isEmpty(s))
        {
            A.loadUrl(s);
        }
        A.loadDataWithBaseURL("", bundle.toString(), "text/html", "utf-8", null);
        return;
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        return false;
    }

    protected void onDestroy()
    {
        super.onDestroy();
        o();
    }
}
