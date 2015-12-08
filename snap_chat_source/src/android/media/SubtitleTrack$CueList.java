// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.media;

import java.util.SortedMap;
import java.util.Vector;

// Referenced classes of package android.media:
//            SubtitleTrack

static class 
{

    private SortedMap mCues;

    private void removeEvent( , long l)
    {
        Vector vector = (Vector)mCues.get(Long.valueOf(l));
        if (vector != null)
        {
            vector.remove();
            if (vector.size() == 0)
            {
                mCues.remove(Long.valueOf(l));
            }
        }
    }

    public void remove(mCues mcues)
    {
        removeEvent(mcues, mcues.rtTimeMs);
        if (mcues.erTimesMs != null)
        {
            long al[] = mcues.erTimesMs;
            int j = al.length;
            for (int i = 0; i < j; i++)
            {
                removeEvent(mcues, al[i]);
            }

        }
        removeEvent(mcues, mcues.TimeMs);
    }
}
