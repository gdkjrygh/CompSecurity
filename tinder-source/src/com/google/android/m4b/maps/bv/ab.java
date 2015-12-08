// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.opengl.GLU;
import android.support.v4.view.a.c;
import android.support.v4.widget.k;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.m4b.maps.cg.ar;
import com.google.android.m4b.maps.cg.ay;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            w, q, t, p, 
//            ah, ag, z

final class ab extends k
{
    static final class a
    {

        final int a[] = new int[400];
        final int b[] = new int[100];
        final int c[] = new int[100];
        int d;
        int e;
        int f;

        public final int a(int i1, int j1)
        {
            int ai[] = a;
            for (int k1 = d - 1; k1 >= 0; k1--)
            {
                int l1 = k1 * 4;
                if (ai[l1] <= i1 && ai[l1 + 1] <= j1 && i1 < ai[l1 + 2] && j1 < ai[l1 + 3])
                {
                    return b[k1];
                }
            }

            return -1;
        }

        public a()
        {
        }
    }

    static final class b
    {

        final FloatBuffer a;
        private final int b;
        private final int c;
        private final ByteBuffer d;
        private final ByteBuffer e;

        private static ByteBuffer a(byte abyte0[])
        {
            int i1 = abyte0.length;
            ByteBuffer bytebuffer = ByteBuffer.allocateDirect(i1).order(ByteOrder.nativeOrder());
            bytebuffer.put(abyte0, 0, i1);
            bytebuffer.position(0);
            return bytebuffer;
        }

        private static byte[] a(int i1)
        {
            byte abyte0[] = new byte[i1];
            for (int j1 = 0; j1 < i1; j1++)
            {
                abyte0[j1] = (byte)j1;
            }

            return abyte0;
        }

        final void a(GL10 gl10)
        {
            gl10.glEnableClientState(32884);
            gl10.glVertexPointer(3, 5126, 0, a);
            gl10.glDisableClientState(32888);
            gl10.glDisable(3553);
            gl10.glDrawElements(6, b, 5121, d);
        }

        public b(float af[])
        {
            this(af, a(af.length / 3));
        }

        private b(float af[], byte abyte0[])
        {
            this(af, abyte0, abyte0);
        }

        private b(float af[], byte abyte0[], byte abyte1[])
        {
            a = ByteBuffer.allocateDirect(af.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            a.put(af, 0, af.length);
            a.position(0);
            b = abyte0.length;
            c = abyte1.length;
            if (b > 256 || c > 256)
            {
                throw new IllegalArgumentException("Only up to 256 points");
            } else
            {
                d = a(abyte0);
                e = a(abyte1);
                return;
            }
        }
    }


    private static final float A[] = {
        0.0F, -0.84F, 0.42096F, -0.1824F, -0.84F, 0.30096F, -0.1824F, -0.84F, 0.2F, 0.0F, 
        -0.84F, 0.32F, 0.1824F, -0.84F, 0.2F, 0.1824F, -0.84F, 0.30096F
    };
    private static final float B[] = {
        0.0F, 1.0F, 0.0F, 1.0F, 0.0F, 1.0F, 1.0F, 0.0F, -1F, -1F, 
        0.0F, -1F, -1F, 0.0F, 1.0F
    };
    private static final byte C[] = {
        0, 1, 2, 3, 4, 0
    };
    private static final byte D[] = {
        0, 1, 2, 0, 2, 3, 0, 3, 4, 0, 
        4, 1
    };
    private static final float z[] = {
        0.0F, -0.8F, 0.42096F, -0.1824F, -0.8F, 0.30096F, -0.1824F, -0.8F, 0.2F, 0.0F, 
        -0.8F, 0.32F, 0.1824F, -0.8F, 0.2F, 0.1824F, -0.8F, 0.30096F
    };
    private final b E;
    private final b F;
    private final ag G;
    private final float H[] = new float[8];
    private final CharSequence I[];
    private final Context J;
    private final float K;
    q a;
    t b[];
    int c;
    int d;
    float e;
    boolean f;
    boolean g;
    w h;
    final CharSequence i[];
    final Paint j = new Paint();
    final Paint k = new Paint();
    a l;
    a m;
    final Object n;
    int o;
    int p;
    long q;
    long r;
    boolean s;
    boolean t;
    boolean u;
    boolean v;
    int w[][];
    boolean x;
    boolean y;

