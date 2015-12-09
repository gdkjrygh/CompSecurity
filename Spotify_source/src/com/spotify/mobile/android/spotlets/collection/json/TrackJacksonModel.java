// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.json;

import android.content.Context;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import enr;
import enw;
import eny;
import fiz;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.json:
//            AlbumJacksonModel

public class TrackJacksonModel
    implements JacksonModel, enw
{

    private final int mAddTime;
    private final AlbumJacksonModel mAlbum;
    private final List mArtists;
    private final boolean mCanAddToCollection;
    private final String mHeader;
    private final boolean mInCollection;
    private final boolean mIsAvailable;
    private final boolean mIsExplicit;
    private final boolean mIsLocal;
    private final boolean mIsPlayable;
    private final String mName;
    private final String mOffline;
    private final String mUri;

    public TrackJacksonModel(String s, String s1, String s2, String s3, AlbumJacksonModel albumjacksonmodel, List list, boolean flag, 
            boolean flag1, boolean flag2, boolean flag3, boolean flag4, boolean flag5, int i)
    {
        mUri = s;
        mName = s1;
        mHeader = s2;
        mAlbum = albumjacksonmodel;
        mArtists = list;
        mIsPlayable = flag;
        mIsAvailable = flag1;
        mIsExplicit = flag2;
        mIsLocal = flag3;
        mInCollection = flag4;
        mCanAddToCollection = flag5;
        mOffline = s3;
        mAddTime = i;
    }

    public boolean canAddToCollection()
    {
        return mCanAddToCollection;
    }

    public int getAddTime()
    {
        return mAddTime;
    }

    public eny getAddedBy()
    {
        return null;
    }

    public enr getAlbum()
    {
        return mAlbum;
    }

    public List getArtists()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.addAll(mArtists);
        return arraylist;
    }

    public String getHeader()
    {
        return mHeader;
    }

    public String getImageUri()
    {
        if (mAlbum != null)
        {
            return mAlbum.getImageUri();
        } else
        {
            return "";
        }
    }

    public enw getItem()
    {
        return this;
    }

    public volatile Object getItem()
    {
        return getItem();
    }

    public String getName()
    {
        return mName;
    }

    public int getOfflineState()
    {
        return com.spotify.mobile.android.provider.Metadata.OfflineSync.a(mOffline);
    }

    public String getRowId()
    {
        return null;
    }

    public String getSubtitle(Flags flags, Context context)
    {
        return fiz.a(this);
    }

    public String getTargetUri(Flags flags)
    {
        return getUri();
    }

    public String getTitle()
    {
        return mName;
    }

    public String getUri()
    {
        return mUri;
    }

    public boolean inCollection()
    {
        return mInCollection;
    }

    public boolean isAvailable()
    {
        return mIsAvailable;
    }

    public boolean isExplicit()
    {
        return mIsExplicit;
    }

    public boolean isHeader()
    {
        return TextUtils.isEmpty(mHeader);
    }

    public boolean isLocal()
    {
        return mIsLocal;
    }

    public boolean isPlayable()
    {
        return mIsPlayable;
    }
}
