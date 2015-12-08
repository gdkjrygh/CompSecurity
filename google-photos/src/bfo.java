// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.consumerphotoeditor.fragments.ConsumerPhotoEditorActivity;

public final class bfo extends omp
{

    private View a;
    private View b;
    private View c;
    private bdo d;

    public bfo()
    {
        (new msi(pwu.r)).a(ae);
        new msh(af, (byte)0);
    }

    private bdv a(View view)
    {
        bdv bdv1 = new bdv(g().getColor(com.google.android.apps.consumerphotoeditor.R.color.cpe_toolbar_button_highlight), bgb.a, bgb.f);
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            view.setBackgroundDrawable(bdv1);
        } else
        {
            view.setBackground(bdv1);
        }
        view.addOnLayoutChangeListener(new bft(this, bdv1));
        return bdv1;
    }

    static bem a(bfo bfo1)
    {
        return (bem)((am) (bfo1)).B.a("EditorFragment");
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = b(bundle);
        d = ((ConsumerPhotoEditorActivity)O_()).j();
        layoutinflater = layoutinflater.inflate(com.google.android.apps.consumerphotoeditor.R.layout.cpe_toolbar_fragment, viewgroup, false);
        if (layoutinflater == null)
        {
            throw new IllegalStateException("Failed to inflate the toolbar fragment");
        } else
        {
            layoutinflater.setOnTouchListener(new bfp(this));
            int i = g().getInteger(com.google.android.apps.consumerphotoeditor.R.integer.cpe_button_highlight_duration);
            a = layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_looks_tool);
            viewgroup = a(a);
            a.setOnClickListener(new bfq(this, viewgroup, i));
            b = layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_crop_tool);
            viewgroup = a(b);
            b.setOnClickListener(new bfr(this, viewgroup, i));
            c = layoutinflater.findViewById(com.google.android.apps.consumerphotoeditor.R.id.cpe_adjustments_tool);
            viewgroup = a(c);
            c.setOnClickListener(new bfs(this, viewgroup, i));
            r();
            return layoutinflater;
        }
    }

    public final void r()
    {
        boolean flag1 = true;
        if (d != null)
        {
            bdp bdp1 = d.a;
            boolean flag;
            if (a != null)
            {
                View view = a;
                if (bdp1 == bdp.b)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setSelected(flag);
            }
            if (b != null)
            {
                view = b;
                if (bdp1 == bdp.c)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setSelected(flag);
            }
            if (c != null)
            {
                view = c;
                if (bdp1 == bdp.e)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                view.setSelected(flag);
            }
        }
    }
}
