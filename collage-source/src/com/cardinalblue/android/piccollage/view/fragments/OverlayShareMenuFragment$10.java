// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.os.Bundle;
import bolts.i;
import bolts.j;
import com.cardinalblue.android.b.k;
import java.io.File;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            OverlayShareMenuFragment, aj

class a
    implements i
{

    final com.cardinalblue.android.piccollage.events.ment._cls10.a a;
    final OverlayShareMenuFragment b;

    public Void a(j j1)
        throws Exception
    {
        OverlayShareMenuFragment.a(b, new aj());
        Bundle bundle = new Bundle();
        bundle.putString("key_caption", OverlayShareMenuFragment.d(b));
        bundle.putString("key_file_path", ((File)j1.e()).getAbsolutePath());
        bundle.putInt("key_target", a.a());
        com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.j(b).setArguments(bundle);
        k.a(b.getActivity(), com.cardinalblue.android.piccollage.view.fragments.OverlayShareMenuFragment.j(b), "tag_share_dialog");
        return null;
    }

    public Object then(j j1)
        throws Exception
    {
        return a(j1);
    }

    (OverlayShareMenuFragment overlaysharemenufragment, com.cardinalblue.android.piccollage.events.ment ment)
    {
        b = overlaysharemenufragment;
        a = ment;
        super();
    }
}
