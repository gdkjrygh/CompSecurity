// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.content.res.Resources;
import android.widget.TextView;
import me.lyft.android.common.Strings;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverDestinyView

class this._cls0
    implements Action1
{

    final DriverDestinyView this$0;

    public volatile void call(Object obj)
    {
        call((String)obj);
    }

    public void call(String s)
    {
        TextView textview = destinyAddressTextView;
        String s1 = s;
        if (Strings.isNullOrEmpty(s))
        {
            s1 = getResources().getString(0x7f070064);
        }
        textview.setText(s1);
    }

    ()
    {
        this$0 = DriverDestinyView.this;
        super();
    }
}
