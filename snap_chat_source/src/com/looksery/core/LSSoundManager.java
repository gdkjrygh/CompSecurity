// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.looksery.core;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.looksery.core:
//            LSCoreManagerWrapper

public class LSSoundManager
{

    private static final boolean DEBUG = false;
    private static final int INFINITY_LOOP_COUNT = 0x40000000;
    private static final String TAG = com/looksery/core/LSSoundManager.getName();
    private static boolean sIsMuted;
    private static final HashMap sMediaPlayers = new HashMap();
    private static final ExecutorService sThreadPoolExecutor = Executors.newCachedThreadPool();

    public LSSoundManager()
    {
    }

    private static MediaPlayer createMediaPlayer(String s)
    {
        Object obj = null;
        MediaPlayer mediaplayer;
        String as[];
        mediaplayer = new MediaPlayer();
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            mediaplayer.setAudioAttributes((new android.media.AudioAttributes.Builder()).build());
        }
        as = s.split(":");
        if (!"asset:".startsWith(as[0])) goto _L2; else goto _L1
_L1:
        s = LSCoreManagerWrapper.getAssetsManger().openFd(as[1]);
        mediaplayer.setDataSource(s.getFileDescriptor(), s.getStartOffset(), s.getLength());
_L4:
        mediaplayer.prepare();
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return mediaplayer;
            }
        }
        return mediaplayer;
_L2:
        if (!"file:".startsWith(as[0]))
        {
            break; /* Loop/switch isn't completed */
        }
        mediaplayer.setDataSource((new StringBuilder("file://")).append(as[1]).toString());
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
        throw new RuntimeException((new StringBuilder("File source not supported: ")).append(as[0]).append(" for file: ").append(s).toString());
        s;
        s = null;
_L11:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
_L5:
        return null;
        s;
        s = null;
_L9:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
          goto _L5
        s;
        s = null;
_L8:
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
          goto _L5
        s;
_L7:
        if (obj != null)
        {
            try
            {
                ((AssetFileDescriptor) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw s;
        Exception exception;
        exception;
        obj = s;
        s = exception;
        continue; /* Loop/switch isn't completed */
        exception;
        obj = s;
        s = exception;
        if (true) goto _L7; else goto _L6
_L6:
        Object obj1;
        obj1;
          goto _L8
        obj1;
          goto _L8
        obj1;
          goto _L9
        obj1;
          goto _L9
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static boolean isPlaying(String s)
    {
        com/looksery/core/LSSoundManager;
        JVM INSTR monitorenter ;
        boolean flag = sMediaPlayers.containsKey(s);
        com/looksery/core/LSSoundManager;
        JVM INSTR monitorexit ;
        return flag;
        s;
        throw s;
    }

    private static void pauseSounds()
    {
        com/looksery/core/LSSoundManager;
        JVM INSTR monitorenter ;
        Iterator iterator = sMediaPlayers.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MediaPlayer mediaplayer = (MediaPlayer)iterator.next();
            if (mediaplayer.isPlaying())
            {
                mediaplayer.pause();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_54;
        Exception exception;
        exception;
        throw exception;
        com/looksery/core/LSSoundManager;
        JVM INSTR monitorexit ;
    }

    public static void play(String s, int i)
    {
        boolean flag = false;
        com/looksery/core/LSSoundManager;
        JVM INSTR monitorenter ;
        MediaPlayer mediaplayer;
        if (sMediaPlayers.containsKey(s))
        {
            stop(s, false);
        }
        mediaplayer = createMediaPlayer(s);
        if (mediaplayer != null)
        {
            if (i > 0)
            {
                flag = true;
            }
            try
            {
                mediaplayer.setLooping(flag);
                mediaplayer.setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener(i, s) {

                    private int a;
                    private int b;
                    private String c;

                    public final void onCompletion(MediaPlayer mediaplayer1)
                    {
                        if (b == 0x40000000)
                        {
                            return;
                        }
                        if (a < b)
                        {
                            a = a + 1;
                            return;
                        } else
                        {
                            LSSoundManager.stop(c, false);
                            return;
                        }
                    }

            
            {
                b = i;
                c = s;
                super();
                a = 0;
            }
                });
                mediaplayer.setOnErrorListener(new android.media.MediaPlayer.OnErrorListener(s) {

                    private String a;

                    public final boolean onError(MediaPlayer mediaplayer1, int j, int k)
                    {
                        LSSoundManager.stop(a, false);
                        return true;
                    }

            
            {
                a = s;
                super();
            }
                });
                if (!sIsMuted)
                {
                    mediaplayer.start();
                }
                sMediaPlayers.put(s, mediaplayer);
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            finally
            {
                com/looksery/core/LSSoundManager;
            }
        }
        com/looksery/core/LSSoundManager;
        JVM INSTR monitorexit ;
        return;
        throw s;
    }

    public static void setIsMuted(boolean flag)
    {
        com/looksery/core/LSSoundManager;
        JVM INSTR monitorenter ;
        boolean flag1 = sIsMuted;
        if (flag1 != flag) goto _L2; else goto _L1
_L1:
        com/looksery/core/LSSoundManager;
        JVM INSTR monitorexit ;
        return;
_L2:
        sIsMuted = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        pauseSounds();
          goto _L1
        Exception exception;
        exception;
        throw exception;
        startSounds();
          goto _L1
    }

    private static void startSounds()
    {
        com/looksery/core/LSSoundManager;
        JVM INSTR monitorenter ;
        Iterator iterator = sMediaPlayers.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            MediaPlayer mediaplayer = (MediaPlayer)iterator.next();
            if (!mediaplayer.isPlaying())
            {
                mediaplayer.start();
            }
        } while (true);
        break MISSING_BLOCK_LABEL_54;
        Exception exception;
        exception;
        throw exception;
        com/looksery/core/LSSoundManager;
        JVM INSTR monitorexit ;
    }

    public static void stop(String s, boolean flag)
    {
        com/looksery/core/LSSoundManager;
        JVM INSTR monitorenter ;
        s = (MediaPlayer)sMediaPlayers.remove(s);
        if (s != null) goto _L2; else goto _L1
_L1:
        com/looksery/core/LSSoundManager;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (sIsMuted)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        sThreadPoolExecutor.execute(new Runnable(s) {

            private MediaPlayer a;

            public final void run()
            {
                float f = 1.0F;
                do
                {
                    f -= 0.1F;
                    if (f > 0.0F)
                    {
                        a.setVolume(f, f);
                        SystemClock.sleep(50L);
                    } else
                    {
                        a.stop();
                        a.release();
                        return;
                    }
                } while (true);
            }

            
            {
                a = mediaplayer;
                super();
            }
        });
          goto _L1
        s;
        throw s;
        s.stop();
        s.release();
          goto _L1
    }

    public static void stopAll()
    {
        com/looksery/core/LSSoundManager;
        JVM INSTR monitorenter ;
        boolean flag = sMediaPlayers.isEmpty();
        if (!flag) goto _L2; else goto _L1
_L1:
        com/looksery/core/LSSoundManager;
        JVM INSTR monitorexit ;
        return;
_L2:
        MediaPlayer mediaplayer;
        for (Iterator iterator = sMediaPlayers.values().iterator(); iterator.hasNext(); mediaplayer.release())
        {
            mediaplayer = (MediaPlayer)iterator.next();
            mediaplayer.stop();
        }

        break MISSING_BLOCK_LABEL_66;
        Exception exception;
        exception;
        throw exception;
        sMediaPlayers.clear();
          goto _L1
    }

}
