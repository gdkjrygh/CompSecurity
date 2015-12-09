// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.playlog.internal;

import com.google.android.gms.common.internal.zzv;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.playlog.internal:
//            PlayLoggerContext, LogEvent

public class zzb
{
    public static class zza
    {

        public final PlayLoggerContext zzayw;
        public final LogEvent zzayx;
        public final com.google.android.gms.internal.zzoc.zzd zzayy;

        private zza(PlayLoggerContext playloggercontext, LogEvent logevent)
        {
            zzayw = (PlayLoggerContext)zzv.zzr(playloggercontext);
            zzayx = (LogEvent)zzv.zzr(logevent);
            zzayy = null;
        }

    }


    private final ArrayList zzayu;
    private int zzayv;

    public zzb()
    {
        this(100);
    }

    public zzb(int i)
    {
        zzayu = new ArrayList();
        zzayv = i;
    }

    private void zzvs()
    {
        for (; getSize() > getCapacity(); zzayu.remove(0)) { }
    }

    public void clear()
    {
        zzayu.clear();
    }

    public int getCapacity()
    {
        return zzayv;
    }

    public int getSize()
    {
        return zzayu.size();
    }

    public boolean isEmpty()
    {
        return zzayu.isEmpty();
    }

    public void zza(PlayLoggerContext playloggercontext, LogEvent logevent)
    {
        zzayu.add(new zza(playloggercontext, logevent));
        zzvs();
    }

    public ArrayList zzvr()
    {
        return zzayu;
    }
}
