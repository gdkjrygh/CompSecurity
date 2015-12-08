// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.content.DialogInterface;

// Referenced classes of package net.hockeyapp.android:
//            DownloadFileTask, DownloadFileListener

final class this._cls0
    implements android.content.lickListener
{

    final DownloadFileTask this$0;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        DownloadFileTask.access$000(DownloadFileTask.this).downloadFailed(DownloadFileTask.this, Boolean.valueOf(true));
    }

    r()
    {
        this$0 = DownloadFileTask.this;
        super();
    }
}
