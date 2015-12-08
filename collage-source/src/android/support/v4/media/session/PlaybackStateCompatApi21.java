// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

class PlaybackStateCompatApi21
{
    static final class CustomAction
    {

        public static String getAction(Object obj)
        {
            return ((android.media.session.PlaybackState.CustomAction)obj).getAction();
        }

        public static Bundle getExtras(Object obj)
        {
            return ((android.media.session.PlaybackState.CustomAction)obj).getExtras();
        }

        public static int getIcon(Object obj)
        {
            return ((android.media.session.PlaybackState.CustomAction)obj).getIcon();
        }

        public static CharSequence getName(Object obj)
        {
            return ((android.media.session.PlaybackState.CustomAction)obj).getName();
        }

        public static Object newInstance(String s, CharSequence charsequence, int i, Bundle bundle)
        {
            s = new android.media.session.PlaybackState.CustomAction.Builder(s, charsequence, i);
            s.setExtras(bundle);
            return s.build();
        }

        CustomAction()
        {
        }
    }


    PlaybackStateCompatApi21()
    {
    }

    public static long getActions(Object obj)
    {
        return ((PlaybackState)obj).getActions();
    }

    public static long getActiveQueueItemId(Object obj)
    {
        return ((PlaybackState)obj).getActiveQueueItemId();
    }

    public static long getBufferedPosition(Object obj)
    {
        return ((PlaybackState)obj).getBufferedPosition();
    }

    public static List getCustomActions(Object obj)
    {
        return ((PlaybackState)obj).getCustomActions();
    }

    public static CharSequence getErrorMessage(Object obj)
    {
        return ((PlaybackState)obj).getErrorMessage();
    }

    public static long getLastPositionUpdateTime(Object obj)
    {
        return ((PlaybackState)obj).getLastPositionUpdateTime();
    }

    public static float getPlaybackSpeed(Object obj)
    {
        return ((PlaybackState)obj).getPlaybackSpeed();
    }

    public static long getPosition(Object obj)
    {
        return ((PlaybackState)obj).getPosition();
    }

    public static int getState(Object obj)
    {
        return ((PlaybackState)obj).getState();
    }

    public static Object newInstance(int i, long l, long l1, float f, long l2, 
            CharSequence charsequence, long l3, List list, long l4)
    {
        android.media.session.PlaybackState.Builder builder = new android.media.session.PlaybackState.Builder();
        builder.setState(i, l, f, l3);
        builder.setBufferedPosition(l1);
        builder.setActions(l2);
        builder.setErrorMessage(charsequence);
        for (charsequence = list.iterator(); charsequence.hasNext(); builder.addCustomAction((android.media.session.PlaybackState.CustomAction)charsequence.next())) { }
        builder.setActiveQueueItemId(l4);
        return builder.build();
    }
}
