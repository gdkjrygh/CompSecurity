// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.utils;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

// Referenced classes of package com.digby.mm.android.library.utils:
//            FileLogger

class val.prefix
    implements FilenameFilter
{

    final FileLogger this$0;
    final String val$prefix;

    public boolean accept(File file, String s)
    {
        return s.toLowerCase(Locale.getDefault()).startsWith(val$prefix);
    }

    ()
    {
        this$0 = final_filelogger;
        val$prefix = String.this;
        super();
    }
}
