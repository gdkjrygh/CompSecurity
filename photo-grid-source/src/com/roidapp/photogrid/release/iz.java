// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.os.Handler;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageEditor, ic

final class iz
    implements Runnable
{

    final int a;
    final int b;
    final ImageEditor c;

    iz(ImageEditor imageeditor, int i, int j)
    {
        c = imageeditor;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        int i = 0;
_L8:
        if (i >= ImageEditor.c(c).size()) goto _L2; else goto _L1
_L1:
        Bitmap bitmap = ((ic)ImageEditor.c(c).get(i)).a(c, c.e[i], a, b);
        if (bitmap == null) goto _L4; else goto _L3
_L3:
        if (!bitmap.isRecycled()) goto _L5; else goto _L4
_L6:
        if (i != 0)
        {
            try
            {
                ImageEditor.G(c);
                ImageEditor.a(c, 144);
                c.h.sendEmptyMessage(ImageEditor.i());
                return;
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
            }
            break MISSING_BLOCK_LABEL_126;
        }
        c.h.sendEmptyMessage(ImageEditor.a());
        return;
        ImageEditor.G(c);
        ImageEditor.a(c, 144);
        c.h.sendEmptyMessage(ImageEditor.i());
        return;
_L2:
        i = 0;
        continue; /* Loop/switch isn't completed */
_L4:
        i = 1;
        if (true) goto _L6; else goto _L5
_L5:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
