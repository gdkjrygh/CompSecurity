// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.os.Trace;

// Referenced classes of package com.skype.android.util:
//            VideoBuild

public final class Systrace
{
    public static final class Section extends Enum
    {

        public static final Section a;
        public static final Section b;
        public static final Section c;
        public static final Section d;
        public static final Section e;
        public static final Section f;
        public static final Section g;
        public static final Section h;
        public static final Section i;
        public static final Section j;
        public static final Section k;
        private static final Section l[];

        public static Section valueOf(String s)
        {
            return (Section)Enum.valueOf(com/skype/android/util/Systrace$Section, s);
        }

        public static Section[] values()
        {
            return (Section[])l.clone();
        }

        static 
        {
            a = new Section("CaptureVideo", 0);
            b = new Section("VideoCaptured", 1);
            c = new Section("EncodeVideo", 2);
            d = new Section("VideoEncoded", 3);
            e = new Section("DecodeVideo", 4);
            f = new Section("VideoDecoded", 5);
            g = new Section("RenderVideo", 6);
            h = new Section("IssueFakeVideoFrame", 7);
            i = new Section("ReadFakeVideoFrame", 8);
            j = new Section("CopyFakeVideoFrame", 9);
            k = new Section("PreviewFakeVideoFrame", 10);
            l = (new Section[] {
                a, b, c, d, e, f, g, h, i, j, 
                k
            });
        }

        private Section(String s, int i1)
        {
            super(s, i1);
        }
    }


    private static final Section SECTIONS[] = Section.values();

    private Systrace()
    {
    }

    public static void begin(int i)
    {
        begin(SECTIONS[i]);
    }

    public static void begin(Section section)
    {
        if ((VideoBuild.DEBUG || VideoBuild.INTERNAL) && android.os.Build.VERSION.SDK_INT >= 18)
        {
            Trace.beginSection(section.toString());
        }
    }

    public static void end()
    {
        if ((VideoBuild.DEBUG || VideoBuild.INTERNAL) && android.os.Build.VERSION.SDK_INT >= 18)
        {
            Trace.endSection();
        }
    }

}
