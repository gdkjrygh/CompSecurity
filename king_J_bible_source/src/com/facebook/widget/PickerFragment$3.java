// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

// Referenced classes of package com.facebook.widget:
//            PickerFragment

class this._cls0
    implements android.widget.mClickListener
{

    final PickerFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        PickerFragment.access$4(PickerFragment.this, (ListView)adapterview, view, i);
    }

    kListener()
    {
        this$0 = PickerFragment.this;
        super();
    }
}
