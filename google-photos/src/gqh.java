// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;

public final class gqh extends al
{

    public gqh()
    {
    }

    public static gqh b(int i, int j)
    {
        gqh gqh1 = new gqh();
        Bundle bundle = new Bundle();
        bundle.putInt("titleResId", i);
        bundle.putInt("messageResId", j);
        gqh1.f(bundle);
        return gqh1;
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(O_())).setTitle(super.q.getInt("titleResId")).setMessage(super.q.getInt("messageResId")).setCancelable(false).setPositiveButton(0x104000a, null).create();
    }
}
