// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.photos.assistant.cardui.CardPhotoView;
import java.util.List;

public final class dwa
    implements dvr
{

    final List a;
    final dwj b;
    final List c;
    final ekq d;
    private final int e;
    private final String f;
    private final String g;
    private final String h;
    private final int i;
    private final String j;
    private final String k[];
    private final int l;
    private final int m;
    private final List n;
    private final boolean o;
    private final mjw p;

    dwa(dwh dwh1)
    {
        e = dwh1.a;
        f = dwh1.b;
        g = dwh1.c;
        h = dwh1.d;
        i = dwh1.i;
        j = dwh1.e;
        k = dwh1.f;
        l = dwh1.g;
        m = dwh1.h;
        d = dwh1.n;
        a = dwh1.j;
        b = dwh1.k;
        n = dwh1.l;
        c = dwh1.m;
        o = dwh1.o;
        p = dwh1.p;
    }

    private static void a(ImageView imageview)
    {
        byte byte0;
        if (imageview.getDrawable() == null)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        imageview.setVisibility(byte0);
    }

    private static void a(TextView textview)
    {
        byte byte0;
        if (TextUtils.isEmpty(textview.getText()))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        textview.setVisibility(byte0);
    }

    private void b(dwk dwk1)
    {
        if (n.size() == 0)
        {
            dwk1.v.setVisibility(8);
        } else
        {
            dwk1.v.setVisibility(0);
            dwk1 = dwk1.w;
            int k1 = dwk1.length;
            int i1 = 0;
            int j1 = 0;
            while (i1 < k1) 
            {
                View view = dwk1[i1];
                if (j1 >= n.size())
                {
                    view.setVisibility(8);
                } else
                {
                    dwi dwi1 = (dwi)n.get(j1);
                    b.a(view, new msm(dwi1.c));
                    view.setOnClickListener(new msj(new dwb(this, dwi1)));
                    if (TextUtils.isEmpty(dwi1.d))
                    {
                        view.setText(dwi1.a);
                    } else
                    {
                        view.setText(dwi1.d);
                    }
                    view.setVisibility(0);
                }
                j1++;
                i1++;
            }
        }
    }

    private void c(dwk dwk1)
    {
        Context context = dwk1.o.getContext();
        ImageButton aimagebutton[] = dwk1.x;
        int j1 = aimagebutton.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            ImageButton imagebutton = aimagebutton[i1];
            if (c.isEmpty())
            {
                imagebutton.setVisibility(8);
            } else
            {
                imagebutton.setVisibility(0);
                b.a(imagebutton, new msm(pws.e));
                imagebutton.setOnClickListener(new msj(new dwd(this, context, imagebutton, dwk1)));
            }
            i1++;
        }
    }

    public final int a()
    {
        boolean flag1 = false;
        if (o)
        {
            return q.E;
        }
        boolean flag;
        if (j != null || k != null || l > 0 || m > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return q.S;
        }
        int i1 = ((flag1) ? 1 : 0);
        if (a != null)
        {
            i1 = a.size();
        }
        switch (i1)
        {
        default:
            return q.Q;

        case 0: // '\0'
            return q.R;

        case 1: // '\001'
            return q.K;

        case 2: // '\002'
            return q.L;

        case 3: // '\003'
            return q.M;

        case 4: // '\004'
            return q.N;

        case 5: // '\005'
            return q.O;

        case 6: // '\006'
            return q.P;
        }
    }

    public final void a(dwk dwk1)
    {
        boolean flag = false;
        if (TextUtils.isEmpty(f))
        {
            b.a(dwk1.a, ogh.a(pws.a, e));
        } else
        {
            b.a(dwk1.a, ogh.a(pws.a, e, f));
        }
        if (dwk1.s != null)
        {
            dwk1.s.setText(null);
        }
        if (dwk1.t != null)
        {
            dwk1.t.setText(null);
            dwk1.t.setVisibility(0);
        }
        if (dwk1.r != null)
        {
            dwk1.r.setVisibility(0);
        }
        if (dwk1.q != null)
        {
            dwk1.q.setVisibility(8);
        }
        b.a(dwk1.u, 0);
        if (dwk1.z != null)
        {
            dwl dwl1 = dwk1.z;
            CardPhotoView acardphotoview[] = dwl1.d;
            int l1 = acardphotoview.length;
            for (int i1 = 0; i1 < l1; i1++)
            {
                CardPhotoView cardphotoview = acardphotoview[i1];
                if (cardphotoview != null)
                {
                    cardphotoview.b();
                }
            }

            if (dwl1.a != null)
            {
                dwl1.a.setText(null);
            }
            if (dwl1.b != null)
            {
                dwl1.b.setText(null);
            }
            if (dwl1.c != null)
            {
                dwl1.c.setImageResource(0);
                dwl1.c.setBackgroundResource(0);
                a(dwl1.c);
            }
        }
        if (dwk1.p != null)
        {
            for (int j1 = 0; j1 < dwk1.p.getChildCount(); j1++)
            {
                dwk1.p.getChildAt(j1).setVisibility(8);
            }

        }
        dwk1.s.setText(g);
        if (!TextUtils.isEmpty(h))
        {
            dwk1.t.setText(h);
        } else
        {
            dwk1.t.setVisibility(8);
        }
        b.a(dwk1.u, i);
        if (a != null)
        {
            if (dwk1.y != null)
            {
                dwk1.y.setText(Integer.toString(a.size() - 5));
                b.a(dwk1.y, b.a(dwk1.a.getContext(), pwt.y, (ekp)a.get(4)));
                dwk1.y.setOnClickListener(new msj(new dwc(this, dwk1)));
            }
            Context context = dwk1.o.getContext();
            CardPhotoView acardphotoview1[] = dwk1.z.d;
            int i2 = Math.min(a.size(), acardphotoview1.length);
            for (int k1 = 0; k1 < i2; k1++)
            {
                if (acardphotoview1[k1] != null && a.get(k1) != null)
                {
                    CardPhotoView cardphotoview1 = acardphotoview1[k1];
                    ekp ekp1 = (ekp)a.get(k1);
                    b.a(cardphotoview1, b.a(context, pwt.y, ekp1));
                    cardphotoview1.setOnClickListener(new msj(new dwf(this, context, cardphotoview1, ekp1)));
                }
            }

        }
        dwl dwl2 = dwk1.z;
        Object obj1 = dwk1.a.getContext();
        if (dwl2.a != null)
        {
            if (j != null)
            {
                dwl2.a.setText(j);
            }
            a(dwl2.a);
        }
        if (dwl2.b != null)
        {
            if (k != null)
            {
                Object obj = k;
                if (obj == null || obj.length == 0)
                {
                    obj = null;
                } else
                if (obj.length == 1)
                {
                    obj = obj[0];
                } else
                {
                    obj1 = ((Context) (obj1)).getString(b.ko);
                    obj = (new StringBuilder()).append(obj[0]).append(((String) (obj1))).append(obj[1]).toString();
                }
                dwl2.b.setText(((CharSequence) (obj)));
            }
            a(dwl2.b);
        }
        if (dwl2.c != null)
        {
            dwl2.c.setImageResource(m);
            dwl2.c.setBackgroundResource(l);
            a(dwl2.c);
        }
        if (a != null)
        {
            obj = dwl2.d;
            obj1 = a;
            if (dwl2.a != null || dwl2.b != null || dwl2.c != null)
            {
                flag = true;
            }
            b.a(((CardPhotoView []) (obj)), ((List) (obj1)), flag, p);
        }
        b(dwk1);
        c(dwk1);
    }
}
