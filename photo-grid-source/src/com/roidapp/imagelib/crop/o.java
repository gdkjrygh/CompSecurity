// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.crop;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.util.DisplayMetrics;
import com.roidapp.baselib.a.a;

// Referenced classes of package com.roidapp.imagelib.crop:
//            j

final class o
    implements Runnable
{

    final j a;
    private final String b;

    public o(j j1, String s)
    {
        a = j1;
        super();
        b = s;
    }

    public final void run()
    {
        if (a.getActivity() == null)
        {
            com.roidapp.imagelib.crop.j.a(a, new Exception("activity is finish"), "");
            return;
        }
        int i = a.getActivity().getResources().getDisplayMetrics().widthPixels;
        com.roidapp.baselib.a.a.a();
        android.graphics.Bitmap bitmap = com.roidapp.baselib.a.a.a(b, i);
        if (bitmap == null)
        {
            com.roidapp.imagelib.crop.j.a(a, new OutOfMemoryError("Out Of Memory"), "");
            return;
        } else
        {
            j.h(a).obtainMessage(1, bitmap).sendToTarget();
            return;
        }
    }
}
