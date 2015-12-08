// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.roidapp.baselib.c.an;
import com.roidapp.baselib.view.FixedDrawerLayout;
import com.roidapp.photogrid.common.al;
import com.roidapp.photogrid.common.b;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageSelector, ig, ih, jt, 
//            kp, jn

final class jm extends Handler
{

    final ImageSelector a;

    jm(ImageSelector imageselector)
    {
        a = imageselector;
        super();
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        message.what;
        JVM INSTR lookupswitch 21: default 188
    //                   4: 189
    //                   5: 236
    //                   6: 271
    //                   7: 306
    //                   11: 406
    //                   12: 450
    //                   14: 594
    //                   15: 618
    //                   16: 659
    //                   17: 835
    //                   18: 847
    //                   19: 539
    //                   20: 869
    //                   21: 892
    //                   22: 971
    //                   23: 1043
    //                   24: 1113
    //                   25: 747
    //                   26: 1121
    //                   27: 1005
    //                   566: 385;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
        return;
_L2:
        if (ImageSelector.a(a) != null)
        {
            if (((Boolean)message.obj).booleanValue())
            {
                ImageSelector.a(a).setVisibility(0);
                return;
            } else
            {
                ImageSelector.a(a).setVisibility(4);
                return;
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (com.roidapp.photogrid.release.ImageSelector.b(a) != null && com.roidapp.photogrid.release.ImageSelector.b(a).getVisibility() != 0)
        {
            com.roidapp.photogrid.release.ImageSelector.b(a).setVisibility(0);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (com.roidapp.photogrid.release.ImageSelector.b(a) != null && com.roidapp.photogrid.release.ImageSelector.b(a).getVisibility() == 0)
        {
            com.roidapp.photogrid.release.ImageSelector.b(a).setVisibility(4);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
        if (a.a == 1)
        {
            an.b(new WeakReference(a), a.getString(0x7f0701f6));
            return;
        } else
        {
            an.b(new WeakReference(a), String.format(a.getString(0x7f0701f7), new Object[] {
                Integer.valueOf(a.a)
            }));
            return;
        }
_L22:
        if (ImageSelector.c(a) != null)
        {
            ImageSelector.c(a).a();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (!ImageSelector.d(a) && !ImageSelector.e(a))
        {
            ImageSelector.f(a).removeMessages(12);
            ImageSelector.a(a, message.arg1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (!ImageSelector.d(a))
        {
            ImageSelector.g(a);
            a.b = (String[])ImageSelector.a(a, ImageSelector.h(a)).toArray(new String[0]);
            a.c = new int[a.b.length];
            a.a(90);
            ImageSelector.a(a, message.arg1);
            return;
        }
        if (true) goto _L1; else goto _L13
_L13:
        String s = a.getResources().getString(0x7f0701a0);
        ImageSelector.i(a).setText((new StringBuilder()).append(s).append(" ").append(message.arg1).append("%").toString());
        return;
_L8:
        an.a(new WeakReference(a), a.getString(0x7f07028d));
        return;
_L9:
        if (!ImageSelector.d(a))
        {
            ImageSelector.a(a, message.arg1, (ig)message.obj);
            ImageSelector.j(a).setVisibility(8);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        if (!ImageSelector.d(a))
        {
            message = (ig)message.obj;
            com.roidapp.photogrid.release.ImageSelector.b(a, ((ig) (message)).n);
            if (ImageSelector.k(a) != null)
            {
                ImageSelector.k(a).remove(message);
            }
            ImageSelector.l(a);
            an.a(new WeakReference(a), a.getResources().getString(0x7f07022b));
            return;
        }
        continue; /* Loop/switch isn't completed */
_L19:
        if (!ImageSelector.d(a))
        {
            message = (ig)message.obj;
            com.roidapp.photogrid.release.ImageSelector.b(a, ((ig) (message)).n);
            if (ImageSelector.k(a) != null)
            {
                ImageSelector.k(a).remove(message);
            }
            ImageSelector.l(a);
            an.a(new WeakReference(a), a.getResources().getString(0x7f070337));
            return;
        }
        if (true) goto _L1; else goto _L11
_L11:
        ImageSelector.a(a, message.obj);
        return;
_L12:
        if (ImageSelector.m(a) != null)
        {
            ImageSelector.m(a).setVisibility(0);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        if (ImageSelector.m(a) != null)
        {
            ImageSelector.m(a).setVisibility(8);
            return;
        }
        if (true) goto _L1; else goto _L15
_L15:
        if (ImageSelector.m(a) != null)
        {
            ImageSelector.m(a).setVisibility(8);
        }
        com.roidapp.photogrid.release.ImageSelector.b(a, message.obj);
        if (ImageSelector.n(a))
        {
            ImageSelector.o(a);
            if (ih.C().M() != null)
            {
                b.a("IS/loadimgs");
                ImageSelector.a(a, ih.C().M());
                return;
            }
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L16:
        if (ImageSelector.m(a) != null)
        {
            ImageSelector.m(a).setVisibility(8);
        }
        ImageSelector.c(a, message.obj);
        return;
_L21:
        if (ImageSelector.m(a) != null)
        {
            ImageSelector.m(a).setVisibility(8);
        }
        ImageSelector.a(a, message.obj, message.arg1);
        return;
_L17:
        if (ImageSelector.m(a) != null)
        {
            ImageSelector.m(a).setVisibility(8);
        }
        message = a;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(message);
        builder.setMessage(0x7f07012f);
        builder.setNegativeButton(0x7f07011c, new jt(message));
        builder.create();
        builder.show();
        return;
_L18:
        ImageSelector.p(a);
        return;
_L20:
        if (!ImageSelector.d(a) && FixedDrawerLayout.g(ImageSelector.q(a)))
        {
            ImageSelector.s(a).a();
            ImageSelector.r(a).f(ImageSelector.q(a));
            postDelayed(new jn(this), 500L);
            return;
        }
        if (true) goto _L1; else goto _L23
_L23:
    }
}
