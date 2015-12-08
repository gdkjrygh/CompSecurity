// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

public final class ovg
    implements Comparable
{

    public final int a;
    private final ovh b;
    private Bitmap c;
    private int d;

    public ovg(ovh ovh1, int i)
    {
        b = (ovh)p.a(ovh1);
        a = i;
        d = 1;
    }

    public final ovi a()
    {
        this;
        JVM INSTR monitorenter ;
        if (d != 0) goto _L2; else goto _L1
_L1:
        ovi ovi1 = ovi.c;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ovi1;
_L2:
        if (c != null)
        {
            ovi1 = ovi.b;
            continue; /* Loop/switch isn't completed */
        }
        ovi1 = ovi.a;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        p.a(bitmap);
        if (a() != ovi.c && c == null) goto _L2; else goto _L1
_L1:
        bitmap.recycle();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        c = bitmap;
        if (true) goto _L4; else goto _L3
_L3:
        bitmap;
        throw bitmap;
    }

    public final long b()
    {
        return b.a().b(a);
    }

    public final Bitmap c()
    {
        this;
        JVM INSTR monitorenter ;
        Bitmap bitmap = c;
        this;
        JVM INSTR monitorexit ;
        return bitmap;
        Exception exception;
        exception;
        throw exception;
    }

    public final int compareTo(Object obj)
    {
        obj = (ovg)obj;
        if (a < ((ovg) (obj)).a)
        {
            return -1;
        }
        return a != ((ovg) (obj)).a ? 1 : 0;
    }

    public final ovg d()
    {
        this;
        JVM INSTR monitorenter ;
        ovg ovg1;
        boolean flag;
        if (d >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        if (d <= 0) goto _L2; else goto _L1
_L1:
        d = d + 1;
        ovg1 = this;
_L4:
        this;
        JVM INSTR monitorexit ;
        return ovg1;
_L2:
        ovg1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (d > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        d = d - 1;
        if (d == 0)
        {
            if (c != null)
            {
                c.recycle();
                c = null;
            }
            b.a(this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final String toString()
    {
        String s = getClass().getSimpleName();
        int i = a;
        String s1 = (new StringBuilder(22)).append("frameIndex=").append(i).toString();
        String s2 = String.valueOf(a());
        return c.a(s, new Object[] {
            s1, (new StringBuilder(String.valueOf(s2).length() + 6)).append("state=").append(s2).toString()
        });
    }
}
