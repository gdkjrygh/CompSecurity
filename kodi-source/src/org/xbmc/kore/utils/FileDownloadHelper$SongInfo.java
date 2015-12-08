// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;

// Referenced classes of package org.xbmc.kore.utils:
//            FileDownloadHelper

public static class title extends 
{

    public final String album;
    public final String artist;
    public final int songId;
    public final String title;
    public final int track;

    public String getDownloadFileName()
    {
        String s = FileDownloadHelper.getFilenameExtension(fileName);
        if (s != null)
        {
            return (new StringBuilder()).append(String.valueOf(track)).append(" - ").append(title).append(s).toString();
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
        if (TextUtils.isEmpty(album) || TextUtils.isEmpty(artist))
        {
            return null;
        } else
        {
            return (new StringBuilder()).append(artist).append("/").append(album).toString();
        }
    }

    public (String s, String s1, int i, int j, String s2, String s3)
    {
        super(s3);
        artist = s;
        album = s1;
        songId = i;
        track = j;
        title = s2;
    }
}
