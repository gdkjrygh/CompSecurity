// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.videoplayer;

import ctz;

public final class VideoActivityActions
{

    public static OnRotateAction a(int i)
    {
        boolean flag;
        if (i >= 0 && i < OnRotateAction.values().length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag);
        return OnRotateAction.values()[i];
    }

    public static OnTapVideoAction b(int i)
    {
        boolean flag;
        if (i >= 0 && i < OnTapVideoAction.values().length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag);
        return OnTapVideoAction.values()[i];
    }

    private class OnRotateAction extends Enum
    {

        public static final OnRotateAction a;
        public static final OnRotateAction b;
        private static final OnRotateAction c[];

        public static OnRotateAction valueOf(String s)
        {
            return (OnRotateAction)Enum.valueOf(com/spotify/mobile/android/spotlets/videoplayer/VideoActivityActions$OnRotateAction, s);
        }

        public static OnRotateAction[] values()
        {
            return (OnRotateAction[])c.clone();
        }

        abstract void a(FullscreenVideoActivity fullscreenvideoactivity);

        static 
        {
            a = new OnRotateAction("ROTATE") {

                public final void a(FullscreenVideoActivity fullscreenvideoactivity)
                {
                    fullscreenvideoactivity.d.b();
                }

            };
            b = new OnRotateAction("CLOSE") {

                public final void a(FullscreenVideoActivity fullscreenvideoactivity)
                {
                    fullscreenvideoactivity.d.o.setVisibility(4);
                    fullscreenvideoactivity.finish();
                }

            };
            c = (new OnRotateAction[] {
                a, b
            });
        }

        private OnRotateAction(String s, int i)
        {
            super(s, i);
        }

        OnRotateAction(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }


    private class OnTapVideoAction extends Enum
    {

        public static final OnTapVideoAction a;
        public static final OnTapVideoAction b;
        private static final OnTapVideoAction c[];

        public static OnTapVideoAction valueOf(String s)
        {
            return (OnTapVideoAction)Enum.valueOf(com/spotify/mobile/android/spotlets/videoplayer/VideoActivityActions$OnTapVideoAction, s);
        }

        public static OnTapVideoAction[] values()
        {
            return (OnTapVideoAction[])c.clone();
        }

        abstract void a(FullscreenVideoActivity fullscreenvideoactivity);

        static 
        {
            a = new OnTapVideoAction("SHOW_OR_HIDE_CONTROLS") {

                public final void a(FullscreenVideoActivity fullscreenvideoactivity)
                {
                    flq flq1 = fullscreenvideoactivity.d;
                    if (flq1.p.getVisibility() == 0)
                    {
                        flq1.b();
                    } else
                    {
                        flq1.a();
                    }
                    fullscreenvideoactivity.i();
                }

            };
            b = new OnTapVideoAction("CLOSE") {

                public final void a(FullscreenVideoActivity fullscreenvideoactivity)
                {
                    fullscreenvideoactivity.finish();
                }

            };
            c = (new OnTapVideoAction[] {
                a, b
            });
        }

        private OnTapVideoAction(String s, int i)
        {
            super(s, i);
        }

        OnTapVideoAction(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }

}
