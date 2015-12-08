// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.fragment;

import android.view.View;
import android.view.ViewTreeObserver;
import com.pinterest.base.Events;
import me.grantland.widget.AutofitHelper;

// Referenced classes of package com.pinterest.activity.nux.fragment:
//            NUXCoreConceptsSaveFragment

class this._cls0
    implements android.view.tListener
{

    final NUXCoreConceptsSaveFragment this$0;

    public void onGlobalLayout()
    {
        Events.post(new com.pinterest.activity.nux.er.NUXCoreConceptsLayoutDoneEvent(_title));
        getView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
        _titleAutofitHelper.a(false);
    }

    eConceptsLayoutDoneEvent()
    {
        this$0 = NUXCoreConceptsSaveFragment.this;
        super();
    }
}
