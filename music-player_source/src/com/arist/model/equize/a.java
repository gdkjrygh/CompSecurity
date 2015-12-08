// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.equize;

import android.app.AlertDialog;
import android.content.res.Resources;
import android.media.AudioManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.arist.activity.EqualizerActivity;
import java.util.ArrayList;

// Referenced classes of package com.arist.model.equize:
//            j, e, c, d, 
//            f, k, b, g, 
//            h, i

public final class a
{

    private EqualizerActivity a;
    private AudioManager b;
    private int c;
    private j d;
    private String e[];

    public a(EqualizerActivity equalizeractivity)
    {
        a = equalizeractivity;
        b = (AudioManager)equalizeractivity.getSystemService("audio");
        c = b.getStreamMaxVolume(3);
        d = com.arist.model.equize.j.a();
        e = equalizeractivity.getResources().getStringArray(0x7f0c0004);
    }

    static j a(a a1)
    {
        return a1.d;
    }

    static void a(a a1, int i1)
    {
        Toast.makeText(a1.a, i1, 0).show();
    }

    static EqualizerActivity b(a a1)
    {
        return a1.a;
    }

    public final float a()
    {
        return (float)b.getStreamVolume(3) / (float)c;
    }

    public final void a(double d1)
    {
        d.a(d1);
    }

    public final void a(float f1)
    {
        b.setStreamVolume(3, (int)((float)c * f1), 0);
    }

    public final void a(int i1, float f1)
    {
        d.a(i1 - 1, b(f1));
    }

    protected final void a(com.arist.b.a a1)
    {
        EditText edittext = new EditText(a);
        edittext.setText(a1.a);
        android.app.AlertDialog.Builder builder;
        int i1;
        if (a1.a != null)
        {
            i1 = a1.a.length();
        } else
        {
            i1 = 0;
        }
        edittext.setSelection(i1);
        builder = new android.app.AlertDialog.Builder(a);
        builder.setTitle(0x7f0900a2);
        builder.setCancelable(true);
        builder.setView(edittext);
        builder.setPositiveButton(0x7f09004b, new e(this, edittext, a1));
        builder.setNegativeButton(0x7f09004a, null);
        builder.create().show();
    }

    protected final void a(com.arist.b.a a1, boolean flag)
    {
        View view = a.getLayoutInflater().inflate(0x7f030016, null);
        Object obj = new android.app.AlertDialog.Builder(a);
        ((android.app.AlertDialog.Builder) (obj)).setTitle(0x7f0900a1).setCancelable(true);
        ((android.app.AlertDialog.Builder) (obj)).setView(view);
        obj = ((android.app.AlertDialog.Builder) (obj)).create();
        view.findViewById(0x7f06006e).setOnClickListener(new c(this, ((AlertDialog) (obj)), a1));
        if (flag)
        {
            view.findViewById(0x7f060070).setOnClickListener(new d(this, ((AlertDialog) (obj)), a1));
        } else
        {
            view.findViewById(0x7f060070).setVisibility(8);
            view.findViewById(0x7f06006f).setVisibility(4);
        }
        ((AlertDialog) (obj)).show();
    }

    public final void a(boolean flag)
    {
        d.a(flag);
    }

    public final int b(float f1)
    {
        return (int)((float)f() * f1) - d.d();
    }

    public final void b(double d1)
    {
        d.b(d1);
    }

    public final void b(com.arist.b.a a1)
    {
        EditText edittext = new EditText(a);
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        builder.setTitle(0x7f09009f);
        builder.setCancelable(true);
        builder.setView(edittext);
        builder.setPositiveButton(0x7f09004b, new f(this, edittext, a1));
        builder.setNegativeButton(0x7f09004a, null);
        builder.create().show();
    }

    public final boolean b()
    {
        return d.e.b();
    }

    public final com.arist.b.a c()
    {
        return d.b();
    }

    public final void d()
    {
        d.e.a(1);
    }

    public final String e()
    {
        return e[d.e.c()];
    }

    public final int f()
    {
        return d.d() * 2;
    }

    public final float g()
    {
        return d.e.e();
    }

    public final float h()
    {
        return d.e.d();
    }

    public final void i()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        builder.setTitle(0x7f0900a1).setCancelable(true);
        ArrayList arraylist = d.f();
        String as[] = new String[arraylist.size()];
        int i1 = 0;
        do
        {
            if (i1 >= as.length)
            {
                builder.setItems(as, new b(this, arraylist));
                builder.create().show();
                return;
            }
            as[i1] = ((com.arist.b.a)arraylist.get(i1)).a;
            i1++;
        } while (true);
    }

    public final void j()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        builder.setTitle(0x7f0900bf).setCancelable(true);
        String as[] = a.getResources().getStringArray(0x7f0c0004);
        builder.setSingleChoiceItems(as, d.e.c(), new g(this, as));
        builder.create().show();
    }

    public final void k()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        builder.setTitle(0x7f0900aa).setCancelable(true);
        ArrayList arraylist = d.g();
        String as[] = new String[arraylist.size()];
        String s = d.b().a;
        int i1 = 0;
        int j1 = 0;
        do
        {
            if (i1 >= as.length)
            {
                builder.setSingleChoiceItems(as, j1, new h(this, arraylist));
                builder.create().show();
                return;
            }
            as[i1] = ((com.arist.b.a)arraylist.get(i1)).a;
            int k1 = j1;
            if (s != null)
            {
                k1 = j1;
                if (s.equals(as[i1]))
                {
                    k1 = i1;
                }
            }
            i1++;
            j1 = k1;
        } while (true);
    }

    public final void l()
    {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(a);
        builder.setTitle(0x7f0900f7);
        builder.setCancelable(true);
        builder.setMessage(0x7f0900ed);
        builder.setPositiveButton(0x7f09004b, new i(this));
        builder.create().show();
    }
}
