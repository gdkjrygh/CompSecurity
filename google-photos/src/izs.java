// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.io.File;

public class izs
{

    private final Context a;

    public izs(Context context)
    {
        a = context;
    }

    public final File a()
    {
        return new File(a.getFilesDir(), "trash_files");
    }

    public final File a(String s)
    {
        File file = new File(a.getFilesDir(), "trash_files");
        if (!file.exists() && !file.mkdir())
        {
            if (Log.isLoggable("LocalTrash", 6))
            {
                Log.e("LocalTrash", "Couldn't create trash directory");
            }
            return null;
        } else
        {
            return new File(file, s);
        }
    }

    public final long b()
    {
        File file;
        long l;
        l = 0L;
        file = a();
        if (file.exists()) goto _L2; else goto _L1
_L1:
        long l1 = l;
_L4:
        return l1;
_L2:
        File afile[] = file.listFiles();
        int j = afile.length;
        int i = 0;
        do
        {
            l1 = l;
            if (i >= j)
            {
                continue;
            }
            l1 = afile[i].length();
            i++;
            l = l1 + l;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
