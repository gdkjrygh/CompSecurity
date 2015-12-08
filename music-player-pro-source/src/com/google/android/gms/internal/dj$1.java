// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            dj, gr

class rq
    implements android.content.gInterface.OnClickListener
{

    final String rp;
    final String rq;
    final dj rr;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (DownloadManager)dj.a(rr).getSystemService("download");
        try
        {
            dialoginterface.enqueue(rr.b(rp, rq));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            gr.U("Could not store picture.");
        }
    }

    ckListener(dj dj1, String s, String s1)
    {
        rr = dj1;
        rp = s;
        rq = s1;
        super();
    }
}
