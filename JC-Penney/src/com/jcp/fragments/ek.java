// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.ac;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.jcp.b.b;

// Referenced classes of package com.jcp.fragments:
//            ProductDetailFragment

class ek extends ClickableSpan
{

    final ProductDetailFragment a;

    ek(ProductDetailFragment productdetailfragment)
    {
        a = productdetailfragment;
        super();
    }

    public void onClick(View view)
    {
        view = new Intent("android.intent.action.VIEW", Uri.parse(b.af()));
        a.i().startActivity(view);
    }

    public void updateDrawState(TextPaint textpaint)
    {
        textpaint.setColor(Color.parseColor("#33b5e5"));
        textpaint.setUnderlineText(false);
    }
}
