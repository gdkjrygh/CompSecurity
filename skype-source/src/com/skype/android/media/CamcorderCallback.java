// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import java.io.File;

public interface CamcorderCallback
{

    public abstract void onError(int i);

    public abstract void onException(Throwable throwable);

    public abstract void onFileRecorded(File file);

    public abstract void onRecording();

    public abstract void onStoppable();
}
