// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;

import android.content.Context;

// Referenced classes of package org.chromium.base.library_loader:
//            LibraryLoaderHelper

static final class val.context extends Thread
{

    final Context val$context;

    public void run()
    {
        LibraryLoaderHelper.deleteWorkaroundLibrariesSynchronously(val$context);
    }

    (Context context1)
    {
        val$context = context1;
        super();
    }
}
