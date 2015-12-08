// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rrrrrr;

import com.immersion.hapticmediasdk.MediaPlaybackSDK;
import com.immersion.hapticmediasdk.utils.Log;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class rrccrr
    implements Runnable
{

    private static final String a = "ValidateURL";
    public static int b044A044A044A044A044A044A = 2;
    public static int b044A044A044A044A044A044A = 24;
    public static int b044A044A044A044A044A044A = 1;
    private URL b;
    public final MediaPlaybackSDK b042504250425042504250425;

    public rrccrr(MediaPlaybackSDK mediaplaybacksdk, String s)
    {
        b042504250425042504250425 = mediaplaybacksdk;
        do
        {
        } while (true);
    }

    private void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        MediaPlaybackSDK.b043B043B043B043B043B043B(b042504250425042504250425, i);
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static int b044A044A044A044A044A044A()
    {
        return 6;
    }

    public void run()
    {
        HttpURLConnection httpurlconnection;
        httpurlconnection = (HttpURLConnection)b.openConnection();
        httpurlconnection.setConnectTimeout(10000);
        httpurlconnection.setReadTimeout(10000);
        httpurlconnection.setUseCaches(false);
        int i = b044A044A044A044A044A044A;
        switch ((i * (b044A044A044A044A044A044A + i)) % b044A044A044A044A044A044A)
        {
        default:
            b044A044A044A044A044A044A = 0;
            b044A044A044A044A044A044A = b044A044A044A044A044A044A();
            break;

        case 0: // '\0'
            break;
        }
        int j;
        httpurlconnection.setRequestMethod("HEAD");
        j = httpurlconnection.getResponseCode();
        Object obj;
        try
        {
            a(j);
            return;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        obj;
        Log.e("ValidateURL", ((IOException) (obj)).getMessage());
        try
        {
            a(500);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj;
        a(500);
        throw obj;
    }
}
