// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.common.t.a.a;
import com.facebook.i;
import com.facebook.widget.f.d;

public class ComposeRootView extends RelativeLayout
{

    private View a;
    private View b;
    private View c;
    private View d;
    private TouchDelegate e;
    private TouchDelegate f;
    private android.view.View.OnKeyListener g;

    public ComposeRootView(Context context)
    {
        super(context);
    }

    public ComposeRootView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ComposeRootView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
    }

    private void a(int j, int k)
    {
        e = com.facebook.widget.f.d.a(b, j, k, 5);
        f = com.facebook.widget.f.d.a(c, j, k, 35);
        TouchDelegate touchdelegate = com.facebook.widget.f.d.a(a, 5);
        TouchDelegate touchdelegate1 = com.facebook.widget.f.d.a(d, j, k);
        setTouchDelegate(new a(this, new TouchDelegate[] {
            e, f, touchdelegate, touchdelegate1
        }));
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyevent)
    {
        if (keyevent.getKeyCode() == 4 && keyevent.getAction() == 0 && g != null && g.onKey(this, keyevent.getKeyCode(), keyevent))
        {
            return true;
        } else
        {
            return super.dispatchKeyEventPreIme(keyevent);
        }
    }

    public TouchDelegate getEmojiAttachmentTouchDelegate()
    {
        return e;
    }

    public TouchDelegate getStickerTouchDelegate()
    {
        return f;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        b = findViewById(i.compose_emoji_attachments);
        c = findViewById(i.compose_button_stickers);
        a = findViewById(i.compose_button_send);
        d = findViewById(i.compose_edit_container);
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        super.onLayout(flag, j, k, l, i1);
        if (flag)
        {
            a(k, i1);
        }
    }

    public void setPreImeKeyListener(android.view.View.OnKeyListener onkeylistener)
    {
        g = onkeylistener;
    }
}
