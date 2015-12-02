// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.camera;

import android.widget.Toast;
import com.facebook.o;
import java.util.ArrayList;

// Referenced classes of package com.facebook.orca.camera:
//            k, CropImage, CropImageView, m

class l
    implements Runnable
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public void run()
    {
        CropImage cropimage = a.e;
        boolean flag;
        if (a.d > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        cropimage.a = flag;
        if (a.d > 0)
        {
            for (int i = 0; i < a.d; i++)
            {
                k.a(a, a.c[i]);
            }

        } else
        {
            k.a(a);
        }
        CropImage.d(a.e).invalidate();
        if (CropImage.d(a.e).a.size() == 1)
        {
            a.e.c = (m)CropImage.d(a.e).a.get(0);
            a.e.c.a(true);
        }
        if (a.d > 1)
        {
            Toast.makeText(a.e, o.image_crop_multiface_crop_help, 0).show();
        }
    }
}
