// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.dominos.fragments:
//            CustomerInformationFragment

class this._cls0
    implements android.view.agment._cls3
{

    final CustomerInformationFragment this$0;

    public boolean onLongClick(View view)
    {
        getActivity().openContextMenu(view);
        return true;
    }

    _cls9()
    {
        this$0 = CustomerInformationFragment.this;
        super();
    }
}
