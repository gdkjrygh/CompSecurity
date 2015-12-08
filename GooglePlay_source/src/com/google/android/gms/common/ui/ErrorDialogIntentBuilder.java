// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.ui;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.common.ui:
//            ErrorDialogActivity

public final class ErrorDialogIntentBuilder
{

    public final Intent mIntent;

    public ErrorDialogIntentBuilder(Context context, String s, String s1)
    {
        mIntent = (new Intent("android.intent.action.VIEW")).setClass(context, com/google/android/gms/common/ui/ErrorDialogActivity).setPackage("com.google.android.gms");
        mIntent.putExtra("com.google.android.gms.common.ui.EXTRA_DIALOG_TITLE_STR", s);
        mIntent.putExtra("com.google.android.gms.common.ui.EXTRA_DIALOG_MESSAGE_STR", s1);
        mIntent.putExtra("com.google.android.gms.common.ui.EXTRA_DIALOG_RESULT_CODE", -1);
        mIntent.addFlags(0x24000000);
    }
}
