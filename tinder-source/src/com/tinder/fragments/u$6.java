// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.os.AsyncTask;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tinder.activities.ActivityMain;
import com.tinder.adapters.j;
import com.tinder.managers.a;
import com.tinder.managers.ae;
import com.tinder.model.SparksEvent;
import com.tinder.model.TinderLocation;
import com.tinder.views.LinearAdapterLayout;

// Referenced classes of package com.tinder.fragments:
//            u

final class a
    implements android.view..OnClickListener
{

    final u a;

    public final void onClick(View view)
    {
        int i = a.o.indexOfChild(view);
        boolean flag;
        if (view.getTag() != null && view.getTag().equals("footer"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            u.b(a);
            return;
        }
        if (i == 0)
        {
            a.c.a(null);
            a.p.c.setVisibility(0);
            a.p.b.setColorFilter(j.a);
            view = a.getString(0x7f060128);
            SparksEvent sparksevent = new SparksEvent("Passport.MenuMyLocation");
            sparksevent.put("from", Integer.valueOf(2));
            com.tinder.managers.a.a(sparksevent);
            ((ActivityMain)a.getActivity()).x();
            a.i.setText(view);
            return;
        }
        view = (TinderLocation)a.c.getItem(i - 1);
        ((ActivityMain)a.getActivity()).a(view);
        String s = view.getDisplayLabel();
        if (ae.a())
        {
            a.p.c.setVisibility(4);
            a.p.b.setColorFilter(j.b);
            a.i.setText(s);
            a.c.a(view);
            a.i.setText(s);
        }
        AsyncTask.execute(new Runnable(view) {

            final TinderLocation a;
            final u._cls6 b;

            public final void run()
            {
                SparksEvent sparksevent1 = new SparksEvent("Passport.MenuChooseLocation");
                sparksevent1.put("newLat", Double.valueOf(a.getLatitude()));
                sparksevent1.put("newLon", Double.valueOf(a.getLongitude()));
                com.tinder.managers.a.a(sparksevent1);
            }

            
            {
                b = u._cls6.this;
                a = tinderlocation;
                super();
            }
        });
    }

    _cls1.a(u u1)
    {
        a = u1;
        super();
    }
}
