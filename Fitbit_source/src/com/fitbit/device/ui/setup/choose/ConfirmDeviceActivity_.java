// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.choose;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.device.ui.setup.choose:
//            ConfirmDeviceActivity

public final class ConfirmDeviceActivity_ extends ConfirmDeviceActivity
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

        public a a(int l)
        {
            b.setFlags(l);
            return this;
        }

        public a a(TrackerType trackertype)
        {
            b.putExtra("deviceType", trackertype);
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

        public void b(int l)
        {
            if (c != null)
            {
                c.startActivityForResult(b, l);
                return;
            }
            if (a instanceof Activity)
            {
                ((Activity)a).startActivityForResult(b, l);
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
            b = new Intent(context, com/fitbit/device/ui/setup/choose/ConfirmDeviceActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/device/ui/setup/choose/ConfirmDeviceActivity_);
        }
    }


    public static final String i = "deviceName";
    public static final String j = "deviceType";
    private final c k = new c();

    public ConfirmDeviceActivity_()
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
        k();
    }

    static void a(ConfirmDeviceActivity_ confirmdeviceactivity_)
    {
        confirmdeviceactivity_.f();
    }

    private void k()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            if (bundle.containsKey("deviceName"))
            {
                h = bundle.getString("deviceName");
            }
            if (bundle.containsKey("deviceType"))
            {
                g = (TrackerType)bundle.getParcelable("deviceType");
            }
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        a = (TextView)a1.findViewById(0x7f1100b7);
        f = a1.findViewById(0x1020002);
        e = (Button)a1.findViewById(0x7f1100bb);
        d = (Button)a1.findViewById(0x7f1100bc);
        c = (LoadablePicassoImageView)a1.findViewById(0x7f1100ba);
        b = (TextView)a1.findViewById(0x7f1100b8);
        View view = a1.findViewById(0x7f1100bc);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final ConfirmDeviceActivity_ a;

                public void onClick(View view1)
                {
                    com.fitbit.device.ui.setup.choose.ConfirmDeviceActivity_.a(a);
                }

            
            {
                a = ConfirmDeviceActivity_.this;
                super();
            }
            });
        }
        a1 = a1.findViewById(0x7f1100bb);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final ConfirmDeviceActivity_ a;

                public void onClick(View view1)
                {
                    a.j();
                }

            
            {
                a = ConfirmDeviceActivity_.this;
                super();
            }
            });
        }
        c();
    }

    public void onActivityResult(int l, int i1, Intent intent)
    {
        super.onActivityResult(l, i1, intent);
        switch (l)
        {
        default:
            return;

        case 7687: 
            a(i1, intent);
            return;

        case 4905: 
            e_(i1);
            return;

        case 4906: 
            b(i1);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(k);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f040012);
    }

    public boolean onKeyDown(int l, KeyEvent keyevent)
    {
        if (org.androidannotations.a.b.a() < 5 && l == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(l, keyevent);
    }

    public void setContentView(int l)
    {
        super.setContentView(l);
        k.a(this);
    }

    public void setContentView(View view)
    {
        super.setContentView(view);
        k.a(this);
    }

    public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setContentView(view, layoutparams);
        k.a(this);
    }

    public void setIntent(Intent intent)
    {
        super.setIntent(intent);
        k();
    }
}
