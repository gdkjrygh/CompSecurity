// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.pin;

import android.content.res.Resources;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

// Referenced classes of package com.netflix.mediaclient.ui.pin:
//            PinDialog

class t> extends LinkMovementMethod
{

    final PinDialog this$0;

    public boolean onTouchEvent(TextView textview, Spannable spannable, MotionEvent motionevent)
    {
        PinDialog.access$200(PinDialog.this).setLinkTextColor(getResources().getColor(0x7f09007f));
        return super.onTouchEvent(textview, spannable, motionevent);
    }

    ()
    {
        this$0 = PinDialog.this;
        super();
    }
}
