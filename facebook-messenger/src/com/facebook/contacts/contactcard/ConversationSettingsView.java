// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Context;
import android.support.v4.app.q;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.base.activity.i;
import com.facebook.contacts.contactcard.entry.LabelValueRowView;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.notify.as;
import com.facebook.orca.prefs.az;
import com.facebook.orca.prefs.n;
import com.facebook.orca.threadview.e;
import com.facebook.prefs.shared.d;
import java.util.Date;

// Referenced classes of package com.facebook.contacts.contactcard:
//            SectionView, y, z, x, 
//            ab

public class ConversationSettingsView extends SectionView
{

    private final d a;
    private final as b;
    private final az c;
    private final LabelValueRowView d;
    private final e e;
    private x f;
    private String g;
    private NotificationSetting h;
    private int i;
    private ab j;
    private av k;

    public ConversationSettingsView(Context context)
    {
        this(context, null);
    }

    public ConversationSettingsView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ConversationSettingsView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        attributeset = getInjector();
        a = (d)attributeset.a(com/facebook/prefs/shared/d);
        b = (as)attributeset.a(com/facebook/orca/notify/as);
        c = (az)attributeset.a(com/facebook/orca/prefs/az);
        k = (av)attributeset.a(com/facebook/analytics/av);
        d = new LabelValueRowView(context);
        d.setLabelText(o.contact_notifications_label);
        d.setOnClickListener(new y(this));
        a(d, false);
        e = new e(context);
        e.setHideableView(d);
        a(e, false);
        j = new z(this);
    }

    private void a(int l)
    {
        l;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 142
    //                   1 197
    //                   2 152
    //                   3 173;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        com.facebook.prefs.shared.ae ae = n.a(g);
        com.facebook.prefs.shared.e e1 = a.b();
        e1.a(ae, h.d());
        e1.a();
        k.a((new cb("set")).f("notification_settings").b("thread_id", g).a("value", l).e("ConverstaionSettingsView"));
        c.c("thread_mute");
        c.c("thread_mute", g);
        a(true);
        return;
_L2:
        h = NotificationSetting.a;
        continue; /* Loop/switch isn't completed */
_L4:
        h = NotificationSetting.a(System.currentTimeMillis() / 1000L + 3600L);
        continue; /* Loop/switch isn't completed */
_L5:
        h = NotificationSetting.a(b.b().getTime() / 1000L);
        continue; /* Loop/switch isn't completed */
_L3:
        h = NotificationSetting.b;
        if (true) goto _L1; else goto _L6
_L6:
    }

    static void a(ConversationSettingsView conversationsettingsview)
    {
        conversationsettingsview.d();
    }

    static void a(ConversationSettingsView conversationsettingsview, int l)
    {
        conversationsettingsview.a(l);
    }

    private void a(boolean flag)
    {
        Object obj = getContext();
        e.a();
        if (b.b(h))
        {
            Object obj1 = new Date(h.b() * 1000L);
            if (((Date) (obj1)).equals(b.b()))
            {
                obj1 = b.b();
                obj1 = DateFormat.getTimeFormat(((Context) (obj))).format(((Date) (obj1)));
                obj = ((Context) (obj)).getString(o.contact_notifications_muted_until, new Object[] {
                    obj1
                });
                d.setValueText(((String) (obj)));
                i = 3;
            } else
            {
                if (flag)
                {
                    d.setValueText(o.contact_notifications_muted_one_hour);
                } else
                {
                    obj1 = DateFormat.getTimeFormat(((Context) (obj))).format(((Date) (obj1)));
                    obj = ((Context) (obj)).getString(o.contact_notifications_muted_until, new Object[] {
                        obj1
                    });
                    d.setValueText(((String) (obj)));
                }
                i = 2;
            }
        } else
        if (h.a())
        {
            d.setValueText(o.contact_notifications_enabled);
            i = 0;
        } else
        {
            d.setValueText(o.contact_notifications_disabled);
            i = 1;
        }
        if (flag && f != null)
        {
            f.c();
        }
    }

    private void c()
    {
        NotificationsSettingsDialogFragment notificationssettingsdialogfragment = (NotificationsSettingsDialogFragment)((i)getContext()).f().a("notifications_dialog");
        if (notificationssettingsdialogfragment != null)
        {
            notificationssettingsdialogfragment.a(j);
            notificationssettingsdialogfragment.a(g, i);
        }
    }

    private void d()
    {
        q q1 = ((i)getContext()).f();
        NotificationsSettingsDialogFragment notificationssettingsdialogfragment = new NotificationsSettingsDialogFragment();
        notificationssettingsdialogfragment.a(g, i);
        notificationssettingsdialogfragment.a(j);
        notificationssettingsdialogfragment.a(q1, "notifications_dialog");
    }

    public void a()
    {
        h = b.a(g);
        a(false);
    }

    public void setContactCardListener(x x1)
    {
        f = x1;
    }

    public void setThreadId(String s)
    {
        g = s;
        a();
        c();
    }

    private class NotificationsSettingsDialogFragment extends DialogFragment
    {

        private int Z;
        private String aa;
        private ab ab;

        static ab a(NotificationsSettingsDialogFragment notificationssettingsdialogfragment)
        {
            return notificationssettingsdialogfragment.ab;
        }

        public void a(ab ab1)
        {
            ab = ab1;
        }

        public void a(String s, int l)
        {
            aa = s;
            Z = l;
        }

        public Dialog c(Bundle bundle)
        {
            Object obj = n();
            bundle = (as)t.a(((Context) (obj))).a(com/facebook/orca/notify/as);
            android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((Context) (obj)));
            builder.setTitle(o.contact_notifications_dialog_label);
            Object obj1 = bundle.b();
            obj1 = DateFormat.getTimeFormat(((Context) (obj))).format(((Date) (obj1)));
            String s;
            String s1;
            int l;
            if (Z == 2)
            {
                bundle = new Date(bundle.a(aa).b() * 1000L);
                bundle = DateFormat.getTimeFormat(((Context) (obj))).format(bundle);
                bundle = ((Context) (obj)).getString(o.contact_notifications_muted_until, new Object[] {
                    bundle
                });
            } else
            {
                bundle = ((Context) (obj)).getString(o.contact_notifications_muted_one_hour);
            }
            s = ((Context) (obj)).getString(o.contact_notifications_enabled);
            s1 = ((Context) (obj)).getString(o.contact_notifications_disabled);
            obj = ((Context) (obj)).getString(o.contact_notifications_muted_until, new Object[] {
                obj1
            });
            l = Z;
            obj1 = new aa(this);
            builder.setSingleChoiceItems(new CharSequence[] {
                s, s1, bundle, obj
            }, l, ((android.content.DialogInterface.OnClickListener) (obj1)));
            return builder.create();
        }

        public NotificationsSettingsDialogFragment()
        {
        }
    }

}
