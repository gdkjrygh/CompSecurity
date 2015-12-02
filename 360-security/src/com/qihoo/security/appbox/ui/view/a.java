// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui.view;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import com.facebook.ads.NativeAd;
import com.qihoo.security.app.f;
import com.qihoo.security.appbox.core.c;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo360.mobilesafe.b.i;
import com.qihoo360.mobilesafe.b.q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.qihoo.security.appbox.ui.view:
//            RemoteIconView

public class a extends com.qihoo.security.c.a.a
    implements android.view.View.OnClickListener
{

    private String c;
    private Set d;
    private float e;

    public a(Context context, List list, String s)
    {
        super(context, list);
        c = null;
        e = 1.956F;
        c = s;
        d = new HashSet();
    }

    public List a()
    {
        return a;
    }

    protected void a(View view, int j, ViewGroup viewgroup)
    {
        RemoteIconView remoteiconview = (RemoteIconView)f.a(view, 0x7f0b007f);
        LocaleTextView localetextview = (LocaleTextView)f.a(view, 0x7f0b0080);
        RatingBar ratingbar = (RatingBar)f.a(view, 0x7f0b0082);
        LocaleTextView localetextview1 = (LocaleTextView)f.a(view, 0x7f0b0081);
        LocaleTextView localetextview2 = (LocaleTextView)f.a(view, 0x7f0b0083);
        View view2 = f.a(view, 0x7f0b007e);
        view2.setOnClickListener(this);
        View view1 = f.a(view, 0x7f0b0084);
        c c1 = (c)getItem(j);
        c1.a(Integer.valueOf(j));
        view2.setTag(c1);
        if (c.equals("0"))
        {
            view = remoteiconview.getLayoutParams();
            j = (int)((float)viewgroup.getMeasuredWidth() / e);
            if (view == null)
            {
                remoteiconview.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, j));
            } else
            {
                view.height = j;
            }
            remoteiconview.b(c1.e, 0x7f02003f);
        } else
        if (c1.c)
        {
            remoteiconview.a(c1.k, 0x7f020041);
        } else
        {
            remoteiconview.b(c1.h, 0x7f020040);
        }
        view = c1.j;
        if (c1.c)
        {
            viewgroup = i.b(b, c1.k);
            if (!TextUtils.isEmpty(viewgroup))
            {
                view = viewgroup;
            }
        }
        localetextview.setLocalText(view);
        if (c1.m != 0.0F)
        {
            ratingbar.setRating(c1.m);
        } else
        {
            ratingbar.setRating(5F);
        }
        localetextview1.setLocalText(c1.b);
        if (c1.o != null)
        {
            localetextview2.setText(c1.s);
            view = c1.o;
            c1.p = true;
            view.a(view1);
            d.add(view);
            return;
        }
        if (c1.c)
        {
            localetextview2.setText(com.qihoo.security.locale.d.a().a(0x7f0c01c3));
            return;
        } else
        {
            localetextview2.setText(com.qihoo.security.locale.d.a().a(0x7f0c01c4));
            return;
        }
    }

    public void a(List list)
    {
        a = list;
        notifyDataSetChanged();
    }

    protected int b()
    {
        return !c.equals("0") ? 0x7f030025 : 0x7f030026;
    }

    public void c()
    {
        Iterator iterator = d.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            NativeAd nativead = (NativeAd)iterator.next();
            if (nativead != null)
            {
                nativead.n();
            }
        } while (true);
        d.clear();
    }

    public void onClick(View view)
    {
        if (com.qihoo360.mobilesafe.b.f.a())
        {
            return;
        }
        c c1 = (c)view.getTag();
        int j = ((Integer)c1.b()).intValue();
        if (c1.o != null)
        {
            view = view.findViewById(0x7f0b0084);
            if (view != null)
            {
                view.performClick();
            }
            com.qihoo.security.appbox.bi.a.a(c1.j, j);
            return;
        }
        if (c1.c)
        {
            view = b.getPackageManager();
            try
            {
                view = view.getLaunchIntentForPackage(c1.k);
                b.startActivity(view);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                q.a().a(0x7f0c01c1);
            }
            c1.c = false;
            notifyDataSetChanged();
        }
        com.qihoo.security.appbox.bi.a.a(c1.k, j);
        com.qihoo.security.support.a.a(b, c1);
    }
}
