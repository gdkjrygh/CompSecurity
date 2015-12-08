// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.landing;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.landing:
//            EnterInfoView

class val.textView
    implements android.widget.rActionListener
{

    final EnterInfoView this$0;
    final TextView val$textView;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        val$textView.setVisibility(4);
        return false;
    }

    ner()
    {
        this$0 = final_enterinfoview;
        val$textView = TextView.this;
        super();
    }
}
