// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.user;

import android.os.Handler;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JsonHttpCallbackReceiver;
import com.spotify.mobile.android.spotlets.follow.NotAvailableViewManager;
import com.spotify.mobile.android.util.logging.Logger;

// Referenced classes of package com.spotify.mobile.android.spotlets.user:
//            ProfilesListFragment, ProfileListModel

final class > extends JsonHttpCallbackReceiver
{

    private ProfilesListFragment a;

    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos..ErrorCause errorcause)
    {
        Logger.b(throwable, "Profile List failed to load", new Object[0]);
        ProfilesListFragment.c(a).a(com.spotify.mobile.android.spotlets.follow..DataState.c);
    }

    protected final void onResolved(Response response, Object obj)
    {
        response = (ProfileListModel)obj;
        ProfilesListFragment.a(a, response.getProfiles());
        if (ProfilesListFragment.a(a) != null)
        {
            ProfilesListFragment.b(a);
            return;
        } else
        {
            ProfilesListFragment.c(a).a(com.spotify.mobile.android.spotlets.follow..DataState.d);
            return;
        }
    }

    ause(ProfilesListFragment profileslistfragment, Handler handler, Class class1)
    {
        a = profileslistfragment;
        super(handler, class1);
    }
}
