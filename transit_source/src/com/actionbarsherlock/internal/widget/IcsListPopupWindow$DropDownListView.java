// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.widget.ListView;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsListPopupWindow

private static class setCacheColorHint extends ListView
{

    private boolean mHijackFocus;
    private boolean mListSelectionHidden;

    public boolean hasFocus()
    {
        return mHijackFocus || super.hasFocus();
    }

    public boolean hasWindowFocus()
    {
        return mHijackFocus || super.hasWindowFocus();
    }

    public boolean isFocused()
    {
        return mHijackFocus || super.isFocused();
    }

    public boolean isInTouchMode()
    {
        return mHijackFocus && mListSelectionHidden || super.isInTouchMode();
    }


    public (Context context, boolean flag)
    {
        super(context, null, com.actionbarsherlock.ropDownListView);
        mHijackFocus = flag;
        setCacheColorHint(0);
    }
}
