// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import java.io.File;
import java.io.FileFilter;
import java.util.Locale;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            ExternalCacheCleanup

private final class fileAge
    implements FileFilter
{

    String extensions[];
    long fileAge;
    final ExternalCacheCleanup this$0;

    public final boolean accept(File file)
    {
        if (file.lastModified() < System.currentTimeMillis() - fileAge)
        {
            String as[] = extensions;
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                String s = as[i];
                if (file.getName().toLowerCase(Locale.ENGLISH).endsWith(s))
                {
                    return true;
                }
            }

        }
        return false;
    }

    public (String as[], long l)
    {
        this$0 = ExternalCacheCleanup.this;
        super();
        extensions = as;
        fileAge = l;
    }
}
