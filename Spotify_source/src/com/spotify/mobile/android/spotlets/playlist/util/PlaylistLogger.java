// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.util;

import android.content.Context;
import dnf;
import fop;
import gcf;
import java.util.concurrent.TimeUnit;

public final class PlaylistLogger
{

    public static final String a = "add-to-playlist";
    public static final String b = "add-to-playlist-in-folder";
    private final Context c;
    private final String d;
    private final String e;
    private final SourceAction f;

    public PlaylistLogger(Context context, String s, String s1, SourceAction sourceaction)
    {
        c = context;
        d = s;
        e = s1;
        f = sourceaction;
    }

    public final void a(String s, String s1, long l, long l1, String s2)
    {
        String s3 = d;
        String s4 = e;
        String s5 = f.mName;
        TimeUnit timeunit = TimeUnit.MILLISECONDS;
        gcf gcf1 = gcf.a;
        s = new dnf(s, s3, s1, s4, s5, l, s2, l1, timeunit.toSeconds(gcf.a()));
        fop.a(c, s);
    }

    private class SourceAction extends Enum
    {

        public static final SourceAction a;
        public static final SourceAction b;
        private static final SourceAction c[];
        final String mName;

        public static SourceAction valueOf(String s)
        {
            return (SourceAction)Enum.valueOf(com/spotify/mobile/android/spotlets/playlist/util/PlaylistLogger$SourceAction, s);
        }

        public static SourceAction[] values()
        {
            return (SourceAction[])c.clone();
        }

        static 
        {
            a = new SourceAction("ADD_TO_PLAYLIST", 0, "add-to-playlist");
            b = new SourceAction("SAVE_TO_COLLECTION", 1, "save-to-collection");
            c = (new SourceAction[] {
                a, b
            });
        }

        private SourceAction(String s, int i, String s1)
        {
            super(s, i);
            mName = s1;
        }
    }

}
