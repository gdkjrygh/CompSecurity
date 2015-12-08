// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.UUID;

// Referenced classes of package com.google.android.gms.internal:
//            zzg, o, zzf, zzm, 
//            zznp

public abstract class zzh
    implements zzg
{

    protected MotionEvent zzlk;
    protected DisplayMetrics zzll;
    protected zzm zzlm;
    private o zzln;

    protected zzh(Context context, zzm zzm1, o o1)
    {
        zzlm = zzm1;
        zzln = o1;
        try
        {
            zzll = context.getResources().getDisplayMetrics();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            zzll = new DisplayMetrics();
        }
        zzll.density = 1.0F;
    }

    private String zza(Context context, String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        zzt();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        zzc(context);
_L1:
        context = zzu();
        this;
        JVM INSTR monitorexit ;
        if (context.length != 0)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        context = Integer.toString(5);
        return context;
        zzb(context);
          goto _L1
        context;
        this;
        JVM INSTR monitorexit ;
        try
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return Integer.toString(7);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return Integer.toString(7);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return Integer.toString(3);
        }
        context = zza(((byte []) (context)), s);
        return context;
    }

    private void zzt()
    {
        zzln.a();
    }

    private byte[] zzu()
        throws IOException
    {
        return zzln.b();
    }

    public String zza(Context context)
    {
        return zza(context, ((String) (null)), false);
    }

    public String zza(Context context, String s)
    {
        return zza(context, s, true);
    }

    String zza(byte abyte0[], String s)
        throws NoSuchAlgorithmException, UnsupportedEncodingException, IOException
    {
        byte abyte1[] = abyte0;
        if (abyte0.length > 239)
        {
            zzt();
            zza(20, 1L);
            abyte1 = zzu();
        }
        if (abyte1.length < 239)
        {
            abyte0 = new byte[239 - abyte1.length];
            (new SecureRandom()).nextBytes(abyte0);
            abyte0 = ByteBuffer.allocate(240).put((byte)abyte1.length).put(abyte1).put(abyte0).array();
        } else
        {
            abyte0 = ByteBuffer.allocate(240).put((byte)abyte1.length).put(abyte1).array();
        }
        abyte1 = MessageDigest.getInstance("MD5");
        abyte1.update(abyte0);
        abyte1 = abyte1.digest();
        abyte0 = ByteBuffer.allocate(256).put(abyte1).put(abyte0).array();
        abyte1 = new byte[256];
        (new zzf()).zza(abyte0, abyte1);
        if (s != null && s.length() > 0)
        {
            zza(s, abyte1);
        }
        return zzlm.zza(abyte1, true);
    }

    public void zza(int i, int j, int k)
    {
        if (zzlk != null)
        {
            zzlk.recycle();
        }
        zzlk = MotionEvent.obtain(0L, k, 1, (float)i * zzll.density, (float)j * zzll.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
    }

    protected void zza(int i, long l)
        throws IOException
    {
        zzln.a(i, l);
    }

    protected void zza(int i, String s)
        throws IOException
    {
        zzln.a(i, s);
    }

    public void zza(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            if (zzlk != null)
            {
                zzlk.recycle();
            }
            zzlk = MotionEvent.obtain(motionevent);
        }
    }

    void zza(String s, byte abyte0[])
        throws UnsupportedEncodingException
    {
        String s1 = s;
        if (s.length() > 32)
        {
            s1 = s.substring(0, 32);
        }
        (new zznp(s1.getBytes("UTF-8"))).zzu(abyte0);
    }

    protected String zzb(String s)
    {
        Object obj = s;
        if (s != null)
        {
            obj = s;
            if (s.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$"))
            {
                s = UUID.fromString(s);
                obj = new byte[16];
                ByteBuffer bytebuffer = ByteBuffer.wrap(((byte []) (obj)));
                bytebuffer.putLong(s.getMostSignificantBits());
                bytebuffer.putLong(s.getLeastSignificantBits());
                obj = zzlm.zza(((byte []) (obj)), true);
            }
        }
        return ((String) (obj));
    }

    protected abstract void zzb(Context context);

    protected abstract void zzc(Context context);
}
