// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.support.v4.view.ViewPager;
import android.view.View;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.template.a.e;
import com.roidapp.cloudlib.template.b.c;
import com.roidapp.photogrid.b.f;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            TemplateSelectorActivity, cu

final class cq
    implements android.view.View.OnClickListener
{

    final TemplateSelectorActivity a;

    cq(TemplateSelectorActivity templateselectoractivity)
    {
        a = templateselectoractivity;
        super();
    }

    public final void onClick(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 5: default 56
    //                   2131558540: 138
    //                   2131558632: 93
    //                   2131558638: 69
    //                   2131558640: 81
    //                   2131558643: 57;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        return;
_L6:
        TemplateSelectorActivity.a(a).setCurrentItem(2);
        return;
_L4:
        TemplateSelectorActivity.a(a).setCurrentItem(0);
        return;
_L5:
        TemplateSelectorActivity.a(a).setCurrentItem(1);
        return;
_L3:
        TemplateSelectorActivity.a(a).getCurrentItem();
        JVM INSTR tableswitch 2 2: default 120
    //                   2 128;
           goto _L7 _L8
_L7:
        TemplateSelectorActivity.b(a);
        return;
_L8:
        f.a("Template_Personal_Back", 4, 0);
          goto _L7
_L2:
        if (TemplateSelectorActivity.a(a).getCurrentItem() == 0 && com.roidapp.photogrid.cloud.TemplateSelectorActivity.c(a)[0])
        {
            if (TemplateSelectorActivity.d(a).f())
            {
                an.c(new WeakReference(a), a.getString(0x7f0700e2));
                return;
            } else
            {
                com.roidapp.photogrid.cloud.TemplateSelectorActivity.c(a)[0] = false;
                ((com.roidapp.cloudlib.template.c.f)com.roidapp.photogrid.cloud.TemplateSelectorActivity.e(a).getItem(0)).c().d();
                TemplateSelectorActivity.d(a).sendEmptyMessage(8983);
                return;
            }
        }
        if (TemplateSelectorActivity.a(a).getCurrentItem() == 1 && com.roidapp.photogrid.cloud.TemplateSelectorActivity.c(a)[1])
        {
            if (TemplateSelectorActivity.d(a).f())
            {
                an.c(new WeakReference(a), a.getString(0x7f0700e2));
                return;
            } else
            {
                com.roidapp.photogrid.cloud.TemplateSelectorActivity.c(a)[1] = false;
                ((com.roidapp.cloudlib.template.c.f)com.roidapp.photogrid.cloud.TemplateSelectorActivity.e(a).getItem(1)).c().d();
                TemplateSelectorActivity.d(a).sendEmptyMessage(8984);
                return;
            }
        }
        if (true) goto _L1; else goto _L9
_L9:
    }
}
