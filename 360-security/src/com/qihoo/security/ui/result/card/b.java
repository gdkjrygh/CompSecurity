// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.card;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.recommend.RecommendHelper;
import com.qihoo.security.ui.result.d;
import com.qihoo.security.ui.result.g;
import com.qihoo360.mobilesafe.b.n;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;

// Referenced classes of package com.qihoo.security.ui.result.card:
//            a, c

public class b
{

    public static a a(int i)
    {
        Object obj;
        Object obj1;
        Context context;
        boolean flag;
        context = SecurityApplication.a();
        flag = d.a().a(i);
        obj1 = null;
        obj = obj1;
        i;
        JVM INSTR tableswitch 3 11: default 68
    //                   3 101
    //                   4 279
    //                   5 70
    //                   6 336
    //                   7 70
    //                   8 417
    //                   9 70
    //                   10 70
    //                   11 491;
           goto _L1 _L2 _L3 _L4 _L5 _L4 _L6 _L4 _L4 _L7
_L4:
        break; /* Loop/switch isn't completed */
_L1:
        obj = obj1;
_L9:
        if (obj != null)
        {
            obj.e = flag;
            if (((a) (obj)).h == null)
            {
                obj.h = com.qihoo.security.locale.d.a().a(0x7f0c00e5);
            }
        }
        return ((a) (obj));
_L2:
        c c1 = new c();
        c1.b = 0x7f080003;
        c1.c = 0x7f020058;
        obj = SharedPref.b(context, "sp_key_clear_prescan_total_count");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            flag = false;
        }
        if (flag)
        {
            if (android.os.Build.VERSION.SDK_INT > 10)
            {
                obj = com.qihoo.security.locale.d.a().a(0x7f0c00db, new Object[] {
                    obj
                });
            } else
            {
                obj = com.qihoo.security.locale.d.a().a(0x7f0c00dc, new Object[] {
                    obj
                });
            }
            c1.f = Html.fromHtml(((String) (obj)));
            c1.h = com.qihoo.security.locale.d.a().a(0x7f0c00cf);
            ((c)c1).i = d.a().f();
            obj = c1;
        } else
        {
            obj = (new StringBuilder()).append("RecommendType.").append(com.qihoo.security.recommend.RecommendHelper.RecommendType.Clean.name()).toString();
            c1.f = com.qihoo.security.locale.d.a().a(0x7f0c00da);
            c1.g = RecommendHelper.a().a(((String) (obj)));
            obj = c1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        obj = new a();
        obj.b = 0x7f080004;
        obj.c = 0x7f020057;
        obj.f = com.qihoo.security.locale.d.a().a(0x7f0c00d0);
        obj.g = d.a().e();
        obj.h = com.qihoo.security.locale.d.a().a(0x7f0c00dd);
        continue; /* Loop/switch isn't completed */
_L5:
        c c2 = new c();
        c2.b = 0x7f080005;
        c2.c = 0x7f02005a;
        c2.f = com.qihoo.security.locale.d.a().a(0x7f0c0254);
        c2.g = n.a(0x7f0c00e4, g.a(context), context.getResources().getDimensionPixelSize(0x7f090072), 0xffff0000);
        obj = c2;
        if (flag)
        {
            ((c)c2).i = d.a().g();
            obj = c2;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        obj = new a();
        obj.b = 0x7f080006;
        obj.c = 0x7f020059;
        obj.f = com.qihoo.security.locale.d.a().a(0x7f0c00e0);
        String s = d.a().d();
        obj.g = com.qihoo.security.locale.d.a().a(0x7f0c00e1, new Object[] {
            s
        });
        obj.h = com.qihoo.security.locale.d.a().a(0x7f0c00e2);
        continue; /* Loop/switch isn't completed */
_L7:
        obj = new c();
        ArrayList arraylist = d.a().b();
        if (arraylist.size() > 0)
        {
            ((c)obj).i = arraylist;
            i = ((c.a)arraylist.get(0)).h;
            if (i == 1)
            {
                obj.g = com.qihoo.security.locale.d.a().a(0x7f0c0093);
                obj.h = com.qihoo.security.locale.d.a().a(0x7f0c0096);
            } else
            if (i == 0)
            {
                obj.g = com.qihoo.security.locale.d.a().a(0x7f0c0092);
                obj.h = com.qihoo.security.locale.d.a().a(0x7f0c0095);
            }
        } else
        {
            obj.g = com.qihoo.security.locale.d.a().a(0x7f0c0094);
        }
        obj.b = 0x7f08000b;
        obj.c = 0x7f02008d;
        obj.f = com.qihoo.security.locale.d.a().a(0x7f0c00a0);
        if (true) goto _L9; else goto _L8
_L8:
    }
}
