// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.assets;

import android.content.Context;
import me.lyft.android.utils.FileUtils;

public class AssetsPath
{

    public AssetsPath()
    {
    }

    public static String get(Context context)
    {
        return (new StringBuilder()).append(FileUtils.getTempDirectoryPath(context)).append("/assets").toString();
    }
}
