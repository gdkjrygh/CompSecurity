// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.widgets.validation;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.google.android.apps.wallet.widgets.validation:
//            ValidatedSpinner

final class this._cls0
    implements android.widget.electedListener
{

    final ValidatedSpinner this$0;

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (!ValidatedSpinner.access$000(ValidatedSpinner.this))
        {
            if (ValidatedSpinner.access$100(ValidatedSpinner.this) != null)
            {
                ValidatedSpinner.access$100(ValidatedSpinner.this).onItemSelected(adapterview, view, i, l);
            }
            checkForError();
            return;
        } else
        {
            ValidatedSpinner.access$002(ValidatedSpinner.this, false);
            return;
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
        if (!ValidatedSpinner.access$000(ValidatedSpinner.this))
        {
            if (ValidatedSpinner.access$100(ValidatedSpinner.this) != null)
            {
                ValidatedSpinner.access$100(ValidatedSpinner.this).onNothingSelected(adapterview);
            }
            checkForError();
            return;
        } else
        {
            ValidatedSpinner.access$002(ValidatedSpinner.this, false);
            return;
        }
    }

    ()
    {
        this$0 = ValidatedSpinner.this;
        super();
    }
}
