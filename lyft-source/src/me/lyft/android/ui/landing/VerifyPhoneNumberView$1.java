// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import me.lyft.android.controls.KeyboardlessEditText;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.landing:
//            VerifyPhoneNumberView

class this._cls0
    implements Action1
{

    final VerifyPhoneNumberView this$0;

    public volatile void call(Object obj)
    {
        call((String)obj);
    }

    public void call(String s)
    {
        codeEditText.setTextAndMoveCursor(s);
    }

    ()
    {
        this$0 = VerifyPhoneNumberView.this;
        super();
    }
}
