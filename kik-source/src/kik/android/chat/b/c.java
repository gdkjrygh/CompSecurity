// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.b;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package kik.android.chat.b:
//            b

public final class c
{

    private static StateListDrawable a(int i)
    {
        ColorDrawable colordrawable = new ColorDrawable(i);
        float af[] = new float[3];
        Color.colorToHSV(i, af);
        af[2] = Math.max(0.0F, af[2] - 0.2F);
        ColorDrawable colordrawable1 = new ColorDrawable(Color.HSVToColor(af));
        StateListDrawable statelistdrawable = new StateListDrawable();
        statelistdrawable.addState(new int[] {
            0x10100a1
        }, colordrawable1);
        statelistdrawable.addState(new int[] {
            0x10100a7
        }, colordrawable1);
        statelistdrawable.addState(new int[] {
            0x101009c
        }, colordrawable1);
        statelistdrawable.addState(new int[0], colordrawable);
        return statelistdrawable;
    }

    public static void a(View view, b b1)
    {
        if (view == null || b1 == null)
        {
            return;
        } else
        {
            view.setBackgroundDrawable(a(b1.c()));
            return;
        }
    }

    public static void a(View view, b b1, int i)
    {
        if (view == null || b1 == null)
        {
            return;
        } else
        {
            view.setBackgroundDrawable(new LayerDrawable(new Drawable[] {
                a(b1.c()), view.getResources().getDrawable(i)
            }));
            return;
        }
    }

    public static void a(ImageView imageview, b b1)
    {
        if (imageview == null || b1 == null)
        {
            return;
        }
        if (-1 == b1.b())
        {
            imageview.setImageResource(0x7f020269);
            return;
        } else
        {
            imageview.setImageResource(0x7f02026a);
            return;
        }
    }

    public static void a(TextView textview, b b1)
    {
        if (textview == null || b1 == null)
        {
            return;
        } else
        {
            textview.setTextColor(b1.b());
            return;
        }
    }
}
