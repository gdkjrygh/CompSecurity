// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.artist;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.f;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.widget.ResolverDrawerLayout;
import com.pandora.android.data.l;
import com.pandora.android.util.s;
import com.pandora.radio.data.b;
import com.pandora.radio.util.k;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p.cw.c;

public class e extends f
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener, android.widget.AdapterView.OnItemClickListener
{
    class a extends BaseAdapter
    {

        final e a;
        private List b;

        public ResolveInfo a(int i)
        {
            switch (getItemViewType(i))
            {
            default:
                throw new IllegalArgumentException();

            case 0: // '\0'
            case 1: // '\001'
                return (ResolveInfo)b.get(i);
            }
        }

        public List a()
        {
            return b;
        }

        public void a(List list)
        {
            b = list;
            notifyDataSetChanged();
        }

        public int getCount()
        {
            return b.size();
        }

        public Object getItem(int i)
        {
            return a(i);
        }

        public long getItemId(int i)
        {
            return (long)i;
        }

        public int getItemViewType(int i)
        {
            return i != 0 ? 0 : 1;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            View view1;
            int j;
label0:
            {
                j = getItemViewType(i);
                if (view != null)
                {
                    view1 = view;
                    if (view.getId() == 0x7f100077)
                    {
                        break label0;
                    }
                }
                view1 = LayoutInflater.from(a.getActivity()).inflate(0x7f04001d, viewgroup, false);
            }
            view = a.getActivity().getPackageManager();
            viewgroup = a(i);
            switch (j)
            {
            default:
                throw new IllegalArgumentException();

            case 0: // '\0'
                ((ImageView)view1.findViewById(0x7f100078)).setImageDrawable(viewgroup.loadIcon(view));
                ((TextView)view1.findViewById(0x7f100044)).setText(viewgroup.loadLabel(view));
                return view1;

            case 1: // '\001'
                ((ImageView)view1.findViewById(0x7f100078)).setImageResource(((ResolveInfo) (viewgroup)).icon);
                break;
            }
            ((TextView)view1.findViewById(0x7f100044)).setText(((ResolveInfo) (viewgroup)).labelRes);
            return view1;
        }

        public int getViewTypeCount()
        {
            return 2;
        }

        a()
        {
            a = e.this;
            super();
        }
    }


    private a a;
    private Intent b;
    private l c;

    public e()
    {
    }

    private Intent a(ResolveInfo resolveinfo)
    {
        resolveinfo = new ComponentName(resolveinfo.activityInfo.packageName, resolveinfo.activityInfo.name);
        Intent intent = new Intent(b);
        intent.setComponent(resolveinfo);
        return intent;
    }

    public static e a(l l1, Intent intent)
    {
        e e1 = new e();
        Bundle bundle = new Bundle();
        bundle.putSerializable("pandora.landing_page_data", l1);
        bundle.putParcelable("intent_followon_intent", intent);
        e1.setArguments(bundle);
        return e1;
    }

    private void a()
    {
        PackageManager packagemanager = getActivity().getPackageManager();
        ArrayList arraylist = new ArrayList(packagemanager.queryIntentActivities(b, 0));
        if (arraylist != null)
        {
            Collections.sort(arraylist, new android.content.pm.ResolveInfo.DisplayNameComparator(packagemanager));
            a(((List) (arraylist)));
            b(arraylist);
        }
    }

    private void a(View view)
    {
        view = (ListView)view.findViewById(0x7f1000a2);
        view.setAdapter(a);
        view.setOnItemClickListener(this);
    }

    private void a(String s1, com.pandora.radio.util.k.l l1)
    {
        if (c != null)
        {
            b b1 = c.f();
            if (b1 != null && b1.c())
            {
                com.pandora.android.provider.b.a.b().o().a(s1, l1, b1);
            } else
            if (c.g() > 0L)
            {
                com.pandora.android.provider.b.a.b().o().a(s1, l1, c.g());
                return;
            }
        }
    }

    private void a(List list)
    {
        Object obj = list.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ResolveInfo resolveinfo = (ResolveInfo)((Iterator) (obj)).next();
            if (!resolveinfo.activityInfo.name.equals("com.google.android.apps.docs.app.SendTextToClipboardActivity"))
            {
                continue;
            }
            list.remove(resolveinfo);
            break;
        } while (true);
        obj = new ResolveInfo();
        obj.icon = 0x7f020100;
        obj.labelRes = 0x7f080137;
        list.add(0, obj);
    }

    private void b()
    {
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            getView().getViewTreeObserver().removeGlobalOnLayoutListener(this);
            return;
        } else
        {
            getView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            return;
        }
    }

    private void b(View view)
    {
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            return;
        } else
        {
            ((ResolverDrawerLayout)view.findViewById(0x7f100073)).setOnClickOutsideListener(new android.view.View.OnClickListener() {

                final e a;

                public void onClick(View view1)
                {
                    a.getDialog().dismiss();
                }

            
            {
                a = e.this;
                super();
            }
            });
            return;
        }
    }

    private void b(List list)
    {
        if (a == null)
        {
            a = new a();
        }
        a.a(list);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setStyle(2, 0x7f0d0082);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        getDialog().getWindow().requestFeature(1);
        getDialog().setCanceledOnTouchOutside(true);
        bundle = getArguments();
        c = (l)bundle.getSerializable("pandora.landing_page_data");
        b = (Intent)bundle.getParcelable("intent_followon_intent");
        a();
        layoutinflater = layoutinflater.inflate(0x7f04001b, viewgroup, false);
        b(layoutinflater);
        a(layoutinflater);
        return layoutinflater;
    }

    public void onGlobalLayout()
    {
        b();
        float f1 = getResources().getDimension(0x7f09005f);
        Object obj = s.t();
        float f2 = ((DisplayMetrics) (obj)).heightPixels;
        if (f1 == 0.0F)
        {
            f1 = f2;
            if ((float)((DisplayMetrics) (obj)).widthPixels < f2)
            {
                f1 = ((DisplayMetrics) (obj)).widthPixels;
            }
        }
        int i = (int)f1;
        obj = getDialog().getWindow();
        ((Window) (obj)).setLayout(i, i - i / 3);
        ((Window) (obj)).setGravity(80);
        ((Window) (obj)).setAttributes(((Window) (obj)).getAttributes());
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l1)
    {
        int j = ((a)adapterview.getAdapter()).getItemViewType(i);
        switch (j)
        {
        default:
            throw new InvalidParameterException((new StringBuilder()).append("ActivityChooserViewAdapter unknown itemViewType called: ").append(j).toString());

        case 0: // '\0'
            adapterview = a((ResolveInfo)a.a().get(i));
            if (adapterview != null)
            {
                a(adapterview.getStringExtra("android.intent.extra.TEXT"), com.pandora.radio.util.k.l.b);
                startActivity(adapterview);
            }
            getDialog().dismiss();
            return;

        case 1: // '\001'
            adapterview = b.getStringExtra("android.intent.extra.TEXT");
            a(adapterview, com.pandora.radio.util.k.l.a);
            ((ClipboardManager)getActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, adapterview));
            getDialog().dismiss();
            return;
        }
    }
}
