// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.settings;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.qihoo.security.app.f;
import com.qihoo.security.locale.LocaleInfo;
import com.qihoo.security.locale.c;
import com.qihoo.security.locale.d;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo360.mobilesafe.share.SharedPref;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class a extends com.qihoo.security.c.a.a
{

    private String c;
    private final d d = com.qihoo.security.locale.d.a();

    public a(Context context, List list)
    {
        super(context, list);
        c = "";
        c();
    }

    public void a()
    {
        c();
        notifyDataSetChanged();
    }

    protected void a(View view, int i, ViewGroup viewgroup)
    {
        viewgroup = (LocaleTextView)f.a(view, 0x7f0b017f);
        ImageView imageview = (ImageView)f.a(view, 0x7f0b0023);
        LocaleInfo localeinfo = (LocaleInfo)getItem(i);
        if (TextUtils.isEmpty(c))
        {
            view = "";
        } else
        {
            view = c;
        }
        c = view;
        if (localeinfo.buildin)
        {
            if (c.equals(localeinfo.locale))
            {
                imageview.setImageResource(0x7f020125);
            } else
            {
                imageview.setImageResource(0x7f020126);
            }
        } else
        if (localeinfo.support)
        {
            imageview.setImageResource(0x7f0200ba);
        } else
        if (localeinfo.state == 1)
        {
            imageview.setImageResource(0x7f0200bb);
        } else
        if (localeinfo.state == 2)
        {
            imageview.setImageResource(0x7f0200ba);
        } else
        if (c.equals(localeinfo.locale))
        {
            imageview.setImageResource(0x7f020125);
        } else
        {
            imageview.setImageResource(0x7f020126);
        }
        viewgroup.setLocalText(localeinfo.name);
    }

    protected int b()
    {
        return 0x7f030072;
    }

    public void c()
    {
        boolean flag1 = false;
        a = d.g();
        if (a == null)
        {
            a = new ArrayList();
        }
        c = com.qihoo.security.locale.d.a().f();
        Object obj = a.iterator();
        boolean flag = true;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            LocaleInfo localeinfo = (LocaleInfo)((Iterator) (obj)).next();
            localeinfo.name = com.qihoo.security.locale.c.a(localeinfo.locale);
            if (c.equals(localeinfo.locale))
            {
                flag = false;
            }
        } while (true);
        if (flag)
        {
            SharedPref.a(b, "language", "");
        }
        obj = new LocaleInfo("");
        obj.name = d.a(0x7f0c0166);
        a.add(0, obj);
        obj = new TreeMap();
        String as[] = com.qihoo.security.env.a.e;
        int j = as.length;
        for (int i = ((flag1) ? 1 : 0); i < j; i++)
        {
            String s1 = as[i];
            ((TreeMap) (obj)).put(s1, s1);
        }

        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            LocaleInfo localeinfo1 = (LocaleInfo)iterator.next();
            if (((TreeMap) (obj)).containsKey(localeinfo1.locale))
            {
                ((TreeMap) (obj)).remove(localeinfo1.locale);
            }
        } while (true);
        LocaleInfo localeinfo2;
        for (obj = ((TreeMap) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); a.add(localeinfo2))
        {
            String s = (String)((java.util.Map.Entry)((Iterator) (obj)).next()).getKey();
            localeinfo2 = new LocaleInfo(s, true);
            localeinfo2.name = com.qihoo.security.locale.c.a(s);
        }

    }
}
