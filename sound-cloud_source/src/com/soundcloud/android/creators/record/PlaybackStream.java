// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.os.Parcel;
import android.os.Parcelable;
import com.soundcloud.android.creators.record.filter.FadeFilter;
import com.soundcloud.android.creators.record.reader.EmptyReader;
import com.soundcloud.android.utils.BufferUtils;
import com.soundcloud.android.utils.IOUtils;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.soundcloud.android.creators.record:
//            AudioReader, AudioConfig, PlaybackFilter, TrimPreview

public class PlaybackStream
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final AudioConfig config;
    private long currentPos;
    private long endPos;
    private PlaybackFilter filter;
    private boolean optimize;
    private AudioReader playbackFile;
    private long startPos;
    private float trimWindow[];

    public PlaybackStream(AudioReader audioreader)
    {
        trimWindow = new float[2];
        playbackFile = audioreader;
        config = audioreader.getConfig();
        resetBounds();
        currentPos = -1L;
    }

    private long getValidPosition(long l)
    {
        long l1;
        if (l < startPos)
        {
            l1 = startPos;
        } else
        {
            l1 = l;
            if (l > endPos)
            {
                return endPos;
            }
        }
        return l1;
    }

    public ByteBuffer buffer()
    {
        return BufferUtils.allocateAudioBuffer(1024);
    }

    public void close()
    {
        IOUtils.close(playbackFile);
        playbackFile = new EmptyReader();
    }

    public int describeContents()
    {
        return 0;
    }

    public AudioConfig getConfig()
    {
        return config;
    }

    public long getDuration()
    {
        return endPos - startPos;
    }

    public long getEndPos()
    {
        if (endPos == getTotalDuration())
        {
            return -1L;
        } else
        {
            return endPos;
        }
    }

    public PlaybackFilter getPlaybackFilter()
    {
        return filter;
    }

    public long getPosition()
    {
        return Math.max(0L, currentPos - startPos);
    }

    public long getStartPos()
    {
        return startPos;
    }

    public long getTotalDuration()
    {
        return playbackFile.getDuration();
    }

    public long getTrimRight()
    {
        return getTotalDuration() - endPos;
    }

    public float[] getTrimWindow()
    {
        return trimWindow;
    }

    public void initializePlayback()
        throws IOException
    {
        currentPos = getValidPosition(currentPos);
        initializePlayback(currentPos);
    }

    public void initializePlayback(long l)
        throws IOException
    {
        playbackFile.seek(l);
    }

    public boolean isFading()
    {
        return filter instanceof FadeFilter;
    }

    public boolean isFiltered()
    {
        return filter != null || optimize;
    }

    public boolean isFinished()
    {
        return currentPos >= endPos;
    }

    public boolean isModified()
    {
        return isTrimmed() || isFiltered();
    }

    public boolean isOptimized()
    {
        return optimize;
    }

    public boolean isTrimmed()
    {
        return startPos > 0L || endPos > 0L && endPos < getTotalDuration();
    }

    public int read(ByteBuffer bytebuffer, int i)
        throws IOException
    {
        i = playbackFile.read(bytebuffer, i);
        bytebuffer.flip();
        return i;
    }

    public int readForPlayback(ByteBuffer bytebuffer, int i)
        throws IOException
    {
        if (currentPos < endPos)
        {
            i = playbackFile.read(bytebuffer, i);
            bytebuffer.flip();
            if (filter != null)
            {
                filter.apply(bytebuffer, config.msToByte(currentPos - startPos), config.msToByte(endPos - startPos));
            }
            currentPos = playbackFile.getPosition();
            return i;
        } else
        {
            return -1;
        }
    }

    public void refreshTrimWindow()
    {
        trimWindow[0] = Math.max(0.0F, (float)startPos / (float)getTotalDuration());
        trimWindow[1] = Math.min(1.0F, (float)endPos / (float)getTotalDuration());
    }

    public void reopen()
        throws IOException
    {
        playbackFile.reopen();
        if (currentPos >= 0L)
        {
            playbackFile.seek(currentPos);
        }
        endPos = Math.min(getTotalDuration(), endPos);
    }

    public void reset()
    {
        resetBounds();
        filter = null;
        optimize = false;
    }

    public final void resetBounds()
    {
        startPos = 0L;
        endPos = getTotalDuration();
        trimWindow[0] = 0.0F;
        trimWindow[1] = 1.0F;
    }

    public void resetPlayback()
    {
        currentPos = -1L;
    }

    public void setCurrentPosition(long l)
    {
        currentPos = l;
    }

    public TrimPreview setEndPositionByPercent(float f, long l)
    {
        if ((double)f < 0.0D || (double)f > 1.0D)
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal end percent ")).append(f).toString());
        } else
        {
            trimWindow[1] = f;
            long l1 = endPos;
            endPos = (long)((float)getTotalDuration() * f);
            return new TrimPreview(this, l1, endPos, l);
        }
    }

    public void setFading(boolean flag)
    {
        FadeFilter fadefilter;
        if (flag)
        {
            fadefilter = new FadeFilter(playbackFile.getConfig());
        } else
        {
            fadefilter = null;
        }
        filter = fadefilter;
    }

    public void setOptimize(boolean flag)
    {
        optimize = flag;
    }

    public TrimPreview setStartPositionByPercent(float f, long l)
    {
        if ((double)f < 0.0D || (double)f > 1.0D)
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal start percent ")).append(f).toString());
        } else
        {
            trimWindow[0] = f;
            long l1 = startPos;
            startPos = (long)((float)getTotalDuration() * f);
            return new TrimPreview(this, l1, startPos, l);
        }
    }

    public void setTrim(long l, long l1)
    {
        startPos = l;
        l = l1;
        if (l1 == -1L)
        {
            l = getTotalDuration();
        }
        endPos = l;
        refreshTrimWindow();
    }

    public String toString()
    {
        return (new StringBuilder("PlaybackStream{startPos=")).append(startPos).append(", endPos=").append(endPos).append(", playbackFile=").append(playbackFile).append(", filter=").append(filter).append(", optimize=").append(optimize).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(playbackFile.getFile().getAbsolutePath());
        parcel.writeLong(startPos);
        parcel.writeLong(endPos);
        int j;
        if (optimize)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        parcel.writeParcelable(filter, i);
    }



/*
    static long access$002(PlaybackStream playbackstream, long l)
    {
        playbackstream.startPos = l;
        return l;
    }

*/


/*
    static long access$102(PlaybackStream playbackstream, long l)
    {
        playbackstream.endPos = l;
        return l;
    }

*/


/*
    static boolean access$202(PlaybackStream playbackstream, boolean flag)
    {
        playbackstream.optimize = flag;
        return flag;
    }

*/


/*
    static PlaybackFilter access$302(PlaybackStream playbackstream, PlaybackFilter playbackfilter)
    {
        playbackstream.filter = playbackfilter;
        return playbackfilter;
    }

*/

    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PlaybackStream createFromParcel(Parcel parcel)
        {
            Object obj;
            boolean flag;
            flag = true;
            obj = new File(parcel.readString());
            obj = new PlaybackStream(AudioReader.guess(((File) (obj))));
            obj.startPos = parcel.readLong();
            obj.endPos = parcel.readLong();
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            obj.optimize = flag;
            obj.filter = (PlaybackFilter)parcel.readParcelable(getClass().getClassLoader());
            ((PlaybackStream) (obj)).refreshTrimWindow();
            return ((PlaybackStream) (obj));
            parcel;
            throw new RuntimeException(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PlaybackStream[] newArray(int i)
        {
            return new PlaybackStream[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
