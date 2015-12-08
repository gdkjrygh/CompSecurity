// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.pinit;

import android.view.View;

// Referenced classes of package com.pinterest.pinit:
//            PinItButton, PinIt

class this._cls0
    implements android.view.stener
{

    final PinItButton this$0;

    public void onClick(View view)
    {
        if (view != null)
        {
            PinItButton.access$000(PinItButton.this).doPinIt(view.getContext());
        }
    }

    ()
    {
        this$0 = PinItButton.this;
        super();
    }
}
