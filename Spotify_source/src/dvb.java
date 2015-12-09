// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.media.AudioManager;
import com.spotify.music.internal.receiver.MediaButtonReceiver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dvb
{

    public static final boolean a;
    public final List b = new ArrayList();
    public ComponentName c;
    public boolean d;
    public final AudioManager e;
    private final Context f;
    private final android.media.AudioManager.OnAudioFocusChangeListener g = new android.media.AudioManager.OnAudioFocusChangeListener() {

        private dvb a;

        public final void onAudioFocusChange(int i)
        {
            i;
            JVM INSTR tableswitch -3 1: default 36
        //                       -3 185
        //                       -2 135
        //                       -1 85
        //                       0 36
        //                       1 37;
               goto _L1 _L2 _L3 _L4 _L1 _L5
_L1:
            return;
_L5:
            dvb.a(a, true);
            Iterator iterator = dvb.a(a).iterator();
            while (iterator.hasNext()) 
            {
                ((dvc)iterator.next()).c();
            }
            continue; /* Loop/switch isn't completed */
_L4:
            dvb.a(a, false);
            Iterator iterator1 = dvb.a(a).iterator();
            while (iterator1.hasNext()) 
            {
                ((dvc)iterator1.next()).a(false, false);
            }
            if (true) goto _L1; else goto _L3
_L3:
            dvb.a(a, false);
            Iterator iterator2 = dvb.a(a).iterator();
            while (iterator2.hasNext()) 
            {
                ((dvc)iterator2.next()).a(true, false);
            }
            if (true)
            {
                continue; /* Loop/switch isn't completed */
            }
_L2:
            dvb.a(a, false);
            Iterator iterator3 = dvb.a(a).iterator();
            while (iterator3.hasNext()) 
            {
                ((dvc)iterator3.next()).a(true, true);
            }
            if (true) goto _L1; else goto _L6
_L6:
        }

            
            {
                a = dvb.this;
                super();
            }
    };

    public dvb(Context context)
    {
        ctz.a(context);
        d = false;
        f = context;
        e = (AudioManager)context.getSystemService("audio");
    }

    static List a(dvb dvb1)
    {
        return dvb1.b;
    }

    static boolean a(dvb dvb1, boolean flag)
    {
        dvb1.d = flag;
        return flag;
    }

    public final void a(dvc dvc1)
    {
        ctz.a(dvc1);
        b.add(dvc1);
    }

    public final boolean a()
    {
        boolean flag = true;
        if (d)
        {
            return true;
        }
        if (e.requestAudioFocus(g, 3, 1) != 1)
        {
            flag = false;
        }
        d = flag;
        if (d)
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); ((dvc)iterator.next()).c()) { }
        }
        return d;
    }

    public final void b()
    {
        if (d)
        {
            d = false;
            e.abandonAudioFocus(g);
            Iterator iterator = b.iterator();
            while (iterator.hasNext()) 
            {
                ((dvc)iterator.next()).a(false, false);
            }
        }
    }

    public final void c()
    {
        if (a && c == null)
        {
            c = new ComponentName(f.getPackageName(), com/spotify/music/internal/receiver/MediaButtonReceiver.getName());
            e.registerMediaButtonEventReceiver(c);
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((dvc)iterator.next()).a()) { }
    }

    static 
    {
        boolean flag;
        if (gcl.c && !dvq.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
