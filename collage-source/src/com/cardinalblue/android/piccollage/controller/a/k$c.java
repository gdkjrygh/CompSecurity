// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.controller.a;

import android.support.v4.app.Fragment;
import com.cardinalblue.android.piccollage.a.b;
import com.cardinalblue.android.piccollage.controller.d;
import com.cardinalblue.android.piccollage.model.StickerBundle;

// Referenced classes of package com.cardinalblue.android.piccollage.controller.a:
//            k

public static class a
    implements a
{

    private boolean a;

    public void a(Fragment fragment, Object obj)
    {
        com.cardinalblue.android.piccollage.a.b.bI();
        d.a().c(new com.cardinalblue.android.piccollage.view.fragments.StickerBundleFragment.OnWatchVideoForDownloadPackEvent((StickerBundle)obj));
    }

    public void a(boolean flag)
    {
        a = flag;
    }

    public boolean a()
    {
        return !a;
    }

    public int b()
    {
        return 0x7f07012f;
    }

    public le()
    {
        a = false;
    }
}
