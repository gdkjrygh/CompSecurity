// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.support.v7.view.ActionMode;
import android.view.View;
import android.widget.AdapterView;
import com.phunware.nbc.sochi.caption.adapter.ClosedCaptionCursorAdapter;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            CaptionListFragment

class this._cls1
    implements android.widget.CaptionStyleActionMode._cls1
{

    final is._cls0 this$1;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (i == 1)
        {
            CaptionListFragment.access$300(_fld0).checkAllItems();
            mMode.invalidate();
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
