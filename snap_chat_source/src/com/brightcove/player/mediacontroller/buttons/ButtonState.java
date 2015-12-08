// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

public class ButtonState
{

    private String a;
    private Drawable b;
    private String c;
    private android.view.View.OnClickListener d;
    private CharSequence e;

    public ButtonState(Context context, int i, int j, Drawable drawable, android.view.View.OnClickListener onclicklistener)
    {
        this(context, i, j, drawable, null, onclicklistener);
    }

    public ButtonState(Context context, int i, int j, Drawable drawable, String s)
    {
        this(context, i, j, drawable, s, null);
    }

    public ButtonState(Context context, int i, int j, Drawable drawable, String s, android.view.View.OnClickListener onclicklistener)
    {
        e = context.getResources().getString(i);
        a = context.getResources().getString(j);
        b = drawable;
        c = s;
        d = onclicklistener;
    }

    public String getContentDescription()
    {
        return a;
    }

    public String getEventType()
    {
        return c;
    }

    public android.view.View.OnClickListener getHandler()
    {
        return d;
    }

    public Drawable getImage()
    {
        return b;
    }

    public CharSequence getText()
    {
        return e;
    }
}
