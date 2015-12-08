// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.os.Environment;
import java.io.File;

public class XWalkPathHelper
{

    private static final String TAG = "XWalkPathHelper";

    public XWalkPathHelper()
    {
    }

    public static void initialize()
    {
        nativeSetDirectory("EXTERNAL", Environment.getExternalStorageDirectory().getPath());
        String as[] = new String[9];
        as[0] = "ALARMS";
        as[1] = "DCIM";
        as[2] = "DOWNLOADS";
        as[3] = "MOVIES";
        as[4] = "MUSIC";
        as[5] = "NOTIFICATIONS";
        as[6] = "PICTURES";
        as[7] = "PODCASTS";
        as[8] = "RINGTONES";
        String s = Environment.DIRECTORY_ALARMS;
        String s1 = Environment.DIRECTORY_DCIM;
        String s2 = Environment.DIRECTORY_DOWNLOADS;
        String s3 = Environment.DIRECTORY_MOVIES;
        String s4 = Environment.DIRECTORY_MUSIC;
        String s5 = Environment.DIRECTORY_NOTIFICATIONS;
        String s6 = Environment.DIRECTORY_PICTURES;
        String s7 = Environment.DIRECTORY_PODCASTS;
        String s8 = Environment.DIRECTORY_RINGTONES;
        for (int i = 0; i < as.length; i++)
        {
            File file = Environment.getExternalStoragePublicDirectory((new String[] {
                s, s1, s2, s3, s4, s5, s6, s7, s8
            })[i]);
            if (file != null)
            {
                nativeSetDirectory(as[i], file.getPath());
            }
        }

    }

    private static native void nativeSetDirectory(String s, String s1);

    public static void setCacheDirectory(String s)
    {
        nativeSetDirectory("CACHEDIR", s);
    }

    public static void setExternalCacheDirectory(String s)
    {
        nativeSetDirectory("EXTERNAL_CACHEDIR", s);
    }
}
