// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class eqx extends LinearLayout
{

    public TextView a;
    private TextView b;

    public eqx(Context context)
    {
        super(context);
        inflate(getContext(), 0x7f0300c3, this);
        a = (TextView)findViewById(0x1020014);
        b = (TextView)findViewById(0x1020015);
    }

    public final void a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            a.setVisibility(8);
            return;
        } else
        {
            a.setVisibility(0);
            a.setText(s);
            return;
        }
    }

    public final void b(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            b.setVisibility(8);
            return;
        } else
        {
            b.setVisibility(0);
            b.setText(s);
            return;
        }
    }
}
