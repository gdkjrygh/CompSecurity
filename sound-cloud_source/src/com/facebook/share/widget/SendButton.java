// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.facebook.share.widget:
//            h, f

public final class SendButton extends h
{

    public SendButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0, "fb_send_button_create");
    }

    public SendButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, "fb_send_button_create");
    }

    static Activity a(SendButton sendbutton)
    {
        return sendbutton.b();
    }

    static void a(SendButton sendbutton, View view)
    {
        sendbutton.a(view);
    }

    protected final int a()
    {
        return com.facebook.internal.m.b.c.a();
    }

    protected final int c()
    {
        return com.facebook.O.g.com_facebook_button_send;
    }

    protected final android.view.View.OnClickListener d()
    {
        return new f(this);
    }
}
