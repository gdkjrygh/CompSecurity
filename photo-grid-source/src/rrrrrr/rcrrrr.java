// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import android.os.Handler;
import com.immersion.hapticmediasdk.controllers.HapticPlaybackThread;
import com.immersion.hapticmediasdk.controllers.MediaController;

public class rcrrrr
    implements Runnable
{

    public static int b041504150415041504150415 = 1;
    public static int b041504150415041504150415 = 92;
    public static int b041504150415041504150415 = 0;
    public static int b041504150415041504150415 = 2;
    public final MediaController b041704170417041704170417;

    public rcrrrr(MediaController mediacontroller)
    {
        if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = 15;
            b041504150415041504150415 = 7;
        }
        try
        {
            b041704170417041704170417 = mediacontroller;
        }
        // Misplaced declaration of an exception variable
        catch (MediaController mediacontroller)
        {
            throw mediacontroller;
        }
        try
        {
            super();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediaController mediacontroller)
        {
            throw mediacontroller;
        }
    }

    public static int b041504150415041504150415()
    {
        return 6;
    }

    public void run()
    {
        if (b041704170417041704170417.isPlaying() && MediaController.b043B043B043B043B043B043B(b041704170417041704170417) != null)
        {
            MediaController.b043B043B043B043B043B043B(b041704170417041704170417).syncUpdate(b041704170417041704170417.getCurrentPosition(), b041704170417041704170417.getReferenceTimeForCurrentPosition());
            MediaController mediacontroller = b041704170417041704170417;
            int i = b041504150415041504150415;
            switch ((i * (b041504150415041504150415 + i)) % b041504150415041504150415)
            {
            default:
                b041504150415041504150415 = b041504150415041504150415();
                b041504150415041504150415 = 99;
                // fall through

            case 0: // '\0'
                MediaController.b043B043B043B043B043B043B(mediacontroller).getHandler().removeCallbacks(this);
                break;
            }
            MediaController.b043B043B043B043B043B043B(b041704170417041704170417).getHandler().postDelayed(this, 1000L);
        }
    }
}
