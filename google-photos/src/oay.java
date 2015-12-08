// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import android.widget.Switch;

public class oay extends oba
{

    private final oaz d;
    private CharSequence e;
    private CharSequence f;

    public oay(Context context)
    {
        this(context, null);
    }

    private oay(Context context, AttributeSet attributeset)
    {
        this(context, null, b.HQ);
    }

    private oay(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset, i, 0);
    }

    private oay(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i);
        d = new oaz(this);
        context = context.obtainStyledAttributes(attributeset, oaw.M, i, 0);
        c(context.getString(oaw.P));
        d(context.getString(oaw.O));
        e = context.getString(oaw.R);
        g();
        f = context.getString(oaw.Q);
        g();
        super.c = context.getBoolean(oaw.N, false);
        context.recycle();
    }

    public void a(View view)
    {
        super.a(view);
        Object obj = view.findViewById(cn.T);
        if (obj != null && (obj instanceof Checkable))
        {
            if (obj instanceof Switch)
            {
                ((Switch)obj).setOnCheckedChangeListener(null);
            }
            ((Checkable)obj).setChecked(a);
            if (obj instanceof Switch)
            {
                obj = (Switch)obj;
                ((Switch) (obj)).setTextOn(e);
                ((Switch) (obj)).setTextOff(f);
                ((Switch) (obj)).setOnCheckedChangeListener(d);
            }
        }
        b(view);
    }
}
