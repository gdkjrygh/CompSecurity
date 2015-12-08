// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.jcp.activities.MainActivity;
import com.jcp.storepickup.pojo.Inventory;
import com.jcp.views.HtmlTypefaceTextView;

// Referenced classes of package com.jcp.util:
//            y, bu

public final class bt
{

    public static int a(Context context)
    {
        if (context != null)
        {
            context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
            if (context != null)
            {
                switch (context.getRotation())
                {
                case 2: // '\002'
                default:
                    return 0;

                case 1: // '\001'
                case 3: // '\003'
                    return 1;
                }
            }
        }
        return 0;
    }

    public static int a(Context context, int i)
    {
        return (int)((float)i * context.getResources().getDisplayMetrics().density);
    }

    public static Drawable a(Drawable drawable, int i, int j)
    {
        int k = drawable.getIntrinsicWidth();
        int l = drawable.getIntrinsicHeight();
        float f;
        if (Math.abs(k - i) - Math.abs(l - j) > 0)
        {
            f = (float)i / (float)k;
        } else
        {
            f = (float)j / (float)l;
        }
        drawable.setBounds(new Rect(0, 0, (int)((float)k * f), (int)(f * (float)l)));
        return drawable;
    }

    public static void a(Context context, double d, String s, TextView textview)
    {
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        int i = 0x7f070357;
        if (!s.contains(context.getString(0x7f0703ef))) goto _L4; else goto _L3
_L3:
        i = 0x7f07035a;
_L5:
        textview.setText(String.format(context.getString(i), new Object[] {
            y.a(d)
        }));
        return;
_L4:
        if (s.contains(context.getString(0x7f0700ae)))
        {
            i = 0x7f070359;
        }
        if (true) goto _L5; else goto _L2
_L2:
        textview.setText(" ");
        return;
    }

    public static void a(Context context, EditText edittext, TextView textview)
    {
        boolean flag;
        if (edittext.length() <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(context, edittext, textview, flag);
    }

    public static void a(Context context, EditText edittext, TextView textview, boolean flag)
    {
        if (flag)
        {
            edittext.setBackgroundResource(0x7f0201b7);
            edittext.setHintTextColor(context.getResources().getColor(0x7f0d006c));
            textview.setVisibility(0);
            textview.setText(context.getResources().getString(0x7f07034d));
            return;
        } else
        {
            edittext.setBackgroundResource(0x7f020124);
            edittext.setHintTextColor(context.getResources().getColor(0x7f0d005d));
            textview.setVisibility(8);
            return;
        }
    }

    public static void a(Context context, HtmlTypefaceTextView htmltypefacetextview, Inventory inventory)
    {
        if (context != null && inventory != null)
        {
            if (context.getResources().getString(0x7f07003d).equalsIgnoreCase(inventory.getStatus()))
            {
                if (context.getResources().getString(0x7f0701ed).equalsIgnoreCase(inventory.getPickupStatus()))
                {
                    htmltypefacetextview.setHtmlText((new StringBuilder()).append("<b>").append(context.getString(0x7f0700ac)).append("</b><br></br> ( ").append(inventory.getQuantity()).append(" ").append(context.getString(0x7f07026b)).append(" )").append("</b><br><br>").append(context.getString(0x7f0700a8)).toString());
                } else
                {
                    htmltypefacetextview.setHtmlText((new StringBuilder()).append("<b>").append(context.getString(0x7f0700ac)).append("</b><br></br> ( ").append(inventory.getQuantity()).append(" ").append(context.getString(0x7f07026b)).append(" )").toString());
                }
                htmltypefacetextview.setTextColor(context.getResources().getColor(0x7f0d005e));
                return;
            }
            if (context.getResources().getString(0x7f0701ef).equalsIgnoreCase(inventory.getStatus()))
            {
                if (context.getResources().getString(0x7f0701ed).equalsIgnoreCase(inventory.getPickupStatus()))
                {
                    htmltypefacetextview.setHtmlText((new StringBuilder()).append("<b>").append(context.getString(0x7f07023e)).append("</b><br><br>").append(context.getString(0x7f0700a8)).toString());
                } else
                {
                    htmltypefacetextview.setHtmlText((new StringBuilder()).append("<b>").append(context.getString(0x7f07023e)).toString());
                }
                htmltypefacetextview.setTextColor(context.getResources().getColor(0x7f0d005e));
                return;
            }
            if (context.getResources().getString(0x7f070047).equalsIgnoreCase(inventory.getStatus()))
            {
                htmltypefacetextview.setHtmlText((new StringBuilder()).append("<b>").append(context.getString(0x7f0700ad)).append("</b>").toString());
                htmltypefacetextview.setTextColor(context.getResources().getColor(0x7f0d006c));
                return;
            } else
            {
                htmltypefacetextview.setHtmlText("");
                return;
            }
        } else
        {
            htmltypefacetextview.setHtmlText("");
            return;
        }
    }

    public static void a(View view, Drawable drawable)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            view.setBackground(drawable);
            return;
        } else
        {
            view.setBackgroundDrawable(drawable);
            return;
        }
    }

    public static void a(ViewTreeObserver viewtreeobserver, android.view.ViewTreeObserver.OnGlobalLayoutListener ongloballayoutlistener)
    {
label0:
        {
            if (viewtreeobserver != null && ongloballayoutlistener != null)
            {
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    break label0;
                }
                viewtreeobserver.removeOnGlobalLayoutListener(ongloballayoutlistener);
            }
            return;
        }
        viewtreeobserver.removeGlobalOnLayoutListener(ongloballayoutlistener);
    }

    public static void a(ImageView imageview, String s)
    {
        imageview.getViewTreeObserver().addOnGlobalLayoutListener(new bu(imageview, s));
    }

    public static boolean a(Activity activity)
    {
        return activity != null && (activity instanceof MainActivity);
    }

    public static String b(Context context)
    {
        switch (a(context))
        {
        default:
            return "PORTRAIT";

        case 1: // '\001'
            return "LANDSCAPE";
        }
    }
}
