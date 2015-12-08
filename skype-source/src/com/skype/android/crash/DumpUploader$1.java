// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.crash;

import java.io.File;

// Referenced classes of package com.skype.android.crash:
//            DumpUploader

final class c
    implements Runnable
{

    final String a[];
    final String b;
    final File c;
    final DumpUploader d;

    public final void run()
    {
        DumpUploader.a(d, a, b, c);
    }

    (DumpUploader dumpuploader, String as[], String s, File file)
    {
        d = dumpuploader;
        a = as;
        b = s;
        c = file;
        super();
    }
}
