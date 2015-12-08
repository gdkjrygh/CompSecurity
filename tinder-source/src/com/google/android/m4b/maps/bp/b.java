// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bp;

import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bx.ab;
import com.google.android.m4b.maps.bx.j;
import com.google.android.m4b.maps.bx.r;
import java.util.Iterator;
import java.util.Vector;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bp:
//            a

public final class b extends r
{

    private final Vector a = new Vector();
    private a b;

    public b()
    {
    }

    private static void d(d d1)
    {
        d1 = d1.a;
        d1.glMatrixMode(5889);
        d1.glPopMatrix();
        d1.glMatrixMode(5888);
        d1.glPopMatrix();
    }

    public final void a(d d1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((a)iterator.next()).a(d1)) { }
    }

    public final void a(d d1, com.google.android.m4b.maps.bi.b b1, ab ab)
    {
        if (a.isEmpty())
        {
            return;
        }
        Vector vector = a;
        vector;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
        break MISSING_BLOCK_LABEL_56;
        d1;
        vector;
        JVM INSTR monitorexit ;
        throw d1;
        GL10 gl10 = d1.a;
        gl10.glPushMatrix();
        gl10.glMatrixMode(5889);
        gl10.glPushMatrix();
        gl10.glLoadIdentity();
        gl10.glOrthof(0.0F, b1.h, 0.0F, b1.i, -1F, 1.0F);
        gl10.glMatrixMode(5888);
        gl10.glLoadIdentity();
        for (Iterator iterator1 = a.iterator(); iterator1.hasNext(); ((a)iterator1.next()).a(d1, b1, ab)) { }
        break MISSING_BLOCK_LABEL_177;
        b1;
        d(d1);
        throw b1;
        d(d1);
        vector;
        JVM INSTR monitorexit ;
    }

    public final void a(d d1, j j)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((a)iterator.next()).a(d1, j)) { }
    }

    public final boolean a(float f, float f1, g g, com.google.android.m4b.maps.bi.b b1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (((a)iterator.next()).a(f, f1, g, b1))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean a(com.google.android.m4b.maps.bi.b b1, d d1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((a)iterator.next()).a(b1, d1)) { }
        return super.a(b1, d1);
    }

    public final boolean b(float f, float f1, g g, com.google.android.m4b.maps.bi.b b1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (((a)iterator.next()).b(f, f1, g, b1))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean c(float f, float f1, com.google.android.m4b.maps.bi.b b1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            a a1 = (a)iterator.next();
            if (a1.c(f, f1, b1))
            {
                b = a1;
                return true;
            }
        }

        return false;
    }

    public final com.google.android.m4b.maps.bx.r.a d()
    {
        return com.google.android.m4b.maps.bx.r.a.r;
    }

    public final boolean d(float f, float f1, com.google.android.m4b.maps.bi.b b1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (((a)iterator.next()).d(f, f1, b1))
            {
                return true;
            }
        }

        return false;
    }

    public final void i_()
    {
        if (b != null)
        {
            b.i_();
            b = null;
        }
    }

    public final boolean m_()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            if (((a)iterator.next()).m_())
            {
                return true;
            }
        }

        return false;
    }
}
