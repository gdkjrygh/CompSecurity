// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.utils;

import android.content.Context;
import android.os.Environment;
import java.io.File;

// Referenced classes of package org.xbmc.kore.utils:
//            FileDownloadHelper

public static abstract class fileName
{

    public final String fileName;

    public boolean downloadDirectoryExists()
    {
        return (new File(getAbsoluteDirectoryPath())).exists();
    }

    public boolean downloadFileExists()
    {
        if (!downloadDirectoryExists())
        {
            return false;
        } else
        {
            return (new File(getAbsoluteFilePath())).exists();
        }
    }

    public String getAbsoluteDirectoryPath()
    {
        File file = Environment.getExternalStoragePublicDirectory(getExternalPublicDirType());
        return (new StringBuilder()).append(file.getPath()).append("/").append(getRelativeDirectoryPath()).toString();
    }

    public String getAbsoluteFilePath()
    {
        return (new StringBuilder()).append(getAbsoluteDirectoryPath()).append("/").append(getDownloadFileName()).toString();
    }

    public String getDownloadDescrition(Context context)
    {
        return context.getString(0x7f070035);
    }

    public abstract String getDownloadFileName();

    public abstract String getDownloadTitle(Context context);

    public abstract String getExternalPublicDirType();

    public abstract String getRelativeDirectoryPath();

    public String getRelativeFilePath()
    {
        return (new StringBuilder()).append(getRelativeDirectoryPath()).append("/").append(getDownloadFileName()).toString();
    }

    public (String s)
    {
        fileName = s;
    }
}
