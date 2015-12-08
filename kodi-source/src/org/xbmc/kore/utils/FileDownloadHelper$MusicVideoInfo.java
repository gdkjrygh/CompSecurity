// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;

// Referenced classes of package org.xbmc.kore.utils:
//            FileDownloadHelper

public static class title extends title
{

    public final String title;

    public String getDownloadFileName()
    {
        String s = FileDownloadHelper.getFilenameExtension(fileName);
        if (s != null)
        {
            return (new StringBuilder()).append(title).append(s).toString();
        } else
        {
            return null;
        }
    }

    public String getDownloadTitle(Context context)
    {
        return title;
    }

    public String getExternalPublicDirType()
    {
        return Environment.DIRECTORY_MUSIC;
    }

    public String getRelativeDirectoryPath()
    {
        if (TextUtils.isEmpty(title))
        {
            return null;
        } else
        {
            return (new StringBuilder()).append("Music Videos/").append(title).toString();
        }
    }

    public (String s, String s1)
    {
        super(s1);
        title = s;
    }
}
