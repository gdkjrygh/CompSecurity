// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.b;

import android.graphics.Bitmap;
import com.kik.l.ab;
import com.ndmob.relay.RelayNative;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package kik.android.gifs.b:
//            c, b, a

public final class g extends c
{

    private final ab c;

    protected g(String s, int i, ab ab1)
    {
        super(s, i);
        c = ab1;
    }

    private static Bitmap a(RelayNative relaynative, int i)
    {
        System.nanoTime();
        (new b()).a = new LinkedList();
        int j = Integer.parseInt(relaynative.extractMetadata("frame_width"));
        int k = Integer.parseInt(relaynative.extractMetadata("frame_height"));
        Bitmap bitmap;
        try
        {
            bitmap = Bitmap.createBitmap(j, k * i, android.graphics.Bitmap.Config.RGB_565);
            relaynative.renderBitmapStrip(bitmap);
        }
        // Misplaced declaration of an exception variable
        catch (RelayNative relaynative)
        {
            return null;
        }
        return bitmap;
    }

    private String e()
    {
        return (new StringBuilder()).append(a).append(b).toString();
    }

    protected final b d()
    {
        Object obj2;
        RelayNative relaynative;
        int i;
        boolean flag;
        obj2 = null;
        i = 1;
        flag = false;
        System.nanoTime();
        relaynative = new RelayNative();
        int l;
        int i1;
        relaynative.setDataSource(a);
        int j = Integer.parseInt(relaynative.extractMetadata("duration"));
        l = Integer.parseInt(relaynative.extractMetadata("frame_count"));
        i1 = j / l;
        if (c == null) goto _L2; else goto _L1
_L1:
        Object obj = c.g(e());
        Bitmap bitmap = ((Bitmap) (obj));
        if (obj != null) goto _L3; else goto _L2
_L2:
        bitmap = a(relaynative, l);
        if (bitmap.getWidth() <= b) goto _L5; else goto _L4
_L4:
        obj = bitmap;
        if (i == 0) goto _L7; else goto _L6
_L6:
        int j1;
        int k1;
        j1 = bitmap.getWidth();
        k1 = bitmap.getHeight() / l;
        if (j1 <= k1)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        int k;
        k = b;
        i = (b * k1) / j1;
_L9:
        obj = Bitmap.createScaledBitmap(bitmap, k, i * l, true);
_L7:
        bitmap = ((Bitmap) (obj));
        if (c == null) goto _L3; else goto _L8
_L8:
        c.b(((Bitmap) (obj)), e());
        bitmap = ((Bitmap) (obj));
_L3:
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        boolean flag1 = c();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        relaynative.release();
        return null;
_L5:
        if (bitmap.getHeight() / l <= b)
        {
            i = 0;
        }
        continue; /* Loop/switch isn't completed */
        i = b;
        k = (b * j1) / k1;
          goto _L9
        obj = new b();
        k = bitmap.getWidth();
        j1 = bitmap.getHeight() / l;
        i = ((flag) ? 1 : 0);
_L11:
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        a a1 = new a();
        a1.a = Bitmap.createBitmap(bitmap, 0, i * j1, k, j1);
        a1.b = i1;
        ((b) (obj)).a.add(a1);
        flag1 = c();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        obj = obj2;
        relaynative.release();
        return ((b) (obj));
        i++;
        if (true) goto _L11; else goto _L10
_L10:
        Object obj1;
        obj1;
_L13:
        relaynative.release();
        return null;
        obj1;
        relaynative.release();
        throw obj1;
        obj1;
        if (true) goto _L13; else goto _L12
_L12:
        if (true) goto _L4; else goto _L14
_L14:
    }
}
