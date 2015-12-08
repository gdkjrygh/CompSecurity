// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;

// Referenced classes of package com.google.android.gms.internal:
//            dz

class b
    implements android.content.gInterface.OnClickListener
{

    final String a;
    final String b;
    final dz c;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = (DownloadManager)dz.a(c).getSystemService("download");
        try
        {
            dialoginterface.enqueue(c.a(a, b));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (DialogInterface dialoginterface)
        {
            c.b("Could not store picture.");
        }
    }

    ckListener(dz dz1, String s, String s1)
    {
        c = dz1;
        a = s;
        b = s1;
        super();
    }
}
