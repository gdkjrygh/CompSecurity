// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.view.View;
import android.view.ViewTreeObserver;
import com.pinterest.activity.nux.NUXCoreConceptsTitleResizeHelper;
import com.pinterest.base.Events;
import me.grantland.widget.AutofitHelper;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXCoreConceptsHomefeedFragment

class this._cls0
    implements android.view.tener
{

    final NUXCoreConceptsHomefeedFragment this$0;

    public void onGlobalLayout()
    {
        Events.post(new com.pinterest.activity.nux.UXCoreConceptsLayoutDoneEvent(_title));
        getView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
        _titleAutofitHelper.a(false);
        NUXCoreConceptsHomefeedFragment.access$100(NUXCoreConceptsHomefeedFragment.this).matchAllTitleSizes();
    }

    ceptsLayoutDoneEvent()
    {
        this$0 = NUXCoreConceptsHomefeedFragment.this;
        super();
    }
}
