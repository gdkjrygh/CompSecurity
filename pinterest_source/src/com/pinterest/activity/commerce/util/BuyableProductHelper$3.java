// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.util;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.pinterest.activity.commerce.event.CloseCommerceFormDialogEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;

final class gEvent extends ClickableSpan
{

    public final void onClick(View view)
    {
        Events.post(new Navigation(Location.BROWSER, "https://about.pinterest.com/en/privacy-policy"));
        Events.post(new CloseCommerceFormDialogEvent());
    }

    public final void updateDrawState(TextPaint textpaint)
    {
        textpaint.setColor(Resources.color(0x7f0e0073));
        textpaint.setFakeBoldText(true);
    }

    gEvent()
    {
    }
}
