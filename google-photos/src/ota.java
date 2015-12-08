// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.nio.ByteBuffer;
import java.util.Map;

public class ota
{

    final MediaExtractor a;

    public ota(MediaExtractor mediaextractor)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        a = mediaextractor;
    }

    public int a(ByteBuffer bytebuffer, int i)
    {
        return a.readSampleData(bytebuffer, 0);
    }

    public MediaFormat a(int i)
    {
        return a.getTrackFormat(i);
    }

    public void a()
    {
        a.release();
    }

    public void a(long l, int i)
    {
        a.seekTo(l, 2);
    }

    public void a(Context context, Uri uri, Map map)
    {
        a.setDataSource(context, uri, null);
    }

    public void b(int i)
    {
        a.selectTrack(i);
    }

    public boolean b()
    {
        return a.advance();
    }

    public long c()
    {
        return a.getSampleTime();
    }
}
