// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.media.MediaDescription;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompatApi21

static class 
{

    public static Object createItem(Object obj, long l)
    {
        return new android.media.session..QueueItem((MediaDescription)obj, l);
    }

    public static Object getDescription(Object obj)
    {
        return ((android.media.session..QueueItem)obj).ion();
    }

    public static long getQueueId(Object obj)
    {
        return ((android.media.session.ion)obj).ion();
    }

    ()
    {
    }
}
