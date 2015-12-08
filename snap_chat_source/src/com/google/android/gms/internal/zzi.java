// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            zzh, zzm, zzo, zzq, 
//            zzn

public abstract class zzi extends zzh
{
    static class zza extends Exception
    {

        public zza()
        {
        }

        public zza(Throwable throwable)
        {
            super(throwable);
        }
    }


    private static long startTime = 0L;
    private static Method zzkA;
    private static Method zzkB;
    private static Method zzkC;
    private static Method zzkD;
    private static Method zzkE;
    private static Method zzkF;
    private static Method zzkG;
    private static Method zzkH;
    private static String zzkI;
    private static String zzkJ;
    private static String zzkK;
    private static zzo zzkL;
    static boolean zzkM = false;
    private static Method zzkz;

    protected zzi(Context context, zzm zzm1, zzn zzn)
    {
        super(context, zzm1, zzn);
    }

    static String zza(Context context, zzm zzm1)
    {
        if (zzkJ != null)
        {
            return zzkJ;
        }
        if (zzkC == null)
        {
            throw new zza();
        }
        try
        {
            context = (ByteBuffer)zzkC.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new zza();
        context = zzm1.zza(context.array(), true);
        zzkJ = context;
        return context;
    }

    static ArrayList zza(MotionEvent motionevent, DisplayMetrics displaymetrics)
    {
        if (zzkD == null || motionevent == null)
        {
            throw new zza();
        }
        try
        {
            motionevent = (ArrayList)zzkD.invoke(null, new Object[] {
                motionevent, displaymetrics
            });
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw new zza(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            throw new zza(motionevent);
        }
        return motionevent;
    }

    protected static void zza(String s, Context context, zzm zzm1)
    {
        com/google/android/gms/internal/zzi;
        JVM INSTR monitorenter ;
        boolean flag = zzkM;
        if (!flag)
        {
            try
            {
                zzkL = new zzo(zzm1, null);
                zzkI = s;
                zzg(context);
                startTime = zzw().longValue();
                zzkM = true;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            finally
            {
                com/google/android/gms/internal/zzi;
            }
        }
        com/google/android/gms/internal/zzi;
        JVM INSTR monitorexit ;
        return;
        throw s;
    }

    static String zzb(Context context, zzm zzm1)
    {
        if (zzkK != null)
        {
            return zzkK;
        }
        if (zzkF == null)
        {
            throw new zza();
        }
        try
        {
            context = (ByteBuffer)zzkF.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new zza();
        context = zzm1.zza(context.array(), true);
        zzkK = context;
        return context;
    }

    private static String zzb(byte abyte0[], String s)
    {
        try
        {
            abyte0 = new String(zzkL.zzc(abyte0, s), "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new zza(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new zza(abyte0);
        }
        return abyte0;
    }

    static String zzd(Context context)
    {
        if (zzkE == null)
        {
            throw new zza();
        }
        try
        {
            context = (String)zzkE.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new zza();
        return context;
    }

    static ArrayList zze(Context context)
    {
        if (zzkG == null)
        {
            throw new zza();
        }
        try
        {
            context = (ArrayList)zzkG.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        if (context.size() == 2)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        throw new zza();
        return context;
    }

    static int[] zzf(Context context)
    {
        if (zzkH == null)
        {
            throw new zza();
        }
        try
        {
            context = (int[])zzkH.invoke(null, new Object[] {
                context
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        return context;
    }

    private static void zzg(Context context)
    {
        File file;
        File file1;
        byte abyte0[];
        String s;
        byte abyte1[];
        Class class1;
        Object obj;
        Class class2;
        Class class3;
        Class class4;
        Class class5;
        Class class6;
        Object obj1;
        try
        {
            abyte0 = zzkL.zzb(zzq.getKey());
            abyte1 = zzkL.zzc(abyte0, zzq.zzE());
            file1 = context.getCacheDir();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new zza(context);
        }
        file = file1;
        if (file1 != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        file1 = context.getDir("dex", 0);
        file = file1;
        if (file1 != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new zza();
        file1 = File.createTempFile("ads", ".jar", file);
        obj = new FileOutputStream(file1);
        ((FileOutputStream) (obj)).write(abyte1, 0, abyte1.length);
        ((FileOutputStream) (obj)).close();
        obj1 = new DexClassLoader(file1.getAbsolutePath(), file.getAbsolutePath(), null, context.getClassLoader());
        context = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzH()));
        class1 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzT()));
        obj = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzN()));
        class2 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzL()));
        class3 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzV()));
        class4 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzJ()));
        class5 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzR()));
        class6 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzP()));
        obj1 = ((DexClassLoader) (obj1)).loadClass(zzb(abyte0, zzq.zzF()));
        zzkz = context.getMethod(zzb(abyte0, zzq.zzI()), new Class[0]);
        zzkA = class1.getMethod(zzb(abyte0, zzq.zzU()), new Class[0]);
        zzkB = ((Class) (obj)).getMethod(zzb(abyte0, zzq.zzO()), new Class[0]);
        zzkC = class2.getMethod(zzb(abyte0, zzq.zzM()), new Class[] {
            android/content/Context
        });
        zzkD = class3.getMethod(zzb(abyte0, zzq.zzW()), new Class[] {
            android/view/MotionEvent, android/util/DisplayMetrics
        });
        zzkE = class4.getMethod(zzb(abyte0, zzq.zzK()), new Class[] {
            android/content/Context
        });
        zzkF = class5.getMethod(zzb(abyte0, zzq.zzS()), new Class[] {
            android/content/Context
        });
        zzkG = class6.getMethod(zzb(abyte0, zzq.zzQ()), new Class[] {
            android/content/Context
        });
        zzkH = ((Class) (obj1)).getMethod(zzb(abyte0, zzq.zzG()), new Class[] {
            android/content/Context
        });
        context = file1.getName();
        file1.delete();
        (new File(file, context.replace(".jar", ".dex"))).delete();
        return;
        context;
        s = file1.getName();
        file1.delete();
        (new File(file, s.replace(".jar", ".dex"))).delete();
        throw context;
    }

    static String zzv()
    {
        if (zzkI == null)
        {
            throw new zza();
        } else
        {
            return zzkI;
        }
    }

    static Long zzw()
    {
        if (zzkz == null)
        {
            throw new zza();
        }
        Long long1;
        try
        {
            long1 = (Long)zzkz.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new zza(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new zza(invocationtargetexception);
        }
        return long1;
    }

    static String zzx()
    {
        if (zzkB == null)
        {
            throw new zza();
        }
        String s;
        try
        {
            s = (String)zzkB.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new zza(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new zza(invocationtargetexception);
        }
        return s;
    }

    static Long zzy()
    {
        if (zzkA == null)
        {
            throw new zza();
        }
        Long long1;
        try
        {
            long1 = (Long)zzkA.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new zza(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new zza(invocationtargetexception);
        }
        return long1;
    }

    protected void zzb(Context context)
    {
        try
        {
            zza(1, zzx());
        }
        catch (zza zza7) { }
        try
        {
            zza(2, zzv());
        }
        catch (zza zza6) { }
        try
        {
            long l = zzw().longValue();
            zza(25, l);
            if (startTime != 0L)
            {
                zza(17, l - startTime);
                zza(23, startTime);
            }
        }
        catch (zza zza5) { }
        try
        {
            ArrayList arraylist = zze(context);
            zza(31, ((Long)arraylist.get(0)).longValue());
            zza(32, ((Long)arraylist.get(1)).longValue());
        }
        catch (zza zza4) { }
        try
        {
            zza(33, zzy().longValue());
        }
        catch (zza zza3) { }
        try
        {
            zza(27, zza(context, zzkx));
        }
        catch (zza zza2) { }
        try
        {
            zza(29, zzb(context, zzkx));
        }
        catch (zza zza1) { }
        try
        {
            context = zzf(context);
            zza(5, context[0]);
            zza(6, context[1]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
    }

    protected void zzc(Context context)
    {
        try
        {
            zza(2, zzv());
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            zza(1, zzx());
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            zza(25, zzw().longValue());
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        try
        {
            context = zza(zzkv, zzkw);
            zza(14, ((Long)context.get(0)).longValue());
            zza(15, ((Long)context.get(1)).longValue());
            if (context.size() >= 3)
            {
                zza(16, ((Long)context.get(2)).longValue());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
    }

}
