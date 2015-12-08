// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.view.KeyEvent;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.controls:
//            NumericKeyboard

class this._cls0
    implements Action1
{

    final NumericKeyboard this$0;

    public void call(KeyEvent keyevent)
    {
        NumericKeyboard.access$100(NumericKeyboard.this).onKeyPressed(keyevent);
    }

    public volatile void call(Object obj)
    {
        call((KeyEvent)obj);
    }

    yPressListener()
    {
        this$0 = NumericKeyboard.this;
        super();
    }
}
