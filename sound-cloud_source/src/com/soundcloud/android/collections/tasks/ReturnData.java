// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections.tasks;

import java.util.List;

// Referenced classes of package com.soundcloud.android.collections.tasks:
//            CollectionParams

public class ReturnData
{
    public static class Error extends ReturnData
    {

        public Error(CollectionParams collectionparams)
        {
            this(collectionparams, -1);
        }

        public Error(CollectionParams collectionparams, int i)
        {
            super(null, collectionparams, null, i, false, false);
        }
    }


    public final boolean keepGoing;
    public final List newItems;
    public final String nextHref;
    public final int responseCode;
    public final boolean success;
    public final boolean wasRefresh;

    public ReturnData(CollectionParams collectionparams)
    {
        this(null, collectionparams, null, 200, false, false);
    }

    public ReturnData(List list, CollectionParams collectionparams, String s, int i, boolean flag, boolean flag1)
    {
        wasRefresh = collectionparams.isRefresh();
        newItems = list;
        nextHref = s;
        keepGoing = flag;
        success = flag1;
        responseCode = i;
    }

    public String toString()
    {
        return (new StringBuilder("ReturnData{keepGoing=")).append(keepGoing).append(", newItems=").append(newItems).append(", nextHref='").append(nextHref).append('\'').append(", responseCode=").append(responseCode).append(", wasRefresh=").append(wasRefresh).append(", success=").append(success).append('}').toString();
    }
}
