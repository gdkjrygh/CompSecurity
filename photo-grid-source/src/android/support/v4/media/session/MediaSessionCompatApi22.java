// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.media.session.MediaSession;

class MediaSessionCompatApi22
{

    MediaSessionCompatApi22()
    {
    }

    public static void setRatingType(Object obj, int i)
    {
        ((MediaSession)obj).setRatingType(i);
    }
}
