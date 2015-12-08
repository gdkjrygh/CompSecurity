// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model;

import IP;
import com.snapchat.android.Timber;
import java.util.Locale;
import uA;

// Referenced classes of package com.snapchat.android.discover.model:
//            MediaState

public final class DSnapPanel
{
    public static final class Docking extends Enum
    {

        private static final Docking $VALUES[];
        public static final Docking MEDIA_BOTTOM;
        public static final Docking MEDIA_CENTER;
        public static final Docking MEDIA_TOP;
        public static final Docking SCREEN_BOTTOM;
        public static final Docking SCREEN_CENTER;
        public static final Docking SCREEN_TOP;

        public static Docking valueOf(String s)
        {
            return (Docking)Enum.valueOf(com/snapchat/android/discover/model/DSnapPanel$Docking, s);
        }

        public static Docking valueOfIgnoreCase(String s)
        {
            if (IP.c("TOP", s))
            {
                return SCREEN_TOP;
            }
            if (IP.c("CENTER", s))
            {
                return SCREEN_CENTER;
            }
            if (IP.c("BOTTOM", s))
            {
                return SCREEN_BOTTOM;
            } else
            {
                return valueOf(s.toUpperCase(Locale.ENGLISH));
            }
        }

        public static Docking[] values()
        {
            return (Docking[])$VALUES.clone();
        }

        public final boolean isMediaDocking()
        {
            return equals(MEDIA_TOP) || equals(MEDIA_CENTER) || equals(MEDIA_BOTTOM);
        }

        public final boolean isScreenDocking()
        {
            return equals(SCREEN_TOP) || equals(SCREEN_CENTER) || equals(SCREEN_BOTTOM);
        }

        static 
        {
            MEDIA_TOP = new Docking("MEDIA_TOP", 0);
            MEDIA_CENTER = new Docking("MEDIA_CENTER", 1);
            MEDIA_BOTTOM = new Docking("MEDIA_BOTTOM", 2);
            SCREEN_TOP = new Docking("SCREEN_TOP", 3);
            SCREEN_CENTER = new Docking("SCREEN_CENTER", 4);
            SCREEN_BOTTOM = new Docking("SCREEN_BOTTOM", 5);
            $VALUES = (new Docking[] {
                MEDIA_TOP, MEDIA_CENTER, MEDIA_BOTTOM, SCREEN_TOP, SCREEN_CENTER, SCREEN_BOTTOM
            });
        }

        private Docking(String s, int j)
        {
            super(s, j);
        }
    }

    public static final class MediaType extends Enum
    {

        private static final MediaType $VALUES[];
        public static final MediaType IMAGE;
        public static final MediaType LOCAL_WEBPAGE;
        public static final MediaType OVERLAY_ITEM;
        public static final MediaType REMOTE_VIDEO;
        public static final MediaType VIDEO;
        private final MediaState a;

        public static MediaType valueOf(String s)
        {
            return (MediaType)Enum.valueOf(com/snapchat/android/discover/model/DSnapPanel$MediaType, s);
        }

        public static MediaType valueOfIgnoreCase(String s)
        {
            return valueOf(s.toUpperCase(Locale.ENGLISH));
        }

        public static MediaType[] values()
        {
            return (MediaType[])$VALUES.clone();
        }

        public final MediaState getDefaultMetadataLoadingState()
        {
            return a;
        }

        static 
        {
            IMAGE = new MediaType("IMAGE", 0, MediaState.SUCCESS);
            VIDEO = new MediaType("VIDEO", 1, MediaState.SUCCESS);
            OVERLAY_ITEM = new MediaType("OVERLAY_ITEM", 2, MediaState.SUCCESS);
            LOCAL_WEBPAGE = new MediaType("LOCAL_WEBPAGE", 3, MediaState.SUCCESS);
            REMOTE_VIDEO = new MediaType("REMOTE_VIDEO", 4, MediaState.NOT_STARTED);
            $VALUES = (new MediaType[] {
                IMAGE, VIDEO, OVERLAY_ITEM, LOCAL_WEBPAGE, REMOTE_VIDEO
            });
        }

        private MediaType(String s, int j, MediaState mediastate)
        {
            super(s, j);
            a = mediastate;
        }
    }

    public static final class Mode extends Enum
    {

        private static final Mode $VALUES[];
        public static final Mode LOOPING;
        public static final Mode ONCE;

        public static Mode valueOf(String s)
        {
            return (Mode)Enum.valueOf(com/snapchat/android/discover/model/DSnapPanel$Mode, s);
        }

        public static Mode valueOfIgnoreCase(String s)
        {
            return valueOf(s.toUpperCase(Locale.ENGLISH));
        }

        public static Mode[] values()
        {
            return (Mode[])$VALUES.clone();
        }

        static 
        {
            LOOPING = new Mode("LOOPING", 0);
            ONCE = new Mode("ONCE", 1);
            $VALUES = (new Mode[] {
                LOOPING, ONCE
            });
        }

        private Mode(String s, int j)
        {
            super(s, j);
        }
    }

    public static final class a
    {

        public String a;
        public String b;
        public String c;
        public Docking d;
        MediaType e;
        public Mode f;
        public Docking g;
        public String h;
        public String i;

        public final a a(String s)
        {
            e = MediaType.valueOf(s);
            return this;
        }

        public final DSnapPanel a()
        {
            if (a == null && e != MediaType.REMOTE_VIDEO)
            {
                throw new uA("Cannot build dsnap panel with null uri.", "uri");
            }
            if (e == null)
            {
                throw new uA("Cannot build dsnap panel with null media type.", "media_type");
            }
            if (e == MediaType.VIDEO && h == null)
            {
                throw new uA("Cannot build video dsnap panel with null first frame URI.", "video_first_frame");
            }
            if (e == MediaType.VIDEO && i == null)
            {
                Timber.d("DSnapPanel", "Did not find uri for video share frame. Using first frame uri instead. DSnapPanel.Builder: %s", new Object[] {
                    this
                });
                i = h;
            }
            if (f == null)
            {
                f = Mode.LOOPING;
            }
            if (g == null)
            {
                g = Docking.MEDIA_TOP;
            }
            if (d == null)
            {
                d = Docking.MEDIA_TOP;
            }
            return new DSnapPanel(this, (byte)0);
        }

        public a()
        {
        }
    }


    public final String a;
    public final String b;
    public final String c;
    public final Docking d;
    public final String e;
    public final String f;
    public final MediaType g;
    public final Mode h;
    public final Docking i;

    private DSnapPanel(a a1)
    {
        a = a1.a;
        b = a1.b;
        c = a1.c;
        d = a1.d;
        g = a1.e;
        h = a1.f;
        i = a1.g;
        e = a1.h;
        f = a1.i;
    }

    DSnapPanel(a a1, byte byte0)
    {
        this(a1);
    }

    public final String toString()
    {
        return (new StringBuilder("DSnapPanel-")).append(g).append("-").append(a).append("-").append(b).toString();
    }
}
