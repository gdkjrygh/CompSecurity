// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

// Referenced classes of package com.skype.android.app.dialer:
//            DialKey, DialpadButton

public class DialpadView extends FrameLayout
{

    android.view.View.OnClickListener listener;

    public DialpadView(Context context)
    {
        super(context);
        listener = null;
        init();
    }

    public DialpadView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        listener = null;
        init();
    }

    public DialpadView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        listener = null;
        init();
    }

    private void init()
    {
        LayoutInflater.from(getContext()).inflate(0x7f03007f, this, true);
        DialKey adialkey[] = DialKey.values();
        int j = adialkey.length;
        for (int i = 0; i < j; i++)
        {
            DialpadButton dialpadbutton = (DialpadButton)findViewById(adialkey[i].getButtonId());
            dialpadbutton.setSoundEffectsEnabled(false);
            dialpadbutton.setFocusable(true);
        }

    }

    public void setKeyListeners(android.view.View.OnClickListener onclicklistener)
    {
        listener = onclicklistener;
        DialKey adialkey[] = DialKey.values();
        int j = adialkey.length;
        for (int i = 0; i < j; i++)
        {
            ((DialpadButton)findViewById(adialkey[i].getButtonId())).setOnClickListener(onclicklistener);
        }

    }

    public void whenConfigurationChanges()
    {
        removeAllViews();
        init();
        setKeyListeners(listener);
    }
}
