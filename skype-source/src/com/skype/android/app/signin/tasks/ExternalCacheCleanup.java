// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin.tasks;

import android.content.Context;
import com.skype.Account;
import java.io.File;
import java.io.FileFilter;
import java.util.Locale;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.signin.tasks:
//            AccountTask

public class ExternalCacheCleanup
    implements AccountTask
{
    private final class a
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

        public a(String as[], long l)
        {
            this$0 = ExternalCacheCleanup.this;
            super();
            extensions = as;
            fileAge = l;
        }
    }


    private static final String FILE_TYPES[] = {
        ".jpg", ".vcf", ".mp4", ".3gp"
    };
    private static final long ONE_WEEK_FILE_AGE = 0x240c8400L;
    private static final Logger log = Logger.getLogger("ExternalCacheCleanup");
    private File cacheDir;

    public ExternalCacheCleanup(Context context)
    {
        cacheDir = context.getExternalCacheDir();
    }

    private void deleteFiles(File afile[])
    {
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            afile[i].delete();
        }

    }

    public void onLogin(Account account)
    {
        account = new a(FILE_TYPES, 0x240c8400L);
        if (cacheDir != null)
        {
            deleteFiles(cacheDir.listFiles(account));
        }
    }

    public void onLogout(Account account)
    {
    }

}
