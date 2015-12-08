// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL10Ext;
import javax.microedition.khronos.opengles.GL11;
import javax.microedition.khronos.opengles.GL11Ext;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            aa

final class m
    implements GL, GL10, GL10Ext, GL11, GL11Ext
{

    aa a;
    private final GL10 b;
    private final GL10Ext c;
    private final GL11 d;
    private final GL11Ext e;
    private int f;
    private final aa g = new aa();
    private final aa h = new aa();
    private final aa i = new aa();

    public m(GL gl)
    {
        b = (GL10)gl;
        Object obj;
        if (gl instanceof GL10Ext)
        {
            obj = (GL10Ext)gl;
        } else
        {
            obj = null;
        }
        c = ((GL10Ext) (obj));
        if (gl instanceof GL11)
        {
            obj = (GL11)gl;
        } else
        {
            obj = null;
        }
        d = ((GL11) (obj));
        if (gl instanceof GL11Ext)
        {
            gl = (GL11Ext)gl;
        } else
        {
            gl = null;
        }
        e = gl;
        a = g;
        f = 5888;
    }

    public final void glActiveTexture(int j)
    {
        b.glActiveTexture(j);
    }

    public final void glAlphaFunc(int j, float f1)
    {
        b.glAlphaFunc(j, f1);
    }

    public final void glAlphaFuncx(int j, int k)
    {
        b.glAlphaFuncx(j, k);
    }

    public final void glBindBuffer(int j, int k)
    {
        throw new UnsupportedOperationException();
    }

    public final void glBindTexture(int j, int k)
    {
        b.glBindTexture(j, k);
    }

    public final void glBlendFunc(int j, int k)
    {
        b.glBlendFunc(j, k);
    }

    public final void glBufferData(int j, int k, Buffer buffer, int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glBufferSubData(int j, int k, int l, Buffer buffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glClear(int j)
    {
        b.glClear(j);
    }

    public final void glClearColor(float f1, float f2, float f3, float f4)
    {
        b.glClearColor(f1, f2, f3, f4);
    }

    public final void glClearColorx(int j, int k, int l, int i1)
    {
        b.glClearColorx(j, k, l, i1);
    }

    public final void glClearDepthf(float f1)
    {
        b.glClearDepthf(f1);
    }

    public final void glClearDepthx(int j)
    {
        b.glClearDepthx(j);
    }

    public final void glClearStencil(int j)
    {
        b.glClearStencil(j);
    }

    public final void glClientActiveTexture(int j)
    {
        b.glClientActiveTexture(j);
    }

    public final void glClipPlanef(int j, FloatBuffer floatbuffer)
    {
        d.glClipPlanef(j, floatbuffer);
    }

    public final void glClipPlanef(int j, float af[], int k)
    {
        d.glClipPlanef(j, af, k);
    }

    public final void glClipPlanex(int j, IntBuffer intbuffer)
    {
        d.glClipPlanex(j, intbuffer);
    }

    public final void glClipPlanex(int j, int ai[], int k)
    {
        d.glClipPlanex(j, ai, k);
    }

    public final void glColor4f(float f1, float f2, float f3, float f4)
    {
        b.glColor4f(f1, f2, f3, f4);
    }

    public final void glColor4ub(byte byte0, byte byte1, byte byte2, byte byte3)
    {
        throw new UnsupportedOperationException();
    }

    public final void glColor4x(int j, int k, int l, int i1)
    {
        b.glColor4x(j, k, l, i1);
    }

    public final void glColorMask(boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        b.glColorMask(flag, flag1, flag2, flag3);
    }

    public final void glColorPointer(int j, int k, int l, int i1)
    {
        throw new UnsupportedOperationException();
    }

    public final void glColorPointer(int j, int k, int l, Buffer buffer)
    {
        b.glColorPointer(j, k, l, buffer);
    }

    public final void glCompressedTexImage2D(int j, int k, int l, int i1, int j1, int k1, int l1, 
            Buffer buffer)
    {
        b.glCompressedTexImage2D(j, k, l, i1, j1, k1, l1, buffer);
    }

    public final void glCompressedTexSubImage2D(int j, int k, int l, int i1, int j1, int k1, int l1, 
            int i2, Buffer buffer)
    {
        b.glCompressedTexSubImage2D(j, k, l, i1, j1, k1, l1, i2, buffer);
    }

    public final void glCopyTexImage2D(int j, int k, int l, int i1, int j1, int k1, int l1, 
            int i2)
    {
        b.glCopyTexImage2D(j, k, l, i1, j1, k1, l1, i2);
    }

    public final void glCopyTexSubImage2D(int j, int k, int l, int i1, int j1, int k1, int l1, 
            int i2)
    {
        b.glCopyTexSubImage2D(j, k, l, i1, j1, k1, l1, i2);
    }

    public final void glCullFace(int j)
    {
        b.glCullFace(j);
    }

    public final void glCurrentPaletteMatrixOES(int j)
    {
        throw new UnsupportedOperationException();
    }

    public final void glDeleteBuffers(int j, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glDeleteBuffers(int j, int ai[], int k)
    {
        throw new UnsupportedOperationException();
    }

    public final void glDeleteTextures(int j, IntBuffer intbuffer)
    {
        b.glDeleteTextures(j, intbuffer);
    }

    public final void glDeleteTextures(int j, int ai[], int k)
    {
        b.glDeleteTextures(j, ai, k);
    }

    public final void glDepthFunc(int j)
    {
        b.glDepthFunc(j);
    }

    public final void glDepthMask(boolean flag)
    {
        b.glDepthMask(flag);
    }

    public final void glDepthRangef(float f1, float f2)
    {
        b.glDepthRangef(f1, f2);
    }

    public final void glDepthRangex(int j, int k)
    {
        b.glDepthRangex(j, k);
    }

    public final void glDisable(int j)
    {
        b.glDisable(j);
    }

    public final void glDisableClientState(int j)
    {
        b.glDisableClientState(j);
    }

    public final void glDrawArrays(int j, int k, int l)
    {
        b.glDrawArrays(j, k, l);
    }

    public final void glDrawElements(int j, int k, int l, int i1)
    {
        throw new UnsupportedOperationException();
    }

    public final void glDrawElements(int j, int k, int l, Buffer buffer)
    {
        b.glDrawElements(j, k, l, buffer);
    }

    public final void glDrawTexfOES(float f1, float f2, float f3, float f4, float f5)
    {
        e.glDrawTexfOES(f1, f2, f3, f4, f5);
    }

    public final void glDrawTexfvOES(FloatBuffer floatbuffer)
    {
        e.glDrawTexfvOES(floatbuffer);
    }

    public final void glDrawTexfvOES(float af[], int j)
    {
        e.glDrawTexfvOES(af, j);
    }

    public final void glDrawTexiOES(int j, int k, int l, int i1, int j1)
    {
        e.glDrawTexiOES(j, k, l, i1, j1);
    }

    public final void glDrawTexivOES(IntBuffer intbuffer)
    {
        e.glDrawTexivOES(intbuffer);
    }

    public final void glDrawTexivOES(int ai[], int j)
    {
        e.glDrawTexivOES(ai, j);
    }

    public final void glDrawTexsOES(short word0, short word1, short word2, short word3, short word4)
    {
        e.glDrawTexsOES(word0, word1, word2, word3, word4);
    }

    public final void glDrawTexsvOES(ShortBuffer shortbuffer)
    {
        e.glDrawTexsvOES(shortbuffer);
    }

    public final void glDrawTexsvOES(short aword0[], int j)
    {
        e.glDrawTexsvOES(aword0, j);
    }

    public final void glDrawTexxOES(int j, int k, int l, int i1, int j1)
    {
        e.glDrawTexxOES(j, k, l, i1, j1);
    }

    public final void glDrawTexxvOES(IntBuffer intbuffer)
    {
        e.glDrawTexxvOES(intbuffer);
    }

    public final void glDrawTexxvOES(int ai[], int j)
    {
        e.glDrawTexxvOES(ai, j);
    }

    public final void glEnable(int j)
    {
        b.glEnable(j);
    }

    public final void glEnableClientState(int j)
    {
        b.glEnableClientState(j);
    }

    public final void glFinish()
    {
        b.glFinish();
    }

    public final void glFlush()
    {
        b.glFlush();
    }

    public final void glFogf(int j, float f1)
    {
        b.glFogf(j, f1);
    }

    public final void glFogfv(int j, FloatBuffer floatbuffer)
    {
        b.glFogfv(j, floatbuffer);
    }

    public final void glFogfv(int j, float af[], int k)
    {
        b.glFogfv(j, af, k);
    }

    public final void glFogx(int j, int k)
    {
        b.glFogx(j, k);
    }

    public final void glFogxv(int j, IntBuffer intbuffer)
    {
        b.glFogxv(j, intbuffer);
    }

    public final void glFogxv(int j, int ai[], int k)
    {
        b.glFogxv(j, ai, k);
    }

    public final void glFrontFace(int j)
    {
        b.glFrontFace(j);
    }

    public final void glFrustumf(float f1, float f2, float f3, float f4, float f5, float f6)
    {
        a.a(f1, f2, f3, f4, f5, f6);
        b.glFrustumf(f1, f2, f3, f4, f5, f6);
    }

    public final void glFrustumx(int j, int k, int l, int i1, int j1, int k1)
    {
        a.a((float)j * 1.525879E-05F, (float)k * 1.525879E-05F, (float)l * 1.525879E-05F, (float)i1 * 1.525879E-05F, (float)j1 * 1.525879E-05F, (float)k1 * 1.525879E-05F);
        b.glFrustumx(j, k, l, i1, j1, k1);
    }

    public final void glGenBuffers(int j, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGenBuffers(int j, int ai[], int k)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGenTextures(int j, IntBuffer intbuffer)
    {
        b.glGenTextures(j, intbuffer);
    }

    public final void glGenTextures(int j, int ai[], int k)
    {
        b.glGenTextures(j, ai, k);
    }

    public final void glGetBooleanv(int j, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetBooleanv(int j, boolean aflag[], int k)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetBufferParameteriv(int j, int k, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetBufferParameteriv(int j, int k, int ai[], int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetClipPlanef(int j, FloatBuffer floatbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetClipPlanef(int j, float af[], int k)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetClipPlanex(int j, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetClipPlanex(int j, int ai[], int k)
    {
        throw new UnsupportedOperationException();
    }

    public final int glGetError()
    {
        return b.glGetError();
    }

    public final void glGetFixedv(int j, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetFixedv(int j, int ai[], int k)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetFloatv(int j, FloatBuffer floatbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetFloatv(int j, float af[], int k)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetIntegerv(int j, IntBuffer intbuffer)
    {
        b.glGetIntegerv(j, intbuffer);
    }

    public final void glGetIntegerv(int j, int ai[], int k)
    {
        b.glGetIntegerv(j, ai, k);
    }

    public final void glGetLightfv(int j, int k, FloatBuffer floatbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetLightfv(int j, int k, float af[], int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetLightxv(int j, int k, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetLightxv(int j, int k, int ai[], int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetMaterialfv(int j, int k, FloatBuffer floatbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetMaterialfv(int j, int k, float af[], int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetMaterialxv(int j, int k, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetMaterialxv(int j, int k, int ai[], int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetPointerv(int j, Buffer abuffer[])
    {
        throw new UnsupportedOperationException();
    }

    public final String glGetString(int j)
    {
        return b.glGetString(j);
    }

    public final void glGetTexEnviv(int j, int k, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexEnviv(int j, int k, int ai[], int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexEnvxv(int j, int k, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexEnvxv(int j, int k, int ai[], int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexParameterfv(int j, int k, FloatBuffer floatbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexParameterfv(int j, int k, float af[], int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexParameteriv(int j, int k, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexParameteriv(int j, int k, int ai[], int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexParameterxv(int j, int k, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glGetTexParameterxv(int j, int k, int ai[], int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glHint(int j, int k)
    {
        b.glHint(j, k);
    }

    public final boolean glIsBuffer(int j)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean glIsEnabled(int j)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean glIsTexture(int j)
    {
        throw new UnsupportedOperationException();
    }

    public final void glLightModelf(int j, float f1)
    {
        b.glLightModelf(j, f1);
    }

    public final void glLightModelfv(int j, FloatBuffer floatbuffer)
    {
        b.glLightModelfv(j, floatbuffer);
    }

    public final void glLightModelfv(int j, float af[], int k)
    {
        b.glLightModelfv(j, af, k);
    }

    public final void glLightModelx(int j, int k)
    {
        b.glLightModelx(j, k);
    }

    public final void glLightModelxv(int j, IntBuffer intbuffer)
    {
        b.glLightModelxv(j, intbuffer);
    }

    public final void glLightModelxv(int j, int ai[], int k)
    {
        b.glLightModelxv(j, ai, k);
    }

    public final void glLightf(int j, int k, float f1)
    {
        b.glLightf(j, k, f1);
    }

    public final void glLightfv(int j, int k, FloatBuffer floatbuffer)
    {
        b.glLightfv(j, k, floatbuffer);
    }

    public final void glLightfv(int j, int k, float af[], int l)
    {
        b.glLightfv(j, k, af, l);
    }

    public final void glLightx(int j, int k, int l)
    {
        b.glLightx(j, k, l);
    }

    public final void glLightxv(int j, int k, IntBuffer intbuffer)
    {
        b.glLightxv(j, k, intbuffer);
    }

    public final void glLightxv(int j, int k, int ai[], int l)
    {
        b.glLightxv(j, k, ai, l);
    }

    public final void glLineWidth(float f1)
    {
        b.glLineWidth(f1);
    }

    public final void glLineWidthx(int j)
    {
        b.glLineWidthx(j);
    }

    public final void glLoadIdentity()
    {
        a.a();
        b.glLoadIdentity();
    }

    public final void glLoadMatrixf(FloatBuffer floatbuffer)
    {
        int j = floatbuffer.position();
        aa aa1 = a;
        floatbuffer.get(aa1.a, aa1.b, 16);
        floatbuffer.position(j);
        b.glLoadMatrixf(floatbuffer);
    }

    public final void glLoadMatrixf(float af[], int j)
    {
        aa aa1 = a;
        System.arraycopy(af, j, aa1.a, aa1.b, 16);
        b.glLoadMatrixf(af, j);
    }

    public final void glLoadMatrixx(IntBuffer intbuffer)
    {
        int k = intbuffer.position();
        aa aa1 = a;
        for (int j = 0; j < 16; j++)
        {
            aa1.a[aa1.b + j] = (float)intbuffer.get() * 1.525879E-05F;
        }

        intbuffer.position(k);
        b.glLoadMatrixx(intbuffer);
    }

    public final void glLoadMatrixx(int ai[], int j)
    {
        aa aa1 = a;
        for (int k = 0; k < 16; k++)
        {
            aa1.a[aa1.b + k] = (float)ai[j + k] * 1.525879E-05F;
        }

        b.glLoadMatrixx(ai, j);
    }

    public final void glLoadPaletteFromModelViewMatrixOES()
    {
        throw new UnsupportedOperationException();
    }

    public final void glLogicOp(int j)
    {
        b.glLogicOp(j);
    }

    public final void glMaterialf(int j, int k, float f1)
    {
        b.glMaterialf(j, k, f1);
    }

    public final void glMaterialfv(int j, int k, FloatBuffer floatbuffer)
    {
        b.glMaterialfv(j, k, floatbuffer);
    }

    public final void glMaterialfv(int j, int k, float af[], int l)
    {
        b.glMaterialfv(j, k, af, l);
    }

    public final void glMaterialx(int j, int k, int l)
    {
        b.glMaterialx(j, k, l);
    }

    public final void glMaterialxv(int j, int k, IntBuffer intbuffer)
    {
        b.glMaterialxv(j, k, intbuffer);
    }

    public final void glMaterialxv(int j, int k, int ai[], int l)
    {
        b.glMaterialxv(j, k, ai, l);
    }

    public final void glMatrixIndexPointerOES(int j, int k, int l, int i1)
    {
        throw new UnsupportedOperationException();
    }

    public final void glMatrixIndexPointerOES(int j, int k, int l, Buffer buffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glMatrixMode(int j)
    {
        j;
        JVM INSTR tableswitch 5888 5890: default 28
    //                   5888 58
    //                   5889 93
    //                   5890 82;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException((new StringBuilder(32)).append("Unknown matrix mode: ").append(j).toString());
_L2:
        a = g;
_L6:
        b.glMatrixMode(j);
        f = j;
        return;
_L4:
        a = h;
        continue; /* Loop/switch isn't completed */
_L3:
        a = i;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void glMultMatrixf(FloatBuffer floatbuffer)
    {
        int j = floatbuffer.position();
        aa aa1 = a;
        floatbuffer.get(aa1.c, 16, 16);
        aa1.a(aa1.c, 16);
        floatbuffer.position(j);
        b.glMultMatrixf(floatbuffer);
    }

    public final void glMultMatrixf(float af[], int j)
    {
        a.a(af, j);
        b.glMultMatrixf(af, j);
    }

    public final void glMultMatrixx(IntBuffer intbuffer)
    {
        int k = intbuffer.position();
        aa aa1 = a;
        for (int j = 0; j < 16; j++)
        {
            aa1.c[j + 16] = (float)intbuffer.get() * 1.525879E-05F;
        }

        aa1.a(aa1.c, 16);
        intbuffer.position(k);
        b.glMultMatrixx(intbuffer);
    }

    public final void glMultMatrixx(int ai[], int j)
    {
        aa aa1 = a;
        for (int k = 0; k < 16; k++)
        {
            aa1.c[k + 16] = (float)ai[j + k] * 1.525879E-05F;
        }

        aa1.a(aa1.c, 16);
        b.glMultMatrixx(ai, j);
    }

    public final void glMultiTexCoord4f(int j, float f1, float f2, float f3, float f4)
    {
        b.glMultiTexCoord4f(j, f1, f2, f3, f4);
    }

    public final void glMultiTexCoord4x(int j, int k, int l, int i1, int j1)
    {
        b.glMultiTexCoord4x(j, k, l, i1, j1);
    }

    public final void glNormal3f(float f1, float f2, float f3)
    {
        b.glNormal3f(f1, f2, f3);
    }

    public final void glNormal3x(int j, int k, int l)
    {
        b.glNormal3x(j, k, l);
    }

    public final void glNormalPointer(int j, int k, int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glNormalPointer(int j, int k, Buffer buffer)
    {
        b.glNormalPointer(j, k, buffer);
    }

    public final void glOrthof(float f1, float f2, float f3, float f4, float f5, float f6)
    {
        a.b(f1, f2, f3, f4, f5, f6);
        b.glOrthof(f1, f2, f3, f4, f5, f6);
    }

    public final void glOrthox(int j, int k, int l, int i1, int j1, int k1)
    {
        a.b((float)j * 1.525879E-05F, (float)k * 1.525879E-05F, (float)l * 1.525879E-05F, (float)i1 * 1.525879E-05F, (float)j1 * 1.525879E-05F, (float)k1 * 1.525879E-05F);
        b.glOrthox(j, k, l, i1, j1, k1);
    }

    public final void glPixelStorei(int j, int k)
    {
        b.glPixelStorei(j, k);
    }

    public final void glPointParameterf(int j, float f1)
    {
        throw new UnsupportedOperationException();
    }

    public final void glPointParameterfv(int j, FloatBuffer floatbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glPointParameterfv(int j, float af[], int k)
    {
        throw new UnsupportedOperationException();
    }

    public final void glPointParameterx(int j, int k)
    {
        throw new UnsupportedOperationException();
    }

    public final void glPointParameterxv(int j, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glPointParameterxv(int j, int ai[], int k)
    {
        throw new UnsupportedOperationException();
    }

    public final void glPointSize(float f1)
    {
        b.glPointSize(f1);
    }

    public final void glPointSizePointerOES(int j, int k, Buffer buffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glPointSizex(int j)
    {
        b.glPointSizex(j);
    }

    public final void glPolygonOffset(float f1, float f2)
    {
        b.glPolygonOffset(f1, f2);
    }

    public final void glPolygonOffsetx(int j, int k)
    {
        b.glPolygonOffsetx(j, k);
    }

    public final void glPopMatrix()
    {
        aa aa1 = a;
        aa1.a(-1);
        aa1.b(-1);
        b.glPopMatrix();
    }

    public final void glPushMatrix()
    {
        aa aa1 = a;
        aa1.a(1);
        System.arraycopy(aa1.a, aa1.b, aa1.a, aa1.b + 16, 16);
        aa1.b(1);
        b.glPushMatrix();
    }

    public final int glQueryMatrixxOES(IntBuffer intbuffer, IntBuffer intbuffer1)
    {
        return c.glQueryMatrixxOES(intbuffer, intbuffer1);
    }

    public final int glQueryMatrixxOES(int ai[], int j, int ai1[], int k)
    {
        return c.glQueryMatrixxOES(ai, j, ai1, k);
    }

    public final void glReadPixels(int j, int k, int l, int i1, int j1, int k1, Buffer buffer)
    {
        b.glReadPixels(j, k, l, i1, j1, k1, buffer);
    }

    public final void glRotatef(float f1, float f2, float f3, float f4)
    {
        a.a(f1, f2, f3, f4);
        b.glRotatef(f1, f2, f3, f4);
    }

    public final void glRotatex(int j, int k, int l, int i1)
    {
        a.a(j, (float)k * 1.525879E-05F, (float)l * 1.525879E-05F, (float)i1 * 1.525879E-05F);
        b.glRotatex(j, k, l, i1);
    }

    public final void glSampleCoverage(float f1, boolean flag)
    {
        b.glSampleCoverage(f1, flag);
    }

    public final void glSampleCoveragex(int j, boolean flag)
    {
        b.glSampleCoveragex(j, flag);
    }

    public final void glScalef(float f1, float f2, float f3)
    {
        a.a(f1, f2, f3);
        b.glScalef(f1, f2, f3);
    }

    public final void glScalex(int j, int k, int l)
    {
        a.a((float)j * 1.525879E-05F, (float)k * 1.525879E-05F, (float)l * 1.525879E-05F);
        b.glScalex(j, k, l);
    }

    public final void glScissor(int j, int k, int l, int i1)
    {
        b.glScissor(j, k, l, i1);
    }

    public final void glShadeModel(int j)
    {
        b.glShadeModel(j);
    }

    public final void glStencilFunc(int j, int k, int l)
    {
        b.glStencilFunc(j, k, l);
    }

    public final void glStencilMask(int j)
    {
        b.glStencilMask(j);
    }

    public final void glStencilOp(int j, int k, int l)
    {
        b.glStencilOp(j, k, l);
    }

    public final void glTexCoordPointer(int j, int k, int l, int i1)
    {
        throw new UnsupportedOperationException();
    }

    public final void glTexCoordPointer(int j, int k, int l, Buffer buffer)
    {
        b.glTexCoordPointer(j, k, l, buffer);
    }

    public final void glTexEnvf(int j, int k, float f1)
    {
        b.glTexEnvf(j, k, f1);
    }

    public final void glTexEnvfv(int j, int k, FloatBuffer floatbuffer)
    {
        b.glTexEnvfv(j, k, floatbuffer);
    }

    public final void glTexEnvfv(int j, int k, float af[], int l)
    {
        b.glTexEnvfv(j, k, af, l);
    }

    public final void glTexEnvi(int j, int k, int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glTexEnviv(int j, int k, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glTexEnviv(int j, int k, int ai[], int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glTexEnvx(int j, int k, int l)
    {
        b.glTexEnvx(j, k, l);
    }

    public final void glTexEnvxv(int j, int k, IntBuffer intbuffer)
    {
        b.glTexEnvxv(j, k, intbuffer);
    }

    public final void glTexEnvxv(int j, int k, int ai[], int l)
    {
        b.glTexEnvxv(j, k, ai, l);
    }

    public final void glTexImage2D(int j, int k, int l, int i1, int j1, int k1, int l1, 
            int i2, Buffer buffer)
    {
        b.glTexImage2D(j, k, l, i1, j1, k1, l1, i2, buffer);
    }

    public final void glTexParameterf(int j, int k, float f1)
    {
        b.glTexParameterf(j, k, f1);
    }

    public final void glTexParameterfv(int j, int k, FloatBuffer floatbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glTexParameterfv(int j, int k, float af[], int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glTexParameteri(int j, int k, int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glTexParameteriv(int j, int k, IntBuffer intbuffer)
    {
        d.glTexParameteriv(j, k, intbuffer);
    }

    public final void glTexParameteriv(int j, int k, int ai[], int l)
    {
        d.glTexParameteriv(j, k, ai, l);
    }

    public final void glTexParameterx(int j, int k, int l)
    {
        b.glTexParameterx(j, k, l);
    }

    public final void glTexParameterxv(int j, int k, IntBuffer intbuffer)
    {
        throw new UnsupportedOperationException();
    }

    public final void glTexParameterxv(int j, int k, int ai[], int l)
    {
        throw new UnsupportedOperationException();
    }

    public final void glTexSubImage2D(int j, int k, int l, int i1, int j1, int k1, int l1, 
            int i2, Buffer buffer)
    {
        b.glTexSubImage2D(j, k, l, i1, j1, k1, l1, i2, buffer);
    }

    public final void glTranslatef(float f1, float f2, float f3)
    {
        a.b(f1, f2, f3);
        b.glTranslatef(f1, f2, f3);
    }

    public final void glTranslatex(int j, int k, int l)
    {
        a.b((float)j * 1.525879E-05F, (float)k * 1.525879E-05F, (float)l * 1.525879E-05F);
        b.glTranslatex(j, k, l);
    }

    public final void glVertexPointer(int j, int k, int l, int i1)
    {
        throw new UnsupportedOperationException();
    }

    public final void glVertexPointer(int j, int k, int l, Buffer buffer)
    {
        b.glVertexPointer(j, k, l, buffer);
    }

    public final void glViewport(int j, int k, int l, int i1)
    {
        b.glViewport(j, k, l, i1);
    }

    public final void glWeightPointerOES(int j, int k, int l, int i1)
    {
        throw new UnsupportedOperationException();
    }

    public final void glWeightPointerOES(int j, int k, int l, Buffer buffer)
    {
        throw new UnsupportedOperationException();
    }
}
