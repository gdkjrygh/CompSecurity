// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.objects.MoreObjects;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayPublisher

static class track
{

    public final String gatewayId;
    public final String registrationId;
    public final long timestamp;
    public final Urn track;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof track))
            {
                return false;
            }
            obj = (track)obj;
            if (!MoreObjects.equal(Long.valueOf(timestamp), Long.valueOf(((timestamp) (obj)).timestamp)) || !MoreObjects.equal(registrationId, ((registrationId) (obj)).registrationId) || !MoreObjects.equal(track, ((track) (obj)).track))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            registrationId, Long.valueOf(timestamp), track
        });
    }

    (String s, String s1, long l, Urn urn)
    {
        gatewayId = s;
        registrationId = s1;
        timestamp = l;
        track = urn;
    }
}
