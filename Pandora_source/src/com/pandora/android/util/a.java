// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.content.j;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import com.pandora.android.R;
import com.pandora.android.provider.b;
import com.pandora.radio.data.o;
import java.util.HashMap;
import java.util.List;
import p.cw.c;
import p.di.r;

// Referenced classes of package com.pandora.android.util:
//            s

public class com.pandora.android.util.a
{
    private static class a extends ArrayAdapter
    {

        private Context a;

        private boolean a(int i)
        {
            if (i < 0 || i >= getCount())
            {
                return false;
            } else
            {
                return ((p.dj.a)getItem(i)).e();
            }
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            view = super.getView(i, view, viewgroup);
            int j = 0x1060000;
            if (isEnabled(i))
            {
                if (a(i))
                {
                    j = 0x7f0b0072;
                } else
                {
                    j = 0x106000c;
                }
            }
            i = a.getResources().getColor(j);
            ((CheckedTextView)view).setTextColor(i);
            return view;
        }

        public boolean isEnabled(int i)
        {
            if (i < 0 || i >= getCount())
            {
                return false;
            } else
            {
                return ((p.dj.a)getItem(i)).c();
            }
        }

        public a(Context context, int i, List list)
        {
            super(context, i, list);
            a = context;
        }
    }


    private static final HashMap a;

    public static void a(Context context, Intent intent)
    {
        p.dj.b b1 = b.a.b().q();
        List list = ((p.dj.c)b1).b();
        if (list == null || list.size() == 0)
        {
            (new android.app.AlertDialog.Builder(context)).setMessage(0x7f0801e7).setCancelable(false).setNeutralButton(0x7f0801f5, new android.content.DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.cancel();
                }

            }).create().show();
            return;
        } else
        {
            a a1 = new a(context, 0x1090010, list);
            context = (new android.app.AlertDialog.Builder(context)).setTitle(0x7f08005a).setCancelable(false).setAdapter(a1, null).setPositiveButton(0x7f0801f5, new android.content.DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface.cancel();
                }

            }).setNegativeButton(0x7f080224, new android.content.DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    b.a.b().j().e(false);
                    (new r()).execute(new Object[0]);
                    dialoginterface.cancel();
                }

            }).create();
            context.setOnDismissListener(new android.content.DialogInterface.OnDismissListener(intent) {

                final Intent a;

                public void onDismiss(DialogInterface dialoginterface)
                {
                    if (a != null)
                    {
                        b.a.C().a(a);
                    }
                }

            
            {
                a = intent;
                super();
            }
            });
            intent = context.getListView();
            intent.setChoiceMode(2);
            context.setOnShowListener(new android.content.DialogInterface.OnShowListener(list, intent) {

                final List a;
                final ListView b;

                public void onShow(DialogInterface dialoginterface)
                {
                    for (int i = 0; i < a.size(); i++)
                    {
                        b.setItemChecked(i, ((p.dj.a)a.get(i)).f());
                    }

                }

            
            {
                a = list;
                b = listview;
                super();
            }
            });
            intent.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener(intent, b1, list) {

                final ListView a;
                final p.dj.b b;
                final List c;

                public void onItemClick(AdapterView adapterview, View view, int i, long l)
                {
                    boolean flag = a.isItemChecked(i);
                    ((p.dj.c)b).a(((p.dj.a)c.get(i)).a(), flag);
                }

            
            {
                a = listview;
                b = b1;
                c = list;
                super();
            }
            });
            context.show();
            return;
        }
    }

    public static boolean a(p.dj.b.a a1)
    {
        boolean flag = false;
        static class _cls7
        {

            static final int a[];

            static 
            {
                a = new int[p.dj.b.b.values().length];
                try
                {
                    a[p.dj.b.b.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[p.dj.b.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.dj.b.b.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.dj.b.b.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls7.a[a1.l.ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 57
    //                   2 65
    //                   3 44
    //                   4 55;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        flag = b.a.b().a(a1);
_L4:
        return flag;
_L2:
        if (s.u())
        {
            return false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (!s.u())
        {
            return false;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    static 
    {
        a = new HashMap();
        Class aclass[] = com/pandora/android/R.getClasses();
        for (int i = 0; i < aclass.length; i++)
        {
            Class class1 = aclass[i];
            a.put(class1.getSimpleName(), class1);
        }

    }
}
