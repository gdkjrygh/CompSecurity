// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.app.Activity;
import com.fitbit.data.bl.b;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.f;

// Referenced classes of package com.fitbit.alarm.ui:
//            LogAlarmActivity

class a
    implements com.fitbit.util.Fragment.a
{

    final LogAlarmActivity a;

    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        f.a(new com.fitbit.util.f.a(a) {

            final LogAlarmActivity._cls2 a;

            public void a(Activity activity)
            {
                com.fitbit.data.bl.b.a().b(activity, com.fitbit.alarm.ui.LogAlarmActivity.b(a.a));
            }

            public void a(Object obj)
            {
                b((Activity)obj);
            }

            public void b(Activity activity)
            {
                super.a(activity);
            }

            public void b(Object obj)
            {
                a((Activity)obj);
            }

            
            {
                a = LogAlarmActivity._cls2.this;
                super(activity);
            }
        });
        a.setResult(-1);
        a.finish();
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    _cls1.a(LogAlarmActivity logalarmactivity)
    {
        a = logalarmactivity;
        super();
    }
}
