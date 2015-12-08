// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.util;

import android.support.v4.util.ContainerHelpers;
import android.support.v4.util.LongSparseArray;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Joiner;
import com.google.android.gms.games.client.PlayGames;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ExperimentUtils
{
    public static final class Experiment
    {

        private final boolean mDefault;
        private final long mId;
        private final String mName;

        public final boolean get(GoogleApiClient googleapiclient)
        {
            return isEnabled(PlayGames.getExperiments(googleapiclient));
        }

        public final boolean isEnabled(Collection collection)
        {
            if (collection == null)
            {
                return mDefault;
            } else
            {
                return collection.contains(Long.valueOf(mId));
            }
        }

        public final String toString()
        {
            return String.format("%s (%s)", new Object[] {
                mName, Long.valueOf(mId)
            });
        }

        Experiment(long l, String s, boolean flag)
        {
            mId = l;
            mName = s;
            mDefault = flag;
            s = ExperimentUtils.KNOWN_EXPERIMENTS;
            l = mId;
            if (((LongSparseArray) (s)).mSize != 0 && l <= ((LongSparseArray) (s)).mKeys[((LongSparseArray) (s)).mSize - 1])
            {
                s.put(l, this);
                return;
            }
            int i = ((LongSparseArray) (s)).mSize;
            if (i >= ((LongSparseArray) (s)).mKeys.length)
            {
                int j = ContainerHelpers.idealLongArraySize(i + 1);
                long al[] = new long[j];
                Object aobj[] = new Object[j];
                System.arraycopy(((LongSparseArray) (s)).mKeys, 0, al, 0, ((LongSparseArray) (s)).mKeys.length);
                System.arraycopy(((Object) (((LongSparseArray) (s)).mValues)), 0, ((Object) (aobj)), 0, ((LongSparseArray) (s)).mValues.length);
                s.mKeys = al;
                s.mValues = aobj;
            }
            ((LongSparseArray) (s)).mKeys[i] = l;
            ((LongSparseArray) (s)).mValues[i] = this;
            s.mSize = i + 1;
        }
    }


    public static final Experiment ENABLE_LATENCY_BACKOUT_LOGGING = new Experiment(0xc050e6L, "ENABLE_LATENCY_BACKOUT_LOGGING", true);
    public static final Experiment ENABLE_VIDEO_LIVE_STREAMING = new Experiment(0xc050d3L, "ENABLE_VIDEO_LIVE_STREAMING", false);
    public static final Experiment ENABLE_VIDEO_RECORDING = new Experiment(0xc053d0L, "ENABLE_VIDEO_RECORDING", false);
    public static final Experiment ENABLE_VIDEO_RECORDING_ONBOARDING = new Experiment(0xc051aeL, "ENABLE_VIDEO_RECORDING_ONBOARDING", true);
    public static final Experiment ENABLE_VIDEO_RECORDING_PROFILING = new Experiment(0xc05006L, "ENABLE_VIDEO_RECORDING_PROFILING", false);
    private static final LongSparseArray KNOWN_EXPERIMENTS = new LongSparseArray();

    public static String getExperimentString(Set set)
    {
        ArrayList arraylist = new ArrayList(set.size());
        for (set = set.iterator(); set.hasNext();)
        {
            Long long1 = (Long)set.next();
            Experiment experiment = (Experiment)KNOWN_EXPERIMENTS.get(long1.longValue());
            if (experiment == null)
            {
                arraylist.add(long1.toString());
            } else
            {
                arraylist.add(experiment.toString());
            }
        }

        return Joiner.on(",").join(arraylist);
    }


}
