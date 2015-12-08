// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            zzer

class zzyM
    implements android.content.nterface.OnClickListener
{

    final String zzyL;
    final String zzyM;
    final zzer zzyN;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (DownloadManager)zzer.zza(zzyN).getSystemService("download");
        try
        {
            dialoginterface.enqueue(zzyN.zzf(zzyL, zzyM));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            zzyN.zzae("Could not store picture.");
        }
    }

    Listener(zzer zzer1, String s, String s1)
    {
        zzyN = zzer1;
        zzyL = s;
        zzyM = s1;
        super();
    }
}
