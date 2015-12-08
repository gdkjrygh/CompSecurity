// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tinder.utils.v;
import java.util.ArrayList;

// Referenced classes of package com.tinder.managers:
//            ManagerNotifications

final class a
    implements android.view.ns._cls4._cls1
{

    final Toast a;
    final a b;

    public final void onClick(View view)
    {
        a.cancel();
    }

    ficationType(ficationType ficationtype, Toast toast)
    {
        b = ficationtype;
        a = toast;
        super();
    }

    // Unreferenced inner class com/tinder/managers/ManagerNotifications$4

/* anonymous class */
    final class ManagerNotifications._cls4
        implements Runnable
    {

        final String a;
        final ManagerNotifications.NotificationType b;
        final String c;
        final ManagerNotifications d;

        public final void run()
        {
            View view;
            TextView textview;
            (new StringBuilder("message=")).append(a).append(", notificationType=").append(b);
            view = ((LayoutInflater)d.a.getSystemService("layout_inflater")).inflate(0x7f0300b5, null);
            LinearLayout linearlayout = (LinearLayout)view.findViewById(0x7f0e0367);
            textview = (TextView)view.findViewById(0x7f0e01b5);
            view.findViewById(0x7f0e0065);
            linearlayout.setBackgroundColor(b.h);
            ManagerNotifications._cls5.a[b.ordinal()];
            JVM INSTR tableswitch 1 5: default 136
        //                       1 237
        //                       2 256
        //                       3 275
        //                       4 334
        //                       5 345;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            v.a("Notification type not found");
            if (TextUtils.isEmpty(a)) goto _L8; else goto _L7
_L7:
            textview.setText(a);
_L10:
            Toast toast = new Toast(d.a);
            toast.setGravity(55, 0, (int)d.a.getResources().getDimension(0x7f090076));
            toast.setDuration(1);
            toast.setView(view);
            d.g.add(toast);
            toast.show();
            textview.setOnClickListener(new ManagerNotifications._cls4._cls1(this, toast));
_L8:
            return;
_L2:
            textview.setText(d.a.getString(0x7f060148));
            continue; /* Loop/switch isn't completed */
_L3:
            textview.setText(d.a.getString(0x7f060143));
            continue; /* Loop/switch isn't completed */
_L4:
            if (c == null)
            {
                textview.setText(d.a.getString(0x7f060144));
            } else
            {
                textview.setText(String.format(d.a.getString(0x7f060149), new Object[] {
                    c
                }));
            }
            continue; /* Loop/switch isn't completed */
_L5:
            textview.setText(a);
            continue; /* Loop/switch isn't completed */
_L6:
            textview.setText(a);
            if (true) goto _L10; else goto _L9
_L9:
        }

            
            {
                d = managernotifications;
                a = s;
                b = notificationtype;
                c = s1;
                super();
            }
    }

}
