// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.skype.android.crash:
//            DumpUploader

final class a
    implements FilenameFilter
{

    final DumpUploader a;

    public final boolean accept(File file, String s)
    {
        return s.endsWith(".dmp");
    }

    (DumpUploader dumpuploader)
    {
        a = dumpuploader;
        super();
    }
}
