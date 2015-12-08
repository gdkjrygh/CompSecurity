// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.weight.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.weight.ui:
//            WeightFragment

public final class WeightFragment_ extends WeightFragment
    implements a, b
{

    private final c j = new c();
    private View k;

    public WeightFragment_()
    {
    }

    private void a(Bundle bundle)
    {
        c.a(this);
    }

    public static a r()
    {
    /* block-local class not found */
    class a {}

        return new a(null);
    }

    public void a(a a1)
    {
        e = a1.findViewById(0x7f11015d);
        d = (ListView)a1.findViewById(0x7f1102d6);
        g = (TextView)a1.findViewById(0x7f110338);
        j();
    }

    public View findViewById(int i)
    {
        if (k == null)
        {
            return null;
        } else
        {
            return k.findViewById(i);
        }
    }

    public void onCreate(Bundle bundle)
    {
        c c1 = c.a(j);
        a(bundle);
        super.onCreate(bundle);
        c.a(c1);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        k = super.onCreateView(layoutinflater, viewgroup, bundle);
        if (k == null)
        {
            k = layoutinflater.inflate(0x7f0400b6, viewgroup, false);
        }
        return k;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        j.a(this);
    }
}
