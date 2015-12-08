// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.os.Bundle;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;

final class ProfileArguments
{

    public static final String SCREEN_KEY = "screen_key";
    public static final String SEARCH_QUERY_SOURCE_INFO_KEY = "search_query_source_info_key";
    public static final String USER_URN_KEY = "user_urn_key";

    ProfileArguments()
    {
    }

    static Bundle from(Urn urn, Screen screen, SearchQuerySourceInfo searchquerysourceinfo)
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("user_urn_key", urn);
        bundle.putSerializable("screen_key", screen);
        bundle.putParcelable("search_query_source_info_key", searchquerysourceinfo);
        return bundle;
    }
}
