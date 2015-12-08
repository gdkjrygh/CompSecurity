// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Map;
import p.cw.c;
import p.df.a;

public class e extends MediaPlayer
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        private static final a k[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/dg/e$a, s);
        }

        public static a[] values()
        {
            return (a[])k.clone();
        }

        static 
        {
            a = new a("IDLE", 0);
            b = new a("INITIALIZED", 1);
            c = new a("PREPARING", 2);
            d = new a("PREPARED", 3);
            e = new a("STARTED", 4);
            f = new a("PAUSED", 5);
            g = new a("STOPPED", 6);
            h = new a("PLAYBACKCOMPLETE", 7);
            i = new a("END", 8);
            j = new a("ERROR", 9);
            k = (new a[] {
                a, b, c, d, e, f, g, h, i, j
            });
        }

        private a(String s, int l)
        {
            super(s, l);
        }
    }


    private static EnumSet c;
    private a a;
    private c b;

    public e(c c1)
    {
        b = c1;
        a(p.dg.a.a);
    }

    private void a(EnumSet enumset, a a1)
    {
        if (enumset.contains(a()))
        {
            a(a1);
        }
    }

    private void a(a a1)
    {
        a = a1;
        p.df.a.c("MediaPlayerWithState", (new StringBuilder()).append("MediaPlayerState : ").append(a.toString()).toString());
    }

    private void a(a a1, a a2)
    {
        a(EnumSet.of(a1), a2);
    }

    static void a(e e1, a a1)
    {
        e1.a(a1);
    }

    private transient void a(a aa[])
    {
        a(EnumSet.complementOf(b(aa)), a.j);
    }

    private static transient EnumSet b(a aa[])
    {
        EnumSet enumset = EnumSet.noneOf(p/dg/e$a);
        int j = aa.length;
        for (int i = 0; i < j; i++)
        {
            enumset.add(aa[i]);
        }

        return enumset;
    }

    public a a()
    {
        return a;
    }

    public int getCurrentPosition()
    {
        a(new a[] {
            a.b, a.d, a.f, a.g, a.h
        });
        return super.getCurrentPosition();
    }

    public int getDuration()
    {
        a(new a[] {
            a.d, a.e, a.f, a.g, a.h
        });
        return super.getDuration();
    }

    public int getVideoHeight()
    {
        a(new a[] {
            p.dg.a.a, a.b, a.d, a.e, a.f, a.g, a.h
        });
        return super.getVideoHeight();
    }

    public int getVideoWidth()
    {
        a(new a[] {
            p.dg.a.a, a.b, a.d, a.e, a.f, a.g, a.h
        });
        return super.getVideoWidth();
    }

    public boolean isPlaying()
    {
        if (c.contains(a()))
        {
            return super.isPlaying();
        } else
        {
            return false;
        }
    }

    public void pause()
        throws IllegalStateException
    {
        a(new a[] {
            a.e, a.f
        });
        super.pause();
        a(a.f);
    }

    public void prepare()
        throws IllegalStateException, IOException
    {
        super.prepare();
        a(a.d);
    }

    public void prepareAsync()
        throws IllegalStateException
    {
        super.prepareAsync();
        a(EnumSet.of(a.b, a.g), p.dg.a.c);
    }

    public void release()
    {
        super.release();
        a(a.i);
    }

    public void reset()
    {
        super.reset();
        a(a.i, p.dg.a.a);
    }

    public void seekTo(int i)
        throws IllegalStateException
    {
        a(new a[] {
            a.d, a.e, a.f, a.h
        });
        super.seekTo(i);
    }

    public void setDataSource(Context context, Uri uri)
        throws IOException, IllegalArgumentException, SecurityException, IllegalStateException
    {
        super.setDataSource(context, uri);
        a(p.dg.a.a, a.b);
    }

    public void setDataSource(Context context, Uri uri, Map map)
        throws IOException, IllegalArgumentException, SecurityException, IllegalStateException
    {
        super.setDataSource(context, uri, map);
        a(p.dg.a.a, a.b);
    }

    public void setDataSource(FileDescriptor filedescriptor)
        throws IOException, IllegalArgumentException, IllegalStateException
    {
        super.setDataSource(filedescriptor);
        a(p.dg.a.a, a.b);
    }

    public void setDataSource(FileDescriptor filedescriptor, long l, long l1)
        throws IOException, IllegalArgumentException, IllegalStateException
    {
        super.setDataSource(filedescriptor, l, l1);
        a(p.dg.a.a, a.b);
    }

    public void setDataSource(String s)
        throws IOException, IllegalArgumentException, SecurityException, IllegalStateException
    {
        super.setDataSource(s);
        a(p.dg.a.a, a.b);
    }

    public void setLooping(boolean flag)
    {
        a(new a[] {
            p.dg.a.a, a.b, a.g, a.d, a.e, a.f, a.h
        });
        super.setLooping(flag);
    }

    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
    {
        super.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener(oncompletionlistener) {

            final android.media.MediaPlayer.OnCompletionListener a;
            final e b;

            public void onCompletion(MediaPlayer mediaplayer)
            {
                if (!b.isLooping())
                {
                    p.dg.e.a(b, a.h);
                }
                a.onCompletion(mediaplayer);
            }

            
            {
                b = e.this;
                a = oncompletionlistener;
                super();
            }
        });
    }

    public void setOnErrorListener(android.media.MediaPlayer.OnErrorListener onerrorlistener)
    {
        super.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener(onerrorlistener) {

            final android.media.MediaPlayer.OnErrorListener a;
            final e b;

            public boolean onError(MediaPlayer mediaplayer, int i, int j)
            {
                p.dg.e.a(b, a.j);
                return a.onError(mediaplayer, i, j);
            }

            
            {
                b = e.this;
                a = onerrorlistener;
                super();
            }
        });
    }

    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onpreparedlistener)
    {
        super.setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener(onpreparedlistener) {

            final android.media.MediaPlayer.OnPreparedListener a;
            final e b;

            public void onPrepared(MediaPlayer mediaplayer)
            {
                p.dg.e.a(b, a.d);
                a.onPrepared(mediaplayer);
            }

            
            {
                b = e.this;
                a = onpreparedlistener;
                super();
            }
        });
    }

    public void start()
        throws IllegalStateException
    {
        a(new a[] {
            a.d, a.e, a.f, a.h
        });
        super.start();
        a(a.e);
    }

    public void stop()
        throws IllegalStateException
    {
        a(new a[] {
            a.d, a.e, a.g, a.f, a.h
        });
        super.stop();
        a(a.g);
    }

    static 
    {
        c = EnumSet.of(p.dg.a.a, new a[] {
            a.b, a.d, a.e, a.f, a.g, a.h
        });
    }
}
