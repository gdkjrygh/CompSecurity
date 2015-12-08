// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.crop;

import android.widget.Toast;
import java.util.ArrayList;

// Referenced classes of package com.android.slyce.crop:
//            l, CropImageActivity, CropImageView, n

class m
    implements Runnable
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public void run()
    {
        CropImageActivity cropimageactivity = a.e;
        boolean flag;
        if (a.d > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cropimageactivity.a = flag;
        if (a.d > 0)
        {
            for (int i = 0; i < a.d; i++)
            {
                l.a(a, a.c[i]);
            }

        } else
        {
            l.a(a);
        }
        CropImageActivity.c(a.e).invalidate();
        if (CropImageActivity.c(a.e).a.size() == 1)
        {
            a.e.c = (n)CropImageActivity.c(a.e).a.get(0);
            a.e.c.a(true);
        }
        if (a.d > 1)
        {
            Toast.makeText(a.e, "Multi face crop help", 0).show();
        }
    }
}
