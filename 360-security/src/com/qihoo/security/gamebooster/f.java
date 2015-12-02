// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.facebook.ads.NativeAd;
import com.qihoo.security.adv.AdvDataManager;
import com.qihoo.security.adv.a.c;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo.security.ui.result.AdvData;
import com.qihoo.security.widget.ImageView.RemoteImageView;
import java.util.ArrayList;
import java.util.List;

public class f extends BaseAdapter
{

    private List a;
    private LayoutInflater b;
    private List c;

    public f(Context context, List list)
    {
        c = new ArrayList();
        b = LayoutInflater.from(context);
        a = list;
    }

    public void a()
    {
        if (c != null)
        {
            c.clear();
        }
    }

    public void a(boolean flag)
    {
        if (flag && c.size() > 6)
        {
            c.remove(c.size() - 1);
        }
        com.qihoo.security.adv.a.c.a(com.qihoo.security.adv.AdvDataManager.AdvType.GameBoosterAddRecmdAdvData, c);
        AdvDataManager.a().a(com.qihoo.security.adv.AdvDataManager.AdvReportType.Show, c);
    }

    public int getCount()
    {
        return a.size();
    }

    public Object getItem(int i)
    {
        return a.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = b.inflate(0x7f030068, null);
        }
        view = (AdvData)a.get(i);
        if (c != null && view != null && !c.contains(view))
        {
            c.add(view);
        }
        if (view != null)
        {
            LocaleTextView localetextview = (LocaleTextView)com.qihoo.security.app.f.a(viewgroup, 0x7f0b014d);
            LocaleTextView localetextview1 = (LocaleTextView)com.qihoo.security.app.f.a(viewgroup, 0x7f0b014e);
            RemoteImageView remoteimageview = (RemoteImageView)com.qihoo.security.app.f.a(viewgroup, 0x7f0b014a);
            localetextview.setText(((AdvData) (view)).title);
            localetextview1.setText(((AdvData) (view)).des);
            remoteimageview.a(((AdvData) (view)).icon, 0x7f02015d);
            if (((AdvData) (view)).type == 0)
            {
                ((AdvData) (view)).nativeAd.a(viewgroup);
            }
        }
        return viewgroup;
    }
}
