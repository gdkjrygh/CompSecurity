// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.utils;

import android.os.Trace;

// Referenced classes of package com.skype.android.video.hw.utils:
//            SliqBuild

public final class Systrace
{
    public static final class Section extends Enum
    {

        private static final Section $VALUES[];
        public static final Section CaptureVideo;
        public static final Section RenderVideoPreview;
        public static final Section RenderVideoTarget;

        public static Section valueOf(String s)
        {
            return (Section)Enum.valueOf(com/skype/android/video/hw/utils/Systrace$Section, s);
        }

        public static Section[] values()
        {
            return (Section[])$VALUES.clone();
        }

        static 
        {
            CaptureVideo = new Section("CaptureVideo", 0);
            RenderVideoPreview = new Section("RenderVideoPreview", 1);
            RenderVideoTarget = new Section("RenderVideoTarget", 2);
            $VALUES = (new Section[] {
                CaptureVideo, RenderVideoPreview, RenderVideoTarget
            });
        }

        private Section(String s, int i)
        {
            super(s, i);
        }
    }


    private Systrace()
    {
    }

    public static void begin(Section section)
    {
        if ((SliqBuild.DEBUG || SliqBuild.INTERNAL) && android.os.Build.VERSION.SDK_INT >= 18)
        {
            Trace.beginSection(section.toString());
        }
    }

    public static void end()
    {
        if ((SliqBuild.DEBUG || SliqBuild.INTERNAL) && android.os.Build.VERSION.SDK_INT >= 18)
        {
            Trace.endSection();
        }
    }
}
