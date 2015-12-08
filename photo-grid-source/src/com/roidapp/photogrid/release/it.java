// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import com.roidapp.photogrid.common.az;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageEditor

final class it
    implements Runnable
{

    final ImageEditor a;

    it(ImageEditor imageeditor)
    {
        a = imageeditor;
        super();
    }

    public final void run()
    {
        if (az.q == 2)
        {
            ImageEditor.D(a);
            return;
        }
        if (az.q == 3)
        {
            ImageEditor.E(a);
            return;
        } else
        {
            ImageEditor.F(a);
            return;
        }
    }
}
