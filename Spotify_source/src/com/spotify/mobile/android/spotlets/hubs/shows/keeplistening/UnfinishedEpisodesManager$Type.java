// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.hubs.shows.keeplistening;

import android.content.Context;
import ctz;
import cua;
import cuv;

public final class mTitleRes extends Enum
{

    private static b a;
    private static b b;
    private static final b c[];
    private final String mDataSource;
    private final cua mFilter;
    private final int mTitleRes;

    static Iterable a(mTitleRes mtitleres, Iterable iterable)
    {
        return cuv.b(iterable, mtitleres.mFilter);
    }

    static String a(mFilter mfilter)
    {
        return mfilter.mDataSource;
    }

    static String a(mDataSource mdatasource, Context context)
    {
        return context.getString(mdatasource.mTitleRes);
    }

    public static mTitleRes valueOf(String s)
    {
        return (mTitleRes)Enum.valueOf(com/spotify/mobile/android/spotlets/hubs/shows/keeplistening/UnfinishedEpisodesManager$Type, s);
    }

    public static mTitleRes[] values()
    {
        return (mTitleRes[])c.clone();
    }

    static 
    {
        a = new <init>("AUDIO", 0, 0x7f080317, <init>, "core-collection/v1/latest-resume-points:audio");
        b = new <init>("VIDEO", 1, 0x7f080318, <init>, "core-collection/v1/latest-resume-points:video");
        c = (new c[] {
            a, b
        });
    }

    private _cls1.a(String s, int i, int j, _cls1.a a1, String s1)
    {
        super(s, i);
        mFilter = new cua(a1) {

            private UnfinishedEpisodes.MediaType a;

            public final boolean a(Object obj)
            {
                obj = (UnfinishedEpisodes.Episode)obj;
                return obj != null && ((UnfinishedEpisodes.Episode) (obj)).getShow().getMediaType() == a;
            }

            
            {
                a = mediatype;
                super();
            }
        };
        mDataSource = (String)ctz.a(s1);
        mTitleRes = j;
    }
}
