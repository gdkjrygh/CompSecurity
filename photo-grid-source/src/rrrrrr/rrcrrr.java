// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import com.immersion.hapticmediasdk.controllers.HapticPlaybackThread;

public class rrcrrr
    implements Runnable
{

    public static int b041504150415041504150415 = 1;
    public static int b041504150415041504150415 = 2;
    public static int b041504150415041504150415 = 2;
    public static int b041504150415041504150415;
    public final HapticPlaybackThread b041704170417041704170417;

    public rrcrrr(HapticPlaybackThread hapticplaybackthread)
    {
        int i = b041504150415041504150415;
        switch ((i * (b041504150415041504150415 + i)) % b041504150415041504150415)
        {
        default:
            b041504150415041504150415 = b041504150415041504150415();
            b041504150415041504150415 = b041504150415041504150415();
            // fall through

        case 0: // '\0'
            b041704170417041704170417 = hapticplaybackthread;
            break;
        }
        super();
    }

    public static int b041504150415041504150415()
    {
        return 54;
    }

    public void run()
    {
        HapticPlaybackThread.b041104110411041104110411(b041704170417041704170417);
    }
}
