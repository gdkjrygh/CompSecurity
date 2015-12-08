// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.fitbit.bluetooth.support.BluetoothSupportStatus;
import com.fitbit.bluetooth.support.a;
import com.fitbit.bluetooth.support.b;
import com.fitbit.pedometer.c;
import com.fitbit.pedometer.e;
import com.fitbit.pedometer.l;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            p

public class m extends com.fitbit.home.ui.tiles.p
{

    private static final String a = "InformationTile";
    private static CharSequence c;
    private TextView b;

    public m()
    {
    }

    public static boolean a(FitbitActivity fitbitactivity)
    {
        c = null;
        if (fitbitactivity != null && fitbitactivity.U() != null)
        {
            boolean flag = p.l();
            if (p.n() && !flag)
            {
                if (e.h() || fitbitactivity.U().c())
                {
                    c = fitbitactivity.getString(0x7f08057e);
                } else
                {
                    c = fitbitactivity.getString(0x7f08057f);
                }
            } else
            if (flag && l.a())
            {
                c = fitbitactivity.getString(0x7f08015a);
            } else
            {
                BluetoothSupportStatus bluetoothsupportstatus = com.fitbit.bluetooth.support.a.a().b();
                fitbitactivity = com.fitbit.bluetooth.support.b.a(fitbitactivity, bluetoothsupportstatus);
                if (fitbitactivity != null && !bluetoothsupportstatus.a().a())
                {
                    c = fitbitactivity;
                }
            }
        }
        return c != null;
    }

    protected boolean N_()
    {
        return false;
    }

    protected int P_()
    {
        return 0x7f04017e;
    }

    protected void R_()
    {
        b.setText(c);
    }

    protected void a(View view)
    {
        super.a(view);
        b = (TextView)view.findViewById(0x7f11042c);
        b.setMovementMethod(LinkMovementMethod.getInstance());
    }

    protected String b()
    {
        return null;
    }

    protected int c()
    {
        return 0;
    }

    public CharSequence f()
    {
        return "";
    }
}
