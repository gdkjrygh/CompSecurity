// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            zzdd

class b
    implements android.content.nterface.OnClickListener
{

    final String a;
    final String b;
    final zzdd c;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (DownloadManager)zzdd.zza(c).getSystemService("download");
        try
        {
            dialoginterface.enqueue(c.zzg(a, b));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            c.zzQ("Could not store picture.");
        }
    }

    Listener(zzdd zzdd1, String s, String s1)
    {
        c = zzdd1;
        a = s;
        b = s1;
        super();
    }
}
