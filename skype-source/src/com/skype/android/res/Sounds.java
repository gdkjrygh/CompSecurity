// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.res;

import android.app.Application;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import com.skype.android.audio.AudioRoute;
import com.skype.android.util.DeviceFeatures;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.res:
//            Vibration

public final class Sounds
    implements android.os.Handler.Callback
{
    private static final class a
    {

        public MediaPlayer a;
        public boolean b;
        public int c;
        public Uri d;

        public a(MediaPlayer mediaplayer, boolean flag, int i, Uri uri)
        {
            a = mediaplayer;
            b = flag;
            c = i;
            d = uri;
        }
    }


    private static final Logger a = Logger.getLogger("Sounds");
    private AudioManager b;
    private Vibration c;
    private Context d;
    private final ConcurrentHashMap e = new ConcurrentHashMap();
    private String f;
    private HandlerThread g;
    private Handler h;

    public Sounds(Application application, AudioManager audiomanager, Vibration vibration)
    {
        d = application;
        b = audiomanager;
        c = vibration;
        g = new HandlerThread("sounds");
        g.start();
        h = new Handler(g.getLooper(), this);
        f = (new StringBuilder("android.resource://")).append(application.getPackageName()).append("/raw/").toString();
    }

    static ConcurrentHashMap a(Sounds sounds)
    {
        return sounds.e;
    }

    private void a(int i)
    {
        a(i, false, 5, null);
    }

    private void a(int i, boolean flag)
    {
        a a1 = (a)e.get(Integer.valueOf(i));
        if (a1 != null)
        {
            h.removeMessages(i);
            MediaPlayer mediaplayer = a1.a;
            if (mediaplayer.isPlaying())
            {
                mediaplayer.stop();
            }
            a.info((new StringBuilder("stop() RELEASE id: ")).append(i).append(" remove: ").append(flag).toString());
            mediaplayer.release();
            if (flag)
            {
                e.remove(Integer.valueOf(i));
            }
            if (a1.c == 2)
            {
                b.setMode(0);
            }
        }
        c.a(i);
    }

    private void a(int i, boolean flag, int j, AsyncTask asynctask)
    {
        if (!e.containsKey(Integer.valueOf(i)) && !c.b(i)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        b.getRingerMode();
        JVM INSTR tableswitch 0 1: default 56
    //                   0 184
    //                   1 184;
           goto _L3 _L4 _L4
_L3:
        a(i, true);
        if (asynctask == null) goto _L6; else goto _L5
_L5:
        if (asynctask.get() == null) goto _L6; else goto _L7
_L7:
        asynctask = (Uri)asynctask.get();
        a.info("playThroughMediaPlayer() custom");
_L8:
        Object obj = new MediaPlayer();
        this;
        JVM INSTR monitorenter ;
        a.info("playThroughMediaPlayer() put in the queue:");
        asynctask = new a(((MediaPlayer) (obj)), flag, j, asynctask);
        e.put(Integer.valueOf(i), asynctask);
        obj = h.obtainMessage(i);
        obj.obj = asynctask;
        h.sendMessage(((Message) (obj)));
        this;
        JVM INSTR monitorexit ;
        if (j == 2)
        {
            b.setMode(1);
            return;
        } else
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        if (j != 0) goto _L1; else goto _L3
_L6:
        asynctask = Uri.parse((new StringBuilder()).append(f).append(i).toString());
        a.info("playThroughMediaPlayer() predefined");
          goto _L8
        asynctask;
_L9:
        a.info((new StringBuilder("playThroughMediaPlayer(): exception: ")).append(asynctask).toString());
        asynctask = Uri.parse((new StringBuilder()).append(f).append(i).toString());
          goto _L8
        asynctask;
        this;
        JVM INSTR monitorexit ;
        throw asynctask;
        asynctask;
          goto _L9
    }

    private static int b(AudioRoute audioroute, int i)
    {
        AudioRoute audioroute1 = audioroute;
        if (audioroute == null)
        {
            audioroute1 = AudioRoute.a;
        }
        static final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[AudioRoute.values().length];
                try
                {
                    a[AudioRoute.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror) { }
            }
        }

        switch (_cls3.a[audioroute1.ordinal()])
        {
        default:
            return i;

        case 1: // '\001'
            return 0;
        }
    }

    static Logger d()
    {
        return a;
    }

    public final int a(AudioRoute audioroute, int i)
    {
        int j = b(audioroute, 0);
        a(i, true, j, null);
        c.a(i, false);
        return j;
    }

    public final int a(AudioRoute audioroute, boolean flag, AsyncTask asynctask)
    {
        int i;
        int j;
        if (flag)
        {
            i = 0x7f070009;
        } else
        {
            i = 0x7f070008;
        }
        a.info((new StringBuilder("playCallIncoming() id: ")).append(i).toString());
        if (flag)
        {
            j = 0;
        } else
        {
            j = 2;
        }
        j = b(audioroute, j);
        a(i, true, j, asynctask);
        c.a(i, true);
        return j;
    }

    public final void a()
    {
        a(0x7f070006);
    }

    public final void a(AudioRoute audioroute)
    {
        c();
        a(0x7f070004, false, b(audioroute, 5), null);
    }

    public final void b()
    {
        a(0x7f07000c);
    }

    public final void c()
    {
        this;
        JVM INSTR monitorenter ;
        for (Iterator iterator = e.keySet().iterator(); iterator.hasNext(); iterator.remove())
        {
            a(((Integer)iterator.next()).intValue(), false);
        }

        break MISSING_BLOCK_LABEL_55;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        this;
        JVM INSTR monitorexit ;
        c.a();
        return;
    }

    public final boolean handleMessage(Message message)
    {
        MediaPlayer mediaplayer;
        Uri uri;
        int i;
        int j;
        boolean flag;
        i = message.what;
        message = (a)message.obj;
        if (!e.containsKey(Integer.valueOf(i)))
        {
            break MISSING_BLOCK_LABEL_205;
        }
        mediaplayer = ((a) (message)).a;
        uri = ((a) (message)).d;
        flag = ((a) (message)).b;
        j = ((a) (message)).c;
        mediaplayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener(flag, i) {

            final boolean a;
            final int b;
            final Sounds c;

            public final void onCompletion(MediaPlayer mediaplayer1)
            {
                if (!a || !mediaplayer1.isLooping())
                {
                    Sounds.d().info((new StringBuilder("playThroughMediaPlayer() !loop || !player.isLooping() id:")).append(b).toString());
                    mediaplayer1.release();
                    Sounds.a(c).remove(Integer.valueOf(b));
                }
            }

            
            {
                c = Sounds.this;
                a = flag;
                b = i;
                super();
            }
        });
        mediaplayer.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener(i) {

            final int a;
            final Sounds b;

            public final boolean onError(MediaPlayer mediaplayer1, int l, int i1)
            {
                Sounds.d().warning((new StringBuilder("MediaPlayer onError id:")).append(a).append(" what:").append(l).append(" extra:").append(i1).toString());
                mediaplayer1.release();
                Sounds.a(b).remove(Integer.valueOf(a));
                return true;
            }

            
            {
                b = Sounds.this;
                a = i;
                super();
            }
        });
        mediaplayer.setDataSource(d, uri);
        mediaplayer.setAudioStreamType(j);
        mediaplayer.setLooping(flag);
        mediaplayer.prepare();
        if (DeviceFeatures.b())
        {
            int k = b.getStreamVolume(1);
            b.setStreamVolume(j, k, 0);
        }
        mediaplayer.setVolume(1.0F, 1.0F);
        if (e.containsKey(Integer.valueOf(i)))
        {
            break MISSING_BLOCK_LABEL_170;
        }
        mediaplayer.release();
        a.info("Almost leaked a sound!");
        return true;
        try
        {
            mediaplayer.start();
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            a.severe((new StringBuilder("playThroughMediaPlayer():")).append(message.toString()).toString());
            return true;
        }
        return true;
        return false;
    }

}
