// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.view.View;
import android.widget.TextView;
import com.fitbit.data.domain.device.Device;
import com.fitbit.util.bh;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            q

public class k extends q
{

    private static final String g = "GuideTile";
    private TextView h;

    public k()
    {
    }

    protected void a(View view)
    {
        super.a(view);
        view.setBackgroundResource(0x7f0f0160);
        h = (TextView)view.findViewById(0x7f110416);
    }

    protected int b()
    {
        return 0x7f04016d;
    }

    protected void c()
    {
        String s = null;
        Device device = p.b();
        if (p.a(device))
        {
            s = bh.a(i(), 0x7f080521, new String[] {
                device.j()
            });
        }
        h.setText(s);
    }

    public CharSequence f()
    {
        return "";
    }
}
