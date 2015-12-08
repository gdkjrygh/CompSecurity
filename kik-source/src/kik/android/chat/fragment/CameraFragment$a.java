// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.OrientationEventListener;
import kik.android.c.a;
import kik.android.util.u;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment

private final class > extends OrientationEventListener
{

    final CameraFragment a;

    public final void onOrientationChanged(int i)
    {
        if (i != -1)
        {
            int j = kik.android.chat.fragment.CameraFragment.a(a);
            i = u.b(i, kik.android.chat.fragment.CameraFragment.a(a));
            if (i != 180)
            {
                kik.android.chat.fragment.CameraFragment.a(a, i);
                i = kik.android.chat.fragment.CameraFragment.a(a);
                Object obj = a.getActivity();
                if (obj != null && ((Activity) (obj)).getResources() != null && ((Activity) (obj)).getResources().getConfiguration() != null)
                {
                    obj = ((Activity) (obj)).getResources().getConfiguration();
                    if (((Configuration) (obj)).orientation == CameraFragment.b(a))
                    {
                        if (kik.android.chat.fragment.CameraFragment.a(a) == 0)
                        {
                            CameraFragment.b(a, kik.android.chat.fragment.CameraFragment.a(a));
                        }
                    } else
                    if (kik.android.chat.fragment.CameraFragment.a(a) == 90 || kik.android.chat.fragment.CameraFragment.a(a) == 270)
                    {
                        CameraFragment.b(a, kik.android.chat.fragment.CameraFragment.a(a));
                    }
                    if (j - i != 0 && (kik.android.chat.fragment.CameraFragment.a(a) == 90 || kik.android.chat.fragment.CameraFragment.a(a) == 270) && ((Configuration) (obj)).orientation == 2)
                    {
                        CameraFragment.c(a, kik.android.chat.fragment.CameraFragment.a(a));
                        if (CameraFragment.c(a) != null)
                        {
                            CameraFragment.c(a).a(CameraFragment.d(a));
                            return;
                        }
                    }
                }
            }
        }
    }

    public (CameraFragment camerafragment, Context context)
    {
        a = camerafragment;
        super(context);
    }
}
