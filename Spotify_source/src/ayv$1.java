// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer.ExoPlaybackException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

final class d.os.Handler extends Handler
{

    private ayv a;

    public final void handleMessage(Message message)
    {
        Object obj = a;
        message.what;
        JVM INSTR tableswitch 1 4: default 40
    //                   1 41
    //                   2 111
    //                   3 161
    //                   4 205;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        boolean aflag[] = (boolean[])message.obj;
        System.arraycopy(aflag, 0, ((ayv) (obj)).b, 0, aflag.length);
        obj.d = message.arg1;
        message = ((ayv) (obj)).a.iterator();
        while (message.hasNext()) 
        {
            ((ayu)message.next()).a(((ayv) (obj)).c, ((ayv) (obj)).d);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        obj.d = message.arg1;
        message = ((ayv) (obj)).a.iterator();
        while (message.hasNext()) 
        {
            ((ayu)message.next()).a(((ayv) (obj)).c, ((ayv) (obj)).d);
        }
        if (true) goto _L1; else goto _L4
_L4:
        obj.e = ((ayv) (obj)).e - 1;
        if (((ayv) (obj)).e == 0)
        {
            message = ((ayv) (obj)).a.iterator();
            while (message.hasNext()) 
            {
                message.next();
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        message = (ExoPlaybackException)message.obj;
        obj = ((ayv) (obj)).a.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            ((ayu)((Iterator) (obj)).next()).a(message);
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    (ayv ayv1)
    {
        a = ayv1;
        super();
    }
}
