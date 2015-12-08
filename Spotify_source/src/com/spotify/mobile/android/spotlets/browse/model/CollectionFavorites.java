// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.browse.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.spotify.mobile.android.spotlets.browse.model:
//            CollectionFavorite

public class CollectionFavorites
    implements JacksonModel
{

    private List mFavorites;

    public CollectionFavorites(CollectionFavorite acollectionfavorite[])
    {
        mFavorites = new ArrayList();
        Collections.addAll(mFavorites, acollectionfavorite);
    }

    public List getFavorites()
    {
        return mFavorites;
    }
}
