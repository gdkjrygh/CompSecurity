// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.plus.model.moments.Moment;
import com.google.android.gms.plus.model.moments.MomentBuffer;

public interface Moments
{
    public static interface LoadMomentsResult
        extends Releasable, Result
    {

        public abstract MomentBuffer getMomentBuffer();

        public abstract String getNextPageToken();

        public abstract String getUpdated();
    }


    public abstract PendingResult load(GoogleApiClient googleapiclient);

    public abstract PendingResult load(GoogleApiClient googleapiclient, int i, String s, Uri uri, String s1, String s2);

    public abstract PendingResult remove(GoogleApiClient googleapiclient, String s);

    public abstract PendingResult write(GoogleApiClient googleapiclient, Moment moment);
}
