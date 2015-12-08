// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.fragment;

import com.snapchat.android.Timber;
import com.snapchat.android.discover.ui.EditionViewerMetadata;
import java.util.List;
import wt;

// Referenced classes of package com.snapchat.android.discover.ui.fragment:
//            EditionViewerFragment, EditionViewerPager

final class a
    implements Runnable
{

    private List a;
    private EditionViewerFragment b;

    public final void run()
    {
        if (EditionViewerFragment.b(b) != null && EditionViewerFragment.c(b) != null)
        {
            EditionViewerFragment.b(b).a(a);
            int j = b.h();
            if (!EditionViewerFragment.d(b) && j < EditionViewerFragment.b(b).c())
            {
                EditionViewerMetadata editionviewermetadata;
                int i;
                if (b.a.f)
                {
                    i = com.snapchat.android.discover.model.ent.a.a();
                } else
                {
                    i = com.snapchat.android.discover.model.ent.a.a();
                }
                EditionViewerFragment.c(b).setCurrentItem(j, false);
                EditionViewerFragment.c(b).setPanel(i);
                Timber.c("EditionViewerFragment", "Opening page to %d longform? %b - count: %d", new Object[] {
                    Integer.valueOf(j), Boolean.valueOf(b.a.f), Integer.valueOf(EditionViewerFragment.b(b).c())
                });
                editionviewermetadata = b.a;
                editionviewermetadata.e = null;
                editionviewermetadata.f = false;
                editionviewermetadata.h = false;
                EditionViewerFragment.e(b);
            }
        }
    }

    (EditionViewerFragment editionviewerfragment, List list)
    {
        b = editionviewerfragment;
        a = list;
        super();
    }
}
