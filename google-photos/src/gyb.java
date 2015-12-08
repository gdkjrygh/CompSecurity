// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;

public final class gyb extends al
{

    public gyb()
    {
    }

    public static gyb b(int i)
    {
        gyb gyb1 = new gyb();
        Bundle bundle = new Bundle();
        bundle.putInt("messageResId", i);
        gyb1.f(bundle);
        return gyb1;
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(O_())).setMessage(super.q.getInt("messageResId")).setCancelable(false).setPositiveButton(0x104000a, null).create();
    }
}
