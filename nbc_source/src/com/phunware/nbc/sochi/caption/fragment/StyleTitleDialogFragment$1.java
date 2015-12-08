// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.fragment;

import android.content.DialogInterface;
import android.widget.EditText;

// Referenced classes of package com.phunware.nbc.sochi.caption.fragment:
//            StyleTitleDialogFragment, CaptionNewStyleFragment

class val.editTextNewDescription
    implements android.content.ener
{

    final StyleTitleDialogFragment this$0;
    final EditText val$editTextNewDescription;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = val$editTextNewDescription.getText().toString();
        StyleTitleDialogFragment.access$000(StyleTitleDialogFragment.this).setDescription(dialoginterface);
    }

    ()
    {
        this$0 = final_styletitledialogfragment;
        val$editTextNewDescription = EditText.this;
        super();
    }
}
