// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.utils;

import android.os.Trace;
import com.microsoft.dl.BuildInfo;

public final class Systrace
{
    public static final class Section extends Enum
    {

        public static final Section CaptureVideo;
        public static final Section CopyFakeVideoFrame;
        public static final Section DeliverVideo;
        public static final Section IssueFakeVideoFrame;
        public static final Section PreviewFakeVideoFrame;
        public static final Section ReadFakeVideoFrame;
        private static final Section a[];

        public static Section valueOf(String s)
        {
            return (Section)Enum.valueOf(com/microsoft/dl/utils/Systrace$Section, s);
        }

        public static Section[] values()
        {
            return (Section[])a.clone();
        }

        static 
        {
            CaptureVideo = new Section("CaptureVideo", 0);
            DeliverVideo = new Section("DeliverVideo", 1);
            IssueFakeVideoFrame = new Section("IssueFakeVideoFrame", 2);
            ReadFakeVideoFrame = new Section("ReadFakeVideoFrame", 3);
            CopyFakeVideoFrame = new Section("CopyFakeVideoFrame", 4);
            PreviewFakeVideoFrame = new Section("PreviewFakeVideoFrame", 5);
            a = (new Section[] {
                CaptureVideo, DeliverVideo, IssueFakeVideoFrame, ReadFakeVideoFrame, CopyFakeVideoFrame, PreviewFakeVideoFrame
            });
        }

        private Section(String s, int i)
        {
            super(s, i);
        }
    }


    private static final Section a[] = Section.values();
    private static final boolean b;

    private Systrace()
    {
    }

    public static void begin(int i)
    {
        begin(a[i]);
    }

    public static void begin(Section section)
    {
        if (b)
        {
            Trace.beginSection(section.toString());
        }
    }

    public static void end()
    {
        if (b)
        {
            Trace.endSection();
        }
    }

    static 
    {
        boolean flag;
        if (BuildInfo.FLAVOUR != com.microsoft.dl.BuildInfo.Flavour.RELEASE && android.os.Build.VERSION.SDK_INT >= 18)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
