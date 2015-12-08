// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;

// Referenced classes of package com.spotify.mobile.android.ui:
//            ActionBarTitle

class a extends ForegroundColorSpan
{

    private ActionBarTitle a;

    public void updateDrawState(TextPaint textpaint)
    {
        int i = getForegroundColor();
        textpaint.setColor(Color.argb((int)(ActionBarTitle.a(a) * ActionBarTitle.b(a) * 255F), Color.red(i), Color.green(i), Color.blue(i)));
    }

    (ActionBarTitle actionbartitle)
    {
        a = actionbartitle;
        super(-1);
    }
}
