// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaExtractor;
import android.media.MediaFormat;
import java.io.File;
import java.io.IOException;

public final class WM
{

    private MediaExtractor a;

    public WM(File file)
    {
        WE.a();
        this(file, (byte)0);
    }

    private WM(File file, byte byte0)
    {
        dv.a(file.exists());
        try
        {
            a = new MediaExtractor();
            a.setDataSource(file.toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw file;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new WG((new StringBuilder("Native exception while setting up extractor: ")).append(file.toString()).toString(), file);
        }
    }

    private boolean c()
    {
        return a == null;
    }

    public final void a()
    {
        if (c())
        {
            return;
        }
        a.release();
        a = null;
        return;
        Object obj;
        obj;
        (new StringBuilder("Native exception while releasing extractor: ")).append(((Throwable) (obj)).toString());
        a = null;
        return;
        obj;
        a = null;
        throw obj;
    }

    public final MediaFormat b()
    {
        int i;
        boolean flag;
        if (!c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dv.b(flag);
        i = WE.a(a);
        if (i == -1)
        {
            return null;
        }
        MediaFormat mediaformat;
        try
        {
            mediaformat = a.getTrackFormat(i);
        }
        catch (Throwable throwable)
        {
            throw new WG((new StringBuilder("Native exception while getting audio track format from extractor: ")).append(throwable.toString()).toString(), throwable);
        }
        return mediaformat;
    }

    protected final void finalize()
    {
        if (!c())
        {
            a();
        }
    }
}
