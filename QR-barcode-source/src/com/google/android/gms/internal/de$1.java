// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            de, gs

class qZ
    implements android.content.gInterface.OnClickListener
{

    final String qY;
    final String qZ;
    final de ra;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (DownloadManager)de.a(ra).getSystemService("download");
        try
        {
            dialoginterface.enqueue(ra.b(qY, qZ));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            gs.U("Could not store picture.");
        }
    }

    ckListener(de de1, String s, String s1)
    {
        ra = de1;
        qY = s;
        qZ = s1;
        super();
    }
}
