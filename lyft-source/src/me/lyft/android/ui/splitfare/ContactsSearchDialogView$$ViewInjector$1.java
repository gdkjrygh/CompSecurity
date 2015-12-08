// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.splitfare;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package me.lyft.android.ui.splitfare:
//            ContactsSearchDialogView

class val.target
    implements android.widget.iewInjector._cls1
{

    final val.target this$0;
    final ContactsSearchDialogView val$target;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        val$target.onItemClicked(i);
    }

    ()
    {
        this$0 = final_;
        val$target = ContactsSearchDialogView.this;
        super();
    }
}
