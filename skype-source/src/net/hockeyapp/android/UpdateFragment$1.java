// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.app.Activity;

// Referenced classes of package net.hockeyapp.android:
//            DownloadFileListener, UpdateFragment, DownloadFileTask

final class val.activity
    implements DownloadFileListener
{

    final UpdateFragment this$0;
    final Activity val$activity;

    public final void downloadFailed(DownloadFileTask downloadfiletask, Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            UpdateFragment.access$000(UpdateFragment.this, val$activity);
        }
    }

    public final void downloadSuccessful(DownloadFileTask downloadfiletask)
    {
    }

    ner()
    {
        this$0 = final_updatefragment;
        val$activity = Activity.this;
        super();
    }
}
