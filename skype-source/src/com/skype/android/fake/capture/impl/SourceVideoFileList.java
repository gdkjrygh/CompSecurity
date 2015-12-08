// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.fake.capture.impl;

import com.skype.android.platform.capture.FpsRange;
import com.skype.android.platform.capture.ImageFormat;
import com.skype.android.util.Log;
import com.skype.android.video.hw.format.Resolution;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SourceVideoFileList
{
    public static class Query
    {

        public String a;
        public ImageFormat b;
        public Resolution c;
        public FpsRange d;

        public String toString()
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append(" [name=").append(a).append(", imageFormat=").append(b).append(", resolution=").append(c).append(", fpsRange=").append(d).append("]").toString();
        }

        public Query()
        {
        }
    }

    public static class VideoFile
    {

        public final String a;
        public final ImageFormat b;
        public final Resolution c;
        public final int d;
        public final File e;

        public String toString()
        {
            return e.getAbsolutePath();
        }

        public VideoFile(String s, ImageFormat imageformat, Resolution resolution, int i, File file)
        {
            a = s;
            b = imageformat;
            c = resolution;
            d = i;
            e = file;
        }
    }


    private final List a = new ArrayList();

    public SourceVideoFileList(String s)
    {
        Pattern pattern = Pattern.compile("(.+)-([0-9]{2,4}[xX][0-9]{2,4})-([0-9]{1,2})[fpshzFPSHZ]*\\.([[a-z][A-Z][0-9]]{4})");
        s = (new File(s)).listFiles();
        if (s != null)
        {
            int j = s.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = s[i];
                Matcher matcher = pattern.matcher(((File) (obj)).getName());
                if (!matcher.matches())
                {
                    continue;
                }
                obj = new VideoFile(matcher.group(1), ImageFormat.valueOf(matcher.group(4).toUpperCase()), new Resolution(matcher.group(2).toLowerCase()), Integer.valueOf(matcher.group(3)).intValue(), ((File) (obj)));
                a.add(obj);
                if (Log.isLoggable("Capture", 4))
                {
                    Log.i("Capture", (new StringBuilder("Video file found: ")).append(obj).toString());
                }
            }

        }
    }

    public final VideoFile a(Query query)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            VideoFile videofile = (VideoFile)iterator.next();
            if ((query.a == null || videofile.a.equals(query.a)) && (query.b == null || videofile.b.equals(query.b)) && (query.c == null || videofile.c.equals(query.c)) && (query.d == null || videofile.d * 1000 >= query.d.a()))
            {
                return videofile;
            }
        }

        return null;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [list=").append(a).append("]").toString();
    }
}
