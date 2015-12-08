// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import com.fitbit.data.domain.device.TrackerType;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.synclair.ui:
//            SynclairActivity

public final class SynclairActivity_ extends SynclairActivity
    implements org.androidannotations.a.c.a, b
{
    public static class a
    {

        private Context a;
        private final Intent b;
        private Fragment c;

        public Intent a()
        {
            return b;
        }

        public a a(int i1)
        {
            b.setFlags(i1);
            return this;
        }

        public a a(TrackerType trackertype)
        {
            b.putExtra("deviceType", trackertype);
            return this;
        }

        public a a(Boolean boolean1)
        {
            b.putExtra("restoreFromNotification", boolean1);
            return this;
        }

        public a a(String s)
        {
            b.putExtra("controllerType", s);
            return this;
        }

        public a b(String s)
        {
            b.putExtra("deviceAddress", s);
            return this;
        }

        public void b()
        {
            a.startActivity(b);
        }

        public void b(int i1)
        {
            if (c != null)
            {
                c.startActivityForResult(b, i1);
                return;
            }
            if (a instanceof Activity)
            {
                ((Activity)a).startActivityForResult(b, i1);
                return;
            } else
            {
                a.startActivity(b);
                return;
            }
        }

        public a c(String s)
        {
            b.putExtra("deviceName", s);
            return this;
        }

        public a(Context context)
        {
            a = context;
            b = new Intent(context, com/fitbit/synclair/ui/SynclairActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/synclair/ui/SynclairActivity_);
        }
    }


    public static final String i = "controllerType";
    public static final String j = "deviceAddress";
    public static final String k = "deviceType";
    public static final String l = "restoreFromNotification";
    public static final String m = "deviceName";
    private final c n = new c();

    public SynclairActivity_()
    {
    }

    public static a a(Context context)
    {
        return new a(context);
    }

    public static a a(Fragment fragment)
    {
        return new a(fragment);
    }

    private void a(Bundle bundle)
    {
        ab();
        c.a(this);
    }

    private void ab()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("controllerType"))
            {
                e = bundle.getString("controllerType");
            }
            if (bundle.containsKey("deviceAddress"))
            {
                g = bundle.getString("deviceAddress");
            }
            if (bundle.containsKey("deviceType"))
            {
                d = (TrackerType)bundle.getParcelable("deviceType");
            }
            if (bundle.containsKey("restoreFromNotification"))
            {
                h = (Boolean)bundle.getSerializable("restoreFromNotification");
            }
            if (bundle.containsKey("deviceName"))
            {
                f = bundle.getString("deviceName");
            }
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        g();
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(n);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f04003c);
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (org.androidannotations.a.b.a() < 5 && i1 == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i1, keyevent);
    }

    public void setContentView(int i1)
    {
        super.setContentView(i1);
        n.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        n.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        n.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        ab();
    }
}
