// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.json.item;

import android.os.Parcel;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonImage;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonMetricsData;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonNavigationLink;
import com.spotify.mobile.android.porcelain.json.subitem.PorcelainJsonPlayable;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsRenderType;
import com.spotify.mobile.android.porcelain.subitem.PorcelainImage;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import ctz;
import dqz;
import drz;
import gen;
import java.util.Collections;

// Referenced classes of package com.spotify.mobile.android.porcelain.json.item:
//            PorcelainJsonBaseItem

public abstract class PorcelainJsonBaseCardItem extends PorcelainJsonBaseItem
    implements dqz
{

    protected static final String KEY_ENABLED = "enabled";
    protected static final String KEY_IMAGE = "image";
    protected static final String KEY_LINK = "link";
    protected static final String KEY_LINK_LONG_CLICK = "longClick";
    protected static final String KEY_MAX_ROWS = "maxRows";
    protected static final String KEY_PLAYABLE = "playback";
    protected static final String KEY_TEXT = "text";
    private final PorcelainJsonImage mImage;
    private final boolean mIsEnabled;
    private final PorcelainJsonNavigationLink mLink;
    private final PorcelainJsonNavigationLink mLongClickLink;
    private final int mMaxRows;
    private final PorcelainJsonPlayable mPlayable;
    private final Object mText;

    PorcelainJsonBaseCardItem(String s, PorcelainJsonMetricsData porcelainjsonmetricsdata, PorcelainJsonImage porcelainjsonimage, Object obj, PorcelainJsonNavigationLink porcelainjsonnavigationlink, PorcelainJsonNavigationLink porcelainjsonnavigationlink1, PorcelainJsonPlayable porcelainjsonplayable, 
            int i, boolean flag)
    {
        super(s, porcelainjsonmetricsdata);
        mImage = (PorcelainJsonImage)ctz.a(porcelainjsonimage);
        mLongClickLink = porcelainjsonnavigationlink1;
        mText = obj;
        mIsEnabled = flag;
        mLink = porcelainjsonnavigationlink;
        mPlayable = porcelainjsonplayable;
        mMaxRows = i;
    }

    public PorcelainJsonImage getImage()
    {
        return mImage;
    }

    public volatile PorcelainImage getImage()
    {
        return getImage();
    }

    public PorcelainJsonNavigationLink getLink()
    {
        return mLink;
    }

    public volatile PorcelainNavigationLink getLink()
    {
        return getLink();
    }

    public PorcelainJsonNavigationLink getLongClickLink()
    {
        return mLongClickLink;
    }

    public volatile PorcelainNavigationLink getLongClickLink()
    {
        return getLongClickLink();
    }

    public int getMaxRows()
    {
        return mMaxRows;
    }

    public PorcelainJsonPlayable getPlayable()
    {
        return mPlayable;
    }

    public volatile drz getPlayable()
    {
        return getPlayable();
    }

    public Iterable getPlayables()
    {
        if (getPlayable() != null)
        {
            return Collections.singleton(getPlayable());
        } else
        {
            return Collections.emptySet();
        }
    }

    protected PorcelainMetricsRenderType getRenderType()
    {
        return PorcelainMetricsRenderType.b;
    }

    public Object getText()
    {
        return mText;
    }

    public boolean isEnabled()
    {
        return mIsEnabled;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
        gen.a(parcel, isEnabled());
        parcel.writeInt(getMaxRows());
        parcel.writeParcelable(getImage(), 0);
        parcel.writeParcelable(getLink(), 0);
        parcel.writeParcelable(getLongClickLink(), 0);
        parcel.writeParcelable(getPlayable(), 0);
    }
}
