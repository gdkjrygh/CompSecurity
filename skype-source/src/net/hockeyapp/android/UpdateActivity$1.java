// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;


// Referenced classes of package net.hockeyapp.android:
//            DownloadFileListener, UpdateActivity, DownloadFileTask

final class this._cls0
    implements DownloadFileListener
{

    final UpdateActivity this$0;

    public final void downloadFailed(DownloadFileTask downloadfiletask, Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            UpdateActivity.access$000(UpdateActivity.this);
            return;
        } else
        {
            enableUpdateButton();
            return;
        }
    }

    public final void downloadSuccessful(DownloadFileTask downloadfiletask)
    {
        enableUpdateButton();
    }

    ner()
    {
        this$0 = UpdateActivity.this;
        super();
    }
}
