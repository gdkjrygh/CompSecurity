// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import java.util.Date;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.food.barcode.ui:
//            BarcodeScannerActivity, BarcodeStatusView, BarcodeCrosshairView

public final class BarcodeScannerActivity_ extends BarcodeScannerActivity
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

        public a a(Date date)
        {
            b.putExtra("logDate", date);
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
            b = new Intent(context, com/fitbit/food/barcode/ui/BarcodeScannerActivity_);
        }

        public a(Fragment fragment)
        {
            c = fragment;
            a = fragment.getActivity();
            b = new Intent(a, com/fitbit/food/barcode/ui/BarcodeScannerActivity_);
        }
    }


    public static final String j = "logDate";
    private final c k = new c();

    public BarcodeScannerActivity_()
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
        b(bundle);
    }

    private void b(Bundle bundle)
    {
        if (bundle == null)
        {
            return;
        } else
        {
            f = (BarcodeScannerActivity.ScanningState)bundle.getSerializable("prevState");
            h = bundle.getParcelableArrayList("uriList");
            e = (BarcodeScannerActivity.ScanningState)bundle.getSerializable("state");
            g = bundle.getString("barcode");
            return;
        }
    }

    private void f()
    {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.containsKey("logDate"))
        {
            i = (Date)bundle.getSerializable("logDate");
        }
    }

    public void a(org.androidannotations.a.c.a a1)
    {
        a = (SurfaceView)a1.findViewById(0x7f110095);
        c = (ToggleButton)a1.findViewById(0x7f110096);
        d = (BarcodeStatusView)a1.findViewById(0x7f110098);
        b = (BarcodeCrosshairView)a1.findViewById(0x7f110097);
        a1 = (CompoundButton)a1.findViewById(0x7f110096);
        if (a1 != null)
        {
            a1.setOnCheckedChangeListener(new android.widget.CompoundButton.OnCheckedChangeListener() {

                final BarcodeScannerActivity_ a;

                public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
                {
                    a.a(compoundbutton, flag);
                }

            
            {
                a = BarcodeScannerActivity_.this;
                super();
            }
            });
        }
        d();
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(k);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
        setContentView(0x7f04000b);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (org.androidannotations.a.b.a() < 5 && i == 4 && keyevent.getRepeatCount() == 0)
        {
            onBackPressed();
        }
        return super.onKeyDown(i, keyevent);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("prevState", f);
        bundle.putParcelableArrayList("uriList", h);
        bundle.putSerializable("state", e);
        bundle.putString("barcode", g);
    }

    public void setContentView(int i)
    {
        super.setContentView(i);
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
        f();
    }
}
