// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.app.AlertDialog;
import android.content.Context;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.messages.ipc.k;
import com.facebook.o;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.notify.as;
import com.facebook.widget.f;
import java.util.Date;

// Referenced classes of package com.facebook.orca.threadview:
//            f, g

public class e extends f
{

    private as a;
    private k b;
    private NotificationSetting c;
    private TextView d;
    private View e;

    public e(Context context)
    {
        super(context);
        a(context);
    }

    private void a(Context context)
    {
        context = t.a(context);
        a = (as)context.a(com/facebook/orca/notify/as);
        b = (k)context.a(com/facebook/messages/ipc/k);
        setContentView(com.facebook.k.orca_global_alert_message_view);
        d = (TextView)getView(i.global_alert_message);
        d.setOnClickListener(new com.facebook.orca.threadview.f(this));
    }

    static void a(e e1)
    {
        e1.b();
    }

    static k b(e e1)
    {
        return e1.b;
    }

    private void b()
    {
        Context context = getContext();
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
        builder.setTitle(context.getString(o.thread_notifications_dialog_title));
        if (a.b(c))
        {
            builder.setMessage(context.getString(o.global_notifications_muted_msg));
        } else
        {
            builder.setMessage(context.getString(o.global_notifications_disabled_msg));
        }
        builder.setNeutralButton(context.getString(o.global_notifications_goto_settings), new g(this, context));
        builder.setNegativeButton(o.dialog_cancel, null);
        builder.create().show();
    }

    public void a()
    {
label0:
        {
            boolean flag = true;
            c = a.a();
            Object obj = getContext();
            if (!c.a())
            {
                d.setText(((Context) (obj)).getString(o.global_notifications_disabled));
            } else
            if (a.b(c))
            {
                Object obj1 = new Date(c.b() * 1000L);
                obj1 = DateFormat.getTimeFormat(((Context) (obj))).format(((Date) (obj1)));
                obj = ((Context) (obj)).getString(o.global_notifications_muted_until, new Object[] {
                    obj1
                });
                d.setText(((CharSequence) (obj)));
            } else
            {
                flag = false;
            }
            if (e != null)
            {
                if (!flag)
                {
                    break label0;
                }
                setVisibility(0);
                e.setVisibility(8);
            }
            return;
        }
        setVisibility(8);
        e.setVisibility(0);
    }

    public void setHideableView(View view)
    {
        e = view;
    }
}
