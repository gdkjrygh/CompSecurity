// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.skype.android.sync:
//            LegacyContactsIngestTaskImpl

final class this._cls0
    implements FilenameFilter
{

    final LegacyContactsIngestTaskImpl this$0;

    public final boolean accept(File file, String s)
    {
        return s.endsWith("_ingestion.db");
    }

    ()
    {
        this$0 = LegacyContactsIngestTaskImpl.this;
        super();
    }
}
