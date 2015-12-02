// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear.filemanager;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.qihoo.security.locale.widget.LocaleTextView;
import com.qihoo360.mobilesafe.b.s;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.qihoo.security.opti.trashclear.filemanager:
//            f, d, h

public class a
{

    static final boolean a;
    private f b;
    private ArrayList c;
    private View d;
    private Context e;
    private String f;
    private String g;
    private String h;
    private String i;
    private HashSet j;
    private String k[];
    private android.view.View.OnClickListener l;
    private ListView m;

    public a(f f1)
    {
        c = new ArrayList();
        h = null;
        j = new HashSet();
        k = null;
        l = new android.view.View.OnClickListener() {

            static final boolean a;
            final a b;

            public void onClick(View view)
            {
                view = (String)view.getTag();
                if (!a && view == null)
                {
                    throw new AssertionError();
                }
                if (a.a(b).d(view))
                {
                    return;
                } else
                {
                    a.a(b, view);
                    b.c();
                    return;
                }
            }

            static 
            {
                boolean flag;
                if (!com/qihoo/security/opti/trashclear/filemanager/a.desiredAssertionStatus())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                a = flag;
            }

            
            {
                b = a.this;
                super();
            }
        };
        if (!a && f1 == null)
        {
            throw new AssertionError();
        } else
        {
            b = f1;
            e = b.p();
            f();
            return;
        }
    }

    static f a(a a1)
    {
        return a1.b;
    }

    static String a(a a1, String s1)
    {
        a1.f = s1;
        return s1;
    }

    private String a(String s1, String s2)
    {
        if (s1.equals("/"))
        {
            return (new StringBuilder()).append(s1).append(s2).toString();
        } else
        {
            return (new StringBuilder()).append(s1).append(File.separator).append(s2).toString();
        }
    }

    private void a(d d1)
    {
        try
        {
            com.qihoo.security.opti.trashclear.filemanager.h.a(e, d1.b);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            s.a(e, 0x7f0c0076, 0);
        }
    }

    static Context b(a a1)
    {
        return a1.e;
    }

    static View c(a a1)
    {
        return a1.d;
    }

    private void f()
    {
        g();
        i();
    }

    private void g()
    {
        d = b.d(0x7f0b0201);
    }

    private void h()
    {
        a();
    }

    private void i()
    {
        m = (ListView)b.d(0x7f0b0203);
        m.setLongClickable(true);
        m.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final a a;

            public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
            {
                a.a(adapterview, view, i1, l1);
            }

            
            {
                a = a.this;
                super();
            }
        });
    }

    public d a(int i1)
    {
        return b.e(i1);
    }

    protected void a()
    {
        LinearLayout linearlayout = (LinearLayout)d.findViewById(0x7f0b0202);
        linearlayout.removeAllViews();
        String s1 = f;
        int j1;
        for (int i1 = g.lastIndexOf("/") + 1; i1 != -1; i1 = j1 + 1)
        {
            j1 = s1.indexOf("/", i1);
            if (j1 == -1)
            {
                if (i1 >= s1.length())
                {
                    break;
                }
                j1 = s1.length();
            }
            View view = LayoutInflater.from(e).inflate(0x7f03009a, null);
            ((LocaleTextView)view.findViewById(0x7f0b0207)).setLocalText(s1.substring(i1, j1));
            view.setOnClickListener(l);
            view.setTag(s1.substring(0, j1));
            linearlayout.addView(view);
        }

        linearlayout.postDelayed(new Runnable(linearlayout) {

            final LinearLayout a;
            final a b;

            public void run()
            {
                DisplayMetrics displaymetrics = a.b(b).getResources().getDisplayMetrics();
                int k1 = a.getWidth();
                if (k1 > displaymetrics.widthPixels)
                {
                    int l1 = displaymetrics.widthPixels;
                    a.c(b).scrollBy(k1 - l1, 0);
                }
            }

            
            {
                b = a.this;
                a = linearlayout;
                super();
            }
        }, 200L);
    }

    public void a(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = b.e(i1);
        if (adapterview == null)
        {
            return;
        }
        if (!((d) (adapterview)).d)
        {
            a(((d) (adapterview)));
            return;
        } else
        {
            f = a(f, ((d) (adapterview)).a);
            m.setEnabled(false);
            c();
            return;
        }
    }

    public void a(String s1)
    {
        g = s1;
        f = s1;
    }

    public void a(String as[])
    {
        j.clear();
        if (as != null && i != null)
        {
            int j1 = as.length;
            for (int i1 = 0; i1 < j1; i1++)
            {
                String s1 = as[i1];
                s1 = (new StringBuilder()).append(i).append(File.separator).append(s1).toString();
                s1.toLowerCase();
                j.add(s1);
            }

        }
    }

    public void b(String s1)
    {
        f = s1;
    }

    public void b(String as[])
    {
        if (as != null && i != null)
        {
            k = new String[as.length];
            for (int i1 = 0; i1 < as.length; i1++)
            {
                String s1 = as[i1];
                s1.toLowerCase();
                k[i1] = s1;
            }

        }
    }

    public boolean b()
    {
        if (!f.equals(g))
        {
            f = (new File(f)).getParent();
            c();
            return true;
        } else
        {
            b.finish();
            return true;
        }
    }

    public void c()
    {
        h();
        b.c(f);
    }

    public void c(String s1)
    {
        h = s1;
    }

    public String d()
    {
        return h;
    }

    public void d(String s1)
    {
        i = s1;
    }

    public boolean e()
    {
        return b();
    }

    public boolean e(String s1)
    {
        while (s1 == null || i == null || j == null) 
        {
            return false;
        }
        return j.contains(s1);
    }

    public boolean f(String s1)
    {
_L2:
        return true;
        if (s1 == null || i == null || k == null) goto _L2; else goto _L1
_L1:
        String as[] = k;
        int j1 = as.length;
        int i1 = 0;
label0:
        do
        {
label1:
            {
                if (i1 >= j1)
                {
                    break label1;
                }
                if (as[i1].startsWith(s1))
                {
                    break label0;
                }
                i1++;
            }
        } while (true);
        if (true) goto _L2; else goto _L3
_L3:
        return false;
    }

    static 
    {
        boolean flag;
        if (!com/qihoo/security/opti/trashclear/filemanager/a.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
