// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.debug;

import android.os.FileObserver;
import java.io.File;
import java.util.Map;

// Referenced classes of package com.google.android.apps.gsa.shared.util.debug:
//            SelfDestructFileProvider

final class b extends FileObserver
{

    private final File a;

    b(File file)
    {
        super(file.getAbsolutePath(), 24);
        a = file;
    }

    public final void onEvent(int i, String s)
    {
        stopWatching();
        a.delete();
        SelfDestructFileProvider.a().remove(a);
    }
}
