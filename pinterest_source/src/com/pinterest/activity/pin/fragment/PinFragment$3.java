// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.view.ViewTreeObserver;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinFragment

class this._cls0
    implements android.view.er.OnPreDrawListener
{

    final PinFragment this$0;

    public boolean onPreDraw()
    {
        PinFragment.access$500(PinFragment.this);
        if (PinFragment.access$600(PinFragment.this) && PinFragment.access$700(PinFragment.this) != null)
        {
            PinFragment.access$800(PinFragment.this).getViewTreeObserver().removeOnPreDrawListener(this);
        }
        return true;
    }

    ()
    {
        this$0 = PinFragment.this;
        super();
    }
}
