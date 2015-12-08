// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.porcelain.json.collection.PorcelainJsonImmutableLinearCollection;
import ctz;
import cua;
import cuq;
import cuv;
import drz;
import fgc;
import gen;
import ggi;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.search.model:
//            SectionBackground

public class SearchResults
    implements Parcelable, JacksonModel, fgc
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new SearchResults(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new SearchResults[i];
        }

    };
    private static final String KEY_CONTEXT = "context";
    private static final String KEY_ECHO = "echo";
    private static final String KEY_INCLUDE_LOCAL = "includeLocal";
    private static final String KEY_INTENT = "intent";
    private static final String KEY_LOAD_MORE = "loadMoreUri";
    private static final String KEY_RESULTS = "results";
    private static final String KEY_SEARCH_TERM = "searchTerm";
    private static final String KEY_SECTION_BACKGROUNDS = "sectionBackgrounds";
    private static final String KEY_SEQUENCE = "sequence";
    private static final String KEY_SHOULD_BE_APPENDED = "append";
    private static final String KEY_TITLE = "title";
    public static final SearchResults NO_RESULTS;
    private final String mContext;
    private final String mEcho;
    private final boolean mIncludeLocal;
    private final String mIntent;
    private final String mLoadMoreUri;
    private Iterable mPlayables;
    private final PorcelainJsonImmutableLinearCollection mResults;
    private final String mSearchTerm;
    private final ImmutableList mSectionBackgrounds;
    private final Integer mSequence;
    private final boolean mShouldBeAppended;
    private final String mTitle;

    protected SearchResults(Parcel parcel)
    {
        mLoadMoreUri = parcel.readString();
        mSearchTerm = parcel.readString();
        mResults = (PorcelainJsonImmutableLinearCollection)parcel.readParcelable(com/spotify/mobile/android/porcelain/json/collection/PorcelainJsonImmutableLinearCollection.getClassLoader());
        mShouldBeAppended = gen.a(parcel);
        mEcho = parcel.readString();
        mTitle = parcel.readString();
        mIntent = parcel.readString();
        mContext = parcel.readString();
        mSequence = (Integer)parcel.readValue(java/lang/Integer.getClassLoader());
        mIncludeLocal = gen.a(parcel);
        ArrayList arraylist = new ArrayList();
        parcel.readList(arraylist, com/spotify/mobile/android/spotlets/search/model/SectionBackground.getClassLoader());
        mSectionBackgrounds = ImmutableList.a(arraylist);
    }

    public SearchResults(String s, PorcelainJsonImmutableLinearCollection porcelainjsonimmutablelinearcollection, String s1, String s2, String s3, String s4, Integer integer, 
            String s5, Boolean boolean1, Boolean boolean2, List list)
    {
        boolean flag1 = true;
        super();
        mEcho = s3;
        mLoadMoreUri = s1;
        mSearchTerm = (String)ctz.a(s);
        mResults = (PorcelainJsonImmutableLinearCollection)ctz.a(porcelainjsonimmutablelinearcollection);
        mContext = (String)ctz.a(s5);
        mTitle = s2;
        mIntent = s4;
        mSequence = integer;
        boolean flag;
        if (boolean1 != null && boolean1.booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mShouldBeAppended = flag;
        if (boolean2 != null && boolean2.booleanValue())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mIncludeLocal = flag;
        mSectionBackgrounds = ggi.a(list);
    }

    public SearchResults append(SearchResults searchresults)
    {
        if (searchresults == null)
        {
            return this;
        } else
        {
            return new SearchResults(searchresults.mSearchTerm, mResults.append(searchresults.mResults), searchresults.mLoadMoreUri, searchresults.mTitle, searchresults.mEcho, searchresults.mIntent, searchresults.mSequence, searchresults.mContext, Boolean.valueOf(false), Boolean.valueOf(searchresults.mIncludeLocal), ImmutableList.h().b(mSectionBackgrounds).b(searchresults.mSectionBackgrounds).a());
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public int getCurrentSequenceNumber()
    {
        if (getSequence() == null)
        {
            throw new IllegalStateException("Session is not available!");
        } else
        {
            return getSequence().intValue();
        }
    }

    public String getCurrentSessionId()
    {
        if (getIntent() == null)
        {
            throw new IllegalStateException("Session is not available!");
        } else
        {
            return getIntent();
        }
    }

    public String getEcho()
    {
        return mEcho;
    }

    String getIntent()
    {
        return mIntent;
    }

    public String getLoadMoreUri()
    {
        return mLoadMoreUri;
    }

    public String getLoggingContext()
    {
        return mContext;
    }

    public Iterable getPlayables()
    {
        if (mPlayables == null)
        {
            mPlayables = cuv.b(mResults.getPlayables(), new cua() {

                public final boolean a(Object obj)
                {
                    obj = (drz)obj;
                    return obj != null && ((drz) (obj)).isPlayable();
                }

            });
        }
        return mPlayables;
    }

    public String getSearchTerm()
    {
        return mSearchTerm;
    }

    public List getSectionBackgrounds()
    {
        return mSectionBackgrounds;
    }

    Integer getSequence()
    {
        return mSequence;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public PorcelainJsonImmutableLinearCollection getViews()
    {
        return mResults;
    }

    public boolean hasMorePages()
    {
        return getLoadMoreUri() != null;
    }

    public boolean isEmpty()
    {
        return mResults.getItemCount() == 0;
    }

    public boolean isOnDemand()
    {
        return "onDemand".equals(getEcho());
    }

    public boolean isSessionAvailable()
    {
        return mIntent != null && mSequence != null;
    }

    public boolean shouldBeAppended()
    {
        return mShouldBeAppended;
    }

    public boolean shouldIncludeLocalResults()
    {
        return mIncludeLocal;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mLoadMoreUri);
        parcel.writeString(mSearchTerm);
        parcel.writeParcelable(mResults, 0);
        gen.a(parcel, mShouldBeAppended);
        parcel.writeString(mEcho);
        parcel.writeString(mTitle);
        parcel.writeString(mIntent);
        parcel.writeString(mContext);
        parcel.writeValue(mSequence);
        gen.a(parcel, mIncludeLocal);
        parcel.writeList(mSectionBackgrounds);
    }

    static 
    {
        NO_RESULTS = new SearchResults("", PorcelainJsonImmutableLinearCollection.EMPTY, null, null, null, null, null, "empty", Boolean.valueOf(false), Boolean.valueOf(false), null);
    }
}
