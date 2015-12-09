// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;

final class eww extends StateListDrawable
{

    private final Context a;
    private final BitmapDrawable b;
    private final ColorFilter c;

    public eww(Context context, int i, Bitmap bitmap)
    {
        a = (Context)ctz.a(context);
        b = new BitmapDrawable(a.getResources(), bitmap);
        context = gcg.a(a, i);
        context = new LayerDrawable(new Drawable[] {
            b, context
        });
        bitmap = new ColorMatrix();
        bitmap.setSaturation(0.0F);
        c = new ColorMatrixColorFilter(bitmap);
        addState(new int[] {
            0x10100a7
        }, context);
        addState(new int[] {
            0x10100a1
        }, context);
        addState(StateSet.WILD_CARD, b);
    }

    protected final boolean onStateChange(int ai[])
    {
        boolean flag = false;
        if (ai.length <= 0) goto _L2; else goto _L1
_L1:
        int i;
        int k;
        k = ai.length;
        i = 0;
_L8:
        int j = ((flag) ? 1 : 0);
        if (i >= k) goto _L4; else goto _L3
_L3:
        j = ai[i];
        if (j != 0x10100a1 && j != 0x10100a7) goto _L6; else goto _L5
_L5:
        j = 1;
_L4:
        BitmapDrawable bitmapdrawable = b;
        ColorFilter colorfilter;
        if (j != 0)
        {
            colorfilter = null;
        } else
        {
            colorfilter = c;
        }
        bitmapdrawable.setColorFilter(colorfilter);
_L2:
        return super.onStateChange(ai);
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
