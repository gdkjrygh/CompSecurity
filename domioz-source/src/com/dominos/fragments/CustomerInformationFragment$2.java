// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.fragments;

import android.view.View;

// Referenced classes of package com.dominos.fragments:
//            CustomerInformationFragment

class this._cls0
    implements android.view.agment._cls2
{

    final CustomerInformationFragment this$0;

    public void onClick(View view)
    {
        int i = ((Integer)view.getTag()).intValue();
        CustomerInformationFragment.access$100(CustomerInformationFragment.this, i);
    }

    _cls9()
    {
        this$0 = CustomerInformationFragment.this;
        super();
    }
}
