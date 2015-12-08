// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaExtractor;
import android.media.MediaFormat;

public abstract class VY extends Wb
{

    public MediaExtractor a;
    public int b;
    public VU c;
    public long d;
    public volatile boolean e;

    public VY(String s, Wc wc)
    {
        super(wc);
        a = null;
        b = -1;
        c = null;
        d = 0L;
        e = false;
        try
        {
            WE.a();
            a = WE.b(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new Wu((new StringBuilder()).append(s.getMessage()).append(s.toString()).toString());
        }
    }

    public abstract void a();

    public final MediaFormat b()
    {
        if (b == -1)
        {
            throw new Wy((new StringBuilder("Request track is undefined ")).append(a.getTrackCount()).toString());
        } else
        {
            return a.getTrackFormat(b);
        }
    }

    public final void c()
    {
        try
        {
            if (a != null)
            {
                a.release();
                a = null;
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void processFrame()
    {
        if (!mDone)
        {
            if (c == null)
            {
                throw new Wy("Decoder is null");
            }
            if (e)
            {
                stageComplete();
                return;
            }
            (new StringBuilder("dequeingInputBuffer: ")).append(c);
            int i = c.b();
            if (i != -1)
            {
                (new StringBuilder("getting buffer with shouldAbort: ")).append(e);
                java.nio.ByteBuffer bytebuffer = c.b[i];
                int j = a.readSampleData(bytebuffer, 0);
                if (j >= 0 && !e)
                {
                    long l = a.getSampleTime();
                    c.a(i, j, l, a.getSampleFlags());
                    if (l < d)
                    {
                        (new StringBuilder("Extractor out of sync last:")).append(d).append(" cur: ").append(l);
                    }
                    d = l;
                    a.advance();
                    return;
                } else
                {
                    c.a(i, 0, 0L, 4);
                    stageComplete();
                    return;
                }
            }
        }
    }
}
