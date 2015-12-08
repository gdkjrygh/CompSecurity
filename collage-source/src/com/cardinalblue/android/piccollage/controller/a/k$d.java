// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.cardinalblue.android.piccollage.activities.YoutubeActivity;
import com.cardinalblue.android.piccollage.model.InstallRequirement;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            k

private static class a
    implements a
{

    private final InstallRequirement a;

    public void a(Fragment fragment, Object obj)
    {
        obj = new Intent(fragment.getActivity(), com/cardinalblue/android/piccollage/activities/YoutubeActivity);
        ((Intent) (obj)).putExtra("extra_video_id", a.b());
        fragment.startActivityForResult(((Intent) (obj)), 201);
    }

    public boolean a()
    {
        return false;
    }

    public int b()
    {
        return 0x7f07012f;
    }

    public irement(InstallRequirement installrequirement)
    {
        a = installrequirement;
    }
}
