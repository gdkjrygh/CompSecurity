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

    public final int episodeNumber;
    public final int season;
    public final String title;
    public final String tvshowTitle;

    public String getDownloadFileName()
    {
        String s = FileDownloadHelper.getFilenameExtension(fileName);
        if (s != null)
        {
            return (new StringBuilder()).append(String.valueOf(episodeNumber)).append(" - ").append(title).append(s).toString();
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
        return Environment.DIRECTORY_MOVIES;
    }

    public String getRelativeDirectoryPath()
    {
        if (season <= 0) goto _L2; else goto _L1
_L1:
        if (!TextUtils.isEmpty(tvshowTitle)) goto _L4; else goto _L3
_L3:
        return null;
_L4:
        return (new StringBuilder()).append(tvshowTitle).append("/Season").append(String.valueOf(season)).toString();
_L2:
        if (!TextUtils.isEmpty(tvshowTitle))
        {
            return tvshowTitle;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public (String s, int i, int j, String s1, String s2)
    {
        super(s2);
        tvshowTitle = s;
        season = i;
        episodeNumber = j;
        title = s1;
    }
}
