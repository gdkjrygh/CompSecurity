// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.text.TextPaint;
import android.text.style.ClickableSpan;

// Referenced classes of package com.google.wallet.wobl.renderer.android:
//            AndroidTextTagRenderer

abstract class <init> extends ClickableSpan
{

    final AndroidTextTagRenderer this$0;

    public void updateDrawState(TextPaint textpaint)
    {
        textpaint.setColor(textpaint.linkColor);
    }

    private ()
    {
        this$0 = AndroidTextTagRenderer.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
