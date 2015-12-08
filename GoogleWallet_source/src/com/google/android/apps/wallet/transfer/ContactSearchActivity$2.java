// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer;

import android.transition.Transition;
import android.view.Window;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.text.clearable.ClearableEditText;

// Referenced classes of package com.google.android.apps.wallet.transfer:
//            ContactSearchActivity

final class this._cls0
    implements android.transition.tener
{

    final ContactSearchActivity this$0;

    public final void onTransitionCancel(Transition transition)
    {
    }

    public final void onTransitionEnd(Transition transition)
    {
        Views.showSoftKeyboard(ContactSearchActivity.this, contactTextInput.getEditText());
        getWindow().getEnterTransition().removeListener(this);
    }

    public final void onTransitionPause(Transition transition)
    {
    }

    public final void onTransitionResume(Transition transition)
    {
    }

    public final void onTransitionStart(Transition transition)
    {
    }

    ditText()
    {
        this$0 = ContactSearchActivity.this;
        super();
    }
}
