// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.os.Vibrator;
import android.view.View;

// Referenced classes of package me.lyft.android.controls:
//            NumericKeyboard

class this._cls0
    implements android.view.stener
{

    final NumericKeyboard this$0;

    public boolean onLongClick(View view)
    {
        NumericKeyboard.access$000(NumericKeyboard.this).vibrate(50L);
        NumericKeyboard.access$100(NumericKeyboard.this).onDelLongPressed();
        return false;
    }

    yPressListener()
    {
        this$0 = NumericKeyboard.this;
        super();
    }
}
