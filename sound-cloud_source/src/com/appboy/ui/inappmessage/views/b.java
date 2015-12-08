// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.appboy.d;
import com.appboy.d.l;
import com.appboy.ui.d.f;
import com.appboy.ui.inappmessage.a;
import java.util.List;

public class b
{

    private static final String a;

    public b()
    {
    }

    public static void a()
    {
        com.appboy.ui.inappmessage.a.a().b();
    }

    public static void a(Context context, String s, int i, int j, TextView textview)
    {
label0:
        {
            boolean flag;
            if (s != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                try
                {
                    textview.setTypeface(Typeface.createFromAsset(context.getAssets(), "fontawesome-webfont.ttf"));
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return;
                }
                textview.setText(s);
                a(textview, i);
                if (textview.getBackground() == null)
                {
                    break label0;
                }
                a(textview.getBackground(), j, context.getResources().getColor(com.appboy.ui.n.a.com_appboy_inappmessage_icon_background));
            }
            return;
        }
        a(((View) (textview)), j);
    }

    public static void a(Bitmap bitmap, ImageView imageview)
    {
        if (bitmap != null)
        {
            imageview.setImageBitmap(bitmap);
        }
    }

    private static void a(Drawable drawable, int i, int j)
    {
        boolean flag1 = true;
        boolean flag = true;
        if (drawable instanceof GradientDrawable)
        {
            drawable = (GradientDrawable)drawable;
            if (i == 0)
            {
                flag = false;
            }
            if (flag)
            {
                drawable.setColor(i);
                return;
            } else
            {
                drawable.setColor(j);
                return;
            }
        }
        if (i != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            drawable.setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
            return;
        } else
        {
            drawable.setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
            return;
        }
    }

    public static void a(View view, int i)
    {
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view.setBackgroundColor(i);
        }
    }

    public static void a(View view, int i, int j)
    {
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view.getBackground().setColorFilter(i, android.graphics.PorterDuff.Mode.MULTIPLY);
            return;
        } else
        {
            view.getBackground().setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
            return;
        }
    }

    public static void a(TextView textview, int i)
    {
        boolean flag;
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            textview.setTextColor(i);
        }
    }

    protected static void a(TextView textview, TextView textview1)
    {
        if (textview1 == null && textview != null)
        {
            textview1 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            textview1.setMargins(0, 0, 0, 0);
            textview.setLayoutParams(textview1);
        }
    }

    public static void a(List list, View view, int i, List list1)
    {
        if (list1 == null || list1.size() == 0)
        {
            f.a(view);
        } else
        {
            int j = 0;
            while (j < list.size()) 
            {
                if (list1.size() <= j)
                {
                    ((View)list.get(j)).setVisibility(8);
                } else
                if (list.get(j) instanceof Button)
                {
                    view = (Button)list.get(j);
                    l l1 = (l)list1.get(j);
                    view.setText(l1.d);
                    a(((TextView) (view)), l1.f);
                    a(view.getBackground(), l1.e, i);
                }
                j++;
            }
        }
    }

    protected static void a(List list, List list1)
    {
        if (list1 != null && list1.size() == 1)
        {
            list1 = new android.widget.LinearLayout.LayoutParams(0, -2, 1.0F);
            ((View)list.get(0)).setLayoutParams(list1);
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/ui/inappmessage/views/b.getName()
        });
    }
}
