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

// Referenced classes of package com.google.android.gms.internal:
//            h, o, f, n, 
//            km

public abstract class i
    implements h
{

    protected MotionEvent jN;
    protected DisplayMetrics jO;
    protected n jP;
    private o jQ;

    protected i(Context context, n n1, o o1)
    {
        jP = n1;
        jQ = o1;
        try
        {
            jO = context.getResources().getDisplayMetrics();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            jO = new DisplayMetrics();
        }
        jO.density = 1.0F;
    }

    private String a(Context context, String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        t();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        c(context);
_L1:
        context = u();
        this;
        JVM INSTR monitorexit ;
        if (context.length != 0)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        context = Integer.toString(5);
        return context;
        b(context);
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
        context = a(((byte []) (context)), s);
        return context;
    }

    private void t()
    {
        jQ.reset();
    }

    private byte[] u()
        throws IOException
    {
        return jQ.z();
    }

    public String a(Context context)
    {
        return a(context, ((String) (null)), false);
    }

    public String a(Context context, String s)
    {
        return a(context, s, true);
    }

    String a(byte abyte0[], String s)
        throws NoSuchAlgorithmException, UnsupportedEncodingException, IOException
    {
        byte abyte1[] = abyte0;
        if (abyte0.length > 239)
        {
            t();
            a(20, 1L);
            abyte1 = u();
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
        (new f()).a(abyte0, abyte1);
        if (s != null && s.length() > 0)
        {
            a(s, abyte1);
        }
        return jP.a(abyte1, true);
    }

    public void a(int j, int k, int l)
    {
        if (jN != null)
        {
            jN.recycle();
        }
        jN = MotionEvent.obtain(0L, l, 1, (float)j * jO.density, (float)k * jO.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
    }

    protected void a(int j, long l)
        throws IOException
    {
        jQ.b(j, l);
    }

    protected void a(int j, String s)
        throws IOException
    {
        jQ.b(j, s);
    }

    public void a(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            if (jN != null)
            {
                jN.recycle();
            }
            jN = MotionEvent.obtain(motionevent);
        }
    }

    void a(String s, byte abyte0[])
        throws UnsupportedEncodingException
    {
        String s1 = s;
        if (s.length() > 32)
        {
            s1 = s.substring(0, 32);
        }
        (new km(s1.getBytes("UTF-8"))).m(abyte0);
    }

    protected abstract void b(Context context);

    protected abstract void c(Context context);
}
