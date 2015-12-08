// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.validation;

import android.text.Editable;
import android.widget.EditText;
import com.google.android.apps.wallet.util.text.DefaultTextWatcher;

// Referenced classes of package com.google.android.apps.wallet.widgets.validation:
//            ValidationLogic

final class <init> extends DefaultTextWatcher
{

    final ValidationLogic this$0;

    private void performAutoAdvance()
    {
        if (ValidationLogic.access$000(ValidationLogic.this).focusSearch(130) != null)
        {
            ValidationLogic.access$000(ValidationLogic.this).onEditorAction(5);
        } else
        {
            ValidationLogic.access$000(ValidationLogic.this).onEditorAction(6);
        }
        ValidationLogic.access$202(ValidationLogic.this, false);
    }

    public final void afterTextChanged(Editable editable)
    {
        if (ValidationLogic.access$000(ValidationLogic.this).length() >= ValidationLogic.access$100(ValidationLogic.this) && ValidationLogic.access$200(ValidationLogic.this) && ValidationLogic.access$300(ValidationLogic.this) && !checkForError())
        {
            performAutoAdvance();
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
