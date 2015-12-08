// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.transfer;

import android.support.v4.app.LoaderManager;
import android.text.Editable;
import com.google.android.apps.wallet.util.text.DefaultTextWatcher;

// Referenced classes of package com.google.android.apps.wallet.transfer:
//            ContactSearchActivity

final class t> extends DefaultTextWatcher
{

    final ContactSearchActivity this$0;

    public final void afterTextChanged(Editable editable)
    {
        ContactSearchActivity.access$800(ContactSearchActivity.this);
    }

    public final void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (charsequence != null)
        {
            getSupportLoaderManager().restartLoader(0, null, ContactSearchActivity.access$700(ContactSearchActivity.this, charsequence.toString()));
        }
    }

    ()
    {
        this$0 = ContactSearchActivity.this;
        super();
    }
}
