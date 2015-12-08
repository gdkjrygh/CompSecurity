// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.View;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.controls:
//            KeyboardTextButton

class this._cls0
    implements android.view.extButton._cls1
{

    final KeyboardTextButton this$0;

    public void onClick(View view)
    {
        KeyboardTextButton.access$000(KeyboardTextButton.this).vibrate(5L);
        KeyboardTextButton.access$200(KeyboardTextButton.this).call(new KeyEvent(0, KeyboardTextButton.access$100(KeyboardTextButton.this).intValue()));
    }

    ()
    {
        this$0 = KeyboardTextButton.this;
        super();
    }
}
