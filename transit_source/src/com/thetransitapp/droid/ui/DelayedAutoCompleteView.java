// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.ui;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;

public class DelayedAutoCompleteView extends com.actionbarsherlock.widget.SearchView.SearchAutoComplete
    implements android.os.Handler.Callback
{

    private int delay;
    private Handler handler;

    public DelayedAutoCompleteView(Context context)
    {
        super(context);
        handler = new Handler(this);
        delay = 400;
    }

    public DelayedAutoCompleteView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        handler = new Handler(this);
        delay = 400;
    }

    public DelayedAutoCompleteView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        handler = new Handler(this);
        delay = 400;
    }

    public boolean handleMessage(Message message)
    {
        super.performFiltering((CharSequence)message.obj, message.arg1);
        return true;
    }

    protected void performFiltering(CharSequence charsequence, int i)
    {
        handler.removeMessages(0);
        charsequence = handler.obtainMessage(0, i, 0, charsequence);
        handler.sendMessageDelayed(charsequence, delay);
    }

    public void setDelay(int i)
    {
        delay = i;
    }
}
