// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;

public final class bfb extends omn
{

    public bfb()
    {
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(new ContextThemeWrapper(O_(), com.google.android.apps.consumerphotoeditor.R.style.Theme_AppCompat_Light))).setMessage(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_invalid_edit_list_message)).setTitle(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_invalid_edit_list_title)).setPositiveButton(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_invalid_edit_list_confirm), null).setNegativeButton(a(com.google.android.apps.consumerphotoeditor.R.string.cpe_invalid_edit_list_cancel), new bfc(this)).setCancelable(false).create();
    }

    public final void i(Bundle bundle)
    {
        super.i(bundle);
    }
}
