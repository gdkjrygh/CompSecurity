// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.interest;

import com.pinterest.api.model.Interest;
import com.pinterest.ui.actionbar.MetadataBar;

// Referenced classes of package com.pinterest.activity.interest:
//            InterestFragment

class this._cls0
    implements com.pinterest.base.iber
{

    final InterestFragment this$0;

    public void onEventMainThread(com.pinterest.api.model.t t)
    {
        t = t.getInterest();
        if (t != null && InterestFragment.access$100(InterestFragment.this) != null && t.getUid() == InterestFragment.access$100(InterestFragment.this).getUid())
        {
            InterestFragment.access$102(InterestFragment.this, t);
            if (InterestFragment.access$200(InterestFragment.this) != null)
            {
                InterestFragment.access$200(InterestFragment.this).setModel(InterestFragment.access$100(InterestFragment.this));
            }
            if (_floatingMetadataBar != null)
            {
                _floatingMetadataBar.setModel(InterestFragment.access$100(InterestFragment.this));
                return;
            }
        }
    }

    ()
    {
        this$0 = InterestFragment.this;
        super();
    }
}
