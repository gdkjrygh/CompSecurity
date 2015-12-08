// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.d;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import com.appboy.d;
import com.appboy.f.c;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.view.SimpleDraweeView;

// Referenced classes of package com.appboy.ui.d:
//            c

public class b
{

    private static final String a;
    private static boolean b = false;
    private static boolean c = false;
    private static final String d[] = {
        "com.facebook.drawee.backends.pipeline.Fresco", "com.facebook.drawee.interfaces.DraweeController", "com.facebook.drawee.view.SimpleDraweeView", "com.facebook.drawee.backends.pipeline.Fresco", "com.facebook.drawee.controller.BaseControllerListener", "com.facebook.drawee.controller.ControllerListener", "com.facebook.imagepipeline.image.ImageInfo"
    };

    public b()
    {
    }

    public static void a(SimpleDraweeView simpledraweeview, String s, float f, boolean flag)
    {
        while (s == null || simpledraweeview == null) 
        {
            return;
        }
        com.appboy.ui.d.c c1 = new com.appboy.ui.d.c(flag, f, simpledraweeview);
        try
        {
            s = Uri.parse(s);
            simpledraweeview.setController(((PipelineDraweeControllerBuilder)((PipelineDraweeControllerBuilder)((PipelineDraweeControllerBuilder)Fresco.newDraweeControllerBuilder().setUri(s).setAutoPlayAnimations(true)).setTapToRetryEnabled(true)).setControllerListener(c1)).build());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SimpleDraweeView simpledraweeview)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SimpleDraweeView simpledraweeview)
        {
            return;
        }
    }

    public static boolean a(Context context)
    {
        int i;
        boolean flag;
        boolean flag1 = true;
        if (c)
        {
            return b;
        }
        context = context.getApplicationContext();
        Resources resources = context.getResources();
        i = resources.getIdentifier("com_appboy_enable_fresco_library_use", "bool", com.appboy.f.c.a(context));
        String as[];
        Class class1;
        int j;
        if (i != 0)
        {
            flag = resources.getBoolean(i);
        } else
        {
            flag = false;
        }
        context = com/appboy/ui/d/b.getClassLoader();
        as = d;
        j = as.length;
        i = 0;
_L5:
        if (i >= j) goto _L2; else goto _L1
_L1:
        class1 = Class.forName(as[i], false, context);
        if (class1 != null) goto _L4; else goto _L3
_L3:
        i = 0;
_L6:
        c = true;
        if (i != 0 && flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        b = flag;
        return flag;
_L4:
        i++;
          goto _L5
_L2:
        i = 1;
          goto _L6
        context;
        i = 0;
          goto _L6
        context;
        i = 0;
          goto _L6
        context;
        i = 0;
          goto _L6
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/ui/d/b.getName()
        });
    }
}
