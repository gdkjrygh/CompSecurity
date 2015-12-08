// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

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
import com.appboy.d.i;
import com.appboy.f;
import com.appboy.f.a;
import com.appboy.ui.d.d;
import com.appboy.ui.q;
import java.util.List;

public class v
{

    private static final String a;

    public v()
    {
    }

    public static void a(Context context, String s, int j, int k, TextView textview)
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
                    com.appboy.f.a.c(a, "Caught exception setting icon typeface. Not rendering icon.", context);
                    return;
                }
                textview.setText(s);
                a(textview, j);
                if (textview.getBackground() == null)
                {
                    break label0;
                }
                a(textview.getBackground(), k, context.getResources().getColor(q.e));
            }
            return;
        }
        a(((View) (textview)), k);
    }

    public static void a(Bitmap bitmap, ImageView imageview)
    {
        if (bitmap != null)
        {
            imageview.setImageBitmap(bitmap);
        }
    }

    private static void a(Drawable drawable, int j, int k)
    {
        boolean flag1 = true;
        boolean flag = true;
        if (drawable instanceof GradientDrawable)
        {
            drawable = (GradientDrawable)drawable;
            if (j == 0)
            {
                flag = false;
            }
            if (flag)
            {
                drawable.setColor(j);
                return;
            } else
            {
                drawable.setColor(k);
                return;
            }
        }
        if (j != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            drawable.setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
            return;
        } else
        {
            drawable.setColorFilter(k, android.graphics.PorterDuff.Mode.MULTIPLY);
            return;
        }
    }

    public static void a(View view, int j)
    {
        boolean flag;
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view.setBackgroundColor(j);
        }
    }

    public static void a(View view, int j, int k)
    {
        boolean flag;
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view.getBackground().setColorFilter(j, android.graphics.PorterDuff.Mode.MULTIPLY);
            return;
        } else
        {
            view.getBackground().setColorFilter(k, android.graphics.PorterDuff.Mode.MULTIPLY);
            return;
        }
    }

    public static void a(TextView textview, int j)
    {
        boolean flag;
        if (j != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            textview.setTextColor(j);
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

    public static void a(List list, View view, int j, List list1)
    {
        if (list1 == null || list1.size() == 0)
        {
            d.a(view);
        } else
        {
            int l = 0;
            while (l < list.size()) 
            {
                if (list1.size() <= l)
                {
                    ((View)list.get(l)).setVisibility(8);
                } else
                if (list.get(l) instanceof Button)
                {
                    view = (Button)list.get(l);
                    i k = (i)list1.get(l);
                    view.setText(k.e());
                    a(((TextView) (view)), k.g());
                    a(view.getBackground(), k.f(), j);
                }
                l++;
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
            f.a, com/appboy/ui/inappmessage/v.getName()
        });
    }
}
