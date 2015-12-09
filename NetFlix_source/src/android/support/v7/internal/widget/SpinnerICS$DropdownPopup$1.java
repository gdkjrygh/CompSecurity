// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerICS, AdapterViewICS

class val.this._cls0
    implements istener
{

    final smiss this$1;
    final SpinnerICS val$this$0;

    public void onItemClick(AdapterViewICS adapterviewics, View view, int i, long l)
    {
        setSelection(i);
        if (mOnItemClickListener != null)
        {
            performItemClick(view, i, cess._mth100(this._cls1.this).getItemId(i));
        }
        smiss();
    }

    istener()
    {
        this$1 = final_istener;
        val$this$0 = SpinnerICS.this;
        super();
    }
}
