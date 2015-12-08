// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.threedsecure;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import com.braintreepayments.api.models.ThreeDSecureAuthenticationResponse;
import com.braintreepayments.api.models.ThreeDSecureLookup;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Stack;

// Referenced classes of package com.braintreepayments.api.threedsecure:
//            ThreeDSecureWebView

public class ThreeDSecureWebViewActivity extends Activity
{

    private ActionBar a;
    private FrameLayout b;
    private Stack c;

    public ThreeDSecureWebViewActivity()
    {
    }

    protected final void a()
    {
        c.pop();
        a((ThreeDSecureWebView)c.pop());
    }

    protected final void a(ThreeDSecureAuthenticationResponse threedsecureauthenticationresponse)
    {
        setResult(-1, (new Intent()).putExtra("com.braintreepayments.api.EXTRA_THREE_D_SECURE_RESULT", threedsecureauthenticationresponse));
        finish();
    }

    protected final void a(ThreeDSecureWebView threedsecurewebview)
    {
        c.push(threedsecurewebview);
        b.removeAllViews();
        b.addView(threedsecurewebview);
    }

    protected final void a(String s)
    {
        if (a != null)
        {
            a.setTitle(s);
        }
    }

    public void onBackPressed()
    {
        if (((ThreeDSecureWebView)c.peek()).canGoBack())
        {
            ((ThreeDSecureWebView)c.peek()).goBack();
            return;
        }
        if (c.size() > 1)
        {
            a();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(2);
        bundle = (ThreeDSecureLookup)getIntent().getParcelableExtra("com.braintreepayments.api.EXTRA_THREE_D_SECURE_LOOKUP");
        if (bundle == null)
        {
            throw new IllegalArgumentException((new StringBuilder("A ThreeDSecureLookup must be specified with ")).append(com/braintreepayments/api/models/ThreeDSecureLookup.getSimpleName()).append(".EXTRA_THREE_D_SECURE_LOOKUP extra").toString());
        }
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = getActionBar();
            if (a != null)
            {
                a("");
                a.setDisplayHomeAsUpEnabled(true);
            }
        }
        c = new Stack();
        b = (FrameLayout)findViewById(0x1020002);
        StringBuilder stringbuilder = new StringBuilder();
        ThreeDSecureWebView threedsecurewebview;
        try
        {
            stringbuilder.append("PaReq=");
            stringbuilder.append(URLEncoder.encode(bundle.d(), "UTF-8"));
            stringbuilder.append("&MD=");
            stringbuilder.append(URLEncoder.encode(bundle.b(), "UTF-8"));
            stringbuilder.append("&TermUrl=");
            stringbuilder.append(URLEncoder.encode(bundle.c(), "UTF-8"));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            finish();
        }
        threedsecurewebview = new ThreeDSecureWebView(this);
        threedsecurewebview.a(this);
        threedsecurewebview.postUrl(bundle.a(), stringbuilder.toString().getBytes());
        a(threedsecurewebview);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            setResult(0);
            finish();
            return true;
        } else
        {
            return super.onOptionsItemSelected(menuitem);
        }
    }
}
