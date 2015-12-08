// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.support.design.widget.FloatingActionButton;
import android.view.ViewTreeObserver;

// Referenced classes of package com.skype.android.app.contacts:
//            PickerFragment

final class this._cls0
    implements android.view.OnGlobalLayoutListener
{

    final PickerFragment this$0;

    public final void onGlobalLayout()
    {
        floatingActionButton.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        android.view.ayoutParams ayoutparams = (android.view.ayoutParams)floatingActionButton.getLayoutParams();
        ayoutparams.topMargin = -floatingActionButton.getHeight() / 2;
        floatingActionButton.setLayoutParams(ayoutparams);
    }

    on()
    {
        this$0 = PickerFragment.this;
        super();
    }
}
