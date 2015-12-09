// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ci;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.pandora.android.provider.b;
import com.pandora.android.util.ThumbImageButton;
import com.pandora.android.util.ae;
import com.pandora.radio.data.aa;
import p.cn.e;
import p.l.d;
import p.l.g;
import p.l.j;

// Referenced classes of package p.ci:
//            a

public class c extends a
    implements com.pandora.android.view.AlbumArtsGallery.a
{

    private e c;
    private String d;

    public c(String s, Context context)
    {
        super(context, false);
        c = e.a();
        d = s;
        notifyDataSetInvalidated();
    }

    static e a(c c1)
    {
        return c1.c;
    }

    public void a(int i, View view, boolean flag)
    {
        view = (a.a)view.getTag();
        if (c() != i)
        {
            ((a.a) (view)).b.setBackgroundResource(0x7f0b0089);
            return;
        } else
        {
            ((a.a) (view)).b.setBackgroundResource(0x7f0200eb);
            return;
        }
    }

    protected void a(View view)
    {
        view = (a.a)view.getTag();
        ((a.a) (view)).d.setOnClickListener(new android.view.View.OnClickListener(view) {

            final a.a a;
            final c b;

            public void onClick(View view1)
            {
                aa aa1 = b.a.b().d().s();
                if (e.a().a(aa1) || !a.h.equals(c.a(b).e()))
                {
                    ae.a(a.i);
                    return;
                } else
                {
                    ae.a((ThumbImageButton)view1, null);
                    return;
                }
            }

            
            {
                b = c.this;
                a = a1;
                super();
            }
        });
        ((a.a) (view)).c.setOnClickListener(new android.view.View.OnClickListener(view) {

            final a.a a;
            final c b;

            public void onClick(View view1)
            {
                aa aa1 = b.a.b().d().s();
                if (e.a().a(aa1) || !a.h.equals(c.a(b).e()))
                {
                    ae.b(a.i);
                    return;
                } else
                {
                    ae.b((ThumbImageButton)view1, null);
                    return;
                }
            }

            
            {
                b = c.this;
                a = a1;
                super();
            }
        });
    }

    public void a(View view, aa aa1)
    {
        a(view, aa1.E());
        boolean flag;
        if (!aa1.B())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = (a.a)view.getTag();
        ((a.a) (view)).d.setPreventFeedback(flag);
        ((a.a) (view)).c.setPreventFeedback(flag);
        if (!flag)
        {
            ((a.a) (view)).d.setEnabled(true);
            ((a.a) (view)).c.setEnabled(true);
        }
        view.a = aa1.B();
    }

    public boolean b(int i)
    {
        return i == getCount() - 1;
    }

    public int getCount()
    {
        return c.b(d);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        aa aa1;
        if (view == null)
        {
            view = a().inflate(0x7f04008d, viewgroup, false);
            viewgroup = new a.a();
            viewgroup.f = (ImageView)view.findViewById(0x7f100180);
            viewgroup.e = view.findViewById(0x7f100182);
            viewgroup.d = (ThumbImageButton)view.findViewById(0x7f100184);
            viewgroup.c = (ThumbImageButton)view.findViewById(0x7f100183);
            viewgroup.b = view.findViewById(0x7f100181);
            view.setTag(viewgroup);
            a(view);
        } else
        {
            viewgroup = (a.a)view.getTag();
        }
        aa1 = c.a(d, i);
        viewgroup.i = aa1;
        viewgroup.h = c.b(aa1.w(), i);
        view.setTag(0x7f100029, aa1);
        g.b(b()).a(aa1.v()).a(0x7f0200e9).a(((a.a) (viewgroup)).f);
        a(aa1, viewgroup);
        a(i, view, false);
        a(view, aa1);
        a(view, aa1.E());
        return view;
    }
}
