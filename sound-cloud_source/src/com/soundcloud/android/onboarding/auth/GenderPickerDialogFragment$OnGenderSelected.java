// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding.auth;

import android.content.DialogInterface;

// Referenced classes of package com.soundcloud.android.onboarding.auth:
//            GenderPickerDialogFragment, GenderOption

private class <init>
    implements android.content.gment.OnGenderSelected
{

    final GenderPickerDialogFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        GenderPickerDialogFragment.access$100(GenderPickerDialogFragment.this).Selected(GenderOption.values()[i]);
        dialoginterface.dismiss();
    }

    private ()
    {
        this$0 = GenderPickerDialogFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
