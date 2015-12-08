// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.chat;

import BG;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.snapchat.android.model.chat.ChatFeedItem;

public abstract class MediaCardView extends LinearLayout
{
    public static interface a
    {

        public abstract void a(MediaCardView mediacardview);
    }


    protected final Context a;
    protected final If.a b;
    private a c;

    public MediaCardView(Context context, If.a a1, a a2)
    {
        super(context);
        a = context;
        b = a1;
        c = a2;
    }

    protected static void a(BG bg, View view)
    {
        if (bg.f())
        {
            view.setBackgroundResource(0x7f020190);
            return;
        } else
        {
            view.setBackgroundResource(0x7f020191);
            return;
        }
    }

    public abstract void a();

    public abstract void a(BG bg);

    protected abstract void a(ChatFeedItem chatfeeditem);

    public final If.a b()
    {
        return b;
    }

    protected void b(BG bg)
    {
        if (bg == null)
        {
            return;
        }
        if (bg.Q() || bg.R())
        {
            setAlpha(0.5F);
            return;
        } else
        {
            setAlpha(1.0F);
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getActionMasked() == 0)
        {
            c.a(this);
        }
        return false;
    }
}
