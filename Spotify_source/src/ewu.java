// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.porcelain.view.PorcelainCompactCardView;
import com.spotify.mobile.android.spotlets.onboarding.taste.model.Question;
import java.util.List;

public abstract class ewu extends eql
{

    protected final PorcelainCompactCardView j;
    protected final Context k;
    ewv l;
    int m;

    public ewu(ViewGroup viewgroup)
    {
        super(new PorcelainCompactCardView(viewgroup.getContext()));
        j = (PorcelainCompactCardView)a;
        k = viewgroup.getContext();
        int i = k.getResources().getInteger(0x7f0e0001);
        int i1 = k.getResources().getDimensionPixelSize(0x7f0c008d);
        m = (((gcz)dmz.a(gcz)).b() - i1 * (i + 1)) / i;
    }

    static ewv a(ewu ewu1)
    {
        return ewu1.l;
    }

    public final void a(Object obj, int i)
    {
        obj = (Question)obj;
        j.a(((Question) (obj)).name);
        j.setSelected(((Question) (obj)).isSelected);
        j.a(false);
        j.setOnClickListener(new android.view.View.OnClickListener(((Question) (obj))) {

            private Question a;
            private ewu b;

            public final void onClick(View view)
            {
                view = b.j;
                boolean flag;
                if (!b.j.isSelected())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setSelected(flag);
                a.isSelected = b.j.isSelected();
                if (ewu.a(b) != null)
                {
                    ewu.a(b).a(a);
                }
            }

            
            {
                b = ewu.this;
                a = question;
                super();
            }
        });
        if (((Question) (obj)).images.size() > 0)
        {
            a((String)((Question) (obj)).images.get(0));
        }
    }

    protected abstract void a(String s);
}
