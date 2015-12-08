// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.ActionMode;
import android.view.View;
import android.widget.AdapterView;
import com.phunware.nbc.sochi.caption.adapter.ClosedCaptionCursorAdapter;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            CaptionListFragment

class this._cls0
    implements android.widget.ClickListener
{

    final CaptionListFragment this$0;

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        if (mMode != null)
        {
            return false;
        }
        CaptionListFragment.access$800(CaptionListFragment.this);
        ((AppCompatActivity)getActivity()).startSupportActionMode(new ptionStyleActionMode(CaptionListFragment.this, null));
        if (l > 0L)
        {
            CaptionListFragment.access$300(CaptionListFragment.this).setChecked(l, true);
        }
        mMode.invalidate();
        return true;
    }

    ter()
    {
        this$0 = CaptionListFragment.this;
        super();
    }
}
