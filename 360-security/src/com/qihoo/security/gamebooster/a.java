// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.qihoo.security.app.f;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleButton;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.support.b;
import com.qihoo.security.widget.ImageView.RemoteImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.gamebooster:
//            b

public class a extends com.qihoo.security.c.a.a
{

    protected static final String c = null;
    private final ArrayList d = new ArrayList();
    private final PackageManager e;
    private final Context f;
    private boolean g;

    public a(Context context, List list, PackageManager packagemanager, boolean flag)
    {
        super(context, list);
        e = packagemanager;
        f = context;
        g = flag;
    }

    static ArrayList a(a a1)
    {
        return a1.d;
    }

    static Context b(a a1)
    {
        return a1.f;
    }

    static boolean c(a a1)
    {
        return a1.g;
    }

    public ArrayList a()
    {
        if (d != null)
        {
            return d;
        } else
        {
            return null;
        }
    }

    protected void a(View view, int i, ViewGroup viewgroup)
    {
        viewgroup = (RemoteImageView)com.qihoo.security.app.f.a(view, 0x7f0b0074);
        LocaleTextView localetextview = (LocaleTextView)com.qihoo.security.app.f.a(view, 0x7f0b0075);
        view = (LocaleButton)com.qihoo.security.app.f.a(view, 0x7f0b0076);
        com.qihoo.security.c.a a1 = (com.qihoo.security.c.a)getItem(i);
        localetextview.setLocalText(a1.a.loadLabel(e));
        viewgroup.b(a1.a.packageName, 0x7f020044);
        if (a1.g)
        {
            view.setText(com.qihoo.security.locale.d.a().a(0x7f0c0091));
            view.setTextColor(f.getResources().getColor(0x7f080055));
            view.setEnabled(false);
        } else
        {
            view.setText(com.qihoo.security.locale.d.a().a(0x7f0c0090));
            view.setTextColor(f.getResources().getColor(0x7f080056));
            view.setEnabled(true);
        }
        view.setOnClickListener(new android.view.View.OnClickListener(a1, view) {

            final com.qihoo.security.c.a a;
            final LocaleButton b;
            final a c;

            public void onClick(View view1)
            {
                if (a.g)
                {
                    return;
                }
                a.g = true;
                a.a(c).add(a);
                b.setText(com.qihoo.security.locale.d.a().a(0x7f0c0091));
                b.setTextColor(com.qihoo.security.gamebooster.a.b(c).getResources().getColor(0x7f080055));
                b.setEnabled(false);
                if (a.c(c))
                {
                    com.qihoo.security.support.b.a(11111, a.a.packageName, "1");
                } else
                {
                    com.qihoo.security.support.b.a(11111, a.a.packageName, "0");
                }
                com.qihoo.security.gamebooster.b.a().c(a.a.packageName);
            }

            
            {
                c = a.this;
                a = a2;
                b = localebutton;
                super();
            }
        });
    }

    public void a(ArrayList arraylist)
    {
        a = arraylist;
        arraylist = a.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            com.qihoo.security.c.a a1 = (com.qihoo.security.c.a)arraylist.next();
            if (!a1.a.packageName.equals("com.qihoo.security.lite"))
            {
                continue;
            }
            a.remove(a1);
            break;
        } while (true);
        notifyDataSetChanged();
    }

    protected int b()
    {
        return 0x7f03001e;
    }

}
