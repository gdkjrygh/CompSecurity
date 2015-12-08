// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.text.style.URLSpan;

final class WalletUrlSpan extends URLSpan
{

    private final Context mContext;

    public WalletUrlSpan(String s, Context context)
    {
        super(s);
        mContext = context;
    }

    public final void updateDrawState(TextPaint textpaint)
    {
        super.updateDrawState(textpaint);
        textpaint.setUnderlineText(false);
        textpaint.setColor(mContext.getResources().getColor(com.google.android.apps.walletnfcrel.R.color.primary));
    }
}
