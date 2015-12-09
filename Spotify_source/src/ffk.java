// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.SparseArray;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public final class ffk
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnPreparedListener
{

    private static final long c;
    public final ffj a;
    public final LinkedList b = new LinkedList();
    private boolean d;
    private final SparseArray e = new SparseArray();

    public ffk(ffj ffj1)
    {
        a = ffj1;
        a.c = this;
        a.d = this;
    }

    private void b()
    {
        if (!b.isEmpty() && !a.a() && !a.b())
        {
            int i = ((Integer)b.removeLast()).intValue();
            Long long1 = (Long)e.get(i);
            long l = System.currentTimeMillis();
            e.put(i, Long.valueOf(l));
            boolean flag;
            if (long1 != null && l - long1.longValue() < c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag && i > 0)
            {
                ffj ffj1 = a;
                if (!ffj1.f)
                {
                    Uri uri = Uri.parse((new StringBuilder("android.resource://")).append(ffj1.a.getPackageName()).append("/").append(i).toString());
                    try
                    {
                        ffj1.b.reset();
                        ffj1.b.setDataSource(ffj1.a, uri);
                    }
                    catch (IOException ioexception)
                    {
                        Logger.b(ioexception, "Can't play uri: %s", new Object[] {
                            uri.toString()
                        });
                    }
                    ffj1.e = true;
                    ffj1.b.prepareAsync();
                    return;
                }
            }
        }
    }

    public final void a()
    {
        if (a.a() || a.b())
        {
            d = true;
            return;
        } else
        {
            ffj ffj1 = a;
            ffj1.f = true;
            ffj1.b.release();
            return;
        }
    }

    public final void a(int i)
    {
        b.addFirst(Integer.valueOf(i));
        if (b.size() > 2)
        {
            b.removeLast();
        }
        b();
    }

    public final void onCompletion(MediaPlayer mediaplayer)
    {
        if (b.isEmpty())
        {
            a.a(false);
        }
        b();
        if (b.isEmpty() && d)
        {
            a();
        }
    }

    public final void onPrepared(MediaPlayer mediaplayer)
    {
        a.a(true);
        a.b.start();
    }

    static 
    {
        c = TimeUnit.SECONDS.toMillis(5L);
    }
}
