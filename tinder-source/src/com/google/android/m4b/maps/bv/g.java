// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import android.graphics.Bitmap;
import android.opengl.GLUtils;
import java.util.BitSet;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            v, ad

final class g extends v
{

    final int a[] = new int[17];
    private final BitSet c = new BitSet(17);
    private final BitSet d = new BitSet(17);
    private GL10 e;

    public g()
    {
        super(17);
    }

    public final void a()
    {
        if (e != null)
        {
            e.glDeleteTextures(b, a, 0);
        }
        super.a(0);
        d.clear();
        e = null;
    }

    public final void a(ad ad, Bitmap bitmap)
    {
        if (bitmap == null) goto _L2; else goto _L1
_L1:
        if (b(ad) != null)
        {
            ad = String.valueOf(ad);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(ad).length() + 15)).append("Already cached ").append(ad).toString());
        }
        break MISSING_BLOCK_LABEL_61;
        ad;
        bitmap.recycle();
        throw ad;
        GL10 gl10;
        int i;
        b();
        i = c.nextClearBit(0);
        if (i >= b)
        {
            throw new RuntimeException("Ran out of texture cache slots.");
        }
        gl10 = e;
        if (gl10 == null) goto _L4; else goto _L3
_L3:
        gl10.glBindTexture(3553, a[i]);
        if (d.get(i)) goto _L6; else goto _L5
_L5:
        gl10.glTexParameterf(3553, 10241, 9728F);
        gl10.glTexParameterf(3553, 10240, 9729F);
        gl10.glTexParameterf(3553, 10242, 33071F);
        gl10.glTexParameterf(3553, 10243, 33071F);
        gl10.glTexEnvf(8960, 8704, 7681F);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        d.set(i);
_L13:
        int j = gl10.glGetError();
        if (j == 0) goto _L8; else goto _L7
_L7:
        ad = String.valueOf(Integer.toString(j));
        if (ad.length() == 0) goto _L10; else goto _L9
_L9:
        ad = "glError: ".concat(ad);
_L11:
        throw new RuntimeException(ad);
_L6:
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        continue; /* Loop/switch isn't completed */
_L10:
        ad = new String("glError: ");
          goto _L11
_L8:
        c.set(i);
        a(ad, Integer.valueOf(i));
_L4:
        bitmap.recycle();
_L2:
        return;
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected final void a(Object obj)
    {
        obj = (Integer)obj;
        if (!c.get(((Integer) (obj)).intValue()))
        {
            obj = String.valueOf(obj);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(obj).length() + 24)).append("Ejecting unused texture ").append(((String) (obj))).toString());
        } else
        {
            c.clear(((Integer) (obj)).intValue());
            return;
        }
    }

    public final void a(GL10 gl10)
    {
        e = gl10;
        gl10.glGenTextures(b, a, 0);
    }
}
