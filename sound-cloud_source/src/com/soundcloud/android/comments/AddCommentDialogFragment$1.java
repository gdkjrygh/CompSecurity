// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.comments;

import android.content.DialogInterface;
import android.widget.EditText;
import com.soundcloud.java.strings.Strings;

// Referenced classes of package com.soundcloud.android.comments:
//            AddCommentDialogFragment

class val.input
    implements android.content.ener
{

    final AddCommentDialogFragment this$0;
    final EditText val$input;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = val$input.getText().toString();
        if (Strings.isNotBlank(dialoginterface))
        {
            AddCommentDialogFragment.access$000(AddCommentDialogFragment.this, dialoginterface);
            dismiss();
        }
    }

    ()
    {
        this$0 = final_addcommentdialogfragment;
        val$input = EditText.this;
        super();
    }
}
