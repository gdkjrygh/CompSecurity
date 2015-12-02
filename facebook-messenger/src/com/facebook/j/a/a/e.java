// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.j.a.a;

import android.content.Context;
import com.facebook.a.a;
import com.facebook.a.d;
import com.facebook.nativejpeg.BitmapFactory;
import com.facebook.nativejpeg.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.facebook.j.a.a:
//            a, c, b

public class e
    implements com.facebook.j.a.a.a
{

    private final Context a;

    public e(Context context)
    {
        a = context;
    }

    private void a(String s, File file, int i, int j, int k)
    {
        b b1 = new b();
        b1.g = new FileOutputStream(file);
        b1.h = k;
        b1.a = i;
        b1.b = j;
        b1.e = true;
        BitmapFactory.a(s, b1);
        b1.g.close();
    }

    private boolean a(int i)
    {
        return (i - 1 & i) == 0;
    }

    public c a(String s, String s1, int i, int j, c c1)
    {
        File file1 = new File(s1);
        File file = file1;
        if (i >= c1.a * 2)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        file = file1;
        if (j < c1.b * 2)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        file = file1;
        int k = (int)Math.floor(Math.max((float)i / (float)c1.a, (float)j / (float)c1.b));
_L2:
        if (k <= 2)
        {
            break; /* Loop/switch isn't completed */
        }
        file = file1;
        if (a(k))
        {
            break; /* Loop/switch isn't completed */
        }
        k--;
        if (true) goto _L2; else goto _L1
_L1:
        file = file1;
        i /= k;
        file = file1;
        a(s, file1, i, j, c1.c);
        file = file1;
        b b1 = new b();
        file = file1;
        b1.inJustDecodeBounds = true;
        file = file1;
        BitmapFactory.a(s1, b1);
        file = file1;
        j = b1.outWidth;
        file = file1;
        i = b1.outHeight;
        file = file1;
        com.facebook.a.a.a(s, s1, j, i);
        s = new c(j, i, c1.c);
        if (false)
        {
            throw new NullPointerException();
        } else
        {
            return s;
        }
        s;
        file = null;
_L6:
        throw new com.facebook.j.a.a.b("IOException while resizing", s);
        s;
_L3:
        if (file != null && file.exists())
        {
            file.delete();
        }
        throw s;
        s;
        file = null;
_L4:
        throw new com.facebook.j.a.a.b("IOException while resizing", s);
        s;
        file = null;
          goto _L3
        s;
        file = file1;
          goto _L4
        s;
        file = file1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public c a(String s, String s1, c c1)
    {
        b b1 = new b();
        b1.inJustDecodeBounds = true;
        BitmapFactory.a(s, b1);
        return a(s, s1, b1.outWidth, b1.outHeight, c1);
    }
}
