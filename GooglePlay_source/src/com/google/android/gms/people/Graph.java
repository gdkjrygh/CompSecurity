// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.people.internal.PeopleCallLog;
import com.google.android.gms.people.model.CircleBuffer;
import com.google.android.gms.people.model.OwnerBuffer;
import com.google.android.gms.people.model.PersonBuffer;
import java.util.Collection;

public interface Graph
{
    public static final class LoadCirclesOptions
    {

        public static final LoadCirclesOptions DEFAULT = new LoadCirclesOptions();
        public int mFilterCircleType;

        public final String toString()
        {
            return PeopleCallLog.toStringHelper(new Object[] {
                "mFilterCircleType", Integer.valueOf(mFilterCircleType), "mFilterCircleId", null, "mFilterCircleNamePrefix", null, "mGetVisibility", Boolean.valueOf(false)
            });
        }


        public LoadCirclesOptions()
        {
            mFilterCircleType = -999;
        }
    }

    public static interface LoadCirclesResult
        extends People.ReleasableResult
    {

        public abstract CircleBuffer getCircles();
    }

    public static final class LoadOwnersOptions
    {

        public static final LoadOwnersOptions DEFAULT = new LoadOwnersOptions();
        public boolean mIncludePlusPages;
        private int mSortOrder;

        public final String toString()
        {
            return PeopleCallLog.toStringHelper(new Object[] {
                "mIncludePlusPages", Boolean.valueOf(false), "mSortOrder", Integer.valueOf(0)
            });
        }


        public LoadOwnersOptions()
        {
            mSortOrder = 0;
        }
    }

    public static interface LoadOwnersResult
        extends People.ReleasableResult
    {

        public abstract OwnerBuffer getOwners();
    }

    public static final class LoadPeopleOptions
    {

        public static final LoadPeopleOptions DEFAULT = new LoadPeopleOptions();
        public int mProjection;
        public Collection mQualifiedIds;
        public int mSearchFields;
        private int mSortOrder;

        public final String toString()
        {
            return PeopleCallLog.toStringHelper(new Object[] {
                "mCircleId", null, "mQualifiedIds", mQualifiedIds, "mProjection", Integer.valueOf(mProjection), "mPeopleOnly", Boolean.valueOf(false), "mChangedSince", Long.valueOf(0L), 
                "mQuery", null, "mSearchFields", Integer.valueOf(mSearchFields), "mSortOrder", Integer.valueOf(0), "mExtraColumns", Integer.valueOf(0)
            });
        }


        public LoadPeopleOptions()
        {
            mProjection = 0x1fffff;
            mSearchFields = 7;
            mSortOrder = 0;
        }
    }

    public static interface LoadPeopleResult
        extends People.ReleasableResult
    {

        public abstract PersonBuffer getPeople();
    }


    public abstract PendingResult loadCircles$3c0ce7d1(GoogleApiClient googleapiclient, String s, LoadCirclesOptions loadcirclesoptions);

    public abstract PendingResult loadOwners(GoogleApiClient googleapiclient, LoadOwnersOptions loadownersoptions);

    public abstract PendingResult loadPeople$7acb640d(GoogleApiClient googleapiclient, String s, LoadPeopleOptions loadpeopleoptions);
}
