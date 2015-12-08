// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

final class ibd extends oay
{

    private final fnp d;
    private TextView e;

    public ibd(Context context)
    {
        super(context);
        d = (fnp)olm.a(context, fnp);
    }

    protected final View a(ViewGroup viewgroup)
    {
        viewgroup = super.a(viewgroup);
        e = (TextView)viewgroup.findViewById(p.aR);
        return viewgroup;
    }

    protected final void a(View view)
    {
        super.a(view);
        if (e != null && !TextUtils.isEmpty(e.getText()))
        {
            d.a(e, e.getText().toString(), fnl.k);
        }
    }
}
