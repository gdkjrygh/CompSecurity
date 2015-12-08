// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.os.Bundle;

public final class iol extends al
{

    public iol()
    {
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = new android.app.AlertDialog.Builder(O_());
        bundle.setMessage(q.bf).setTitle(q.bg).setPositiveButton(q.bd, new ion(this)).setNegativeButton(q.bb, new iom(this));
        return bundle.create();
    }
}
