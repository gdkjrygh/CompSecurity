// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.roidapp.photogrid.common.al;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.be;
import com.roidapp.photogrid.common.c;
import com.roidapp.photogrid.common.y;
import java.util.ArrayList;
import java.util.Map;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageEditor, if, ic, aq, 
//            rf

final class ik extends Handler
{

    final ImageEditor a;

    ik(ImageEditor imageeditor)
    {
        a = imageeditor;
        super();
    }

    public final void handleMessage(Message message)
    {
        int i;
        i = 0;
        super.handleMessage(message);
        if (message.what != ImageEditor.a()) goto _L2; else goto _L1
_L1:
        if (ImageEditor.a(a) != null && ImageEditor.b(a).getChildCount() == 0)
        {
            ImageEditor.b(a).addView(ImageEditor.a(a));
        }
        if (com.roidapp.photogrid.release.ImageEditor.c(a).size() != a.e.length) goto _L4; else goto _L3
_L3:
        i = 0;
_L47:
        if (i >= a.e.length) goto _L6; else goto _L5
_L5:
        message = (if)ImageEditor.d(a).findViewById(i + 1);
        if (message != null) goto _L8; else goto _L7
_L7:
        ImageEditor.e(a);
_L6:
        ImageEditor.a(a, ImageEditor.d(a));
        if (ImageEditor.g(a) && "retato".equals(ImageEditor.h(a)))
        {
            Toast.makeText(a, 0x7f07027c, 1).show();
            ImageEditor.i(a);
            return;
        }
          goto _L9
_L8:
        try
        {
            Log.e("layout sieze", (new StringBuilder()).append(((ic)com.roidapp.photogrid.release.ImageEditor.c(a).get(i)).d).toString());
            com.roidapp.photogrid.release.ImageEditor.c(a).get(i);
            com.roidapp.photogrid.release.ImageEditor.c(a).get(i);
            com.roidapp.photogrid.release.ImageEditor.c(a).get(i);
            com.roidapp.photogrid.release.ImageEditor.c(a).get(i);
            message.b(((ic)com.roidapp.photogrid.release.ImageEditor.c(a).get(i)).a);
            message.a(((ic)com.roidapp.photogrid.release.ImageEditor.c(a).get(i)).a);
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            message.printStackTrace();
            c.a(a.h, message);
            return;
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        ImageEditor.f(a);
          goto _L6
_L2:
        if (message.what != ImageEditor.b())
        {
            break MISSING_BLOCK_LABEL_412;
        }
        if (((Boolean)message.obj).booleanValue())
        {
            ImageEditor.j(a).bringToFront();
            ImageEditor.j(a).setVisibility(0);
            return;
        }
        ImageEditor.j(a).setVisibility(4);
        return;
        if (message.what != ImageEditor.d())
        {
            break MISSING_BLOCK_LABEL_559;
        }
        if (!ImageEditor.k(a))
        {
            break MISSING_BLOCK_LABEL_479;
        }
        Toast.makeText(a, (new StringBuilder()).append(a.getString(0x7f07027e)).append(ImageEditor.l(a)).toString(), 1).show();
_L11:
        System.gc();
        return;
        (new be(a, (ViewGroup)a.findViewById(0x7f0d0260), (String)message.obj, ImageEditor.m(a), false, false, 3000L)).a((new StringBuilder()).append(a.getString(0x7f07027e)).append(ImageEditor.l(a)).toString());
        if (true) goto _L11; else goto _L10
_L10:
        if (message.what == ImageEditor.f())
        {
            a.a(a.g);
            return;
        }
        if (message.what != ImageEditor.g()) goto _L13; else goto _L12
_L12:
        Object obj2;
        int j;
        j = message.arg1;
        obj2 = (aq)ImageEditor.n(a).findViewById(j);
        int k = j - 1;
        if (az.q != 0 || com.roidapp.photogrid.release.ImageEditor.c(a) == null || com.roidapp.photogrid.release.ImageEditor.c(a).size() <= 0) goto _L15; else goto _L14
_L14:
        ((ic)com.roidapp.photogrid.release.ImageEditor.c(a).get(k)).a(a, a.e[k], ((ic)com.roidapp.photogrid.release.ImageEditor.c(a).get(k)).d, ((ic)com.roidapp.photogrid.release.ImageEditor.c(a).get(k)).e);
        ((aq) (obj2)).a(((ic)com.roidapp.photogrid.release.ImageEditor.c(a).get(k)).a);
        obj2.c = a.e[k];
        Object obj1 = null;
_L23:
        Object obj = obj1;
        ImageEditor.a(a, false);
        obj = obj1;
        ImageEditor.j(a).setVisibility(4);
        return;
        obj2;
        obj1 = obj;
        obj = obj2;
_L45:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_808;
        }
        if (!((Bitmap) (obj1)).isRecycled())
        {
            ((Bitmap) (obj1)).recycle();
        }
        ImageEditor.a(a, false);
        obj1 = Message.obtain();
        message.what = ImageEditor.b();
        message.obj = Boolean.valueOf(false);
        a.h.sendMessage(((Message) (obj1)));
        ((OutOfMemoryError) (obj)).printStackTrace();
        ImageEditor.a(a, 161);
        a.h.sendEmptyMessage(ImageEditor.i());
        return;
_L15:
        az.q;
        JVM INSTR tableswitch 0 5: default 2129
    //                   0 999
    //                   1 2129
    //                   2 1028
    //                   3 1050
    //                   4 2129
    //                   5 999;
           goto _L16 _L17 _L16 _L18 _L19 _L16 _L17
_L24:
        rf.a();
        obj1 = rf.a(a.e[k], i, j, Boolean.valueOf(false));
        if (obj1 == null) goto _L21; else goto _L20
_L20:
        obj = obj1;
        if (((Bitmap) (obj1)).isRecycled()) goto _L21; else goto _L22
_L22:
        obj = obj1;
        ((aq) (obj2)).a(((Bitmap) (obj1)));
        obj = obj1;
        obj2.c = a.e[k];
        obj = obj1;
        a.a(k, ((Bitmap) (obj1)));
          goto _L23
_L17:
        rf.a();
        obj = rf.a(((View) (obj2)));
        j = obj[0] + 6;
        i = obj[1] + 6;
          goto _L24
_L18:
        i = rf.a(a);
        j = (int)((float)i * 0.75F);
          goto _L24
_L19:
        j = rf.a(a);
        i = (int)((float)j * 0.75F);
          goto _L24
_L21:
        obj = obj1;
        ImageEditor.f(a);
          goto _L23
_L13:
        if (message.what == ImageEditor.j())
        {
            ImageEditor.b(a, false);
            return;
        }
        if (message.what == ImageEditor.k())
        {
            ImageEditor.b(a, true);
            return;
        }
        if (message.what == ImageEditor.l())
        {
            com.roidapp.photogrid.release.ImageEditor.c(a, false);
            return;
        }
        if (message.what == ImageEditor.m())
        {
            com.roidapp.photogrid.release.ImageEditor.c(a, true);
            return;
        }
        if (message.what == ImageEditor.n())
        {
            ImageEditor.b(a, 10);
            return;
        }
        if (message.what == ImageEditor.o())
        {
            ImageEditor.b(a, -10);
            return;
        }
        if (message.what == ImageEditor.p())
        {
            ImageEditor.b(a, 90);
            return;
        }
        if (message.what == ImageEditor.q())
        {
            ImageEditor.o(a);
            return;
        }
        if (message.what == ImageEditor.r())
        {
            ImageEditor.p(a);
            return;
        }
        if (message.what == ImageEditor.i())
        {
            ImageEditor.f(a);
            return;
        }
        if (message.what == ImageEditor.s())
        {
            ImageEditor.q(a);
            return;
        }
        if (message.what == ImageEditor.t())
        {
            ImageEditor.r(a);
            return;
        }
        if (message.what != ImageEditor.u()) goto _L26; else goto _L25
_L25:
        a.findViewById(0x7f0d024a).setEnabled(true);
        ((ImageView)a.findViewById(0x7f0d024c)).setAlpha(255);
        a.findViewById(0x7f0d024d).setEnabled(true);
        ((ImageView)a.findViewById(0x7f0d024f)).setAlpha(255);
        message.arg1;
        JVM INSTR tableswitch -1 1: default 2135
    //                   -1 1416
    //                   0 2135
    //                   1 1449;
           goto _L27 _L28 _L27 _L29
_L28:
        a.findViewById(0x7f0d024d).setEnabled(false);
        ((ImageView)a.findViewById(0x7f0d024f)).setAlpha(100);
        return;
_L29:
        a.findViewById(0x7f0d024a).setEnabled(false);
        ((ImageView)a.findViewById(0x7f0d024c)).setAlpha(100);
        return;
_L26:
        if (message.what != ImageEditor.v()) goto _L31; else goto _L30
_L30:
        if (ImageEditor.s(a) == null) goto _L9; else goto _L32
_L32:
        i = ImageEditor.s(a).getId();
        message = ImageEditor.n(a).findViewWithTag((new StringBuilder("mask")).append(i - 1).toString());
        if (message == null) goto _L34; else goto _L33
_L33:
        message.setBackgroundColor(0);
_L34:
        ImageEditor.t(a);
        return;
_L31:
        if (message.what == ImageEditor.w())
        {
            ImageEditor.u(a);
            return;
        }
        if (message.what != ImageEditor.a) goto _L36; else goto _L35
_L35:
        message = (Bitmap)message.obj;
        ImageEditor.s(a).a(message);
        i = ImageEditor.s(a).getId() - 1;
        if (!ImageEditor.v(a).containsKey(Integer.valueOf(i))) goto _L38; else goto _L37
_L37:
        ImageEditor.v(a).remove(Integer.valueOf(i));
_L39:
        a.a(i, message);
        ImageEditor.t(a);
        ImageEditor.a(a, false);
        ImageEditor.j(a).setVisibility(4);
        return;
_L38:
        ImageEditor.v(a).put(Integer.valueOf(i), Integer.valueOf(i));
        if (true) goto _L39; else goto _L36
_L36:
        if (message.what == com.roidapp.photogrid.release.ImageEditor.y())
        {
            message = (View)message.obj;
            obj = (FrameLayout)a.findViewById(0x7f0d0239);
            ((FrameLayout) (obj)).removeAllViews();
            obj1 = new android.widget.FrameLayout.LayoutParams(-2, -1);
            obj1.gravity = 17;
            ((FrameLayout) (obj)).addView(message, ((android.view.ViewGroup.LayoutParams) (obj1)));
            ImageEditor.a(a, message);
            ImageEditor.i(a);
            return;
        }
        if (message.what == ImageEditor.z())
        {
            message = (View)message.obj;
            obj = (FrameLayout)a.findViewById(0x7f0d0239);
            ((FrameLayout) (obj)).removeAllViews();
            obj1 = new android.widget.FrameLayout.LayoutParams(-1, -2);
            obj1.gravity = 17;
            ((FrameLayout) (obj)).addView(message, ((android.view.ViewGroup.LayoutParams) (obj1)));
            ImageEditor.a(a, message);
            ImageEditor.i(a);
            return;
        }
        if (message.what != 566) goto _L41; else goto _L40
_L40:
        if (ImageEditor.w(a) != null)
        {
            ImageEditor.w(a).a();
            return;
        }
          goto _L9
_L41:
        if (message.what != 656) goto _L43; else goto _L42
_L42:
        message = a.findViewById(message.arg1);
        if (message == null) goto _L9; else goto _L44
_L44:
        message.invalidate();
        return;
_L43:
        if (message.what == 123)
        {
            c.a(a, (String)message.obj);
            return;
        }
        if (message.what == 16)
        {
            if (ImageEditor.j(a) != null)
            {
                ImageEditor.j(a).setVisibility(4);
            }
            ImageEditor.a(a, false);
            y.a(a);
            return;
        }
        if (message.what == 700)
        {
            if (ImageEditor.j(a) != null)
            {
                ImageEditor.j(a).setVisibility(4);
            }
            ImageEditor.a(a, false);
            y.a(a, (String)message.obj);
            return;
        }
        if (message.what == 701)
        {
            if (ImageEditor.j(a) != null)
            {
                ImageEditor.j(a).setVisibility(4);
            }
            ImageEditor.a(a, false);
            y.b(a, (String)message.obj);
            return;
        }
          goto _L9
        obj;
        obj1 = null;
          goto _L45
_L9:
        return;
_L16:
        j = 0;
          goto _L24
_L27:
        return;
        if (true) goto _L47; else goto _L46
_L46:
    }
}
