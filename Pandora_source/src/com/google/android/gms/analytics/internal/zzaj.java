// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzp, zze, zzc, zzak, 
//            f

public class zzaj extends zzp
{
    private static class a extends zzc
        implements zzp.zza
    {

        private final zzak a = new zzak();

        public zzak a()
        {
            return a;
        }

        public void zzc(String s, int i)
        {
            if ("ga_sessionTimeout".equals(s))
            {
                a.zzIJ = i;
                return;
            } else
            {
                zzd("int configuration name not recognized", s);
                return;
            }
        }

        public void zzc(String s, boolean flag)
        {
            boolean flag1 = true;
            boolean flag2 = true;
            int i = 1;
            if ("ga_autoActivityTracking".equals(s))
            {
                s = a;
                if (!flag)
                {
                    i = 0;
                }
                s.zzIK = i;
                return;
            }
            if ("ga_anonymizeIp".equals(s))
            {
                s = a;
                int j;
                if (flag)
                {
                    j = ((flag1) ? 1 : 0);
                } else
                {
                    j = 0;
                }
                s.zzIL = j;
                return;
            }
            if ("ga_reportUncaughtExceptions".equals(s))
            {
                s = a;
                int k;
                if (flag)
                {
                    k = ((flag2) ? 1 : 0);
                } else
                {
                    k = 0;
                }
                s.zzIM = k;
                return;
            } else
            {
                zzd("bool configuration name not recognized", s);
                return;
            }
        }

        public f zzhO()
        {
            return a();
        }

        public void zzj(String s, String s1)
        {
            a.zzIN.put(s, s1);
        }

        public void zzk(String s, String s1)
        {
            if ("ga_trackingId".equals(s))
            {
                a.zzEm = s1;
                return;
            }
            if ("ga_sampleFrequency".equals(s))
            {
                try
                {
                    a.zzII = Double.parseDouble(s1);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    zzc("Error parsing ga_sampleFrequency value", s1, s);
                }
                return;
            } else
            {
                zzd("string configuration name not recognized", s);
                return;
            }
        }

        public a(zze zze)
        {
            super(zze);
        }
    }


    public zzaj(zze zze)
    {
        super(zze, new a(zze));
    }
}
