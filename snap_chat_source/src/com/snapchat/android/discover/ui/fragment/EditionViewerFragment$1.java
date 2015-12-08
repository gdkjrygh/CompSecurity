// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.fragment;

import com.snapchat.android.ui.SwipeOutTracker;

// Referenced classes of package com.snapchat.android.discover.ui.fragment:
//            EditionViewerFragment

final class a
    implements Runnable
{

    private EditionViewerFragment a;

    public final void run()
    {
        EditionViewerFragment.a(a).a(com.snapchat.android.ui.xitMethod.BACK_PRESSED);
    }

    (EditionViewerFragment editionviewerfragment)
    {
        a = editionviewerfragment;
        super();
    }
}
