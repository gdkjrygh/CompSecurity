// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.mediacontroller.buttons;

import android.content.Context;
import android.content.res.Resources;

public class ButtonState
{

    private CharSequence a;
    private String b;
    private String c;
    private android.view.View.OnClickListener d;

    public ButtonState(Context context, int i, int j, android.view.View.OnClickListener onclicklistener)
    {
        this(context, i, j, null, onclicklistener);
    }

    public ButtonState(Context context, int i, int j, String s)
    {
        this(context, i, j, s, null);
    }

    public ButtonState(Context context, int i, int j, String s, android.view.View.OnClickListener onclicklistener)
    {
        a = context.getResources().getString(i);
        b = context.getResources().getString(j);
        c = s;
        d = onclicklistener;
    }

    public String getContentDescription()
    {
        return b;
    }

    public String getEventType()
    {
        return c;
    }

    public android.view.View.OnClickListener getHandler()
    {
        return d;
    }

    public CharSequence getText()
    {
        return a;
    }
}
