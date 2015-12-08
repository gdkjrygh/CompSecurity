// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.j.x;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bl

public static final class b extends bl
{

    private final bl a;
    private final float b;

    public final Bitmap a(Context context)
    {
        Bitmap bitmap = a.a(context);
        float f = b;
        int j = bitmap.getHeight();
        int k = bitmap.getWidth();
        context = new int[j * k];
        bitmap.getPixels(context, 0, k, 0, 0, k, j);
        int ai[] = new int[j * k];
        float af[] = new float[3];
        for (int i = 0; i < context.length; i++)
        {
            Color.colorToHSV(context[i], af);
            af[0] = f;
            ai[i] = Color.HSVToColor(Color.alpha(context[i]), af);
        }

        return Bitmap.createBitmap(ai, 0, k, k, j, android.graphics.p.Config.ARGB_8888);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof _cls8888))
            {
                return false;
            }
            obj = (_cls8888)obj;
            if (!a.equals(((a) (obj)).a) || Float.floatToIntBits(b) != Float.floatToIntBits(((b) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, Float.valueOf(b)
        });
    }

    public final String toString()
    {
        return v.a(this).("base", a).("hue", Float.valueOf(b)).oString();
    }

    public (bl bl1, float f)
    {
        boolean flag = true;
        super((byte)1, (byte)0);
        if (f < 0.0F || f >= 360F)
        {
            flag = false;
        }
        x.b(flag, "hue outside range [0.0,360.0)");
        a = (bl)x.a(bl1);
        b = f;
    }
}
