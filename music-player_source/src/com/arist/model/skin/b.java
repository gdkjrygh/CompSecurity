// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.skin;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.GridView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.arist.model.skin:
//            m, f, c, d

public final class b
{

    private static b c;
    private int a;
    private final List b = new ArrayList();

    public b()
    {
        a = 0xff259eff;
    }

    public static b a()
    {
        if (c == null)
        {
            c = new b();
        }
        return c;
    }

    public final void a(int i)
    {
        if (a != i)
        {
            a = i;
            Iterator iterator = b.iterator();
            while (iterator.hasNext()) 
            {
                m m1 = (m)iterator.next();
                if (m1 != null)
                {
                    m1.a(i);
                }
            }
        }
    }

    public final void a(Context context)
    {
        AlertDialog alertdialog = (new android.app.AlertDialog.Builder(context)).create();
        int ai[] = context.getResources().getIntArray(0x7f0c0005);
        View view = LayoutInflater.from(context).inflate(0x7f030014, null);
        GridView gridview = (GridView)view.findViewById(0x7f060068);
        gridview.setAdapter(new f(this, ai, context, (byte)0));
        gridview.setOnItemClickListener(new c(this, ai, alertdialog));
        view.findViewById(0x7f060067).setOnClickListener(new d(this, context, alertdialog));
        alertdialog.setView(view);
        alertdialog.show();
    }

    public final void a(m m1)
    {
        if (!b.contains(m1) && m1 != null)
        {
            m1.a(a);
            b.add(m1);
        }
    }

    public final int b()
    {
        return a;
    }

    public final void b(m m1)
    {
        b.remove(m1);
    }
}
