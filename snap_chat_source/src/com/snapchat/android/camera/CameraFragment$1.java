// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.camera;

import com.snapchat.android.LandingPageActivity;
import com.snapchat.android.analytics.CameraEventAnalytics;
import com.snapchat.android.camera.cameradecor.CameraDecor;

// Referenced classes of package com.snapchat.android.camera:
//            CameraFragment

final class a
    implements com.snapchat.android.ui.ut.a
{

    private CameraFragment a;

    public final void a(int i, int j, int k)
    {
label0:
        {
            if (i == 2 && j != k)
            {
                if (k != 0)
                {
                    break label0;
                }
                CameraFragment.a(a).e();
            }
            return;
        }
        CameraFragment.a(a).c();
    }

    public final void b(int i, int j, int k)
    {
    }

    public final void b_(int i)
    {
        Object obj = a.H_();
        if (obj instanceof LandingPageActivity)
        {
            obj = (LandingPageActivity)obj;
            if (i == 0)
            {
                ((LandingPageActivity) (obj)).d();
                ((LandingPageActivity) (obj)).e();
            }
            a.d.i();
        }
    }

    aDecor(CameraFragment camerafragment)
    {
        a = camerafragment;
        super();
    }
}
