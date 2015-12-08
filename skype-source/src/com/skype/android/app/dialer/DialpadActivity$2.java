// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.dialer;

import android.view.View;

// Referenced classes of package com.skype.android.app.dialer:
//            DialpadActivity, NoImeEditText

final class this._cls0
    implements android.view.stener
{

    final DialpadActivity this$0;

    public final boolean onLongClick(View view)
    {
        if (editText.getSelectionStart() == 0 && !editText.getText().toString().contains("+"))
        {
            DialpadActivity.access$000(DialpadActivity.this, 81);
        }
        return true;
    }

    ()
    {
        this$0 = DialpadActivity.this;
        super();
    }
}
