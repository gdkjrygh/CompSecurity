// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.util.Assertion;
import java.util.List;

public final class dsw
{

    public final ViewGroup a;
    List b;
    public dsy c;
    public int d;
    private android.view.View.OnClickListener e;
    private final LayoutInflater f;

    public dsw(LayoutInflater layoutinflater, ViewGroup viewgroup)
    {
        e = new android.view.View.OnClickListener() {

            private dsw a;

            public final void onClick(View view)
            {
                if (a.c == null)
                {
                    return;
                }
                view = (dsx)view.getTag(0x7f1100e8);
                int i = a.b.indexOf(view);
                if (i < 0)
                {
                    Assertion.b("Invalid tab clicked");
                    return;
                } else
                {
                    a.a(i);
                    return;
                }
            }

            
            {
                a = dsw.this;
                super();
            }
        };
        b = ImmutableList.d();
        d = -1;
        f = (LayoutInflater)ctz.a(layoutinflater);
        a = (ViewGroup)f.inflate(0x7f030137, viewgroup, false);
    }

    public final void a()
    {
        a(((List) (ImmutableList.d())));
        a(-1);
    }

    public final void a(int i)
    {
        if (d != i)
        {
            if (i != -1 && c != null)
            {
                dsy dsy1 = c;
                b.get(i);
                dsy1.c(i);
            }
            d = i;
            i = 0;
            while (i < b()) 
            {
                View view = a.getChildAt(i);
                boolean flag;
                if (i == d)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setSelected(flag);
                i++;
            }
        }
    }

    public final void a(List list)
    {
        boolean flag = false;
        b = ImmutableList.a(list);
        for (; b() < a.getChildCount(); a.removeViewAt(a.getChildCount() - 1)) { }
        for (; b() > a.getChildCount(); f.inflate(0x7f030136, a)) { }
        for (int i = 0; i < b(); i++)
        {
            list = (TextView)a.getChildAt(i);
            dsx dsx1 = (dsx)b.get(i);
            list.setText(dsx1.a());
            list.setTag(0x7f1100e8, dsx1);
            list.setOnClickListener(e);
        }

        list = a;
        int j;
        if (b() > 0)
        {
            j = ((flag) ? 1 : 0);
        } else
        {
            j = 8;
        }
        list.setVisibility(j);
    }

    public final int b()
    {
        return b.size();
    }
}
