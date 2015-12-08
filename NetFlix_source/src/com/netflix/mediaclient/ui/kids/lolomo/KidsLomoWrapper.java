// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.os.Parcel;
import com.netflix.mediaclient.servicemgr.BasicLoMo;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import java.util.List;

public class KidsLomoWrapper
    implements LoMo
{

    private final BasicLoMo lomo;

    public KidsLomoWrapper(BasicLoMo basiclomo)
    {
        lomo = basiclomo;
    }

    public int describeContents()
    {
        throw new UnsupportedOperationException("Can't describe contents");
    }

    public List getFacebookFriends()
    {
        return null;
    }

    public String getId()
    {
        return lomo.getId();
    }

    public int getListPos()
    {
        return lomo.getListPos();
    }

    public List getMoreImages()
    {
        return null;
    }

    public int getNumVideos()
    {
        return -1;
    }

    public String getRequestId()
    {
        return lomo.getRequestId();
    }

    public String getTitle()
    {
        return lomo.getTitle();
    }

    public int getTrackId()
    {
        return lomo.getTrackId();
    }

    public LoMoType getType()
    {
        return lomo.getType();
    }

    public boolean isBillboard()
    {
        return false;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        throw new UnsupportedOperationException("Can't write to parcel");
    }
}
