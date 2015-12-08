// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.media.SoundPool;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.millennialmedia.android:
//            BridgeMMMedia

private abstract class soundPool
{

    private static final int TEST_PERIOD_MS = 100;
    private ArrayList sampleIds;
    private SoundPool soundPool;
    final timer this$0;
    private Timer timer;

    abstract void onLoadComplete(SoundPool soundpool, int i, int j);

    void release()
    {
        this;
        JVM INSTR monitorenter ;
        if (timer != null)
        {
            timer.cancel();
            timer.purge();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void testSample(int i)
    {
        this;
        JVM INSTR monitorenter ;
        sampleIds.add(Integer.valueOf(i));
        if (sampleIds.size() == 1)
        {
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {

                final BridgeMMMedia.Audio.OnLoadCompleteListener this$1;

                public void run()
                {
                    ArrayList arraylist = new ArrayList();
                    Iterator iterator = sampleIds.iterator();
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        Integer integer = (Integer)iterator.next();
                        int j = soundPool.play(integer.intValue(), 0.0F, 0.0F, 0, 0, 1.0F);
                        if (j != 0)
                        {
                            soundPool.stop(j);
                            onLoadComplete(soundPool, integer.intValue(), 0);
                            arraylist.add(integer);
                        }
                    } while (true);
                    sampleIds.removeAll(arraylist);
                    if (sampleIds.size() == 0)
                    {
                        timer.cancel();
                        timer.purge();
                    }
                }

            
            {
                this$1 = BridgeMMMedia.Audio.OnLoadCompleteListener.this;
                super();
            }
            }, 0L, 100L);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }




    public _cls1.this._cls1(SoundPool soundpool)
    {
        this$0 = this._cls0.this;
        super();
        sampleIds = new ArrayList();
        soundPool = soundpool;
    }
}
