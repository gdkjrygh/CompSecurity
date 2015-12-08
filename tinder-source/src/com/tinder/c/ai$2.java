// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import com.tinder.a.d;
import com.tinder.a.f;
import com.tinder.e.b;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.ac;
import com.tinder.model.ReportNotification;
import com.tinder.model.SparksEvent;
import org.json.JSONObject;

// Referenced classes of package com.tinder.c:
//            ai, u

final class init>
    implements android.view.OnClickListener
{

    final ai a;

    public final void onClick(View view)
    {
        if (a.d.isChecked())
        {
            com.tinder.c.ai.a(a).show();
            view = new SparksEvent("Warning.Acknowledge");
            view.put("warningLevel", Integer.valueOf(com.tinder.c.ai.b(a).tier));
            view.put("version", Integer.valueOf(1));
            com.tinder.managers.a.a(view);
            Object obj = a.G;
            b b = new b() {

                final ai._cls2 a;

                public final void a()
                {
                    a.a.F.e();
                    com.tinder.c.ai.a(a.a).dismiss();
                    a.a.dismiss();
                }

                public final void b()
                {
                    com.tinder.c.ai.a(a.a).dismiss();
                    Toast.makeText(a.a.a, 0x7f0601a7, 1).show();
                }

            
            {
                a = ai._cls2.this;
                super();
            }
            };
            view = ((ac) (obj)).a.G;
            JSONObject jsonobject = new JSONObject();
            com.tinder.managers.ent ent = new com.tinder.managers.<init>(((ac) (obj)), b);
            obj = new com.tinder.managers.<init>(((ac) (obj)), b);
            ManagerApp.h().g();
            view = new d(1, view, jsonobject, ent, ((com.android.volley.p.h) (obj)), com.tinder.managers.d.b());
            ManagerApp.b().a(view);
        }
    }

    init>(ai ai1)
    {
        a = ai1;
        super();
    }
}
