// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;

public final class grw extends al
{

    public grw()
    {
    }

    public static grw r()
    {
        return new grw();
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(O_())).setTitle(b.tP).setMessage(b.tO).setCancelable(false).setPositiveButton(0x104000a, null).create();
    }
}
