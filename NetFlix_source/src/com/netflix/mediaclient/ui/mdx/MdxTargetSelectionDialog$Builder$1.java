// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxTargetSelectionDialog

class val.listener
    implements android.widget.ialog.Builder._cls1
{

    final val.listener this$0;
    final android.widget.ialog.Builder val$listener;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        cess._mth200(this._cls0.this).notifyDataSetChanged();
        val$listener.temClick(adapterview, view, i, l);
    }

    pter()
    {
        this$0 = final_pter;
        val$listener = android.widget.ialog.Builder._cls1.val.listener.this;
        super();
    }
}
