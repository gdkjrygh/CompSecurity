// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.Checkable;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.spotlets.user.ProfileModel;

final class ang.Object
    implements android.view.nClickListener
{

    private ProfileModel a;
    private View b;

    public final void onClick(View view)
    {
        ((FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager)).a(a.getUri(), ((Checkable)b).isChecked());
    }

    (ProfileModel profilemodel, View view)
    {
        a = profilemodel;
        b = view;
        super();
    }
}
