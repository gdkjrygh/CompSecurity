// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.spotify.android.paste.widget.SectionHeaderView;

public final class dqt extends dqx
    implements android.view.View.OnClickListener
{

    private final SectionHeaderView k;
    private TextView l;

    public dqt(Context context, doh doh)
    {
        super(dgp.f(context), doh);
        k = (SectionHeaderView)a;
        k.b(false);
        k.b();
    }

    protected final void a(drf drf, doj doj)
    {
        drf = (drd)drf;
        k.a(true);
        k.a(drf.getTitle());
        drf = drf.getButtonText();
        if (drf != null)
        {
            if (l == null)
            {
                doj = k.getContext();
                TextView textview = dgp.a(doj, k);
                dgo.a(doj, textview, 0x7f0b00f2);
                textview.setOnClickListener(this);
                l = textview;
            }
            k.a(l);
            l.setText(drf);
        }
    }

    public final void onClick(View view)
    {
        a(((drd)w()).getButtonLink(), null);
    }
}
