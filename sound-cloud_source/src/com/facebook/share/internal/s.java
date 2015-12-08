// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.facebook.l;

public final class s extends l
{

    public s(Context context, boolean flag)
    {
        super(context, null, 0, "fb_like_button_create");
        setSelected(flag);
    }

    private void d()
    {
        if (isSelected())
        {
            setCompoundDrawablesWithIntrinsicBounds(com.facebook.O.c.com_facebook_button_like_icon_selected, 0, 0, 0);
            setText(getResources().getString(com.facebook.O.f.com_facebook_like_button_liked));
            return;
        } else
        {
            setCompoundDrawablesWithIntrinsicBounds(com.facebook.O.c.com_facebook_button_icon, 0, 0, 0);
            setText(getResources().getString(com.facebook.O.f.com_facebook_like_button_not_liked));
            return;
        }
    }

    protected final int a()
    {
        return 0;
    }

    protected final void a(Context context, AttributeSet attributeset, int i, int j)
    {
        super.a(context, attributeset, i, j);
        d();
    }

    protected final int c()
    {
        return com.facebook.O.g.com_facebook_button_like;
    }

    public final void setSelected(boolean flag)
    {
        super.setSelected(flag);
        d();
    }
}
