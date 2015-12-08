// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.vim;

import java.io.File;

// Referenced classes of package com.skype.android.app.vim:
//            VideoCaptureFragment

public static interface 
{

    public abstract void onFileRecorded(File file, long l, int i);

    public abstract void onMinimumRecordTimePassed();

    public abstract void onProgressUpdate(long l, long l1);

    public abstract void onRecordCapabilityChange(boolean flag);

    public abstract void onRecordingPaused();

    public abstract void onRecordingStarted();

    public abstract void onRecordingStopped(boolean flag);
}
