// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.os.Bundle;

public final class dvp extends omn
    implements android.content.DialogInterface.OnClickListener
{

    private dvq ad;

    public dvp()
    {
    }

    public static void a(ay ay)
    {
        dvp dvp1 = new dvp();
        dvp1.f(new Bundle());
        dvp1.a(ay, "assistant_auto_backup_master_sync_dialog");
    }

    public final Dialog c(Bundle bundle)
    {
        return (new android.app.AlertDialog.Builder(af)).setTitle(b.jR).setMessage(b.jQ).setPositiveButton(b.jS, this).setNegativeButton(0x1040000, null).create();
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ad = (dvq)ag.a(dvq);
    }

    public final void onClick(DialogInterface dialoginterface, int j)
    {
        if (j == -1)
        {
            ContentResolver.setMasterSyncAutomatically(true);
            ad.d();
        }
    }
}
