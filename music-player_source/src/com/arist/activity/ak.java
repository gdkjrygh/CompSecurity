// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.content.DialogInterface;

// Referenced classes of package com.arist.activity:
//            ScanMusicActivity

final class ak
    implements android.content.DialogInterface.OnClickListener
{

    final ScanMusicActivity a;

    ak(ScanMusicActivity scanmusicactivity)
    {
        a = scanmusicactivity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface.dismiss();
        a.a();
    }
}
