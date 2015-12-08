// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.model.policy;

import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.collection.model.policy:
//            HeaderPolicy, ListPolicy

public class DecorationPolicy
    implements JacksonModel
{

    private HeaderPolicy mHeaderPolicy;
    private ListPolicy mListPolicy;

    public DecorationPolicy()
    {
    }

    public void setHeaderPolicy(HeaderPolicy headerpolicy)
    {
        mHeaderPolicy = headerpolicy;
    }

    public void setListPolicy(ListPolicy listpolicy)
    {
        mListPolicy = listpolicy;
    }
}