    public ab(Context context, Resources resources, ag ag1, View view)
    {
        super(view);
        u = true;
        v = true;
        J = context;
        K = resources.getDisplayMetrics().density;
        E = new b(z);
        F = new b(A);
        G = ag1;
        b();
        i = resources.getTextArray(com.google.android.m4b.maps.h.a.maps_compass_directions);
        I = resources.getTextArray(com.google.android.m4b.maps.h.a.maps_full_compass_directions);
        j.setAntiAlias(true);
        j.setTextAlign(android.graphics.Paint.Align.LEFT);
        j.setTypeface(Typeface.DEFAULT);
        j.setTextSize(100F);
        j.setARGB(-1, 255, 255, 255);
        j.setStyle(android.graphics.Paint.Style.FILL);
        j.setStrokeWidth(1.0F);
        k.setAntiAlias(true);
        k.setTextAlign(android.graphics.Paint.Align.LEFT);
        k.setTypeface(Typeface.DEFAULT);
        k.setTextSize(100F);
        k.setStyle(android.graphics.Paint.Style.STROKE);
        k.setStrokeWidth(3F);
        k.setARGB(-1, 0, 0, 0);
        l = new a();
        m = new a();
        n = m;
    }

    protected final int a(float f1, float f2)
    {
        int j1 = m.a((int)f1, d - (int)f2);
        int i1 = j1;
        if (j1 == -1)
        {
            i1 = 0x80000000;
        }
        return i1;
    }

