// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.video;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public interface Video
    extends Parcelable, Freezable
{

    public abstract int getDuration();

    public abstract String getFilePath();

    public abstract long getFileSize();

    public abstract String getPackageName();

    public abstract long getStartTime();
}
