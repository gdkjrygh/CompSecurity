// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.view.View;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.template.a.e;
import com.roidapp.cloudlib.template.b.c;
import com.roidapp.cloudlib.template.c.f;
import java.lang.ref.WeakReference;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            TemplateChangeActivity

final class cn
    implements android.view.View.OnClickListener
{

    final TemplateChangeActivity a;

    cn(TemplateChangeActivity templatechangeactivity)
    {
        a = templatechangeactivity;
        super();
    }

    public final void onClick(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 3: default 40
    //                   2131558540: 49
    //                   2131558632: 161
    //                   2131559437: 41;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L4:
        TemplateChangeActivity.a(a);
        return;
_L2:
        if (!TemplateChangeActivity.b(a))
        {
            if (com.roidapp.photogrid.cloud.TemplateChangeActivity.c(a).f())
            {
                an.c(new WeakReference(a), a.getString(0x7f0700e2));
                return;
            }
            TemplateChangeActivity.d(a).c().d();
            com.roidapp.photogrid.cloud.TemplateChangeActivity.e(a);
            switch (com.roidapp.photogrid.cloud.TemplateChangeActivity.f(a))
            {
            default:
                return;

            case 1: // '\001'
                com.roidapp.photogrid.b.f.a("Template_Switch_Refresh", 4, 0);
                return;

            case 2: // '\002'
                com.roidapp.photogrid.b.f.a("Template_Layout_Refresh", 4, 0);
                break;
            }
            return;
        }
          goto _L1
_L3:
        if (TemplateChangeActivity.g(a))
        {
            TemplateChangeActivity.h(a);
        } else
        {
            TemplateChangeActivity.a(a);
        }
        switch (com.roidapp.photogrid.cloud.TemplateChangeActivity.f(a))
        {
        default:
            return;

        case 1: // '\001'
            com.roidapp.photogrid.b.f.a("Template_Switch_Back", 4, 0);
            return;

        case 2: // '\002'
            com.roidapp.photogrid.b.f.a("Template_Layout_Back", 4, 0);
            break;
        }
        return;
    }
}
