// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import org.androidannotations.a.c.a;
import org.androidannotations.a.c.b;
import org.androidannotations.a.c.c;

// Referenced classes of package com.fitbit.home.ui:
//            DeviceView

public final class DeviceView_ extends DeviceView
    implements a, b
{

    private boolean t;
    private final c u;

    public DeviceView_(Context context)
    {
        super(context);
        t = false;
        u = new c();
        o();
    }

    public DeviceView_(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        t = false;
        u = new c();
        o();
    }

    public DeviceView_(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        t = false;
        u = new c();
        o();
    }

    public static DeviceView a(Context context, AttributeSet attributeset)
    {
        context = new DeviceView_(context, attributeset);
        context.onFinishInflate();
        return context;
    }

    public static DeviceView a(Context context, AttributeSet attributeset, int i)
    {
        context = new DeviceView_(context, attributeset, i);
        context.onFinishInflate();
        return context;
    }

    public static DeviceView b(Context context)
    {
        context = new DeviceView_(context);
        context.onFinishInflate();
        return context;
    }

    private void o()
    {
        c c1 = c.a(u);
        c.a(this);
        b = com.fitbit.galileo.service.b.b(getContext());
        a = com.fitbit.galileo.ui.sync.c.b(getContext());
        c.a(c1);
    }

    public void a(a a1)
    {
        k = (ImageView)a1.findViewById(0x7f1103da);
        m = (ImageView)a1.findViewById(0x7f1103dc);
        d = (ImageView)a1.findViewById(0x7f1103e7);
        h = (LoadablePicassoImageView)a1.findViewById(0x7f1103d7);
        e = (ImageView)a1.findViewById(0x7f1103e5);
        c = (ImageView)a1.findViewById(0x7f1103e6);
        f = (ImageButton)a1.findViewById(0x7f1103e1);
        q = (ImageButton)a1.findViewById(0x7f1103de);
        j = a1.findViewById(0x7f1103d9);
        g = (ImageView)a1.findViewById(0x7f1103e2);
        n = (TextView)a1.findViewById(0x7f1103e4);
        p = (ImageButton)a1.findViewById(0x7f1103e0);
        o = (ImageButton)a1.findViewById(0x7f1103dd);
        l = (TextView)a1.findViewById(0x7f1103db);
        r = (ImageButton)a1.findViewById(0x7f1103df);
        i = (TextView)a1.findViewById(0x7f1103d8);
        s = a1.findViewById(0x7f1103e3);
        View view = a1.findViewById(0x7f1103dd);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final DeviceView_ a;

                public void onClick(View view1)
                {
                    a.d();
                }

            
            {
                a = DeviceView_.this;
                super();
            }
            });
        }
        view = a1.findViewById(0x7f1103de);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final DeviceView_ a;

                public void onClick(View view1)
                {
                    a.e();
                }

            
            {
                a = DeviceView_.this;
                super();
            }
            });
        }
        view = a1.findViewById(0x7f1103e1);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final DeviceView_ a;

                public void onClick(View view1)
                {
                    a.g();
                }

            
            {
                a = DeviceView_.this;
                super();
            }
            });
        }
        view = a1.findViewById(0x7f1103e3);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final DeviceView_ a;

                public void onClick(View view1)
                {
                    a.i();
                }

            
            {
                a = DeviceView_.this;
                super();
            }
            });
        }
        view = a1.findViewById(0x7f1103df);
        if (view != null)
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final DeviceView_ a;

                public void onClick(View view1)
                {
                    a.h();
                }

            
            {
                a = DeviceView_.this;
                super();
            }
            });
        }
        a1 = a1.findViewById(0x7f1103e0);
        if (a1 != null)
        {
            a1.setOnClickListener(new android.view.View.OnClickListener() {

                final DeviceView_ a;

                public void onClick(View view1)
                {
                    a.f();
                }

            
            {
                a = DeviceView_.this;
                super();
            }
            });
        }
        a();
    }

    public void onFinishInflate()
    {
        if (!t)
        {
            t = true;
            inflate(getContext(), 0x7f040145, this);
            u.a(this);
        }
        super.onFinishInflate();
    }
}
