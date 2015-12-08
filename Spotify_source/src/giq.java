// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.HashMap;
import java.util.Map;

public class giq
    implements dmx
{

    private final String a;
    private final Map b;

    public giq()
    {
        this("spotify_preferences");
    }

    private giq(String s)
    {
        b = new HashMap();
        a = s;
    }

    private gin a(Context context, String s)
    {
        this;
        JVM INSTR monitorenter ;
        gin gin2 = (gin)b.get(s);
        gin gin1;
        gin1 = gin2;
        if (gin2 != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        gin1 = new gin(context.getApplicationContext(), s);
        Logger.a("Using prefs implementation: %s", new Object[] {
            gin1.getClass().getCanonicalName()
        });
        b.put(s, gin1);
        this;
        JVM INSTR monitorexit ;
        return gin1;
        context;
        throw context;
    }

    public final gin a(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        context = a(context, a);
        this;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public final gin b(Context context)
    {
        this;
        JVM INSTR monitorenter ;
        context = a(context, a);
        this;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    // Unreferenced inner class giq$1

/* anonymous class */
    public final class _cls1 extends Thread
    {

        private gin a;

        public final void run()
        {
            a.a();
        }

            public 
            {
                a = gin1;
                super(s);
            }
    }

}
