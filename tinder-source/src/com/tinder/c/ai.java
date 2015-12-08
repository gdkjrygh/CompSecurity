// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
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
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.tinder.c:
//            ag, u

public final class ai extends ag
{

    d F;
    ac G;
    private ReportNotification H;
    private Context I;
    private u J;

    public ai(Context context, ReportNotification reportnotification)
    {
        Object obj;
        StringBuilder stringbuilder;
        Context context1;
        boolean flag = false;
        super(context, 0x103006f);
        ManagerApp.h().a(this);
        setCancelable(false);
        H = reportnotification;
        I = context;
        context = H;
        if (((ReportNotification) (context)).tier > 0)
        {
            flag = true;
        }
        reportnotification = b;
        obj = a;
        Iterator iterator;
        StringBuilder stringbuilder1;
        int i;
        int j;
        if (flag)
        {
            j = 0x7f0601a5;
        } else
        {
            j = 0x7f0601ac;
        }
        reportnotification.setText(((Context) (obj)).getString(j));
        reportnotification = a;
        if (flag)
        {
            j = 0x7f0601a4;
        } else
        {
            j = 0x7f0601ab;
        }
        reportnotification = reportnotification.getString(j);
        obj = a;
        if (flag)
        {
            i = 0x7f0601a3;
        } else
        {
            i = 0x7f0601aa;
        }
        obj = ((Context) (obj)).getString(i);
        stringbuilder = new StringBuilder();
        iterator = ((ReportNotification) (context)).reasons.iterator();
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_346;
        }
        context = (Integer)iterator.next();
        if (stringbuilder.length() > 1)
        {
            stringbuilder.append("<br />");
        }
        stringbuilder1 = (new StringBuilder()).append("&#8226").append(' ');
        context1 = a;
        context.intValue();
        JVM INSTR tableswitch 0 5: default 244
    //                   0 291
    //                   1 302
    //                   2 313
    //                   3 244
    //                   4 324
    //                   5 335;
           goto _L1 _L2 _L3 _L4 _L1 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_335;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        context = context1.getString(0x7f0601a6);
_L10:
        stringbuilder.append(stringbuilder1.append(context).toString());
        if (true) goto _L8; else goto _L7
_L8:
        break MISSING_BLOCK_LABEL_140;
_L7:
        context = context1.getString(0x7f0601a6);
        continue; /* Loop/switch isn't completed */
_L3:
        context = context1.getString(0x7f0601a1);
        continue; /* Loop/switch isn't completed */
_L4:
        context = context1.getString(0x7f06019f);
        continue; /* Loop/switch isn't completed */
_L5:
        context = context1.getString(0x7f06019d);
        continue; /* Loop/switch isn't completed */
        context = context1.getString(0x7f06019c);
        if (true) goto _L10; else goto _L9
_L9:
        context = stringbuilder.toString();
        C.setText(reportnotification);
        D.setText(Html.fromHtml(context));
        E.setText(((CharSequence) (obj)));
        J = new u(I);
        return;
    }

    static u a(ai ai1)
    {
        return ai1.J;
    }

    static ReportNotification b(ai ai1)
    {
        return ai1.H;
    }

    public final void k()
    {
        d.setText(0x7f0601a8);
        f.setText(0x7f0601a9);
        f.setVisibility(0);
        c.setVisibility(8);
        j();
        b();
        f();
        d();
        a(false);
        d.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

            final ai a;

            public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
            {
                a.a(flag);
            }

            
            {
                a = ai.this;
                super();
            }
        });
        f.setOnClickListener(new android.view.View.OnClickListener() {

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
                    b b1 = new b(this) {

                        final _cls2 a;

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
                a = _pcls2;
                super();
            }
                    };
                    view = ((ac) (obj)).a.G;
                    JSONObject jsonobject = new JSONObject();
                    com.tinder.managers.ac._cls5 _lcls5 = new com.tinder.managers.ac._cls5(((ac) (obj)), b1);
                    obj = new com.tinder.managers.ac._cls6(((ac) (obj)), b1);
                    ManagerApp.h().g();
                    view = new com.tinder.a.d(1, view, jsonobject, _lcls5, ((com.android.volley.i.a) (obj)), d.b());
                    ManagerApp.b().a(view);
                }
            }

            
            {
                a = ai.this;
                super();
            }
        });
    }

    public final void show()
    {
        super.show();
        SparksEvent sparksevent = new SparksEvent("Warning.View");
        sparksevent.put("warningLevel", Integer.valueOf(H.tier));
        sparksevent.put("version", Integer.valueOf(1));
        com.tinder.managers.a.a(sparksevent);
    }
}
