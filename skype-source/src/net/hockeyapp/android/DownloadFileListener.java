// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;


// Referenced classes of package net.hockeyapp.android:
//            DownloadFileTask

public interface DownloadFileListener
{

    public abstract void downloadFailed(DownloadFileTask downloadfiletask, Boolean boolean1);

    public abstract void downloadSuccessful(DownloadFileTask downloadfiletask);
}
