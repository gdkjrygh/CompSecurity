// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.d.a;
import com.roidapp.cloudlib.ak;
import com.roidapp.cloudlib.al;
import com.roidapp.photogrid.release.rf;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            u, v

public final class t extends BaseAdapter
{

    public ListView a;
    public boolean b;
    String c[];
    String d[];
    Integer e[];
    private Context f;
    private HashMap g;
    private boolean h;
    private boolean i;
    private String j;
    private ArrayList k;
    private Handler l;

    public t(Context context)
    {
        i = false;
        b = false;
        k = null;
        l = new u(this);
        f = context;
        j = com.roidapp.baselib.d.a.a();
        h = true;
        k = al.g().e();
    }

    private t(Context context, ListView listview, String as[], String as1[], Integer ainteger[], HashMap hashmap)
    {
        i = false;
        b = false;
        k = null;
        l = new u(this);
        f = context;
        a = listview;
        c = as;
        d = as1;
        e = ainteger;
        g = hashmap;
        j = com.roidapp.baselib.d.a.a();
        k = al.g().e();
    }

    public t(Context context, ListView listview, String as[], String as1[], Integer ainteger[], HashMap hashmap, byte byte0)
    {
        this(context, listview, as, as1, ainteger, hashmap);
        h = true;
    }

    static void a(t t1, String s)
    {
        t1.a(s);
    }

    private void a(String s)
    {
        if (!Environment.getExternalStorageState().equals("mounted"))
        {
            Toast.makeText(f, 0x7f07028d, 1).show();
            return;
        } else
        {
            (new v(this, s)).start();
            return;
        }
    }

    static boolean a(t t1)
    {
        return t1.i;
    }

    static HashMap b(t t1)
    {
        return t1.g;
    }

    static Handler c(t t1)
    {
        return t1.l;
    }

    public final int getCount()
    {
        if (c == null || d == null) goto _L2; else goto _L1
_L1:
        rf.a();
        if (!rf.a(j)) goto _L2; else goto _L3
_L3:
        int i1;
        b = true;
        i1 = k.size() + 1;
        if (!h) goto _L5; else goto _L4
_L4:
        return i1;
_L5:
        return i1 + 1;
_L2:
        b = false;
        int j1 = k.size();
        i1 = j1;
        if (!h)
        {
            return j1 + 1;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final Object getItem(int i1)
    {
        return Integer.valueOf(i1);
    }

    public final long getItemId(int i1)
    {
        return (long)i1;
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            viewgroup = LayoutInflater.from(f).inflate(0x7f0300d7, null);
        }
        Object obj = (TextView)viewgroup.findViewById(0x7f0d0386);
        Object obj1 = (TextView)viewgroup.findViewById(0x7f0d0387);
        ((TextView) (obj1)).setText("");
        view = (ImageView)viewgroup.findViewById(0x7f0d0385);
        if (b)
        {
            if (h && i1 == 0 || !h && i1 == 1)
            {
                view.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                String s = c[0];
                s = s.substring(0, s.length());
                ((TextView) (obj)).setText(s.substring(s.lastIndexOf("/") + 1));
                obj = new StringBuilder();
                ((StringBuilder) (obj)).append("(");
                ((StringBuilder) (obj)).append(e[0]);
                ((StringBuilder) (obj)).append(")");
                ((TextView) (obj1)).setText(((StringBuilder) (obj)).toString());
                obj = d[0];
                view.setTag(obj);
                n.a(view, 0x7f020225);
                viewgroup.setTag("cloudfolder_download");
                if (!i)
                {
                    a(((String) (obj)));
                }
                return viewgroup;
            }
            if (!h && i1 == 0)
            {
                ((TextView) (obj)).setText(f.getString(0x7f0701a2));
                n.a(view, 0x7f02044c);
                viewgroup.setTag("cloudfolder_local");
                return viewgroup;
            }
            int j1 = i1 - 1;
            if (!h)
            {
                j1 = i1 - 2;
            }
            obj1 = (ak)k.get(j1);
            ((TextView) (obj)).setText(((ak) (obj1)).e);
            n.a(view, ((ak) (obj1)).c);
            viewgroup.setTag(((ak) (obj1)).a);
            return viewgroup;
        }
        if (!h && i1 == 0)
        {
            ((TextView) (obj)).setText(f.getString(0x7f0701a2));
            n.a(view, 0x7f02044c);
            viewgroup.setTag("cloudfolder_local");
            return viewgroup;
        }
        if (h)
        {
            ak ak1 = (ak)k.get(i1);
            ((TextView) (obj)).setText(ak1.e);
            n.a(view, ak1.c);
            viewgroup.setTag(ak1.a);
            return viewgroup;
        } else
        {
            ak ak2 = (ak)k.get(i1 - 1);
            ((TextView) (obj)).setText(ak2.e);
            n.a(view, ak2.c);
            viewgroup.setTag(ak2.a);
            return viewgroup;
        }
    }
}
