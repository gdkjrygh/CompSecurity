// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.authoring;

import com.googlecode.mp4parser.util.Matrix;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.googlecode.mp4parser.authoring:
//            Track, TrackMetaData

public class Movie
{

    Matrix matrix;
    List tracks;

    public Movie()
    {
        matrix = Matrix.ROTATE_0;
        tracks = new LinkedList();
    }

    public Movie(List list)
    {
        matrix = Matrix.ROTATE_0;
        tracks = new LinkedList();
        tracks = list;
    }

    public static long gcd(long l, long l1)
    {
        do
        {
            long l2 = l;
            if (l1 == 0L)
            {
                return l2;
            }
            l = l1;
            l1 = l2 % l1;
        } while (true);
    }

    public void addTrack(Track track)
    {
        if (getTrackByTrackId(track.getTrackMetaData().getTrackId()) != null)
        {
            track.getTrackMetaData().setTrackId(getNextTrackId());
        }
        tracks.add(track);
    }

    public Matrix getMatrix()
    {
        return matrix;
    }

    public long getNextTrackId()
    {
        Iterator iterator = tracks.iterator();
        long l = 0L;
        do
        {
            Track track;
            do
            {
                if (!iterator.hasNext())
                {
                    return 1L + l;
                }
                track = (Track)iterator.next();
            } while (l >= track.getTrackMetaData().getTrackId());
            l = track.getTrackMetaData().getTrackId();
        } while (true);
    }

    public long getTimescale()
    {
        long l = ((Track)getTracks().iterator().next()).getTrackMetaData().getTimescale();
        Iterator iterator = getTracks().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                return l;
            }
            l = gcd(((Track)iterator.next()).getTrackMetaData().getTimescale(), l);
        } while (true);
    }

    public Track getTrackByTrackId(long l)
    {
        Iterator iterator = tracks.iterator();
        Track track;
        do
        {
            if (!iterator.hasNext())
            {
                return null;
            }
            track = (Track)iterator.next();
        } while (track.getTrackMetaData().getTrackId() != l);
        return track;
    }

    public List getTracks()
    {
        return tracks;
    }

    public void setMatrix(Matrix matrix1)
    {
        matrix = matrix1;
    }

    public void setTracks(List list)
    {
        tracks = list;
    }

    public String toString()
    {
        Iterator iterator = tracks.iterator();
        String s = "Movie{ ";
        do
        {
            if (!iterator.hasNext())
            {
                return (new StringBuilder(String.valueOf(s))).append('}').toString();
            }
            Track track = (Track)iterator.next();
            s = (new StringBuilder(String.valueOf(s))).append("track_").append(track.getTrackMetaData().getTrackId()).append(" (").append(track.getHandler()).append(") ").toString();
        } while (true);
    }
}
