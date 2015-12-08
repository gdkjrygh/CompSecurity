// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.immersion.hapticmediasdk.controllers.FileReaderFactory;
import com.immersion.hapticmediasdk.controllers.HapticPlaybackThread;
import com.immersion.hapticmediasdk.controllers.IHapticFileReader;

// Referenced classes of package rrrrrr:
//            rrcrrr

public class rccrrr extends Handler
{

    public static int b042704270427042704270427 = 16;
    public static int b042704270427042704270427 = 1;
    public static int b042704270427042704270427;
    public final HapticPlaybackThread b044404440444044404440444;

    private rccrrr(HapticPlaybackThread hapticplaybackthread)
    {
        do
        {
        } while (true);
    }

    public rccrrr(HapticPlaybackThread hapticplaybackthread, rrcrrr rrcrrr)
    {
        this(hapticplaybackthread);
    }

    public static int b044604460446044604460446()
    {
        return 85;
    }

    public static int b042704270427042704270427()
    {
        return 2;
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 9: default 56
    //                   1 57
    //                   2 115
    //                   3 140
    //                   4 242
    //                   5 252
    //                   6 56
    //                   7 56
    //                   8 260
    //                   9 269;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L1 _L1 _L7 _L8
_L1:
        return;
_L2:
        HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444).removeCallbacks(HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444));
        HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444, message.arg1);
        HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444, message.arg2);
        HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444, 0);
        HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444);
        return;
_L3:
        message = message.getData();
        HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444, message.getInt("playback_timecode"), message.getLong("playback_uptime"));
        return;
_L4:
        if (HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444) == null)
        {
            HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444, FileReaderFactory.getHapticFileReaderInstance(HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444), HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444)));
        }
        if (HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444) != null && HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444) == 0)
        {
            HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444, HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444).getBlockSizeMS());
        }
        if (HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444) != null)
        {
            HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444).setBytesAvailable(message.arg1);
            return;
        }
          goto _L1
_L5:
        HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444);
        do
        {
        } while (true);
_L6:
        HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444);
        return;
_L7:
        HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444, message);
        return;
_L8:
        HapticPlaybackThread.b041104110411041104110411(b044404440444044404440444);
        return;
    }
}
