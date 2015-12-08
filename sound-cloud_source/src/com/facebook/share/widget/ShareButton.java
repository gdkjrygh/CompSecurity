// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

// Referenced classes of package com.facebook.share.widget:
//            h, g

public final class ShareButton extends h
{

    public ShareButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset, 0, "fb_share_button_create");
    }

    public ShareButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i, "fb_share_button_create");
    }

    static Activity a(ShareButton sharebutton)
    {
        return sharebutton.b();
    }

    static void a(ShareButton sharebutton, View view)
    {
        sharebutton.a(view);
    }

    protected final int a()
    {
        return com.facebook.internal.m.b.b.a();
    }

    protected final int c()
    {
        return com.facebook.O.g.com_facebook_button_share;
    }

    protected final android.view.View.OnClickListener d()
    {
        return new g(this);
    }
}
