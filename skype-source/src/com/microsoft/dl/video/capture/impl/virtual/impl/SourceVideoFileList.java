// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.video.capture.impl.virtual.impl;

import com.microsoft.dl.utils.Log;
import com.microsoft.dl.video.capture.api.FpsRange;
import com.microsoft.dl.video.capture.api.ImageFormat;
import com.microsoft.dl.video.capture.api.Resolution;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SourceVideoFileList
{
    public static class Query
    {

        private String a;
        private ImageFormat b;
        private Resolution c;
        private FpsRange d;

        static String a(Query query)
        {
            return query.a;
        }

        static ImageFormat b(Query query)
        {
            return query.b;
        }

        static Resolution c(Query query)
        {
            return query.c;
        }

        static FpsRange d(Query query)
        {
            return query.d;
        }

        public final FpsRange getFpsRange()
        {
            return d;
        }

        public final ImageFormat getImageFormat()
        {
            return b;
        }

        public final String getName()
        {
            return a;
        }

        public final Resolution getResolution()
        {
            return c;
        }

        public final void setFpsRange(FpsRange fpsrange)
        {
            d = fpsrange;
        }

        public final void setImageFormat(ImageFormat imageformat)
        {
            b = imageformat;
        }

        public final void setName(String s)
        {
            a = s;
        }

        public final void setResolution(Resolution resolution)
        {
            c = resolution;
        }

        public final String toString()
        {
            return (new StringBuilder()).append(getClass().getSimpleName()).append(" [name=").append(a).append(", imageFormat=").append(b).append(", resolution=").append(c).append(", fpsRange=").append(d).append("]").toString();
        }

        public Query()
        {
        }
    }

    public static class VideoFile
    {

        private final String a;
        private final ImageFormat b;
        private final Resolution c;
        private final int d;
        private final File e;

        static String a(VideoFile videofile)
        {
            return videofile.a;
        }

        static ImageFormat b(VideoFile videofile)
        {
            return videofile.b;
        }

        static Resolution c(VideoFile videofile)
        {
            return videofile.c;
        }

        static int d(VideoFile videofile)
        {
            return videofile.d;
        }

        public final File getFile()
        {
            return e;
        }

        public final int getFps()
        {
            return d;
        }

        public final ImageFormat getImageFormat()
        {
            return b;
        }

        public final String getName()
        {
            return a;
        }

        public final Resolution getResolution()
        {
            return c;
        }

        public final String toString()
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

    public SourceVideoFileList(File file)
    {
        Pattern pattern = Pattern.compile("(.+)-([0-9]{2,4}[xX][0-9]{2,4})-([0-9]{1,2})[fpshzFPSHZ]*\\.([[a-z][A-Z][0-9]]{4})");
        file = file.listFiles();
        if (file != null)
        {
            int j = file.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = file[i];
                Matcher matcher = pattern.matcher(((File) (obj)).getName());
                if (!matcher.matches())
                {
                    continue;
                }
                obj = new VideoFile(matcher.group(1), ImageFormat.valueOf(matcher.group(4).toUpperCase(Locale.US)), new Resolution(matcher.group(2).toLowerCase(Locale.US)), Integer.valueOf(matcher.group(3)).intValue(), ((File) (obj)));
                a.add(obj);
                if (Log.isLoggable("Capture", 4))
                {
                    Log.i("Capture", (new StringBuilder("Video file found: ")).append(obj).toString());
                }
            }

        }
    }

    public final VideoFile selectAny(Query query)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            VideoFile videofile = (VideoFile)iterator.next();
            if ((Query.a(query) == null || VideoFile.a(videofile).equals(Query.a(query))) && (Query.b(query) == null || VideoFile.b(videofile).equals(Query.b(query))) && (Query.c(query) == null || VideoFile.c(videofile).equals(Query.c(query))) && (Query.d(query) == null || VideoFile.d(videofile) * 1000 >= Query.d(query).getMin()))
            {
                return videofile;
            }
        }

        return null;
    }

    public final String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" [list=").append(a).append("]").toString();
    }
}
