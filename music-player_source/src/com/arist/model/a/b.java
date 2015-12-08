// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.a;

import android.app.AlertDialog;
import android.content.Context;
import android.util.Log;
import android.widget.BaseAdapter;
import android.widget.EditText;
import com.arist.activity.MyApplication;
import com.arist.model.b.c;
import com.arist.model.b.d;
import com.arist.view.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

// Referenced classes of package com.arist.model.a:
//            a, c, d, e

public final class b
{

    private d a;
    private c b;
    private com.arist.model.a.a c;

    public b()
    {
        a = new d();
        c = new com.arist.model.a.a();
        b = new c(MyApplication.q);
    }

    static d a(b b1)
    {
        return b1.a;
    }

    private static void a(com.arist.b.b b1, ArrayList arraylist, boolean flag)
    {
        Iterator iterator = (new ArrayList(arraylist)).iterator();
        do
        {
            com.arist.b.c c1;
            do
            {
                if (!iterator.hasNext())
                {
                    return;
                }
                c1 = (com.arist.b.c)iterator.next();
                c1.b(b1);
            } while (!flag || !c1.f().isEmpty());
            arraylist.remove(c1);
        } while (true);
    }

    public final void a()
    {
        long l = System.currentTimeMillis();
        MyApplication.p.clear();
        Object obj = new com.arist.b.c();
        ((com.arist.b.c) (obj)).b(-1);
        ((com.arist.b.c) (obj)).a(b.a());
        ((com.arist.b.c) (obj)).c(MyApplication.q.getString(0x7f09007f));
        MyApplication.p.add(obj);
        obj = new com.arist.b.c();
        ((com.arist.b.c) (obj)).b(-3);
        ((com.arist.b.c) (obj)).a(b.e());
        ((com.arist.b.c) (obj)).c(MyApplication.q.getString(0x7f0900f8));
        MyApplication.p.add(obj);
        MyApplication.l.clear();
        MyApplication.l.addAll(a.a());
        obj = MyApplication.l.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                MyApplication.m.clear();
                MyApplication.m.addAll(b.d());
                MyApplication.n.clear();
                MyApplication.n.addAll(b.f());
                MyApplication.o.clear();
                MyApplication.o.addAll(b.c());
                Log.i("PlayListBiz", (new StringBuilder(String.valueOf(System.currentTimeMillis() - l))).toString());
                return;
            }
            Collections.sort(((com.arist.b.c)((Iterator) (obj)).next()).f(), new com.arist.model.a.c(this));
        } while (true);
    }

    public final void a(Context context, com.arist.b.c c1, BaseAdapter baseadapter, a a1)
    {
        EditText edittext = new EditText(context);
        edittext.setText(c1.b());
        edittext.setSelection(c1.b().length());
        (new android.app.AlertDialog.Builder(context)).setIcon(0x1080027).setTitle(context.getString(0x7f0900c8)).setView(edittext).setPositiveButton(context.getString(0x7f090073), new com.arist.model.a.d(this, edittext, context, c1, baseadapter, a1)).setNegativeButton(context.getString(0x7f09004a), null).create().show();
    }

    public final void a(Context context, Runnable runnable)
    {
        EditText edittext = new EditText(context);
        edittext.setHint(0x7f0900c4);
        (new android.app.AlertDialog.Builder(context)).setIcon(0x1080027).setTitle(0x7f0900c3).setView(edittext).setPositiveButton(0x7f09004b, new e(this, edittext, runnable, context)).setCancelable(true).setNegativeButton(0x7f09004a, null).create().show();
    }

    public final void a(com.arist.b.b b1)
    {
        if (b1 == null)
        {
            return;
        } else
        {
            com.arist.c.c.c(b1.e());
            b.a(b1.c());
            a(b1, MyApplication.n, true);
            a(b1, MyApplication.p, false);
            a(b1, MyApplication.o, true);
            a(b1, MyApplication.l, false);
            a(b1, MyApplication.m, true);
            return;
        }
    }

    public final void a(com.arist.b.b b1, com.arist.b.c c1)
    {
        a.b(b1, c1);
    }

    public final void a(com.arist.b.c c1)
    {
        a.c(c1);
        MyApplication.l.remove(c1);
    }

    public final void b(com.arist.b.c c1)
    {
        c1.e();
        a.b(c1);
    }
}
