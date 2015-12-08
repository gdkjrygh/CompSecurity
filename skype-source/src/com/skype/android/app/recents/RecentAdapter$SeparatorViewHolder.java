// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.recents;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.skype.android.util.TimeSeparator;

// Referenced classes of package com.skype.android.app.recents:
//            RecentAdapter

public static class view extends com.skype.android.app.data.er
{

    final TextView view;

    protected void onSetData(Object obj)
    {
        obj = ((TimeSeparator)obj).a();
        view.setText(((CharSequence) (obj)));
        view.setContentDescription(itemView.getContext().getString(0x7f0800b9, new Object[] {
            obj
        }));
        view.setFocusable(false);
    }

    public (View view1)
    {
        super(view1);
        view = (TextView)view1;
    }
}
