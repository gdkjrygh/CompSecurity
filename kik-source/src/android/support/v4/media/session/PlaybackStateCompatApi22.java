// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

class PlaybackStateCompatApi22
{

    PlaybackStateCompatApi22()
    {
    }

    public static Bundle getExtras(Object obj)
    {
        return ((PlaybackState)obj).getExtras();
    }

    public static Object newInstance(int i, long l, long l1, float f, long l2, 
            CharSequence charsequence, long l3, List list, long l4, Bundle bundle)
    {
        android.media.session.PlaybackState.Builder builder = new android.media.session.PlaybackState.Builder();
        builder.setState(i, l, f, l3);
        builder.setBufferedPosition(l1);
        builder.setActions(l2);
        builder.setErrorMessage(charsequence);
        for (charsequence = list.iterator(); charsequence.hasNext(); builder.addCustomAction((android.media.session.PlaybackState.CustomAction)charsequence.next())) { }
        builder.setActiveQueueItemId(l4);
        builder.setExtras(bundle);
        return builder.build();
    }
}
