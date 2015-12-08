// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.development;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package me.lyft.android.ui.development:
//            DeepLinksView

class this._cls0
    implements android.widget.rActionListener
{

    final DeepLinksView this$0;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 2)
        {
            performRoute();
            return true;
        } else
        {
            return false;
        }
    }

    ()
    {
        this$0 = DeepLinksView.this;
        super();
    }
}
