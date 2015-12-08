// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.media.Rating;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//            MediaControllerCompatApi21

public static class 
{

    public static void fastForward(Object obj)
    {
        ((android.media.session.rtControls)obj).();
    }

    public static void pause(Object obj)
    {
        ((android.media.session.)obj).();
    }

    public static void play(Object obj)
    {
        ((android.media.session.)obj).();
    }

    public static void playFromMediaId(Object obj, String s, Bundle bundle)
    {
        ((android.media.session.)obj).iaId(s, bundle);
    }

    public static void playFromSearch(Object obj, String s, Bundle bundle)
    {
        ((android.media.session.iaId)obj).rch(s, bundle);
    }

    public static void rewind(Object obj)
    {
        ((android.media.session.rch)obj).rch();
    }

    public static void seekTo(Object obj, long l)
    {
        ((android.media.session.rch)obj).rch(l);
    }

    public static void sendCustomAction(Object obj, String s, Bundle bundle)
    {
        ((android.media.session.rch)obj).ction(s, bundle);
    }

    public static void setRating(Object obj, Object obj1)
    {
        ((android.media.session.ction)obj).ction((Rating)obj1);
    }

    public static void skipToNext(Object obj)
    {
        ((android.media.session.ction)obj).ction();
    }

    public static void skipToPrevious(Object obj)
    {
        ((android.media.session.ction)obj).ous();
    }

    public static void skipToQueueItem(Object obj, long l)
    {
        ((android.media.session.ous)obj).Item(l);
    }

    public static void stop(Object obj)
    {
        ((android.media.session.Item)obj).Item();
    }

    public ()
    {
    }
}
