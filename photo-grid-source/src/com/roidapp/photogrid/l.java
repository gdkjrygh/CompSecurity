// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.os.Message;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.roidapp.baselib.c.b;
import com.roidapp.cloudlib.ads.s;
import com.roidapp.cloudlib.sns.c.c;
import com.roidapp.cloudlib.sns.topic.e;
import com.roidapp.cloudlib.template.TemplateInfo;
import com.roidapp.cloudlib.template.j;
import com.roidapp.photogrid.b.f;
import com.roidapp.photogrid.common.af;

// Referenced classes of package com.roidapp.photogrid:
//            k, MainPage

final class l
    implements android.view.View.OnClickListener
{

    final k a;

    l(k k1)
    {
        a = k1;
        super();
    }

    public final void onClick(View view)
    {
        if (k.a(a) == null || k.a(a).isFinishing())
        {
            return;
        }
        switch (view.getId())
        {
        default:
            return;

        case 2131558400: 
            a.getActivity();
            b.a("SNS", "click", "SNS/PopularUser/Click");
            af.b(a.getActivity(), "SNS", "click", "SNS/PopularUser/Click", Long.valueOf(1L));
            a.a(new c());
            return;

        case 2131558687: 
            Object obj = (TemplateInfo)view.getTag();
            if (j.a().c(((TemplateInfo) (obj))))
            {
                f.a("MainPage_template_card", 3, 5);
                Message.obtain(com.roidapp.photogrid.k.e(a), 8996, obj).sendToTarget();
                return;
            } else
            {
                f.a("MainPage_template_card", 2, 5);
                TextView textview = (TextView)view.findViewById(0x7f0d0120);
                ProgressBar progressbar = (ProgressBar)view.findViewById(0x7f0d0121);
                textview.setVisibility(8);
                progressbar.setVisibility(0);
                j.c(((TemplateInfo) (obj)).e());
                s.d();
                obj = Message.obtain();
                obj.what = 8985;
                obj.obj = view.getTag();
                com.roidapp.photogrid.k.e(a).sendMessage(((Message) (obj)));
                view.setEnabled(false);
                return;
            }

        case 2131558401: 
            a.getActivity();
            b.a("SNS", "click", "SNS/PopularPost/Click");
            af.b(a.getActivity(), "SNS", "click", "SNS/PopularPost/Click", Long.valueOf(1L));
            view = new com.roidapp.cloudlib.sns.topic.a.b();
            a.a(view);
            return;

        case 2131558682: 
            view = (String[])view.getTag();
            a.getActivity();
            b.a("SNS", "click", (new StringBuilder("SNS/PopularTags/Click/")).append(view[0]).toString());
            a.getActivity();
            b.a("SNS", "click", (new StringBuilder("SNS/PopularTagsColor/Click/")).append(view[1]).toString());
            af.b(a.getActivity(), "SNS", "click", (new StringBuilder("SNS/PopularTags/Click/")).append(view[0]).toString(), Long.valueOf(1L));
            af.b(a.getActivity(), "SNS", "click", (new StringBuilder("SNS/PopularTagsColor/Click/")).append(view[1]).toString(), Long.valueOf(1L));
            e e1 = new e();
            e1.a(view[0], "Explore_Hashtag_%s_Page");
            a.a(e1);
            return;
        }
    }
}
