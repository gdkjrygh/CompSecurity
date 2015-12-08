// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera;

import com.snapchat.android.camera.cameraview.CameraView;
import com.snapchat.android.camera.model.CameraModel;
import qJ;
import qx;
import rr;

// Referenced classes of package com.snapchat.android.camera:
//            CameraFragment

final class <init>
    implements rr
{

    private CameraFragment a;

    public final void a(float f, float f1, float f2)
    {
        a.b.setScaleX(f);
        a.b.setScaleY(f1);
        a.b.setTranslationY(f2);
    }

    public final void a(qx qx)
    {
        if (a.b == null)
        {
            return;
        } else
        {
            a.l.b(a.b, qx, CameraFragment.f(a));
            return;
        }
    }

    public final boolean a()
    {
        return a.i.a();
    }

    public final boolean b()
    {
        boolean flag1 = false;
        CameraModel cameramodel = a.i;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < cameramodel.b)
                {
                    if (!cameramodel.a(i))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public final void c()
    {
        a.b(false);
    }

    public final boolean d()
    {
        return !a.i.e;
    }

    private (CameraFragment camerafragment)
    {
        a = camerafragment;
        super();
    }

    a(CameraFragment camerafragment, byte byte0)
    {
        this(camerafragment);
    }
}
