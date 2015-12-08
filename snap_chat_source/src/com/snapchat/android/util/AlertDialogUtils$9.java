// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util;

import android.content.DialogInterface;
import android.widget.CheckBox;

// Referenced classes of package com.snapchat.android.util:
//            AlertDialogUtils

static final class val.listener
    implements android.content.lickListener
{

    final CheckBox val$dontAskAgainCheckBox;
    final sNoOption.YES val$listener;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (val$dontAskAgainCheckBox.isChecked())
        {
            val$listener.a(sNoOption.YES_DONT_ASK_AGAIN);
            return;
        } else
        {
            val$listener.a(sNoOption.YES);
            return;
        }
    }

    sNoOption(CheckBox checkbox, sNoOption snooption)
    {
        val$dontAskAgainCheckBox = checkbox;
        val$listener = snooption;
        super();
    }
}
