// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.replace;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.ui.loadable.CircleLoadablePicassoImageView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.device.ui.setup.replace:
//            ConfirmReplacePairedDeviceActivity

public final class ConfirmReplacePairedDeviceActivity_ extends ConfirmReplacePairedDeviceActivity
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

        public a a(int i)
        {
            b.setFlags(i);
            return this;
        }

        public a a(DeviceVersion deviceversion)
        {
            b.putExtra("deviceVersion", deviceversion);
            return this;
        }

        public a a(String s)
        {
            b.putExtra("deviceName", s);
            return this;
        }

        public void b()
        {
            a.startActivity(b);
        }

        public void b(int i)
        {
            if (c != null)
            {
                c.startActivityForResult(b, i);
                return;
            }
            if (a instanceof Activity)
            {
                ((Activity)a).startActivityForResult(b, i);
                return;
            } else
            {
                a.startActivity(b);
                return;
            }
        }

        public a(Context context)
        {
            a = context;
            b = new Intent(context, com/fitbit/device/ui/setup/replace/ConfirmReplacePairedDeviceActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/device/ui/setup/replace/ConfirmReplacePairedDeviceActivity_);
        }
    }


    public static final String f = "deviceName";
    public static final String g = "deviceVersion";
    private final c h = new c();

    public ConfirmReplacePairedDeviceActivity_()
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
        c.a(this);
        f();
        e = com.fitbit.galileo.ui.sync.c.b(this);
    }

    private void f()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("deviceName"))
            {
                c = bundle.getString("deviceName");
            }
            if (bundle.containsKey("deviceVersion"))
            {
                d = (DeviceVersion)bundle.getSerializable("deviceVersion");
            }
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        b = (CircleLoadablePicassoImageView)a1.findViewById(0x7f1100be);
        a = (TextView)a1.findViewById(0x7f1100c1);
        View view = a1.findViewById(0x7f1100c0);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final ConfirmReplacePairedDeviceActivity_ a;

                public void onClick(View view1)
                {
                    a.e();
                }

            
            {
                a = ConfirmReplacePairedDeviceActivity_.this;
                super();
            }
            });
        }
        a1 = a1.findViewById(0x7f1100c3);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final ConfirmReplacePairedDeviceActivity_ a;

                public void onClick(View view1)
                {
                    a.d();
                }

            
            {
                a = ConfirmReplacePairedDeviceActivity_.this;
                super();
            }
            });
        }
        c();
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(h);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f040014);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (org.androidannotations.a.b.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
        h.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        h.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        h.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        f();
    }
}
