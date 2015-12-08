// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.acra;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.facebook.acra:
//            ErrorReporter

class val.extensions
    implements FilenameFilter
{

    final ErrorReporter this$0;
    final String val$extensions[];

    public boolean accept(File file, String s)
    {
        boolean flag1 = false;
        file = val$extensions;
        int j = file.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!s.endsWith(file[i]))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    ()
    {
        this$0 = final_errorreporter;
        val$extensions = _5B_Ljava.lang.String_3B_.this;
        super();
    }
}
