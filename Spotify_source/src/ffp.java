// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.spotify.mobile.android.spotlets.search.SearchFragment;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.music.spotlets.FeatureIdentifier;

public class ffp
{

    public ffp()
    {
    }

    public static SearchFragment a(String s, boolean flag, boolean flag1, boolean flag2, String s1, Flags flags)
    {
        SearchFragment searchfragment = new SearchFragment();
        Bundle bundle = new Bundle();
        bundle.setClassLoader(ffp.getClassLoader());
        bundle.putString("search_query", s);
        bundle.putString("username", s1);
        bundle.putBoolean("start_playback", flag);
        bundle.putBoolean("start_radio", flag1);
        bundle.putBoolean("close_search_on_click", flag2);
        searchfragment.f(bundle);
        gnl.a(searchfragment, FeatureIdentifier.T);
        fyw.a(searchfragment, (Flags)ctz.a(flags));
        return searchfragment;
    }
}
