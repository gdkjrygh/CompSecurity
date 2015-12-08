// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.upload;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.roidapp.cloudlib.aq;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import java.io.File;
import java.util.List;

// Referenced classes of package com.roidapp.cloudlib.upload:
//            s, e, f, p, 
//            UploadManagerActivity, q, r

public final class o extends ArrayAdapter
{

    final UploadManagerActivity a;
    private LayoutInflater b;

    public o(UploadManagerActivity uploadmanageractivity, Activity activity, List list)
    {
        a = uploadmanageractivity;
        super(activity, as.ak, list);
        b = LayoutInflater.from(activity);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        e e1;
        Object obj;
        Object obj1;
        boolean flag;
        if (view != null)
        {
            viewgroup = (s)view.getTag();
        } else
        {
            view = b.inflate(as.ak, viewgroup, false);
            viewgroup = new s(this, (byte)0);
            viewgroup.b = (ImageView)view.findViewById(ar.bj);
            viewgroup.c = (TextView)view.findViewById(ar.cK);
            viewgroup.a = (TextView)view.findViewById(ar.cM);
            viewgroup.d = (ImageView)view.findViewById(ar.bk);
            viewgroup.e = (ImageView)view.findViewById(ar.bh);
            view.setTag(viewgroup);
        }
        e1 = (e)getItem(i);
        obj = new File(e1.b);
        ((s) (viewgroup)).c.setText(((File) (obj)).getName());
        ((s) (viewgroup)).a.setText((new StringBuilder()).append(e1.d.substring(0, 1).toUpperCase()).append(e1.d.substring(1)).toString());
        ((s) (viewgroup)).e.setTag(Integer.valueOf(e1.a));
        obj = e1.f;
        obj1 = ((s) (viewgroup)).e;
        ((ImageView) (obj1)).setOnClickListener(null);
        if (obj == f.c)
        {
            ((ImageView) (obj1)).setVisibility(0);
            ((ImageView) (obj1)).setImageResource(aq.S);
            ((ImageView) (obj1)).setOnClickListener(new p(this));
        } else
        {
            ((ImageView) (obj1)).setVisibility(4);
        }
        ((s) (viewgroup)).d.setTag(Integer.valueOf(e1.a));
        obj = e1.f;
        obj1 = ((s) (viewgroup)).d;
        ((ImageView) (obj1)).setClickable(false);
        ((ImageView) (obj1)).setOnClickListener(null);
        ((ImageView) (obj1)).setImageBitmap(null);
        ((ImageView) (obj1)).setBackgroundColor(0);
        if (obj == f.a)
        {
            ((ImageView) (obj1)).setImageResource(aq.u);
        } else
        if (obj == f.b)
        {
            ((ImageView) (obj1)).setBackgroundResource(aq.b);
            ((ImageView) (obj1)).postDelayed(new q(this, ((ImageView) (obj1))), 200L);
        } else
        if (obj == f.c)
        {
            ((ImageView) (obj1)).setClickable(true);
            ((ImageView) (obj1)).setImageResource(aq.L);
            ((ImageView) (obj1)).setOnClickListener(new r(this));
        } else
        if (obj == f.d)
        {
            ((ImageView) (obj1)).setImageResource(aq.t);
        }
        obj = a;
        viewgroup = ((s) (viewgroup)).b;
        obj1 = e1.h;
        if (e1.e != null && e1.e.startsWith("video/"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        UploadManagerActivity.a(((UploadManagerActivity) (obj)), viewgroup, ((String) (obj1)), flag);
        return view;
    }

    public final boolean isEnabled(int i)
    {
        return false;
    }
}
