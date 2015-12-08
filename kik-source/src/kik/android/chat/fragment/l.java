// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.View;
import com.kik.sdkutils.y;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment

final class l
    implements android.view.View.OnLongClickListener
{

    final CameraFragment a;

    l(CameraFragment camerafragment)
    {
        a = camerafragment;
        super();
    }

    public final boolean onLongClick(View view)
    {
        if (y.a(14))
        {
            if (CameraFragment.s(a))
            {
                CameraFragment.a(a, "torch");
            }
            a.a();
        }
        return true;
    }
}
