// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import com.fitbit.data.domain.ActivityLogEntry;

// Referenced classes of package com.fitbit.runtrack.ui:
//            i

public class ShareExerciseSharingEvent extends i
{
    public static final class Source extends Enum
    {

        public static final Source a;
        public static final Source b;
        public static final Source c;
        private static final Source d[];
        private String value;

        public static Source a(String s)
        {
            Source asource[] = values();
            int k = asource.length;
            for (int j = 0; j < k; j++)
            {
                Source source = asource[j];
                if (source.a().equals(s))
                {
                    return source;
                }
            }

            return null;
        }

        public static Source valueOf(String s)
        {
            return (Source)Enum.valueOf(com/fitbit/runtrack/ui/ShareExerciseSharingEvent$Source, s);
        }

        public static Source[] values()
        {
            return (Source[])d.clone();
        }

        String a()
        {
            return value;
        }

        static 
        {
            a = new Source("CAMERA_BACK", 0, "Back camera");
            b = new Source("CAMERA_FRONT", 1, "Front camera");
            c = new Source("GALLERY", 2, "Library");
            d = (new Source[] {
                a, b, c
            });
        }

        private Source(String s, int j, String s1)
        {
            super(s, j);
            value = s1;
        }
    }


    private static final String a = "Activity LogId";
    private static final String b = "Resource";

    public ShareExerciseSharingEvent()
    {
        super("Exercise: Sharing: Share");
    }

    public ShareExerciseSharingEvent a(ActivityLogEntry activitylogentry)
    {
        a("Activity LogId", Long.toString(activitylogentry.getServerId()));
        return this;
    }

    public ShareExerciseSharingEvent a(Source source)
    {
        a("Resource", source.a());
        return this;
    }
}