    public final int a(int i1, int j1)
    {
        synchronized (n)
        {
            i1 = m.a(i1, j1);
        }
        return i1;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void a(int i1, c c1)
    {
        int ai[] = m.a;
        int j1 = i1 * 4;
        c1.b(new Rect(ai[j1], d - ai[j1 + 3], ai[j1 + 2], d - ai[j1 + 1]));
        c1.a(true);
        i1 = m.c[i1];
        c1.c(I[i1]);
    }

    protected final void a(int i1, AccessibilityEvent accessibilityevent)
    {
        i1 = m.c[i1];
        accessibilityevent.setContentDescription(I[i1]);
    }

    protected final void a(List list)
    {
        int ai[] = m.b;
        for (int i1 = 0; i1 < m.d; i1++)
        {
            list.add(Integer.valueOf(ai[i1]));
        }

    }

    final void a(GL10 gl10)
    {
        g = false;
        f = false;
        if (h != null)
        {
            h.b(gl10);
            h = null;
        }
    }

    final void a(GL10 gl10, ay ay1)
    {
        if (w != null)
        {
            w w1 = h;
            float f1 = c;
            float f3 = d;
            w1.a(1, 3);
            gl10.glBindTexture(3553, w1.f);
            gl10.glShadeModel(7424);
            gl10.glEnable(3042);
            gl10.glBlendFunc(1, 771);
            gl10.glColor4x(0x10000, 0x10000, 0x10000, 0x10000);
            if (w1.m)
            {
                gl10.glMatrixMode(5889);
                gl10.glPushMatrix();
                gl10.glLoadIdentity();
                gl10.glOrthof(0.0F, f1, 0.0F, f3, 0.0F, 1.0F);
                gl10.glMatrixMode(5888);
                gl10.glPushMatrix();
                gl10.glLoadIdentity();
            }
            gl10.glMatrixMode(5888);
            gl10.glPushMatrix();
            gl10.glLoadIdentity();
            gl10.glMultMatrixf(ay1.a(), 0);
            for (int i1 = 0; i1 < b.length; i1++)
            {
                if (w[i1][0] == -1)
                {
                    continue;
                }
                gl10.glPushMatrix();
                float f4 = ar.p(180F - a.u);
                float f2 = (float)Math.cos(f4);
                f4 = (float)Math.sin(f4);
                gl10.glRotatef(-a.v, f2, 0.0F, -f4);
                gl10.glRotatef(-b[i1].a, 0.0F, 1.0F, 0.0F);
                gl10.glTranslatef(0.0F, 0.0F, -5F);
                gl10.glTranslatef(0.0F, -5F, 0.0F);
                gl10.glRotatef(-90F, 1.0F, 0.0F, 0.0F);
                gl10.glRotatef(90F, 0.0F, 0.0F, 1.0F);
                gl10.glScalef(0.025F, 0.025F, 0.025F);
                gl10.glTranslatef(0.0F, (-60F * K) / 2.0F, 0.0F);
                ay1 = h;
                int j1 = w[i1][0];
                ay1.a(3, 3);
                f2 = (float)Math.floor(0.0D);
                f4 = (float)Math.floor(0.0D);
                if (((w) (ay1)).m)
                {
                    gl10.glMatrixMode(5888);
                    gl10.glPushMatrix();
                    gl10.glTranslatef(f2, f4, 0.0F);
                }
                w.a a1 = (w.a)((w) (ay1)).l.get(j1);
                gl10.glEnable(3553);
                a1.a.a(gl10, true);
                if (((w) (ay1)).m)
                {
                    gl10.glMatrixMode(5888);
                    gl10.glPopMatrix();
                }
                gl10.glPopMatrix();
            }

            gl10.glMatrixMode(5888);
            gl10.glPopMatrix();
            ay1 = h;
            ay1.a(3, 1);
            gl10.glDisable(3042);
            if (((w) (ay1)).m)
            {
                gl10.glMatrixMode(5889);
                gl10.glPopMatrix();
                gl10.glMatrixMode(5888);
                gl10.glPopMatrix();
                return;
            }
        }
    }

    protected final boolean a()
    {
        return true;
    }

    public final t b(int i1)
    {
        t t1;
        try
        {
            t1 = b[i1];
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            return null;
        }
        return t1;
    }

    final void b()
    {
        char c1;
        if ((double)K < 2D)
        {
            c1 = '\u0400';
        } else
        {
            c1 = '\u0800';
        }
        h = new w(2048, c1, false);
    }

    final void b(GL10 gl10, ay ay1)
    {
        int k1;
        if (e == 0.0F)
        {
            return;
        }
        gl10.glMatrixMode(5889);
        gl10.glLoadIdentity();
        GLU.gluPerspective(gl10, ay1.c() * ah.a(e), e, 0.1F, 100F);
        gl10.glMatrixMode(5888);
        gl10.glLoadIdentity();
        gl10.glTranslatef(0.0F, 0.0F, -2F);
        gl10.glMultMatrixf(ay1.a(), 0);
        gl10.glTranslatef(0.0F, -1F, 0.0F);
        gl10.glShadeModel(7424);
        gl10.glEnable(3042);
        gl10.glBlendFunc(770, 771);
        G.a(gl10);
        gl10.glMatrixMode(5888);
        k1 = 0;
_L9:
        if (k1 >= b.length) goto _L2; else goto _L1
_L1:
        a a1;
        int ai1[];
        boolean flag;
        boolean flag1;
        int j2;
        int l2;
        int j3;
        int l3;
        int j4;
        int k4;
        float f1 = ay1.a;
        t t1 = b[k1];
        gl10.glPushMatrix();
        float f2 = t1.a;
        float f3 = t1.a;
        float f5 = ar.p(180F - a.u);
        float f4 = (float)Math.cos(f5);
        f5 = (float)Math.sin(f5);
        gl10.glRotatef(-a.v, f4, 0.0F, -f5);
        gl10.glRotatef(180F - f3, 0.0F, 1.0F, 0.0F);
        int i1 = t1.d;
        gl10.glColor4x((i1 >> 16 & 0xff) << 8, (i1 >> 8 & 0xff) << 8, (i1 >> 0 & 0xff) << 8, Math.min((int)((float)((i1 >> 24 & 0xff) << 8) * 1.1F), 0x10000));
        f1 = (float)Math.cos(ar.p(f1 - f2));
        gl10.glTranslatef(0.0F, 0.0F, ((f1 * 0.355F + 0.68F) - (2.0F * f1 * f1 - 1.0F) * 0.32F - 0.215F * ((4F * f1 * f1 - 3F) * f1)) * 0.25F + 0.2F);
        if (p == k1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (o == k1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            flag = false;
        }
        if (flag || flag1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            ag ag1;
            float af[];
            b b1;
            int l1;
            int l4;
            int i5;
            int j5;
            int k5;
            int l5;
            if (flag)
            {
                gl10.glColor4x(34816, 27904, 44288, 0x10000);
            } else
            {
                gl10.glColor4x(62976, 35328, 7936, 0x10000);
            }
            gl10.glPushMatrix();
            gl10.glScalef(1.3F, 1.0F, 1.3F);
        } else
        {
            gl10.glColor4x(0, 0, 0, 32768);
        }
        G.b(gl10);
        if (!y || e >= 1.0F)
        {
            gl10.glTranslatef(0.0F, 0.5F, 0.0F);
        }
        gl10.glColor4x(0, 0, 0, 20480);
        F.a(gl10);
        gl10.glColor4x(0x10000, 0x10000, 0x10000, 0x10000);
        E.a(gl10);
        a1 = l;
        ag1 = G;
        af = H;
        b1 = E;
        j4 = t1.b;
        ag1.b(gl10);
        k4 = a1.d * 4;
        ai1 = a1.a;
        l4 = a1.e;
        i5 = a1.f;
        j5 = b1.a.limit() / 3;
        l1 = 0;
        flag = false;
        j2 = 0x80000000;
        l2 = 0x7fffffff;
        j3 = 0x80000000;
        l3 = 0x7fffffff;
_L8:
        if (l1 >= j5)
        {
            break MISSING_BLOCK_LABEL_945;
        }
        k5 = l1 * 3;
        af[0] = b1.a.get(k5);
        af[1] = b1.a.get(k5 + 1);
        af[2] = b1.a.get(k5 + 2);
        af[3] = 1.0F;
        GLU.gluProject(af[0], af[1], af[2], ag1.a.a, 0, ag1.a.b, 0, ag1.b, 0, af, 4);
        l5 = (int)af[4];
        k5 = (int)af[5];
        if (!flag)
        {
            if (l5 >= 0 && k5 >= 0 && l5 < l4 && k5 < i5)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                break; /* Loop/switch isn't completed */
            }
        }
        flag = true;
_L6:
        l3 = Math.min(l3, l5);
        j3 = Math.max(j3, l5);
        l2 = Math.min(l2, k5);
        j2 = Math.max(j2, k5);
        l1++;
        if (true) goto _L4; else goto _L3
_L4:
        break MISSING_BLOCK_LABEL_673;
_L3:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
        if (flag)
        {
            ai1[k4] = l3;
            ai1[k4 + 1] = l2;
            ai1[k4 + 2] = j3;
            ai1[k4 + 3] = j2;
        }
        if (flag)
        {
            int k3 = a1.a[k4];
            int j1 = a1.a[k4 + 1];
            int i4 = a1.a[k4 + 2];
            k4 = a1.a[k4 + 3];
            int i2 = a1.d * 4;
            int ai[] = a1.a;
            int k2 = Math.max(0, i4 - k3);
            int i3 = Math.max(64, k4 - j1);
            k3 = (k3 + i4 >> 1) - (k2 >> 1);
            j1 = (j1 + k4 >> 1) - (i3 >> 1);
            ai[i2] = k3;
            ai[i2 + 1] = j1;
            ai[i2 + 2] = k3 + k2;
            ai[i2 + 3] = j1 + i3;
            a1.c[a1.d] = j4;
            ai = a1.b;
            j1 = a1.d;
            a1.d = j1 + 1;
            ai[j1] = k1;
        }
        if (flag1)
        {
            gl10.glPopMatrix();
        }
        gl10.glPopMatrix();
        k1++;
          goto _L9
_L2:
        gl10.glDisable(3042);
        return;
    }

}
