// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;

import java.io.File;
import java.util.ArrayList;

// Referenced classes of package com.arist.util:
//            Constant

public class DownloadMusicUtil
{

    public DownloadMusicUtil()
    {
    }

    public static int getDownloadMusicsCount()
    {
        return getDownloadMusicsTitle().size();
    }

    public static ArrayList getDownloadMusicsTitle()
    {
        ArrayList arraylist;
        int i;
        int j;
        arraylist = new ArrayList();
        String as[];
        try
        {
            File file = new File(Constant.BASE_DOWNLOAD_PATH);
            if (!file.exists())
            {
                file.mkdirs();
            }
            as = file.list();
            j = as.length;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return arraylist;
        }
        i = 0;
          goto _L1
_L3:
        arraylist.add(as[i]);
        i++;
_L1:
        if (i < j) goto _L3; else goto _L2
_L2:
        return arraylist;
    }
}
