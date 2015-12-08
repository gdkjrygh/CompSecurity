// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzp, zze, zzz, zzae, 
//            f

public class zzy extends zzp
{
    private static class a
        implements zzp.zza
    {

        private final zze a;
        private final zzz b = new zzz();

        public zzz a()
        {
            return b;
        }

        public void zzc(String s, int i)
        {
            if ("ga_dispatchPeriod".equals(s))
            {
                b.zzIb = i;
                return;
            } else
            {
                a.zzgH().zzd("Int xml configuration name not recognized", s);
                return;
            }
        }

        public void zzc(String s, boolean flag)
        {
            if ("ga_dryRun".equals(s))
            {
                s = b;
                int i;
                if (flag)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                s.zzIc = i;
                return;
            } else
            {
                a.zzgH().zzd("Bool xml configuration name not recognized", s);
                return;
            }
        }

        public f zzhO()
        {
            return a();
        }

        public void zzj(String s, String s1)
        {
        }

        public void zzk(String s, String s1)
        {
            if ("ga_appName".equals(s))
            {
                b.zzHY = s1;
                return;
            }
            if ("ga_appVersion".equals(s))
            {
                b.zzHZ = s1;
                return;
            }
            if ("ga_logLevel".equals(s))
            {
                b.zzIa = s1;
                return;
            } else
            {
                a.zzgH().zzd("String xml configuration name not recognized", s);
                return;
            }
        }

        public a(zze zze1)
        {
            a = zze1;
        }
    }


    public zzy(zze zze)
    {
        super(zze, new a(zze));
    }
}
