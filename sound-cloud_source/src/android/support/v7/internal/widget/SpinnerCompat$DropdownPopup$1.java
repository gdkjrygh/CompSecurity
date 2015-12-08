// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.widget:
//            SpinnerCompat

class val.this._cls0
    implements android.widget.r
{

    final smiss this$1;
    final SpinnerCompat val$this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        setSelection(i);
        if (mOnItemClickListener != null)
        {
            performItemClick(view, i, cess._mth300(this._cls1.this).getItemId(i));
        }
        smiss();
    }

    ()
    {
        this$1 = final_;
        val$this$0 = SpinnerCompat.this;
        super();
    }
}
