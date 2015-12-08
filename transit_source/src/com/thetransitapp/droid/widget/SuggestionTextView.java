// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.widget.AutoCompleteTextView;

public class SuggestionTextView extends AutoCompleteTextView
    implements android.os.Handler.Callback
{

    private int delay;
    private Handler handler;

    public SuggestionTextView(Context context)
    {
        super(context);
        handler = new Handler(this);
        delay = 400;
    }

    public SuggestionTextView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        handler = new Handler(this);
        delay = 400;
    }

    public SuggestionTextView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        handler = new Handler(this);
        delay = 400;
    }

    public boolean enoughToFilter()
    {
        return true;
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

    protected void replaceText(CharSequence charsequence)
    {
    }

    public void setDelay(int i)
    {
        delay = i;
    }
}
