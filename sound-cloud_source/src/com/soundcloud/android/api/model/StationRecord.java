// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.functions.Function;
import java.util.List;

public interface StationRecord
{

    public static final Function TO_URN = new _cls1();

    public abstract String getPermalink();

    public abstract int getPreviousPosition();

    public abstract String getTitle();

    public abstract List getTracks();

    public abstract String getType();

    public abstract Urn getUrn();


    private class _cls1
        implements Function
    {

        public final Urn apply(StationRecord stationrecord)
        {
            return stationrecord.getUrn();
        }

        public final volatile Object apply(Object obj)
        {
            return apply((StationRecord)obj);
        }

        _cls1()
        {
        }
    }

}
