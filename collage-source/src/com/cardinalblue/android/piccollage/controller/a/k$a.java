// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.cardinalblue.android.piccollage.auth.PicAuth;
import com.cardinalblue.android.piccollage.auth.PicLoginActivity;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            k

private static class <init>
    implements <init>
{

    public void a(Fragment fragment, Object obj)
    {
        obj = new Intent(fragment.getActivity(), com/cardinalblue/android/piccollage/auth/PicLoginActivity);
        ((Intent) (obj)).putExtra("from", "login stickers");
        fragment.startActivityForResult(((Intent) (obj)), 200);
    }

    public boolean a()
    {
        return PicAuth.h().b();
    }

    public int b()
    {
        return 0x7f0701ff;
    }

    private vity()
    {
    }

    vity(vity vity)
    {
        this();
    }
}
