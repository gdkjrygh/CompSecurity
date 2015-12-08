// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.SystemClock;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzb, zzs

public class zzv
    implements com.google.android.gms.internal.zzb
{
    static class zza
    {

        public long zzaB;
        public String zzaC;
        public String zzb;
        public long zzc;
        public long zzd;
        public long zze;
        public long zzf;
        public Map zzg;

        public static zza zzf(InputStream inputstream)
            throws IOException
        {
            zza zza1 = new zza();
            if (zzv.zzb(inputstream) != 0x20150306)
            {
                throw new IOException();
            }
            zza1.zzaC = zzv.zzd(inputstream);
            zza1.zzb = zzv.zzd(inputstream);
            if (zza1.zzb.equals(""))
            {
                zza1.zzb = null;
            }
            zza1.zzc = zzv.zzc(inputstream);
            zza1.zzd = zzv.zzc(inputstream);
            zza1.zze = zzv.zzc(inputstream);
            zza1.zzf = zzv.zzc(inputstream);
            zza1.zzg = zzv.zze(inputstream);
            return zza1;
        }

        public boolean zza(OutputStream outputstream)
        {
            zzv.zza(outputstream, 0x20150306);
            zzv.zza(outputstream, zzaC);
            if (zzb != null)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            String s = "";
_L1:
            try
            {
                zzv.zza(outputstream, s);
                zzv.zza(outputstream, zzc);
                zzv.zza(outputstream, zzd);
                zzv.zza(outputstream, zze);
                zzv.zza(outputstream, zzf);
                zzv.zza(zzg, outputstream);
                outputstream.flush();
            }
            // Misplaced declaration of an exception variable
            catch (OutputStream outputstream)
            {
                zzs.zzb("%s", new Object[] {
                    outputstream.toString()
                });
                return false;
            }
            return true;
            s = zzb;
              goto _L1
        }

        public zzb.zza zzb(byte abyte0[])
        {
            zzb.zza zza1 = new zzb.zza();
            zza1.data = abyte0;
            zza1.zzb = zzb;
            zza1.zzc = zzc;
            zza1.zzd = zzd;
            zza1.zze = zze;
            zza1.zzf = zzf;
            zza1.zzg = zzg;
            return zza1;
        }

        private zza()
        {
        }

        public zza(String s, zzb.zza zza1)
        {
            zzaC = s;
            zzaB = zza1.data.length;
            zzb = zza1.zzb;
            zzc = zza1.zzc;
            zzd = zza1.zzd;
            zze = zza1.zze;
            zzf = zza1.zzf;
            zzg = zza1.zzg;
        }
    }

    private static class zzb extends FilterInputStream
    {

        private int zzaD;

        static int zza(zzb zzb1)
        {
            return zzb1.zzaD;
        }

        public int read()
            throws IOException
        {
            int i = super.read();
            if (i != -1)
            {
                zzaD = zzaD + 1;
            }
            return i;
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            i = super.read(abyte0, i, j);
            if (i != -1)
            {
                zzaD = zzaD + i;
            }
            return i;
        }

        private zzb