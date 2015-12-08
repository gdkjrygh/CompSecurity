// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.view.View;
import com.google.wallet.wobl.intermediaterepresentation.TextIr;

// Referenced classes of package com.google.wallet.wobl.renderer.android:
//            AndroidTextTagRenderer, AndroidRenderer, AndroidRenderUtils

class ickableSpan extends ickableSpan
{

    final AndroidTextTagRenderer this$0;
    final AndroidRenderer val$renderer;
    final TextIr val$textIr;
    final View val$textView;

    public void onClick(View view)
    {
        AndroidRenderUtils.getFirstResolvableClickListener(val$textIr.getTapUris(), val$renderer.getRendererClient(), val$textView).ick(view);
    }

    ickableSpan()
    {
        this$0 = final_androidtexttagrenderer;
        val$textIr = textir;
        val$renderer = androidrenderer;
        val$textView = View.this;
        super(final_androidtexttagrenderer, null);
    }
}
