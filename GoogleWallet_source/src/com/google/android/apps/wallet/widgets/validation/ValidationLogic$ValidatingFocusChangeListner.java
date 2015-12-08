// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.validation;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package com.google.android.apps.wallet.widgets.validation:
//            ValidationLogic

final class <init>
    implements android.view.onLogic.ValidatingFocusChangeListner
{

    final ValidationLogic this$0;

    public final void onFocusChange(View view, boolean flag)
    {
        view = ValidationLogic.this;
        boolean flag1;
        if (flag && !ValidationLogic.access$400(ValidationLogic.this))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ValidationLogic.access$202(view, flag1);
        ValidationLogic.access$402(ValidationLogic.this, true);
        if ((!flag || ValidationLogic.access$000(ValidationLogic.this).length() > 0) && !ValidationLogic.access$500(ValidationLogic.this))
        {
            checkForError();
        }
    }

    private ()
    {
        this$0 = ValidationLogic.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
