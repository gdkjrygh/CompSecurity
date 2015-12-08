// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import com.skype.android.widget.SymbolView;

// Referenced classes of package com.skype.android.app.dialer:
//            DialpadActivity, NoImeEditText

public class _cls9 extends com.skype.android.ity..Proxy
{

    public void clearViews()
    {
        super.earViews();
        ((DialpadActivity)getTarget()).editText = null;
        ((DialpadActivity)getTarget()).addNumberButton = null;
        ((DialpadActivity)getTarget()).eraseButton = null;
        ((DialpadActivity)getTarget()).countryButton = null;
        ((DialpadActivity)getTarget()).contactText = null;
        ((DialpadActivity)getTarget()).callButton = null;
    }

    public void injectViews()
    {
        super.jectViews();
        ((DialpadActivity)getTarget()).editText = (NoImeEditText)findViewById(0x7f100344);
        ((DialpadActivity)getTarget()).addNumberButton = (SymbolView)findViewById(0x7f100349);
        ((DialpadActivity)getTarget()).eraseButton = (SymbolView)findViewById(0x7f100343);
        ((DialpadActivity)getTarget()).countryButton = (Button)findViewById(0x7f100346);
        ((DialpadActivity)getTarget()).contactText = (TextView)findViewById(0x7f100345);
        ((DialpadActivity)getTarget()).callButton = (ImageButton)findViewById(0x7f100348);
    }

    public _cls9(DialpadActivity dialpadactivity)
    {
        super(dialpadactivity);
    }
}
