// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.ui;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextPaint;
import android.text.style.URLSpan;
import android.view.View;

public class LinkSpan extends URLSpan
{

    private static final Typeface TYPEFACE_MEDIUM = Typeface.create("sans-serif-medium", 0);

    public void onClick(View view)
    {
        android.content.Context context = view.getContext();
        if (context != null)
        {
            Intent intent = new Intent("com.google.android.setupwizard.LINK_SPAN_CLICKED");
            intent.putExtra("id", getURL());
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }
        view.cancelPendingInputEvents();
    }

    public void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
        textpaint.setTypeface(TYPEFACE_MEDIUM);
    }

}
