// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class hte extends omn
    implements android.view.View.OnClickListener, fpl
{

    private int ad;
    private hth ae;
    private fnt ai;

    public hte()
    {
        new fpk(ah, this);
    }

    static hth a(hte hte1)
    {
        return hte1.ae;
    }

    static fnt b(hte hte1)
    {
        return hte1.ai;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.xD, viewgroup, false);
        layoutinflater.setOnTouchListener(new htg());
        layoutinflater.findViewById(b.xA).setOnClickListener(this);
        layoutinflater.findViewById(b.xC).setOnClickListener(this);
        ad = layoutinflater.findViewById(b.xz).getPaddingBottom();
        viewgroup = (TextView)layoutinflater.findViewById(b.xB);
        bundle = a(b.xE);
        String s = a(b.xF);
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        spannablestringbuilder.append(bundle).append(" ").append(s).setSpan(new htf(this), bundle.length() + 1, spannablestringbuilder.length(), 17);
        viewgroup.setMovementMethod(LinkMovementMethod.getInstance());
        viewgroup.setText(spannablestringbuilder);
        return layoutinflater;
    }

    public final void a(fpj fpj, Rect rect)
    {
        fpj = super.R;
        if (fpj == null)
        {
            return;
        } else
        {
            fpj = fpj.findViewById(b.xz);
            fpj.setPadding(fpj.getPaddingLeft(), fpj.getPaddingTop(), fpj.getPaddingRight(), ad + rect.bottom);
            return;
        }
    }

    protected final void i(Bundle bundle)
    {
        super.i(bundle);
        ae = (hth)ag.a(hth);
        ai = (fnt)ag.a(fnt);
    }

    public final void onClick(View view)
    {
        ae.a();
    }
}
