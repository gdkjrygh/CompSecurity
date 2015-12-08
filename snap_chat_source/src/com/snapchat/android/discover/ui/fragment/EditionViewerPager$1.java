// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.fragment;

import android.support.v4.view.ViewPager;

// Referenced classes of package com.snapchat.android.discover.ui.fragment:
//            EditionViewerPager

final class a
    implements Runnable
{

    private EditionViewerPager a;

    public final void run()
    {
        a.a(((ViewPager) (a)).mCurItem, -1);
    }

    (EditionViewerPager editionviewerpager)
    {
        a = editionviewerpager;
        super();
    }
}
