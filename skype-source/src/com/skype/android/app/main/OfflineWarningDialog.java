// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.app.Dialog;
import android.os.Bundle;
import com.skype.android.SkypeDialogFragment;

public class OfflineWarningDialog extends SkypeDialogFragment
{

    public OfflineWarningDialog()
    {
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        bundle = getMaterialDialogBuilder(getActivity());
        bundle.a(0x7f080264);
        bundle.b(0x7f0803fb);
        bundle.b(0x7f080120, null);
        return bundle.c();
    }
}
