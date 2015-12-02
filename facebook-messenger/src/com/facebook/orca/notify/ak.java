// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Vibrator;
import com.facebook.debug.log.b;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.facebook.orca.notify:
//            an, al, c

public class ak
{

    private static final Class a = com/facebook/orca/notify/ak;
    private static final long b[] = {
        0L, 100L
    };
    private static final long c[] = {
        0L, 250L, 200L, 250L
    };
    private final Context d;
    private final Vibrator e;
    private final AudioManager f;
    private final an g;

    public ak(Context context, Vibrator vibrator, AudioManager audiomanager, an an1)
    {
        d = context;
        e = vibrator;
        f = audiomanager;
        g = an1;
    }

    private void a(boolean flag)
    {
label0:
        {
            if (g.a())
            {
                if (flag)
                {
                    break label0;
                }
                com.facebook.debug.log.b.b(a, "Vibrating short");
                e.vibrate(b, -1);
            }
            return;
        }
        com.facebook.debug.log.b.b(a, "Vibrating normal");
        e.vibrate(c, -1);
    }

    private boolean a()
    {
        return f.getStreamVolume(2) > 0;
    }

    private void b()
    {
        MediaPlayer mediaplayer;
        Uri uri;
        try
        {
            uri = c();
        }
        catch (Throwable throwable)
        {
            com.facebook.debug.log.b.b(a, "MediaPlayer create failed: ", throwable);
            return;
        }
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        mediaplayer = new MediaPlayer();
        mediaplayer.setDataSource(d, uri);
_L2:
        mediaplayer.setAudioStreamType(2);
        mediaplayer.setOnCompletionListener(new al(this));
        mediaplayer.prepare();
        mediaplayer.start();
        return;
        mediaplayer = MediaPlayer.create(d, 1);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private Uri c()
    {
        Object obj = g.d();
        if (obj != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        String s = ((Uri) (obj)).getScheme();
        if (s == null || s.equals("file"))
        {
            if (!(new File(((Uri) (obj)).getPath())).exists())
            {
                obj = null;
            }
            return ((Uri) (obj));
        }
        AssetFileDescriptor assetfiledescriptor = d.getContentResolver().openAssetFileDescriptor(((Uri) (obj)), "r");
        if (assetfiledescriptor == null)
        {
            if (assetfiledescriptor != null)
            {
                try
                {
                    assetfiledescriptor.close();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return null;
                }
                return null;
            }
        } else
        {
            Object obj1;
            Exception exception;
            if (assetfiledescriptor != null)
            {
                try
                {
                    assetfiledescriptor.close();
                }
                catch (IOException ioexception1) { }
            }
            return ((Uri) (obj));
        }
          goto _L1
        obj1;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                return null;
            }
        }
          goto _L1
        obj1;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                return null;
            }
        }
          goto _L1
        obj1;
        if (true) goto _L1; else goto _L3
_L3:
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            return null;
        }
        exception;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            catch (IOException ioexception) { }
        }
        throw exception;
    }

    public void a(Notification notification, c c1)
    {
        boolean flag = g.b();
        boolean flag1 = g.a();
        boolean flag2 = g.c();
        if (flag && !c1.b())
        {
            Uri uri = c();
            if (uri != null)
            {
                notification.sound = uri;
            } else
            {
                notification.defaults = notification.defaults | 1;
            }
            c1.c();
        }
        if (flag1 && !c1.d())
        {
            notification.vibrate = (new long[] {
                0L, 200L, 200L, 200L
            });
            c1.e();
        }
        if (flag2 && !c1.l())
        {
            notification.ledARGB = 0xff00ff00;
            notification.ledOnMS = 300;
            notification.ledOffMS = 1000;
            notification.flags = notification.flags | 1;
            c1.m();
        }
    }

    public void a(c c1)
    {
        if (g.b() && a())
        {
            b();
            c1.c();
        }
    }

    public void b(c c1)
    {
        a(false);
        c1.e();
    }

    public void c(c c1)
    {
        a(true);
        c1.e();
    }

}
