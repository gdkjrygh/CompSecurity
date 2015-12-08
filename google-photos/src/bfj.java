// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;

public final class bfj extends al
{

    public bfj()
    {
    }

    public static bfj b(int i, int j)
    {
        bfj bfj1 = new bfj();
        Bundle bundle = new Bundle();
        bundle.putInt("titleResId", i);
        bundle.putInt("messageResId", j);
        bfj1.f(bundle);
        return bfj1;
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(new ContextThemeWrapper(O_(), com.google.android.apps.consumerphotoeditor.R.style.Theme_AppCompat_Light))).setTitle(super.q.getInt("titleResId")).setMessage(super.q.getInt("messageResId")).setPositiveButton(0x104000a, null).create();
    }
}
