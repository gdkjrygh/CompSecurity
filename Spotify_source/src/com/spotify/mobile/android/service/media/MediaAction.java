// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media;


public final class MediaAction extends Enum
{

    public static final MediaAction a;
    public static final MediaAction b;
    public static final MediaAction c;
    public static final MediaAction d;
    public static final MediaAction e;
    public static final MediaAction f;
    public static final MediaAction g;
    public static final MediaAction h;
    public static final MediaAction i;
    public static final MediaAction j;
    public static final MediaAction k;
    public static final MediaAction l;
    public static final MediaAction m;
    public static final MediaAction n;
    public static final MediaAction o;
    public static final MediaAction p;
    public static final MediaAction q;
    private static final MediaAction r[];
    public final int mIconRes;

    private MediaAction(String s, int i1, int j1)
    {
        super(s, i1);
        mIconRes = j1;
    }

    public static MediaAction valueOf(String s)
    {
        return (MediaAction)Enum.valueOf(com/spotify/mobile/android/service/media/MediaAction, s);
    }

    public static MediaAction[] values()
    {
        return (MediaAction[])r.clone();
    }

    static 
    {
        a = new MediaAction("PLAY", 0, 0x7f02022c);
        b = new MediaAction("PAUSE", 1, 0x7f02022b);
        c = new MediaAction("SKIP_TO_NEXT", 2, 0x7f020236);
        d = new MediaAction("SKIP_TO_PREVIOUS", 3, 0x7f020237);
        e = new MediaAction("TURN_SHUFFLE_ON", 4, 0x7f020234);
        f = new MediaAction("TURN_SHUFFLE_OFF", 5, 0x7f020235);
        g = new MediaAction("THUMB_UP", 6, 0x7f02023b);
        h = new MediaAction("THUMBS_UP_SELECTED", 7, 0x7f02023c);
        i = new MediaAction("THUMB_DOWN", 8, 0x7f02023a);
        j = new MediaAction("THUMB_DOWN_SELECTED", 9, 0x7f02023a);
        k = new MediaAction("START_RADIO", 10, 0x7f020239);
        l = new MediaAction("ADD_TO_COLLECTION", 11, 0x7f020232);
        m = new MediaAction("REMOVE_FROM_COLLECTION", 12, 0x7f020233);
        n = new MediaAction("TURN_REPEAT_ALL_ON", 13, 0x7f020230);
        o = new MediaAction("TURN_REPEAT_ONE_ON", 14, 0x7f02022f);
        p = new MediaAction("TURN_REPEAT_ONE_OFF", 15, 0x7f020231);
        q = new MediaAction("TURN_REPEAT_ALL_OFF", 16, 0x7f02022f);
        r = (new MediaAction[] {
            a, b, c, d, e, f, g, h, i, j, 
            k, l, m, n, o, p, q
        });
    }
}
