// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.people.model.OwnerBuffer;

public interface Graph
{
    public static final class LoadOwnersOptions
    {

        public static final LoadOwnersOptions DEFAULT = new LoadOwnersOptions();
        private boolean aBA;
        private int aBu;

        public final int getSortOrder()
        {
            return aBu;
        }

        public final boolean isIncludePlusPages()
        {
            return aBA;
        }

        public final LoadOwnersOptions setIncludePlusPages(boolean flag)
        {
            aBA = flag;
            return this;
        }


        public LoadOwnersOptions()
        {
            aBu = 0;
        }
    }

    public static interface LoadOwnersResult
        extends People.ReleasableResult
    {

        public abstract OwnerBuffer getOwners();
    }


    public abstract PendingResult loadOwners(GoogleApiClient googleapiclient, LoadOwnersOptions loadownersoptions);
}
