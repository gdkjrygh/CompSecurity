// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ToggleButton;
import com.spotify.mobile.android.spotlets.follow.FollowManager;

final class ang.Object
    implements android.view.nClickListener
{

    private fkm a;

    public final void onClick(View view)
    {
        view = (FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager);
        String s = fkm.a(a);
        boolean flag = fkm.b(a).isChecked();
        fkm.c(a);
        view.a(s, flag);
    }

    (fkm fkm1)
    {
        a = fkm1;
        super();
    }
}
