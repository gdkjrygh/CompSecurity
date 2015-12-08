// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

public interface Images
{
    public static interface LoadImageResult
        extends People.ReleasableResult
    {

        public abstract int getHeight();

        public abstract ParcelFileDescriptor getParcelFileDescriptor();

        public abstract int getWidth();
    }

    public static interface SetAvatarResult
        extends Result
    {
    }


    public abstract PendingResult loadOwnerAvatar(GoogleApiClient googleapiclient, String s, String s1, int i, int j);

    public abstract PendingResult loadOwnerCoverPhoto(GoogleApiClient googleapiclient, String s, String s1, int i);
}
