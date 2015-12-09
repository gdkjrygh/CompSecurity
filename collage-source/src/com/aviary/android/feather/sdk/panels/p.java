// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import com.aviary.android.feather.library.filters.a;
import com.aviary.android.feather.library.services.IAviaryController;
import com.aviary.android.feather.sdk.widget.AviarySeekBar;
import com.aviary.android.feather.sdk.widget.AviaryWheel;
import com.aviary.android.feather.sdk.widget.i;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            b

public abstract class p extends b
    implements android.view.View.OnClickListener, android.widget.SeekBar.OnSeekBarChangeListener, com.aviary.android.feather.sdk.widget.AviaryWheel.a
{
    static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/aviary/android/feather/sdk/panels/p$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("SeekBarStyle", 0);
            b = new a("WheelStyle", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int j)
        {
            super(s, j);
        }
    }


    private a a;
    AviaryWheel u;
    AviarySeekBar v;
    String w;
    View x;
    View y;

    public p(IAviaryController iaviarycontroller, com.aviary.android.feather.library.a.a a1, com.aviary.android.feather.library.filters.a.a a2, String s)
    {
        super(iaviarycontroller, a1);
        a = a.b;
        k = com.aviary.android.feather.library.filters.a.d(a2);
        w = s;
    }

    public void A()
    {
        super.A();
        x.setOnClickListener(null);
        y.setOnClickListener(null);
        if (a == com.aviary.android.feather.sdk.panels.a.a)
        {
            v.setOnSeekBarChangeListener(null);
            return;
        } else
        {
            u.setOnWheelChangeListener(this);
            return;
        }
    }

    protected abstract void a(int j);

    protected abstract void a(int j, boolean flag);

    public void a(Bitmap bitmap, Bundle bundle)
    {
        super.a(bitmap, bundle);
        x = f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_button_minus);
        y = f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_button_plus);
        if (a == com.aviary.android.feather.sdk.panels.a.a)
        {
            v = (AviarySeekBar)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_seekbar);
            v.setProgress(50);
            return;
        } else
        {
            u = (AviaryWheel)f().findViewById(com.aviary.android.feather.sdk.R.id.aviary_wheel);
            u.setValue(50);
            return;
        }
    }

    public final void a(AviaryWheel aviarywheel)
    {
        a(aviarywheel.getValue());
    }

    public final void a(AviaryWheel aviarywheel, int j)
    {
        a(j, true);
    }

    public volatile void a(boolean flag)
    {
        super.a(flag);
    }

    protected ViewGroup b(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        if (a == com.aviary.android.feather.sdk.panels.a.a)
        {
            return (ViewGroup)layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_panel_seekbar, viewgroup, false);
        } else
        {
            return (ViewGroup)layoutinflater.inflate(com.aviary.android.feather.sdk.R.layout.aviary_panel_wheel, viewgroup, false);
        }
    }

    protected void b()
    {
        if (a == com.aviary.android.feather.sdk.panels.a.a)
        {
            v.setProgress(v.getProgress() - 1);
            return;
        } else
        {
            u.setValue(u.getValue() - 1);
            return;
        }
    }

    protected abstract void b(int j);

    public void b(AviaryWheel aviarywheel)
    {
        b(aviarywheel.getValue());
    }

    protected void c(int j)
    {
        if (a == com.aviary.android.feather.sdk.panels.a.a)
        {
            v.setProgress(j);
            return;
        } else
        {
            u.setValue(j);
            return;
        }
    }

    protected void d()
    {
        if (a == com.aviary.android.feather.sdk.panels.a.a)
        {
            v.setProgress(v.getProgress() + 1);
            return;
        } else
        {
            u.setValue(u.getValue() + 1);
            return;
        }
    }

    public void onClick(View view)
    {
        int j = view.getId();
        if (j == x.getId())
        {
            b();
        } else
        if (j == y.getId())
        {
            d();
            return;
        }
    }

    public final void onProgressChanged(SeekBar seekbar, int j, boolean flag)
    {
        a(j, flag);
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        a(seekbar.getProgress());
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        b(seekbar.getProgress());
    }

    public void z()
    {
        super.z();
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        if (a == com.aviary.android.feather.sdk.panels.a.a)
        {
            v.setOnSeekBarChangeListener(this);
            return;
        } else
        {
            u.setOnWheelChangeListener(this);
            a(new i[] {
                u
            });
            return;
        }
    }
}
