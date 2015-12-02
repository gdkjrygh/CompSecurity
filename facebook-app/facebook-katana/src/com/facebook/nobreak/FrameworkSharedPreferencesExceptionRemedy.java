// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import java.io.File;

// Referenced classes of package com.facebook.nobreak:
//            NobreakUtils

public class FrameworkSharedPreferencesExceptionRemedy
    implements ExceptionHandlerToDispatchKnownExceptionRemedies.KnownExceptionRemedy
{

    private static final String a = com/facebook/nobreak/FrameworkSharedPreferencesExceptionRemedy.getSimpleName();

    public FrameworkSharedPreferencesExceptionRemedy()
    {
    }

    private void a(Context context)
    {
        File file;
        Log.e(a, "attempting to wipe shared preferences");
        File file2 = NobreakUtils.a(context);
        file = file2;
        if (file2 == null)
        {
            context = context.getFilesDir().getParentFile();
            file = file2;
            if (context != null)
            {
                file = new File(context, "shared_prefs");
            }
        }
        if (file != null) goto _L2; else goto _L1
_L1:
        Log.e(a, "could not find shared preferences directory");
_L4:
        return;
_L2:
        Log.w(a, (new StringBuilder("preferencesDir is ")).append(file.getAbsolutePath()).toString());
        context = file.listFiles(new _cls1());
        if (context != null)
        {
            int j = context.length;
            int i = 0;
            while (i < j) 
            {
                File file1 = context[i];
                File file3 = new File((new StringBuilder()).append(file1.getPath()).append(".possiblyCorrupted").toString());
                if (file3.exists())
                {
                    file3.delete();
                }
                if (file1.renameTo(file3))
                {
                    Log.e(a, (new StringBuilder("renamed file: ")).append(file1).toString());
                } else
                {
                    Log.e(a, (new StringBuilder("failed to rename file: ")).append(file1).toString());
                }
                i++;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Application application, Throwable throwable)
    {
        if (((throwable instanceof NumberFormatException) || (throwable instanceof ArrayIndexOutOfBoundsException)) && NobreakUtils.a(throwable).contains("android.app.SharedPreferencesImpl.loadFromDiskLocked"))
        {
            a(((Context) (application)));
        }
    }


    private class _cls1
        implements FileFilter
    {

        final FrameworkSharedPreferencesExceptionRemedy a;

        public boolean accept(File file)
        {
            return file.getName().endsWith(".xml");
        }

        _cls1()
        {
            a = FrameworkSharedPreferencesExceptionRemedy.this;
            super();
        }
    }

}
