// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.content.Context;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

// Referenced classes of package com.localytics.android:
//            Constants, JsonHelper

class AmpDownloader
{

    AmpDownloader()
    {
    }

    public static String downloadFile(String s, String s1, boolean flag)
    {
        String s2;
        File file;
        s2 = s1;
        file = new File(s1);
        if (file.exists() && !flag)
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", String.format("The file %s does exist and overwrite is turned off.", new Object[] {
                    file.getAbsolutePath()
                }));
            }
            return s1;
        }
        File file1 = file.getParentFile();
        if (!file1.mkdirs() && !file1.isDirectory())
        {
            if (Constants.IS_LOGGABLE)
            {
                Log.w("Localytics", String.format("Could not create the directory %s for saving file.", new Object[] {
                    file1.getAbsolutePath()
                }));
            }
            return null;
        }
        FileOutputStream fileoutputstream;
        byte abyte0[];
        s1 = new File(String.format("%s_temp", new Object[] {
            s1
        }));
        s1.createNewFile();
        s = new BufferedInputStream((new URL(s)).openConnection().getInputStream(), 16384);
        fileoutputstream = new FileOutputStream(s1.getPath());
        abyte0 = new byte[8192];
_L3:
        int i = s.read(abyte0);
        if (i == -1) goto _L2; else goto _L1
_L1:
        fileoutputstream.write(abyte0, 0, i);
          goto _L3
        s;
        if (Constants.IS_LOGGABLE)
        {
            Log.w("Localytics", "AMP campaign not found. Creating a new one.");
        }
        s2 = null;
_L5:
        return s2;
_L2:
        fileoutputstream.close();
        if (s1.renameTo(file)) goto _L5; else goto _L4
_L4:
        s1.delete();
        return null;
    }

    public static String getAmpDataDirectory(Context context, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(context.getFilesDir().getAbsolutePath());
        stringbuilder.append(File.separator);
        stringbuilder.append(".localytics");
        stringbuilder.append(File.separator);
        stringbuilder.append(s);
        return stringbuilder.toString();
    }

    public static String getLocalFileURL(Context context, String s, long l, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getAmpDataDirectory(context, s));
        stringbuilder.append(File.separator);
        if (flag)
        {
            stringbuilder.append(String.format("amp_rule_%d.zip", new Object[] {
                Long.valueOf(l)
            }));
        } else
        {
            stringbuilder.append(String.format("amp_rule_%d", new Object[] {
                Long.valueOf(l)
            }));
            context = new File(stringbuilder.toString());
            if ((!context.exists() || !context.isDirectory()) && !context.mkdirs())
            {
                if (Constants.IS_LOGGABLE)
                {
                    Log.w("Localytics", String.format("Could not create the directory %s for saving the HTML file.", new Object[] {
                        context.getAbsolutePath()
                    }));
                }
                return null;
            }
            stringbuilder.append(File.separator);
            stringbuilder.append("index.html");
        }
        return stringbuilder.toString();
    }

    public static String getRemoteFileURL(Map map)
    {
        String s = JsonHelper.getSafeStringFromMap(map, "devices");
        if (s.equals("tablet"))
        {
            return JsonHelper.getSafeStringFromMap(map, "tablet_location");
        }
        if (s.equals("both"))
        {
            return JsonHelper.getSafeStringFromMap(map, "phone_location");
        } else
        {
            return JsonHelper.getSafeStringFromMap(map, "phone_location");
        }
    }
}
