// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.appboy.f;
import com.appboy.f.a;
import com.appboy.ui.r;
import java.util.ArrayList;
import java.util.List;

public class StarRatingView extends LinearLayout
{

    private static final String a;
    private List b;
    private float c;

    public StarRatingView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0.0F;
        setOrientation(0);
        b = new ArrayList(5);
        for (int i = 0; i < 5; i++)
        {
            attributeset = new ImageView(context);
            attributeset.setTag(Integer.valueOf(0));
            addView(attributeset, new android.view.ViewGroup.LayoutParams(-2, -2));
            b.add(attributeset);
        }

        a(c);
    }

    public final boolean a(float f1)
    {
        if (f1 < 0.0F || f1 > 5F)
        {
            com.appboy.f.a.d(a, String.format("Unable to set rating to %f. Rating must be between 0 and %d", new Object[] {
                Float.valueOf(f1), Integer.valueOf(5)
            }));
            return false;
        }
        c = f1;
        int l = (int)Math.floor(c);
        int k = (int)Math.ceil(c);
        int i = 0;
        int j;
        do
        {
            j = k;
            if (i >= l)
            {
                break;
            }
            ImageView imageview = (ImageView)b.get(i);
            imageview.setTag(Integer.valueOf(r.c));
            imageview.setImageResource(r.c);
            i++;
        } while (true);
        for (; j < b.size(); j++)
        {
            ImageView imageview1 = (ImageView)b.get(j);
            imageview1.setTag(Integer.valueOf(r.b));
            imageview1.setImageResource(r.b);
        }

        f1 -= l;
        if (f1 > 0.0F)
        {
            ImageView imageview2 = (ImageView)b.get(l);
            if (f1 < 0.25F)
            {
                imageview2.setTag(Integer.valueOf(r.b));
                imageview2.setImageResource(r.b);
            } else
            if (f1 < 0.75F)
            {
                imageview2.setTag(Integer.valueOf(r.d));
                imageview2.setImageResource(r.d);
            } else
            {
                imageview2.setTag(Integer.valueOf(r.c));
                imageview2.setImageResource(r.c);
            }
        }
        return true;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, com/appboy/ui/widget/StarRatingView.getName()
        });
    }
}
