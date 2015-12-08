// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.help;

import android.content.res.Resources;
import android.widget.TextView;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.help:
//            HelpView

class this._cls0
    implements Action1
{

    final HelpView this$0;

    public void call(Boolean boolean1)
    {
        TextView textview = developerModeTitle;
        if (boolean1.booleanValue())
        {
            boolean1 = getResources().getString(0x7f070194);
        } else
        {
            boolean1 = "";
        }
        textview.setText(boolean1);
    }

    public volatile void call(Object obj)
    {
        call((Boolean)obj);
    }

    ()
    {
        this$0 = HelpView.this;
        super();
    }
}
