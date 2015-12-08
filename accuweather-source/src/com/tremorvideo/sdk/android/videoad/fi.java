// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            ea, de, dh, gd, 
//            ct, fn, fo, fj, 
//            fk, fl, fm

public class fi
{

    List a;
    String b;
    long c;
    boolean d;

    public fi(JSONObject jsonobject)
        throws Exception
    {
        int i = 0;
        super();
        int j;
        if (jsonobject.has("survey-skip-seconds"))
        {
            c = 1000L * jsonobject.getLong("survey-skip-seconds");
        } else
        {
            c = 0L;
        }
        if (jsonobject.has("survey-skip"))
        {
            d = jsonobject.getBoolean("survey-skip");
        } else
        {
            d = false;
        }
        b = jsonobject.getString("survey-question");
        jsonobject = jsonobject.getJSONArray("events");
        j = Math.min(10, jsonobject.length());
        a = new ArrayList(j);
        for (; i < j; i++)
        {
            a.add(new ea(jsonobject.getJSONObject(i)));
        }

    }

    public static Dialog a(Context context, gd gd1, fi fi1, a.a a1)
    {
        de de1;
        try
        {
            de1 = de.a(context);
            Bitmap abitmap[] = a(gd1);
            ScrollView scrollview = a(context, gd1, a1, ((Dialog) (de1)), fi1);
            LinearLayout linearlayout = new LinearLayout(context);
            linearlayout.setOrientation(1);
            linearlayout.setPadding(10, 10, 10, 10);
            LinearLayout linearlayout1 = new LinearLayout(context);
            linearlayout1.setOrientation(0);
            Object obj = a(context, gd1, "Survey");
            ((TextView) (obj)).setFocusable(false);
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutparams.weight = 1.0F;
            linearlayout1.addView(((android.view.View) (obj)), layoutparams);
            a1 = a(context, gd1, a1, fi1, ((Dialog) (de1)));
            a1.setFocusable(false);
            obj = new android.widget.LinearLayout.LayoutParams(-2, -2);
            obj.gravity = 5;
            linearlayout1.addView(a1, ((android.view.ViewGroup.LayoutParams) (obj)));
            linearlayout.addView(linearlayout1, new android.widget.LinearLayout.LayoutParams(-1, -2));
            linearlayout.addView(b(context, gd1, fi1.b));
            linearlayout.addView(scrollview);
            de1.requestWindowFeature(1);
            de1.getWindow().setBackgroundDrawable(new dh(abitmap, gd1.a(gd.a.f)));
            de1.addContentView(linearlayout, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ct.a(context);
            return null;
        }
        return de1;
    }

    private static ImageButton a(Context context, gd gd1, a.a a1, fi fi1, Dialog dialog)
    {
        gd1 = gd1.a(gd.b.V);
        context = new ImageButton(context);
        context.setBackgroundDrawable(null);
        context.setImageBitmap(gd1);
        if (fi1.d && fi1.c > 0L)
        {
            context.postDelayed(new fn(dialog, a1, fi1), fi1.c);
        }
        context.setOnClickListener(new fo(dialog, a1, fi1));
        return context;
    }

    private static ScrollView a(Context context, gd gd1, a.a a1, Dialog dialog, fi fi1)
    {
        gd1 = new int[3];
        gd1[0] = Color.rgb(156, 157, 158);
        gd1[1] = Color.rgb(39, 40, 41);
        gd1[2] = Color.rgb(59, 60, 63);
        int ai[] = new int[2];
        ai[0] = Color.rgb(68, 121, 254);
        ai[1] = Color.rgb(4, 63, 212);
        ScrollView scrollview = new ScrollView(context);
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setOrientation(1);
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < fi1.a.size(); i++)
        {
            if (((ea)fi1.a.get(i)).a() == ea.b.P)
            {
                arraylist.add(fi1.a.get(i));
            }
        }

        Collections.sort(arraylist, new fj());
        for (int j = 0; j < arraylist.size(); j++)
        {
            Object obj = new GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, gd1);
            ((GradientDrawable) (obj)).setCornerRadius(6F);
            ((GradientDrawable) (obj)).setGradientType(0);
            fi1 = new Button(context);
            fi1.setText(((ea)arraylist.get(j)).i());
            fi1.setTag(arraylist.get(j));
            fi1.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj)));
            fi1.setTextColor(-1);
            fi1.setPadding(5, 5, 5, 5);
            fi1.setId(j + 35);
            fi1.setFocusable(true);
            obj = new android.widget.LinearLayout.LayoutParams(-1, -2);
            obj.bottomMargin = 5;
            fi1.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            fi1.setOnClickListener(new fk(a1, dialog));
            fi1.setOnFocusChangeListener(new fl(ai, gd1));
            fi1.setOnTouchListener(new fm(ai, gd1));
            linearlayout.addView(fi1);
            linearlayout.setPadding(5, 5, 5, 5);
        }

        scrollview.addView(linearlayout);
        return scrollview;
    }

    private static TextView a(Context context, gd gd1, String s)
    {
        context = new TextView(context);
        context.setText(s);
        context.setTextSize(ct.E());
        context.setTextColor(gd1.a(gd.a.g));
        context.setTypeface(Typeface.create("helvetica", 1));
        context.setShadowLayer(5F, 0.0F, 0.0F, gd1.a(gd.a.h));
        context.setPadding(10, 5, 10, 0);
        return context;
    }

    private static ea a(ea.b b1, List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            ea ea1 = (ea)list.next();
            if (ea1.a() == b1)
            {
                return ea1;
            }
        }

        return null;
    }

    static void a(Dialog dialog, a.a a1, fi fi1)
    {
        b(dialog, a1, fi1);
    }

    private static Bitmap[] a(gd gd1)
    {
        Bitmap abitmap[] = new Bitmap[dh.a.values().length];
        abitmap[dh.a.a.ordinal()] = gd1.a(gd.b.y);
        abitmap[dh.a.b.ordinal()] = gd1.a(gd.b.z);
        abitmap[dh.a.c.ordinal()] = gd1.a(gd.b.A);
        abitmap[dh.a.d.ordinal()] = gd1.a(gd.b.B);
        abitmap[dh.a.e.ordinal()] = gd1.a(gd.b.C);
        abitmap[dh.a.f.ordinal()] = gd1.a(gd.b.D);
        abitmap[dh.a.g.ordinal()] = gd1.a(gd.b.E);
        abitmap[dh.a.h.ordinal()] = gd1.a(gd.b.F);
        return abitmap;
    }

    private static TextView b(Context context, gd gd1, String s)
    {
        context = new TextView(context);
        context.setText(s);
        context.setPadding(10, 5, 10, 5);
        context.setTextColor(gd1.a(gd.a.i));
        context.setTextSize(ct.F());
        return context;
    }

    private static void b(Dialog dialog, a.a a1, fi fi1)
    {
        com/tremorvideo/sdk/android/videoad/fi;
        JVM INSTR monitorenter ;
        if (dialog.isShowing())
        {
            dialog.dismiss();
        }
        dialog = a(ea.b.O, fi1.a);
        if (dialog == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        fi1.a.remove(dialog);
        a1.a(dialog);
        com/tremorvideo/sdk/android/videoad/fi;
        JVM INSTR monitorexit ;
        return;
        dialog;
        throw dialog;
    }

    public ea a(ea.b b1)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            ea ea1 = (ea)iterator.next();
            if (ea1.a() == b1)
            {
                return ea1;
            }
        }

        return null;
    }
}
