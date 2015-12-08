// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.pinterest.fragment:
//            BoardGridFragment

class this._cls0
    implements android.widget.ickListener
{

    final BoardGridFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        onBoardClicked(adapterview, view, i, l);
    }

    ner()
    {
        this$0 = BoardGridFragment.this;
        super();
    }
}
