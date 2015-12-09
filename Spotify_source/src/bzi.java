// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public abstract class bzi
    implements bzh
{

    public MotionEvent a;
    public DisplayMetrics b;
    public bzn c;
    private bzo d;

    public bzi(Context context, bzn bzn1, bzo bzo1)
    {
        c = bzn1;
        d = bzo1;
        try
        {
            b = context.getResources().getDisplayMetrics();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            b = new DisplayMetrics();
        }
        b.density = 1.0F;
    }

    private String a(Context context, String s, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        c(context);
_L1:
        byte abyte0[] = b();
        this;
        JVM INSTR monitorexit ;
        if (abyte0.length != 0)
        {
            break MISSING_BLOCK_LABEL_56;
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
        context = abyte0;
        if (abyte0.length > 239)
        {
            a();
            a(20, 1L);
            context = b();
        }
        if (context.length >= 239)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        abyte0 = new byte[239 - context.length];
        (new SecureRandom()).nextBytes(abyte0);
        context = ByteBuffer.allocate(240).put((byte)context.length).put(context).put(abyte0).array();
_L2:
        MessageDigest messagedigest = MessageDigest.getInstance("MD5");
        messagedigest.update(context);
        messagedigest = messagedigest.digest();
        context = ByteBuffer.allocate(256).put(messagedigest).put(context).array();
        messagedigest = new byte[256];
        (new byt()).a(context, messagedigest);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        if (s.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_246;
        }
        context = s;
        if (s.length() > 32)
        {
            context = s.substring(0, 32);
        }
        (new coo(context.getBytes("UTF-8"))).a(messagedigest);
        return c.a(messagedigest);
        context = ByteBuffer.allocate(240).put((byte)context.length).put(context).array();
          goto _L2
    }

    private void a()
    {
        d.a();
    }

    private byte[] b()
    {
        return d.b();
    }

    public final String a(Context context)
    {
        return a(context, ((String) (null)), false);
    }

    public final String a(Context context, String s)
    {
        return a(context, s, true);
    }

    protected final String a(String s)
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
                obj = c.a(((byte []) (obj)));
            }
        }
        return ((String) (obj));
    }

    public final void a(int i, int j, int k)
    {
        if (a != null)
        {
            a.recycle();
        }
        a = MotionEvent.obtain(0L, k, 1, (float)i * b.density, (float)j * b.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
    }

    public final void a(int i, long l)
    {
        d.a(i, l);
    }

    public final void a(int i, String s)
    {
        d.a(i, s);
    }

    public final void a(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            if (a != null)
            {
                a.recycle();
            }
            a = MotionEvent.obtain(motionevent);
        }
    }

    public abstract void b(Context context);

    public abstract void c(Context context);
}
