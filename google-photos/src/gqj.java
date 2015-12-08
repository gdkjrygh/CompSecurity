// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;

public final class gqj extends al
{

    public gqj()
    {
    }

    public static gqj r()
    {
        return new gqj();
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(O_())).setMessage(b.tH).setCancelable(false).setPositiveButton(b.tI, null).create();
    }
}
