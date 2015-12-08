// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.landing:
//            EnterInfoView

class this._cls0
    implements android.widget.rActionListener
{

    final EnterInfoView this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            submitProfileInfo();
            return true;
        } else
        {
            return false;
        }
    }

    ner()
    {
        this$0 = EnterInfoView.this;
        super();
    }
}
