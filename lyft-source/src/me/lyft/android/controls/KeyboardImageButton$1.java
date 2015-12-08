// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.os.Vibrator;
import android.view.KeyEvent;
import android.view.View;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.controls:
//            KeyboardImageButton

class this._cls0
    implements android.view.ageButton._cls1
{

    final KeyboardImageButton this$0;

    public void onClick(View view)
    {
        KeyboardImageButton.access$000(KeyboardImageButton.this).vibrate(5L);
        KeyboardImageButton.access$200(KeyboardImageButton.this).call(new KeyEvent(0, KeyboardImageButton.access$100(KeyboardImageButton.this).intValue()));
    }

    ()
    {
        this$0 = KeyboardImageButton.this;
        super();
    }
}
