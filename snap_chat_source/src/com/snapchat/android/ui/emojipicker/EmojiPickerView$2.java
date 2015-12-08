// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.emojipicker;

import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package com.snapchat.android.ui.emojipicker:
//            EmojiPickerView

final class a
    implements android.view.er
{

    private EmojiPickerView a;

    public final void onClick(View view)
    {
        int i = ((Integer)view.getTag()).intValue();
        if (i != EmojiPickerView.a(a))
        {
            EmojiPickerView.b(a, i);
            EmojiPickerView.a(a, EmojiPickerView.a(a));
            EmojiPickerView.b(a).setCurrentItem(i);
            return;
        } else
        {
            ((RecyclerView)EmojiPickerView.b(a).findViewWithTag(Integer.valueOf(i))).b(0);
            return;
        }
    }

    (EmojiPickerView emojipickerview)
    {
        a = emojipickerview;
        super();
    }
}
