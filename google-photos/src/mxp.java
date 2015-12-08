// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class mxp
{

    private final ByteBuffer a;
    private final mxn b;
    private final List c;
    private final mxm d;
    private int e;

    protected mxp(ByteBuffer bytebuffer, mxm mxm1)
    {
        c = new ArrayList();
        a = bytebuffer;
        e = bytebuffer.position();
        d = mxm1;
        mxm1 = new mxk(bytebuffer);
        bytebuffer = mxs.a(mxm1, d);
        b = new mxn(((mxs) (bytebuffer)).a.b.order());
        int i = e;
        e = ((mxs) (bytebuffer)).f + i;
        a.position(0);
        mxm.a(mxm1);
        return;
        bytebuffer;
        mxm1 = null;
_L2:
        mxm.a(mxm1);
        throw bytebuffer;
        bytebuffer;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(mxx mxx1)
    {
        b.a(mxx1);
    }

    protected final boolean a()
    {
        mxk mxk1 = new mxk(a);
        Object obj2;
        obj2 = new mxy[5];
        obj2[0] = b.b(0);
        obj2[1] = b.b(1);
        obj2[2] = b.b(2);
        obj2[3] = b.b(3);
        obj2[4] = b.b(4);
        break MISSING_BLOCK_LABEL_78;
_L22:
        int i;
        mxs1 = mxs.a(mxk1, j, d);
        i = mxs1.a();
        Object obj1 = null;
          goto _L1
_L3:
        i = mxs1.a();
        Object obj;
        obj1 = obj;
          goto _L1
_L26:
        obj1 = obj2[mxs1.b];
        obj = obj1;
        if (obj1 != null) goto _L3; else goto _L2
_L2:
        mxs1.b();
        obj = obj1;
          goto _L3
        obj;
        obj1 = mxk1;
_L21:
        mxm.a(((java.io.Closeable) (obj1)));
        throw obj;
_L27:
        mxx1 = mxs1.c;
        mxx2 = ((mxy) (obj1)).a(mxx1.a);
        obj = obj1;
        if (mxx2 == null) goto _L3; else goto _L4
_L4:
        if (mxx2.d != mxx1.d)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        i = mxx2.b;
        j = mxx1.b;
        if (i == j)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        mxm.a(mxk1);
        return false;
        c.add(new mxq(mxx2, mxx1.g));
        ((mxy) (obj1)).b(mxx1.a);
        obj = obj1;
        if (((mxy) (obj1)).c() != 0) goto _L3; else goto _L5
_L5:
        mxs1.b();
        obj = obj1;
          goto _L3
_L6:
        if (i >= 5)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        obj = obj2[i];
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_311;
        }
        j = ((mxy) (obj)).c();
        if (j > 0)
        {
            mxm.a(mxk1);
            return false;
        }
        i++;
          goto _L6
        a.order(b.c);
        obj = c.iterator();
_L20:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = (mxq)((Iterator) (obj)).next();
        obj1 = ((mxq) (obj2)).b;
        i = ((mxq) (obj2)).a;
        if (!((mxx) (obj1)).b())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("ExifModifier", 2))
        {
            obj2 = String.valueOf(obj1);
            (new StringBuilder(String.valueOf(obj2).length() + 19)).append("modifying tag to: \n").append(((String) (obj2)));
            (new StringBuilder(22)).append("at offset: ").append(i);
        }
        a.position(i + e);
        ((mxx) (obj1)).b;
        JVM INSTR tableswitch 1 10: default 887
    //                   1 524
    //                   2 551
    //                   3 715
    //                   4 614
    //                   5 654
    //                   6 887
    //                   7 524
    //                   8 887
    //                   9 614
    //                   10 654;
           goto _L7 _L8 _L9 _L10 _L11 _L12 _L7 _L8 _L7 _L11 _L12
_L7:
        break; /* Loop/switch isn't completed */
_L8:
        obj2 = new byte[((mxx) (obj1)).d];
        ((mxx) (obj1)).b(((byte []) (obj2)));
        a.put(((byte []) (obj2)));
        break; /* Loop/switch isn't completed */
_L9:
        obj2 = (byte[])((mxx) (obj1)).f;
        if (obj2.length == ((mxx) (obj1)).d)
        {
            obj2[obj2.length - 1] = 0;
            a.put(((byte []) (obj2)));
            break; /* Loop/switch isn't completed */
        }
        a.put(((byte []) (obj2)));
        a.put((byte)0);
        break; /* Loop/switch isn't completed */
_L11:
        j = ((mxx) (obj1)).d;
        i = 0;
_L14:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        a.putInt((int)((mxx) (obj1)).c(i));
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        break; /* Loop/switch isn't completed */
_L12:
        j = ((mxx) (obj1)).d;
        i = 0;
_L16:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2 = ((mxx) (obj1)).d(i);
        a.putInt((int)((myb) (obj2)).a);
        a.putInt((int)((myb) (obj2)).b);
        i++;
        if (true) goto _L16; else goto _L15
_L15:
        break; /* Loop/switch isn't completed */
_L10:
        j = ((mxx) (obj1)).d;
        i = 0;
_L18:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        a.putShort((short)(int)((mxx) (obj1)).c(i));
        i++;
        if (true) goto _L18; else goto _L17
_L17:
        if (true) goto _L20; else goto _L19
_L19:
        mxm.a(mxk1);
        return true;
        obj;
        obj1 = null;
          goto _L21
        mxs mxs1;
        mxx mxx1;
        mxx mxx2;
        int j;
        if (obj2[0] != null)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        i = j;
        if (obj2[1] != null)
        {
            i = j | 2;
        }
        j = i;
        if (obj2[2] != null)
        {
            j = i | 4;
        }
        i = j;
        if (obj2[4] != null)
        {
            i = j | 8;
        }
        j = i;
        if (obj2[3] != null)
        {
            j = i | 0x10;
        }
          goto _L22
_L1:
        if (i == 6) goto _L24; else goto _L23
_L23:
        i;
        JVM INSTR tableswitch 0 1: default 876
    //                   0 127
    //                   1 161;
           goto _L25 _L26 _L27
_L25:
        obj = obj1;
          goto _L3
_L24:
        i = 0;
          goto _L6
    }
}
