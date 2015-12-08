// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            zzed

class zzty
    implements android.content.nterface.OnClickListener
{

    final String zztx;
    final String zzty;
    final zzed zztz;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (DownloadManager)zzed.zza(zztz).getSystemService("download");
        try
        {
            dialoginterface.enqueue(zztz.zzf(zztx, zzty));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            zztz.zzH("Could not store picture.");
        }
    }

    Listener(zzed zzed1, String s, String s1)
    {
        zztz = zzed1;
        zztx = s;
        zzty = s1;
        super();
    }
}
