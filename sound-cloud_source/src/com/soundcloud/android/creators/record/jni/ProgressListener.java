// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record.jni;

import com.soundcloud.android.creators.upload.UserCanceledException;

public interface ProgressListener
{

    public abstract void onProgress(long l, long l1)
        throws UserCanceledException;
}
