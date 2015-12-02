// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.prefs;

import android.content.Context;
import android.preference.CheckBoxPreference;
import android.text.format.DateFormat;
import com.facebook.inject.t;
import com.facebook.o;
import com.facebook.orca.notify.NotificationSetting;
import com.facebook.orca.notify.as;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.e;
import java.util.Date;

// Referenced classes of package com.facebook.orca.prefs:
//            n

public class q extends CheckBoxPreference
{

    private d a;
    private as b;
    private NotificationSetting c;

    public q(Context context)
    {
        super(context);
        context = t.a(context);
        a = (d)context.a(com/facebook/prefs/shared/d);
        b = (as)context.a(com/facebook/orca/notify/as);
        c = b.a();
        setDefaultValue(Boolean.valueOf(true));
        setKey(n.n.a());
        setSummary(a());
    }

    private String a()
    {
        Context context = getContext();
        if (b.b(c))
        {
            Object obj = new Date(c.b() * 1000L);
            obj = DateFormat.getTimeFormat(context).format(((Date) (obj)));
            return context.getString(o.preference_notifications_muted_until, new Object[] {
                obj
            });
        }
        if (c.a())
        {
            return null;
        } else
        {
            return context.getString(o.preference_notifications_disabled);
        }
    }

    protected void onSetInitialValue(boolean flag, Object obj)
    {
        if (!b.b(c))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChecked(flag);
    }

    public void setChecked(boolean flag)
    {
        super.setChecked(flag);
        ae ae1;
        e e1;
        if (flag)
        {
            c = NotificationSetting.a;
        } else
        {
            c = NotificationSetting.a(System.currentTimeMillis() / 1000L + 28800L);
        }
        ae1 = com.facebook.orca.prefs.n.o;
        e1 = a.b();
        e1.a(ae1, c.d());
        e1.a();
        setSummary(a());
    }
}
