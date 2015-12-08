// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import com.tinder.a.f;
import com.tinder.e.b;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.a;
import com.tinder.managers.ac;
import com.tinder.managers.d;
import com.tinder.model.ReportNotification;
import com.tinder.model.SparksEvent;
import org.json.JSONObject;

// Referenced classes of package com.tinder.c:
//            ai, u

final class it>
    implements b
{

    final .show a;

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

    it>(it> it>)
    {
        a = it>;
        super();
    }

    // Unreferenced inner class com/tinder/c/ai$2

/* anonymous class */
    final class ai._cls2
        implements android.view.View.OnClickListener
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
                ai._cls2._cls1 _lcls1 = new ai._cls2._cls1(this);
                view = ((ac) (obj)).a.G;
                JSONObject jsonobject = new JSONObject();
                com.tinder.managers.ac._cls5 _lcls5 = new com.tinder.managers.ac._cls5(((ac) (obj)), _lcls1);
                obj = new com.tinder.managers.ac._cls6(((ac) (obj)), _lcls1);
                ManagerApp.h().g();
                view = new com.tinder.a.d(1, view, jsonobject, _lcls5, ((com.android.volley.i.a) (obj)), d.b());
                ManagerApp.b().a(view);
            }
        }

            
            {
                a = ai1;
                super();
            }
    }

}
